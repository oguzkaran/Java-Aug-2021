/*----------------------------------------------------------------------
	FILE        : NumberUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 07.11.2021

	Utility class that is used for numeric operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.numeric;

public class NumberUtil {
	//...
	public static boolean isPrime(long val)	
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
		
		for (long i = 11; i * i <= val; i += 2)	
			if (val % i == 0)
				return false;
		
		return true;
	}		
}
