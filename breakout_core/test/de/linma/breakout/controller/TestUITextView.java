package de.linma.breakout.controller;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import de.linma.breakout.communication.MENU_ITEM;
import de.linma.breakout.data.IPlayGrid;
import de.linma.breakout.data.PlayGrid;
import de.linma.breakout.data.user.dao.IUserDao;
import de.linma.breakout.view.tui.UITextView;

public class TestUITextView extends TestCase {
	
	@Mock
	private Logger logger;
	
	@Mock
	private IUserDao dummyDao;

	private IPlayGrid grid = new PlayGrid(500, 500);
	
	@InjectMocks
	private GameController controller = new GameController(grid, "test\\");

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		System.out.println("setUp()\n");

		// create controller
		controller.clearGrid();

		controller.initialize("TestUser");
	}


	@Test
	public void testConsoleInput() throws InterruptedException {
		// create view
		UITextView view;
		view = new UITextView("0\na\nd\np\n3\np\n4\n5\n");
		view.setController(controller);		
		controller.addObserver(view);

		Thread.sleep(2000); // wait 2 sek to let console work
	}

	@Override
	public void tearDown() {
		System.out.println("tearDown()\n");

		controller.processMenuInput(MENU_ITEM.MNU_END);
		controller.close();
		controller = null;	
	}

}
