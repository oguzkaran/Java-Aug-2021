/*----------------------------------------------------------------------
	FILE        : MutableTime.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 29.01.2022

	MutableTime class that represents time with hour, minute, second
	and millisecond

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.csystem.util.datetime.TimeCheckCommon.*;

public class MutableTime {
    private int m_hour;
    private int m_minute;
    private int m_second;
    private int m_millisecond;
    //...

    public static final MutableTime MAX = new MutableTime(23, 59, 59, 999);
    public static final MutableTime MIDNIGHT = new MutableTime(0, 0, 0, 0);
    public static final MutableTime MIN = MIDNIGHT;
    public static final MutableTime NOON = new MutableTime(12, 0, 0, 0);


    /*  Bu ctor o anki sistem zamanını alır. Burada yazılan kodların ne anlama geldiği şu an için önemsizdir.
        Tasarım açısında default ctor'un yaptığı iş için yazılmıştır
    */
    public MutableTime()
    {
        Calendar now = new GregorianCalendar();

        m_hour = now.get(Calendar.HOUR_OF_DAY);
        m_minute = now.get(Calendar.MINUTE);
        m_second = now.get(Calendar.SECOND);
        m_millisecond = now.get(Calendar.MILLISECOND);
    }

    public MutableTime(int hour, int minute)
    {
        this(hour, minute, 0);
    }

    public MutableTime(int hour, int minute, int second)
    {
        this(hour, minute, second, 0);
    }

    public MutableTime(int hour, int minute, int second, int millisecond)
    {
        checkTime(hour, minute, second, millisecond);
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_millisecond = millisecond;
    }

    public int getHour()
    {
        return m_hour;
    }

    public void setHour(int hour)
    {
        if (m_hour == hour)
            return;
        checkHour(hour);
        m_hour = hour;
    }

    public int getMinute()
    {
        return m_minute;
    }

    public void setMinute(int minute)
    {
        if (m_minute == minute)
            return;
        checkMinute(minute);
        m_minute = minute;
    }

    public int getSecond()
    {
        return m_second;
    }

    public void setSecond(int second)
    {
        if (m_second == second)
            return;
        checkSecond(second);
        m_second = second;
    }

    public int getMillisecond()
    {
        return m_millisecond;
    }

    public void setMillisecond(int millisecond)
    {
        if (m_millisecond == millisecond)
            return;
        checkMillisecond(millisecond);
        m_millisecond = millisecond;
    }

    public String toShortTimeString()
    {
        return String.format("%02d:%02d", m_hour, m_minute);
    }

    public String toString()
    {
        return String.format("%s:%02d", toShortTimeString(), m_second);
    }

    public String toLongTimeString()
    {
        return String.format("%s.%03d", toString(), m_millisecond);
    }

    //...
}
