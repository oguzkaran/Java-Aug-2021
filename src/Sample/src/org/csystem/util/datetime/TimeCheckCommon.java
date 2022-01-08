/*----------------------------------------------------------------------
	FILE        : TimeCheckCommon.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 08.01.2022

	Utility package private class that is used for checking time

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

class TimeCheckCommon {
    private TimeCheckCommon()
    {
    }

    static void doWorkForException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemlerine kadar sabredin
    }

    static boolean isValidForBound(int val, int bound)
    {
        return 0 <= val && val <= bound;
    }

    static boolean isValidHour(int val)
    {
        return isValidForBound(val, 23);
    }

    static boolean isValidMinute(int val)
    {
        return isValidForBound(val, 59);
    }

    static boolean isValidSecond(int val)
    {
        return isValidForBound(val, 59);
    }

    static boolean isValidMillisecond(int val)
    {
        return isValidForBound(val, 999);
    }

    static boolean isValidTime(int hour, int minute, int second, int millisecond)
    {
        return isValidHour(hour) && isValidMinute(minute)
                && isValidSecond(second) && isValidMillisecond(millisecond);
    }

    static void checkHour(int hour)
    {
        if (!isValidHour(hour))
            doWorkForException("Invalid hour value:" + hour);
    }

    static void checkMinute(int minute)
    {
        if (!isValidMinute(minute))
            doWorkForException("Invalid minute value:" + minute);
    }

    static void checkSecond(int second)
    {
        if (!isValidSecond(second))
            doWorkForException("Invalid second value:" + second);
    }

    static void checkTime(int hour, int minute, int second, int millisecond)
    {
        if (isValidTime(hour, minute, second, millisecond))
            return;

        String hs = isValidHour(hour) ? "" : "h -> " + hour + " ";
        String ms = isValidMinute(minute) ? "" : "m -> " + minute + " ";
        String ss = isValidSecond(second) ? "" : "s -> " + second + " ";
        String mss = isValidMillisecond(millisecond) ? "" : "ms -> " + millisecond + " ";

        doWorkForException(String.format("Invalid time value(s): %s%s%s%s", hs, ms, ss, mss));
    }

    static void checkMillisecond(int millisecond)
    {
        if (!isValidMillisecond(millisecond))
            doWorkForException("Invalid millisecond value:" + millisecond);
    }
}
