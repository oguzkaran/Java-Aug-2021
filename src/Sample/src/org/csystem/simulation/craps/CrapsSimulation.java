package org.csystem.simulation.craps;

import org.csystem.game.craps.Craps;

public class CrapsSimulation {
	public double p;
	
	public void run(int n)
	{
		p = 0;
		int winCount = 0;
		
		for (int i = 0; i < n; ++i) {
			Craps craps = new Craps();
			
			craps.play();
			
			if (craps.isWin())
				++winCount;
		}
		
		p = (double)winCount / n;
	}
}
