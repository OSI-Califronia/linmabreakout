package de.linma.breakout.view.wui.controllers;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import play.api.Play;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.F;
import play.libs.OpenID;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

import com.google.gson.Gson;
import com.google.inject.Inject;

import de.linma.breakout.communication.GAME_STATE;
import de.linma.breakout.communication.MENU_ITEM;
import de.linma.breakout.controller.GameController;
import de.linma.breakout.controller.IGameController;
import de.linma.breakout.data.user.User;

/**
 * Main controller of Play application 
 */
public class Application extends Controller  {
    
	@Inject
	private IGameController gameController;	  // game instance
		
	private static final String USER_NAME = "linma.webtech";
	private static final String USER_PW = "900150983cd24fb0d6963f7d28e17f72";
		
	/**
	 * Initializes the global game instance.
	 */
	private IGameController getGameController() {
		return gameController;
	}	
	
	// ##########################  FORMS AUTHENTICATION HANDLERS ###########################
	
	/**
	 * Returns name/email of logged in user or empty string.
	 */
    public static String getActiveUser() {
        if(session("UserName") != null && !session("UserName").equals("")) {
          return session("UserName");
        }
        return "";
    }
	
    /**
     * GET: /login 
     * Shows login page
     */
	public Result login() {
		// redirect to index if already logged in
		if (!getActiveUser().equals("")) {
			return redirect(routes.Application.index());
		}
		
		return ok(de.linma.breakout.view.wui.views.html.login.render(""));
	}
	
	/**
	 * GET:  /logout
	 * Terminate a user session.
	 */
	public Result logout() {
		session().clear();
		return redirect(routes.Application.login());
	}
	
	/**
	 * POST: /processLogin
	 * Processes a forms login.
	 */
	public Result processLogin() {
		// get form data from request
		Form<User> filledForm = DynamicForm.form(User.class).bindFromRequest();		
		User user = filledForm.get();

		if (user.getUsername().equals(USER_NAME) && user.getPassword().equals(USER_PW)) {  // login is correct
			session().clear();
            session("UserName", user.getUsername());            
			return redirect(routes.Application.index());
		}
		
		return ok(de.linma.breakout.view.wui.views.html.login.render("Username or password are wrong."));
	}
	
	
	// ####################  HANDLERS FOR OPEN ID AUTHENTICATION ##################

	/**
	 * GET: /auth
	 * Show login page for OpenID authentication
	 */
	public Result openid_auth() {
		String providerUrl = "https://www.google.com/accounts/o8/id";
		String returnToUrl = routes.Application.openid_verify().absoluteURL(request());
		Map<String, String> attributes = new HashMap<String, String>();
		attributes.put("Email", "http://schema.openid.net/contact/email");
		attributes.put("FirstName", "http://schema.openid.net/namePerson/first");
		attributes.put("LastName", "http://schema.openid.net/namePerson/last");
		F.Promise<String> redirectUrl = OpenID.redirectURL(providerUrl, returnToUrl, attributes);
		return redirect(redirectUrl.get());
	}
	
	/**
	 * GET: /verify
	 * Callback action for OpenID provider
	 */
	public Result openid_verify() {
		F.Promise<OpenID.UserInfo> userInfoPromise = OpenID.verifiedId();
		OpenID.UserInfo userInfo = userInfoPromise.get();
		session().clear();
		session("UserName", userInfo.attributes.get("Email"));
		return redirect(routes.Application.index());
	}


	// #################### ACTIONS FOR WEBSOCKET VERSION ##########################

	/**
	 * GET: /socket_index
	 * Returns the Websocket-based main page layout of the game
	 */
    @play.mvc.Security.Authenticated(Secured.class)
    public Result index() {
    	return ok(de.linma.breakout.view.wui.views.html.index.render());
    }
    
    /**
     * GET: /socket_connect
     * Initializes a new WebSocket connection to the running game
     */
    public WebSocket<String> socket_connect() {
    	return new GameWebSocket(getGameController());
    }
    

}
