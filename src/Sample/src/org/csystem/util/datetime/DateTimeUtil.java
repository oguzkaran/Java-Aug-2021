/*----------------------------------------------------------------
	FILE		: DateUtil.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 21.05.2022

	Utility class for Date and Time other operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Random;

public class DateTimeUtil {
    private DateTimeUtil()
    {
    }

    public static Date randomDate(Random r, int minYear, int maxYear)
    {
        //TODO
        return new Date();
    }

    public static Date randomDate(Random r, int year)
    {
        return randomDate(r, year, year);
    }

    public static Date randomDate(Random r)
    {
        return randomDate(r, new Date().getYear());
    }

    //...

    public static Time randomTime(Random r)
    {
        //TODO
        return new Time();
    }

    //...
}
