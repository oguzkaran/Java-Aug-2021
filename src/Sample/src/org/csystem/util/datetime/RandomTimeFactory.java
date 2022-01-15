/*----------------------------------------------------------------------
	FILE        : RandomTimeFactory.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 15.01.2022

	Class that generates random Time objects

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Random;

public class RandomTimeFactory {
    private final Random m_random;

    public RandomTimeFactory()
    {
        m_random = new Random();
    }

    public RandomTimeFactory(Random random)
    {
        m_random = random;
    }

    public Time createRandomTime()
    {
        return Time.of(m_random.nextInt(24), m_random.nextInt(60), m_random.nextInt(60), m_random.nextInt(1000));
    }
}
