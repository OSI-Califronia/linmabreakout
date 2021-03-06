package de.linma.breakout.module;

import org.apache.log4j.Logger;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

import de.linma.breakout.controller.GameController;
import de.linma.breakout.controller.IGameController;
import de.linma.breakout.data.IPlayGrid;
import de.linma.breakout.data.PlayGrid;
import de.linma.breakout.data.highscore.HighscorePoster;
import de.linma.breakout.data.highscore.dao.IHighscoreDao;
import de.linma.breakout.data.highscore.dao.impl.hibernate.HighscoreDaoHibernate;
import de.linma.breakout.data.user.dao.IUserDao;
import de.linma.breakout.data.user.dao.impl.couchDB.UserDaoCouchDB;
import de.linma.breakout.data.user.dao.impl.db4o.UserDaoDB4O;
import de.linma.breakout.data.user.dao.impl.hibernate.UserDaoHibernate;
import de.linma.breakout.view.wui.controllers.Application;

/**
 * Module for play Application
 * 
 * @author MBausch
 *
 */
public class PlayAppModule extends AbstractModule {
	
	/**
	 * Constantes for default Gridsize
	 */
	private final static int GRID_DEF_HEIGHT = 500;
	private final static int GRID_DEF_WIDTH = 500;

	@Override
	protected void configure() {
		// playgrid
		bind(IPlayGrid.class).toInstance(new PlayGrid(GRID_DEF_HEIGHT, GRID_DEF_WIDTH));
		
		// bind user persistence
//		IUserDao db4o = new UserDaoDB4O("breakout1_07.db4o");
//		bind(IUserDao.class).toInstance(db4o);
		IUserDao defaultDao = new UserDaoHibernate();
		bind(IUserDao.class).toInstance(defaultDao);
		MapBinder<String, IUserDao> daoBinder = MapBinder.newMapBinder(binder(), String.class, IUserDao.class);
		daoBinder.addBinding("DB4O").toInstance(new UserDaoDB4O("breakout1_07.db4o"));
		daoBinder.addBinding("CouchDB").toInstance(new UserDaoCouchDB("http://lenny2.in.htwg-konstanz.de:5984", "breakout1_07"));
		daoBinder.addBinding("Hibernate").toInstance(defaultDao);
		
		// bind highscore persistence
		bind(IHighscoreDao.class).to(HighscoreDaoHibernate.class);
		bind(HighscorePoster.class).toInstance(new HighscorePoster("http://de-htwg-sa-highscores.herokuapp.com/", "Breakout1"));
		
		// gamecontroller
		bind(IGameController.class).to(GameController.class);
		
		// Application Controller
		bind(Application.class).toInstance(new Application());
		
		// Logger
		bind(Logger.class).toInstance(Logger.getLogger("Breakout"));		
	}

}
