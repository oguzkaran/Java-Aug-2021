/*----------------------------------------------------------------------------------------------------------------------	 
	 Homework-002-4. sorunun bir çözümü
	 (Not: İleride daha iyisi yazılacaktır)	 
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.application.game.ballfall;

import java.util.Scanner;

public class BallFallGameApp {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		BallFall ballFall = new BallFall();
		
		for (;;) {
			System.out.print("Width?");
			int width = Integer.parseInt(kb.nextLine());
			
			if (width == 0)
				break;
			
			System.out.print("Height?");
			int height = Integer.parseInt(kb.nextLine());
			
			ballFall.play(width, height);

			System.out.println(ballFall.getShape());
		}
	}
}