package de.linma.breakout.controller;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import de.linma.breakout.communication.GAME_STATE;
import de.linma.breakout.communication.MENU_ITEM;
import de.linma.breakout.data.IPlayGrid;
import de.linma.breakout.data.PlayGrid;

public class TestExtras extends TestCase {
	
	private IPlayGrid grid = new PlayGrid(500, 500);

	private IGameController controller;

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()\n");

		// create controller
		controller = new GameController(grid, "test\\");
		controller.clearGrid();

		controller.initialize();
	}

	@Test
	public void testLevelEditing() {
		controller.processMenuInput(MENU_ITEM.MNU_LEVEL_EDITOR);
		assertTrue(controller.getCreativeMode());

		// controller knows at least one type of brick
		assertFalse(controller.getBrickClasses().isEmpty());
	}


	@Test
	public void testMenuInputs() {

		assertTrue(controller.getState() == GAME_STATE.MENU_MAIN);

		controller.processMenuInput(MENU_ITEM.MNU_NEW_GAME);
		assertTrue(controller.getState() == GAME_STATE.RUNNING);

//		controller.processGameInput(PLAYER_INPUT.PAUSE);
//		assertTrue(controller.getState() == GAME_STATE.PAUSED);
//
//		controller.processMenuInput(MENU_ITEM.MNU_CONTINUE);
//		assertTrue(controller.getState() == GAME_STATE.RUNNING);
//
//		controller.processGameInput(PLAYER_INPUT.PAUSE);
//		controller.processMenuInput(MENU_ITEM.MNU_BACK_MAIN_MENU);
//		assertTrue(controller.getState() == GAME_STATE.MENU_MAIN);
//
//		controller.processMenuInput(MENU_ITEM.MNU_END);
//		assertTrue(controller.getState() == GAME_STATE.KILLED);
	}


	@Override
	public void tearDown() {
		System.out.println("tearDown()\n");

		controller.processMenuInput(MENU_ITEM.MNU_END);
		System.out.println("close Databases");
		controller.close();
		controller = null;	
	}

}