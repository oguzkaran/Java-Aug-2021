/*----------------------------------------------------------------------------------------------------------------------	 
	 Homework-002-4. sorunun bir çözümü
	 (Not: İleride daha iyisi yazılacaktır)	 
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.application.game.ballfall;

public class BallFallGameApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		
		for (;;) {
			System.out.print("Width?");
			int width = Integer.parseInt(kb.nextLine());
			
			if (width == 0)
				break;
			
			System.out.print("Height?");
			int height = Integer.parseInt(kb.nextLine());
			
			BallFall.play(width, height);		
		}
	}
}