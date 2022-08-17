/*----------------------------------------------------------------
	FILE		: Time.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 16.08.2022

	Time class that represents a local time

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    private int m_hour;
    private int m_minute;
    private int m_second;
    private int m_millisecond;

    private static void doWorkForException(String message)
    {
        throw new DateTimeException(message);
    }

    private static boolean isValid(int value, int bound)
    {
        return 0 <= value && value <= bound;
    }

    private static boolean isValidHour(int value)
    {
        return isValid(value, 23);
    }

    private static boolean isValidMinute(int value)
    {
        return isValid(value, 59);
    }

    private static boolean isValidSecond(int value)
    {
        return isValid(value, 59);
    }

    private static boolean isValidMillisecond(int value)
    {
        return isValid(value, 999);
    }

    private static boolean isValidTime(int hour, int minute, int second, int milliseconds)
    {
        return isValidHour(hour) && isValidMinute(minute) && isValidSecond(second) && isValidMillisecond(milliseconds);
    }

    private static void checkForHour(int value)
    {
        if (!isValidHour(value))
            doWorkForException("Invalid hour value: " + value);
    }

    private static void checkForMinute(int value)
    {
        if (!isValidMinute(value))
            doWorkForException("Invalid minute value: " + value);
    }

    private static void checkForSecond(int value)
    {
        if (!isValidSecond(value))
            doWorkForException("Invalid second value: " + value);
    }

    private static void checkForMillisecond(int value)
    {
        if (!isValidMillisecond(value))
            doWorkForException("Invalid millisecond value: " + value);
    }

    private static void checkForTime(int hour, int minute, int second, int millisecond)
    {
        if (!isValidTime(hour, minute, second, millisecond))
            doWorkForException(String.format("Invalid time value(s) -> h: %d, m: %d, s: %d, ms: %d",
                    hour, minute, second, millisecond));
    }

    public Time() //Burada yazılan kodların şu an bilinmesi gerekmez. Sadece default ctor'un anlamına odaklanınız
    {
        Calendar now = new GregorianCalendar();

        m_hour = now.get(Calendar.HOUR_OF_DAY);
        m_minute = now.get(Calendar.MINUTE);
        m_second = now.get(Calendar.SECOND);
        m_millisecond = now.get(Calendar.MILLISECOND);
    }

    public Time(int hour, int minute)
    {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second)
    {
        this(hour, minute, second, 0);
    }

    public Time(int hour, int minute, int second, int millisecond)
    {
        checkForTime(hour, minute, second, millisecond);
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_millisecond = millisecond;
    }

    public int getHour()
    {
        return m_hour;
    }

    public void setHour(int value)
    {
        if (value == m_hour)
            return;
        checkForHour(value);
        m_hour = value;
    }

    public int getMinute()
    {
        return m_minute;
    }

    public void setMinute(int value)
    {
        if (value == m_minute)
            return;

        checkForMinute(value);
        m_minute = value;
    }

    public int getSecond()
    {
        return m_second;
    }

    public void setSecond(int value)
    {
        if (value == m_second)
            return;

        checkForSecond(value);
        m_second = value;
    }

    public int getMillisecond()
    {
        return m_millisecond;
    }
    public void setMillisecond(int value)
    {
        if (value == m_millisecond)
            return;

        checkForMillisecond(value);
        m_millisecond = value;
    }

    public String toString()
    {
        return String.format("%s:%02d", this.toShortTimeString(), m_second);
    }

    public String toShortTimeString()
    {
        return String.format("%02d:%02d", m_hour, m_minute);
    }

    public String toLongTimeString()
    {
        return String.format("%s.%03d", this.toString(), m_millisecond);
    }
}
