/*----------------------------------------------------------------------
	FILE        : RandomUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 04.12.2021

	Utility class that is used as an extension of Random class

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/

package org.csystem.util.random;

import java.util.Random;

public class RandomUtil {
    public static int nextInt(Random random, int min, int bound)
    {
        return random.nextInt(bound - min) + min;
    }

    public static double nextDouble(Random random, double min, double bound)
    {
        return random.nextDouble() * (bound - min) + min;
    }

    //...
}
