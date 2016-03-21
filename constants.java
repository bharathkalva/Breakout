
public interface constants {
	
	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;

/** Dimensions of the paddle */
	public static final int PADDLE_WIDTH = 60;
	public static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	public static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	public static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	public static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	public static final int BRICK_SEP = 4;

/** Width of a brick */
	public static final double BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW + 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	public static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	public static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	public static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	public static final int NTURNS = 3;


}
