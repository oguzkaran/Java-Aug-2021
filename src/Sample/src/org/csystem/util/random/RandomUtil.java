/*----------------------------------------------------------------------
	FILE        : RandomUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 20.02.2022

	Utility class that is used as an extension of Random class

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.random;

import java.util.Random;

public final class RandomUtil {
    private RandomUtil()
    {
    }

    public static int nextInt(Random random, int min, int bound)
    {
        return random.nextInt(bound - min) + min;
    }

    public static int nextIntClosed(Random random, int min, int max)
    {
        return nextInt(random, min, max + 1);
    }

    public static double nextDouble(Random random, double min, double bound)
    {
        return random.nextDouble() * (bound - min) + min;
    }

    //...
}
