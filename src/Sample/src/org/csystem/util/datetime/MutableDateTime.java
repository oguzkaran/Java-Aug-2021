/*----------------------------------------------------------------------
	FILE        : MutableDateTime.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 30.01.2022

	Mutable class that represents date and time

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

public class MutableDateTime {
    private final MutableDate m_date;
    private final MutableTime m_time;

    private MutableDateTime(int day, int month, int year, int hour, int minute, int second, int millisecond)
    {
        m_date = new MutableDate(day, month, year);
        m_time = new MutableTime(hour, minute, second, millisecond);
    }

    public MutableDateTime(int day, Month month, int year)
    {
        this(day, month, year, 0, 0);
    }

    public MutableDateTime(int day, Month month, int year, int hour, int minute)
    {
        this(day, month, year, hour, minute, 0);
    }

    public MutableDateTime(int day, Month month, int year, int hour, int minute, int second)
    {
        this(day, month.ordinal() + 1, year, hour, minute, second, 0);
    }

    public MutableDateTime(int day, Month month, int year, int hour, int minute, int second, int millisecond)
    {
        this(day, month.ordinal() + 1, year, hour, minute, second, millisecond);
    }


}
