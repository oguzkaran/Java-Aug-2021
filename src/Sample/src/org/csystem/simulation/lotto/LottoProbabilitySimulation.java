package org.csystem.simulation.lotto;

import org.csystem.game.lotto.Lotto;

import java.util.Random;

public class LottoProbabilitySimulation {
	private int m_count;
	private double m_game1Prob;
	private double m_game2Prob;
	private double m_game3Prob;

	public LottoProbabilitySimulation(int n)
	{
		m_count = n;
	}

	public void run()
	{
		Random r = new Random();
		Lotto lotto = new Lotto(r);
		int winCount1,  winCount2,  winCount3;

		winCount1 = winCount2 = winCount3 = 0;

		for (int i = 0; i < m_count; ++i) {
			lotto.play();

			if (lotto.isWinGame1())
				++winCount1;

			if (lotto.isWinGame2())
				++winCount2;

			if (lotto.isWinGame3())
				++winCount3;
		}
		m_game1Prob = (double)winCount1 / m_count;
		m_game2Prob = (double)winCount2 / m_count;
		m_game3Prob = (double)winCount3 / m_count;
	}

	public int getCount()
	{
		return m_count;
	}

	public double getGame1Prob()
	{
		return m_game1Prob;
	}

	public double getGame2Prob()
	{
		return m_game2Prob;
	}

	public double getGame3Prob()
	{
		return m_game3Prob;
	}
}


