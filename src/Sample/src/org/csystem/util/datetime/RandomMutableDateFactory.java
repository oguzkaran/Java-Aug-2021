/*----------------------------------------------------------------------
	FILE        : RandomMutableDateFactory.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 22.01.2022

	Class that generates random MutableDate objects

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Random;


public class RandomMutableDateFactory {
    private static MutableDate createRandomDate(Random r, int minYear, int maxYear)
    {
        int year = r.nextInt(maxYear - minYear + 1) + minYear;
        int month = r.nextInt(12) + 1;
        int day = r.nextInt(DateCheckCommon.MONTHS[month - 1].getDays(month, year)) + 1;

        return new MutableDate(day, month, year);
    }

    private final Random m_random;

    public RandomMutableDateFactory()
    {
        m_random = new Random();
    }

    public RandomMutableDateFactory(Random random)
    {
        m_random = random;
    }

    public MutableDate createRandomDate()
    {
        return createRandomDate(new MutableDate().getYear());
    }

    public MutableDate createRandomDate(int year)
    {
        return createRandomDate(m_random, year, year);
    }


    public MutableDate createRandomDate(int minYear, int maxYear)
    {
        return createRandomDate(m_random, minYear, maxYear);
    }
}
