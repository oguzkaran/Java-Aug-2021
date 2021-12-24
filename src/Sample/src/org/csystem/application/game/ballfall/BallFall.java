package org.csystem.application.game.ballfall;

public class BallFall {
	public static void fillSpace(int begin, int end) //[begin, end)
	{
		for (int i = begin; i < end; ++i)
			System.out.print(' ');
	}
	
	public static void fillBall(int ballIndex, int end)
	{
		fillSpace(0, ballIndex);
		System.out.print('*');
		fillSpace(ballIndex + 1, end);
	}
	public static boolean updateRightFlag(boolean isRight, int ballIndex, int width)
	{
		if (ballIndex == 0)
			isRight = true;
		else if (ballIndex == width - 1)
			isRight = false;
		
		return isRight; 
	}
	
	public static int updateBallIndex(int ballIndex, boolean isRight, int width)
	{
		return isRight ? ballIndex + 1 : ballIndex - 1;				
	}
	
	public static void play(int width, int height)
	{
		int ballIndex = 0;
		boolean isRight = false;
		
		for (int i = 1; i <= height; ++i) {
			System.out.print('|');
			fillBall(ballIndex, width);
			if (width != 1) {
				isRight = updateRightFlag(isRight, ballIndex, width);
				ballIndex = updateBallIndex(ballIndex, isRight, width);
			}
			System.out.println('|');
		}
	}
}
