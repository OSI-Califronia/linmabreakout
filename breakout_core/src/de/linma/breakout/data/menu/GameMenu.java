package de.linma.breakout.data.menu;

import de.linma.breakout.communication.MENU_ITEM;

/**
 * This class stores data for Game Menu.
 *  - Title
 *  - Items
 * 
 * @author MBausch
 *
 */
public class GameMenu {

	private MENU_ITEM[] menuItems;
	private String title;

	/**
	 * Constructor with all arguments.
	 * 
	 * @param menuItems
	 * @param title
	 */
	public GameMenu(final MENU_ITEM[] menuItems, final String title) {
		super();
		this.menuItems = menuItems;
		this.title = title;
	}	
	
	/**
	 * This method returns the menu Items
	 * @return items
	 */
	public MENU_ITEM[] getMenuItems() {
		return menuItems;
	}

	/**
	 * This method returns the Title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
}
