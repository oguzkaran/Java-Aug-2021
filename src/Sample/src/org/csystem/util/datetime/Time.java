/*----------------------------------------------------------------------
	FILE        : Time.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 08.01.2022

	Immutable Time class that represents time with hour, minute, second
	and millisecond

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.csystem.util.datetime.TimeCheckCommon.checkTime;

public class Time {
    private final int m_hour;
    private final int m_minute;
    private final int m_second;
    private final int m_millisecond;

    //...

    /*  Bu ctor o anki sistem zamanını alır. Burada yazılan kodların ne anlama geldiği şu an için önemsizdir.
        Tasarım açısında default ctor'un yaptığı iş için yazılmıştır
     */
    private Time()
    {
        Calendar now = new GregorianCalendar();

        m_hour = now.get(Calendar.HOUR_OF_DAY);
        m_minute = now.get(Calendar.MINUTE);
        m_second = now.get(Calendar.SECOND);
        m_millisecond = now.get(Calendar.MILLISECOND);
    }

    //...

    private Time(int hour, int minute, int second, int millisecond)
    {
        checkTime(hour, minute, second, millisecond);
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_millisecond = millisecond;
    }

    public static final Time MAX = of(23, 59, 59, 999);
    public static final Time MIDNIGHT = of(0, 0);
    public static final Time MIN = MIDNIGHT;
    public static final Time NOON = of(12, 0);

    public static Time createRandomTime()
    {
        return createRandomTime(new Random());
    }

    public static Time createRandomTime(Random random)
    {
        return new Time(random.nextInt(24), random.nextInt(60), random.nextInt(60), random.nextInt(1000));
    }

    public static Time of(int hour, int minute)
    {
        return of(hour, minute, 0);
    }

    public static Time of(int hour, int minute, int second)
    {
        return of(hour, minute, second, 0);
    }

    public static Time of(int hour, int minute, int second, int millisecond)
    {
        return new Time(hour, minute, second, millisecond);
    }

    public static Time now()
    {
        return new Time();
    }

    public int getHour()
    {
        return m_hour;
    }

    public int getMinute()
    {
        return m_minute;
    }

    public int getSecond()
    {
        return m_second;
    }

    public int getMillisecond()
    {
        return m_millisecond;
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
}
