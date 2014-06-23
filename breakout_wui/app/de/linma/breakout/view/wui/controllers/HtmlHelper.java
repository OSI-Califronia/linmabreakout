package de.linma.breakout.view.wui.controllers;

import java.util.ArrayList;
import java.util.List;

import de.linma.breakout.communication.MENU_ITEM;
import de.linma.breakout.communication.TextMapping;
import de.linma.breakout.controller.IGameController;
import de.linma.breakout.data.highscore.IHighscore;
import de.linma.breakout.data.objects.IBall;
import de.linma.breakout.data.objects.IBrick;
import de.linma.breakout.data.objects.impl.MovingBrick;

public class HtmlHelper {
	
	public static class MenuParameter {
		public String title;
		public List<MenuItemParameter> menuItems;
		
		public MenuParameter(String title, List<MenuItemParameter> menuItems) {
			super();
			this.title = title;
			this.menuItems = menuItems;
		}
	}

	public static class MenuItemParameter {
		public String text;
		public Integer index;
		
		public MenuItemParameter(String text, Integer index) {
			super();
			this.text = text;
			this.index = index;
		}				
	}
	
	public static class HtmlBrick {
		public int x,y,width,height;
		public String color;
		
		public HtmlBrick(int x, int y, int width, int height) {
			this.x = x; 
			this.y = y;
			this.width = width;
			this.height = height;
		}
	}
	
	public static class HighscoreItemParameter {
		public Integer number;
		public String username;
		public Integer score;
		
		public HighscoreItemParameter(Integer number, String username, Integer score) {
			super();
			this.number = number;
			this.username = username;
			this.score = score;
		}
	}
	
	/**
	 * Returns the list of bricks.
	 */
	public static List<HtmlBrick> getBricks(IGameController gameController) {
		List<HtmlBrick> bricks = new ArrayList<HtmlBrick>(gameController.getBricks().size());
		
		// add normal bricks
		for(IBrick brick : gameController.getBricks()) {
			HtmlBrick htmlBrick = new HtmlBrick(brick.getX(), brick.getY(), brick.getWidth(), brick.getHeight());
			
			if (brick instanceof MovingBrick) {
				htmlBrick.color = "red";
			} else {
				htmlBrick.color = "blue";
			}
			
			bricks.add(htmlBrick);
		}
		
		// add slider
		IBrick slider = gameController.getSlider();
		HtmlBrick htmlSlider = new HtmlBrick(slider.getX(), slider.getY(), slider.getWidth(), slider.getHeight());
		htmlSlider.color = "green";
		bricks.add(htmlSlider);
		return bricks;
	}
	
	
	public static List<HtmlBrick> getBalls(IGameController gameController) {
		List<HtmlBrick> balls = new ArrayList<HtmlBrick>(gameController.getBalls().size());

		for(IBall ball : gameController.getBalls()) {
			
			int radius = (int)ball.getRadius();
			HtmlBrick htmlBrick = new HtmlBrick((int)ball.getX() - radius/2, (int)ball.getY() - radius/2, (int)ball.getRadius(), (int)ball.getRadius());
			balls.add(htmlBrick);
		}
		return balls;
	}
	
	
	public static List<MenuItemParameter> getMenuItems(MENU_ITEM[] menuItems) {
		if (menuItems == null || menuItems.length == 0) {
			return new ArrayList<MenuItemParameter>(0);
		}		
		
		List<MenuItemParameter> menuList = new ArrayList<MenuItemParameter>();		
		for (MENU_ITEM menuItem : menuItems) {
			menuList.add(new MenuItemParameter(TextMapping.getTextForMenuEnum(menuItem), menuItem.ordinal()));			
		}
		
		return menuList;
	}
	
	public static MenuParameter getMenu(MENU_ITEM[] menuItems, String title) {
		return new MenuParameter(title, getMenuItems(menuItems));
	}
	
	public static List<HighscoreItemParameter> getHighscoreItems(IGameController gameController) {
		List<HighscoreItemParameter> highscoreList = new ArrayList<HighscoreItemParameter>();
		
		// real Highscore data
		int i = 1;
		for(IHighscore score : gameController.getHighscoreList()) {
			HighscoreItemParameter htmlScore = new HighscoreItemParameter(i, score.getUserName(), score.getPoints());
						
			highscoreList.add(htmlScore);
			i++;
			
			// display only 10 scores
			if (i > 10) {
				break;
			}
		}
		
		
		// dummy data
//		highscoreList.add(new HighscoreItemParameter(1, "gustel@html.net", 400));
//		highscoreList.add(new HighscoreItemParameter(2, "manfred@gmx.net", 300));
//		highscoreList.add(new HighscoreItemParameter(3, "gogo@google.com", 100));
		
		return highscoreList;
	}
}
