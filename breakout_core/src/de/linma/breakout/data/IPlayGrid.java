package de.linma.breakout.data;

import java.util.List;

import de.linma.breakout.data.objects.IBall;
import de.linma.breakout.data.objects.IBrick;
import de.linma.breakout.data.objects.IDecodable;

/**
 * This interface stores all data for the
 * play grid contains balls, bricks, slider and
 * dimensions of the playgrid.
 * 
 * @author MBausch
 *
 */
public interface IPlayGrid extends IDecodable {
	
	/**
	 * Clears all data of play grid
	 */
	void clearGrid();
	
	/**
	 * Checks if a ball has a collision with a brick
	 * 
	 * @param ball
	 * @return true if collision happens otherwise false
	 */
	boolean tryCollision(IBall ball);
	
	/**
	 * Returns all Brick Classes in playgrid
	 * @return
	 */
	List<IBrick> getBrickClasses();
	
	/**
	 * @return height
	 */
	int getHeight();
	
	/**
	 * @param height
	 */
	void setHeight(int height);
	
	/**
	 * @return width
	 */
	int getWidth();
	
	/**
	 * @param width
	 */
	void setWidth(int width);
	
	/**
	 * @return all balls in playgrid
	 */
	List<IBall> getBalls();
	
	/**
	 * @param ball
	 */
	void addBall(IBall ball);
	
	/**
	 * @return all bricks in playgrid
	 */
	List<IBrick> getBricks();
	
	/**
	 * @param brick
	 */
	void addBrick(IBrick brick);
	
	/**
	 * @return the slider
	 */
	IBrick getSlider();
	
	/**
	 * @param slider
	 */
	void setSlider(IBrick slider);
	
}
