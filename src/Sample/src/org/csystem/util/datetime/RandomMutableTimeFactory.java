/*----------------------------------------------------------------------
	FILE        : RandomMutableTimeFactory.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 15.01.2022

	Class that generates random MutableTime objects

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Random;

public class RandomMutableTimeFactory {
    private final Random m_random;

    public RandomMutableTimeFactory()
    {
        m_random = new Random();
    }

    public RandomMutableTimeFactory(Random random)
    {
        m_random = random;
    }

    public MutableTime createRandomTime()
    {
        return new MutableTime(m_random.nextInt(24), m_random.nextInt(60), m_random.nextInt(60), m_random.nextInt(1000));
    }
}
