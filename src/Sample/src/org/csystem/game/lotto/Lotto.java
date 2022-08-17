package org.csystem.game.lotto;

import org.csystem.util.numeric.NumberUtil;

import java.util.Random;

public class Lotto {
	private boolean m_winGame1;
	private boolean m_winGame2;
	private boolean m_winGame3;
	private final Random m_random;

	public int getRandom()
	{
		return m_random.nextInt(99) + 1;
	}

	public int getFirst()
	{
		return getRandom();
	}

	public int getSecond(int first)
	{
		int second;

		while ((second = getRandom()) == first)
			;

		return second;
	}

	public int getThird(int first, int second)
	{
		int third;

		while ((third = getRandom()) == first || third == second)
			;

		return third;
	}

	public void playGame1(int first, int second, int third)
	{
		m_winGame1 = first + second + third < 150;
	}

	public void playGame2(int first, int second, int third)
	{
		m_winGame2 = NumberUtil.isPrime(first + second + third);
	}

	public void playGame3(int first, int second, int third)
	{
		int min = NumberUtil.min(first, second, third);
		int max = NumberUtil.max(first, second, third);
		int mid = first + second + third - max - min;

		m_winGame3 = max - min > mid;
	}

	public Lotto(Random r)
	{
		m_random = r;
	}

	public void play()
	{
		int first = getFirst();
		int second = getSecond(first);
		int third = getThird(first, second);

		playGame1(first, second, third);
		playGame2(first, second, third);
		playGame3(first, second, third);
	}

	public boolean isWinGame1()
	{
		return m_winGame1;
	}

	public boolean isWinGame2()
	{
		return m_winGame2;
	}

	public boolean isWinGame3()
	{
		return m_winGame3;
	}
}