package org.csystem.game.craps;

public class Craps {
	private boolean m_win;
	
	private static int roll(java.util.Random r)
	{
		return (r.nextInt(6) + 1) + (r.nextInt(6) + 1);
	}
	
	private void rollForIndefinite(java.util.Random r, int result)
	{
		int total;
		
		while ((total = roll(r)) != result && total != 7)
			;
		
		m_win = total == result;
	}

	public boolean isWin()
	{
		return m_win;
	}

	public void play()
	{
		java.util.Random r = new java.util.Random();		
		int total = roll(r);
		
		switch (total) {
		case 7, 11 -> m_win = true;
		case 2, 3, 12 -> m_win = false;
		default -> rollForIndefinite(r, total); 
		}
	}
}
