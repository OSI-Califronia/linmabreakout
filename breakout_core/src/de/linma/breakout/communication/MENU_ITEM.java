package de.linma.breakout.communication;

/**
 * Types of menu items.
 */
public enum MENU_ITEM {
	/** Start new game, load first level */
	MNU_NEW_GAME,
	/** Load next level in level list */
	MNU_NEXT_LEVEL,
	/** Open level selection menu */
	MNU_LEVEL_CHOOSE,
	/** Open level editor */
	MNU_LEVEL_EDITOR,
	/** Continue a running game */
	MNU_CONTINUE,
	/** Open main menu */
	MNU_BACK_MAIN_MENU,
	/** Terminate game */
	MNU_END,
	/** Open Highscore */
	MNU_HIGHSCORE,
	/** Shows Main Menu or Game over Menu */
	MNU_HIGHSCORE_NEXT
}
