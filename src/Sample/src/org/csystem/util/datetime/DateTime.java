/*----------------------------------------------------------------
	FILE		: DateTime.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 06.06.2022

	DateTime class that represents a local date and time

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.datetime;

public class DateTime {
    private final Date m_date;
    private final Time m_time;

    public DateTime(int day, Month month, int year)
    {
        this(day, month, year, 0, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute)
    {
        this(day, month, year, hour, minute, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute, int second)
    {
        this(day, month, year, hour, minute, second, 0);
    }

    public DateTime(int day, Month month, int year, int hour, int minute, int second, int millisecond)
    {
        this(day, month.ordinal() + 1, year, hour, minute, second, millisecond);
    }

    public DateTime(int day, int month, int year, int hour, int minute, int second, int millisecond)
    {
        m_date = new Date(day, month, year);
        m_time = new Time(hour, minute, second, millisecond);
    }

    public int getDay()
    {
        return m_date.getDay();
    }

    public void setDay(int value)
    {
        m_date.setDay(value);
    }

    public Month getMonth()
    {
        return m_date.getMonth();
    }

    public void setMonth(Month month)
    {
        m_date.setMonth(month);
    }

    public int getYear()
    {
        return m_date.getYear();
    }

    public void setYear(int value)
    {
        m_date.setYear(value);
    }

    public DayOfWeek getDayOfWeek()
    {
        return m_date.getDayOfWeek();
    }

    public String getDayOfWeekTR()
    {
        return m_date.getDayOfWeekTR();
    }

    public String getDayOfWeekEN()
    {
        return m_date.getDayOfWeekEN();
    }

    public boolean isLeapYear()
    {
        return m_date.isLeapYear();
    }

    public boolean isWeekend()
    {
        return m_date.isWeekend();
    }

    public boolean isWeekday()
    {
        return m_date.isWeekday();
    }

    public int getHour()
    {
        return m_time.getHour();
    }

    public void setHour(int value)
    {
        m_time.setHour(value);
    }

    public int getMinute()
    {
        return m_time.getMinute();
    }

    public void setMinute(int value)
    {
        m_time.setMinute(value);
    }

    public int getSecond()
    {
        return m_time.getSecond();
    }

    public void setSecond(int value)
    {
        m_time.setSecond(value);
    }

    public int getMillisecond()
    {
        return m_time.getMillisecond();
    }

    public void setMillisecond(int value)
    {
        m_time.setMillisecond(value);
    }

    public String toShortTimeString()
    {
        return m_time.toShortTimeString();
    }

    public String toLongTimeString()
    {
        return m_time.toLongTimeString();
    }

    public String toShortDateStringTR()
    {
        return m_date.toShortDateStringTR();
    }

    public String toShortDateStringEN()
    {
        return m_date.toShortDateStringEN();
    }

    public String toLongDateStringTR()
    {
        return m_date.toLongDateStringTR();
    }

    public String toLongDateStringEN()
    {
        return m_date.toLongDateStringEN();
    }

    public String toShortDateTimeStringTR()
    {
        return String.format("%s %s", m_date.toShortDateStringTR(), m_time.toShortTimeString());
    }

    public String toShortDateTimeStringEN()
    {
        return String.format("%s %s", m_date.toShortDateStringEN(), m_time.toShortTimeString());
    }

    public String toLongDateTimeStringTR()
    {
        return String.format("%s %s", m_date.toLongDateStringTR(), m_time.toLongTimeString());
    }

    public String toLongDateTimeStringEN()
    {
        return String.format("%s %s", m_date.toLongDateStringEN(), m_time.toLongTimeString());
    }

    public String toString(char sep)
    {
        return String.format("%s %s", m_date.toString(sep), m_time.toString());
    }
    public String toString()
    {
        return toString('/');
    }

    //...
}
