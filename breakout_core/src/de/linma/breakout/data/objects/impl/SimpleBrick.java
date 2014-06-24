package de.linma.breakout.data.objects.impl;


/**
 * Data class for brick with fix size.
 * @author mabausch
 *
 */
public class SimpleBrick extends AbstractBrick {	
	
	private static final  int DEFAULT_WIDTH = 50;
	private static final  int DEFAULT_HEIGHT = 20;
	
	private final static int SCORE = 4;
	
	/**
	 * constructor 
	 * @param x
	 * @param y
	 */
	public SimpleBrick(int x, int y) {
		super(x, y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
		getProperties().setProperty(PROP_COLOR, "blue");
		getProperties().setProperty(PROP_IMG_PATH, "resources\\simpleBrick.png");
	}
	
	/**
	 * Constructor which set brick to  x 0 y 0.
	 */
	public SimpleBrick() {
		this(0, 0);
	}
	

	/*
	 * (non-Javadoc)
	 * @see de.luma.breakout.data.objects.IDecodable#decode(java.lang.String)
	 */
	public void decode(String line) {
		String[] s = super.decodeBasic(line);
		
		setScore(Integer.valueOf(s[SCORE]));
	}

	/*
	 * (non-Javadoc)
	 * @see de.luma.breakout.data.objects.IDecodable#encode()
	 */
	public String encode() {		
		return super.encodeBasic().toString();
	}

	
	/**
	 * SimpleBrick is not resizable, setWidth will be ignored.
	 */
	@Override
	public void setWidth(int width) {
		return;
	}
	/**
	 * SimpleBrick is not resizable, setHeight will be ignored.
	 */
	@Override
	public void setHeight(int height) {
		return;
	}


}
