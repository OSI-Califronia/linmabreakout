package de.linma.breakout.data.objects.impl;

import java.awt.Color;

import de.linma.breakout.data.objects.IBall;

/**
 * Data class for a Display brick.
 * @author mabausch
 *
 */
public class VisibleBrick extends AbstractBrick {

	private final static int SCORE = 4;
	private static final int MAX_FRAME_COUNTER = 5;
	
	private int frameCounter = 0;
	private int maxFrameCounter = 0;
	
	private boolean isVisible = true;
	
	/**
	 * Default Constructor
	 */
	public VisibleBrick() {
		super();
		isVisible = true;
		frameCounter = 0;
		maxFrameCounter = 0;
		getProperties().setProperty(PROP_COLOR, Color.yellow.toString());
		getProperties().setProperty(PROP_IMG_PATH, "resources\\movingBrick.png");
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.objects.IDecodable#decode(java.lang.String)
	 */
	public void decode(String line) {
		String[] s = decodeBasic(line);
		
		setScore(Integer.valueOf(s[SCORE]));
		setMaxFrameCounter(Integer.valueOf(s[MAX_FRAME_COUNTER]));
	}	

	/*
	 * (non-Javadoc)
	 * @see de.linma.breakout.data.objects.IDecodable#encode()
	 */
	public String encode() {
		StringBuilder sb = super.encodeBasic();
		// comma at start
		sb.append(String.format(",%d,", this.getMaxFrameCounter())); 
		
		return sb.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.luma.breakout.data.objects.impl.AbstractBrick#tryCollision(de.luma.breakout.data.objects.IBall)
	 */
	@Override
	public boolean tryCollision(IBall b) {
		if (!isVisible) {
			return false;
		}
		return super.tryCollisionRectangle(b);	
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.luma.breakout.data.objects.impl.AbstractBrick#onNextFrame()
	 */
	@Override
	public void onNextFrame() {
		super.onNextFrame();
		
		frameCounter++;
		
		if (frameCounter >= maxFrameCounter) {
			if (isVisible) {
				getProperties().setProperty(PROP_COLOR, Color.black.toString());
				isVisible = false;
			} else {
				getProperties().setProperty(PROP_COLOR, Color.yellow.toString());
				isVisible = true;
			}
			frameCounter = 0;
		}
	}
	
	/**
	 * @return the Frame Counter for invisible time
	 */
	public int getMaxFrameCounter() {
		return maxFrameCounter;
	}

	/**
	 * @param frameCounter for invisible time
	 */
	public void setMaxFrameCounter(int maxFrameCounter) {
		this.maxFrameCounter = maxFrameCounter;
	}

}
