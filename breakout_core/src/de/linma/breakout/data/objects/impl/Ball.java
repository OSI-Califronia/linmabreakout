package de.linma.breakout.data.objects.impl;

import de.linma.breakout.data.objects.IBall;
import de.linma.breakout.data.objects.IDecodable;

/**
 * Data class for Ball Component
 * @author mabausch
 *
 */
public class Ball implements IBall {

	private static final int BALL_SPEED_Y = 3;
	private static final int BALL_RADIUS = 4;
	
	private double x;
	private double y;
	private double speedX;
	private double speedY;
	private double radius;
	
	/**
	 * Default Constructor
	 */
	public Ball() {
		super();
	}

	/**
	 * constructor with all arguments
	 * @param x
	 * @param y
	 * @param speedX
	 * @param speedY
	 * @param radius
	 */
	public Ball(double x, double y, double speedX, double speedY, double radius) {
		super();
		setX(x);
		setY(y);
		setSpeedX(speedX);
		setSpeedY(speedY);
		setRadius(radius);
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#getX()
	 */	
	public double getX() {
		return x;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#setX(double)
	 */
	public final void setX(double x) {
		this.x = x;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#getY()
	 */
	public double getY() {
		return y;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#setY(double)
	 */
	public final void setY(double y) {
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#getSpeedX()
	 */
	public double getSpeedX() {
		return speedX;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#setSpeedX(double)
	 */
	public final void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#getSpeedY()
	 */
	public double getSpeedY() {
		return speedY;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#setSpeedY(double)
	 */
	public final void setSpeedY(double speedY) {
		this.speedY = speedY;
	}
	
	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#getRadius()
	 */
	public double getRadius() {
		return radius;
	}

	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#setRadius(double)
	 */
	public final void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#inverseSpeedX()
	 */
	public void inverseSpeedX() {
		speedX = speedX * (-1);
	}
	
	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#inverseSpeedY()
	 */
	public void inverseSpeedY() {
		speedY = speedY * (-1);
	}
	
	/* (non-Javadoc)
	 * @see de.luma.breakout.data.objects.Ball#getAbsoluteSpeed()
	 */
	public double getAbsoluteSpeed() {
		return Math.sqrt(Math.pow(getSpeedX(), 2) + Math.pow(getSpeedY(), 2));
	}

	public void decode(String line) {
		String[] s = line.split(",");
		setX(Double.valueOf(s[0]));
		setY(Double.valueOf(s[1]));	
		setSpeedX(Double.valueOf(s[2]));
		setSpeedY(Double.valueOf(s[BALL_SPEED_Y]));
		setRadius(Double.valueOf(s[BALL_RADIUS]));
	}

	public String encode() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format(IDecodable.FloatFormatString + ",", this.getX()));
		sb.append(String.format(IDecodable.FloatFormatString + ",", this.getY()));
		sb.append(String.format(IDecodable.FloatFormatString + ",", this.getSpeedX()));
		sb.append(String.format(IDecodable.FloatFormatString + ",", this.getSpeedY()));
		sb.append(String.format(IDecodable.FloatFormatString, this.getRadius()));
		
		return sb.toString();
	}
	
}
