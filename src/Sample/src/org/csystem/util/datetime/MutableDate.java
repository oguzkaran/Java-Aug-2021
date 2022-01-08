/*----------------------------------------------------------------------
	FILE        : MutableDate.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 08.01.2022

	MutableDate class that represents date with day, month, year and related
	values

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

public class MutableDate {
    private int m_day;
    private int m_month;
    private int m_year;
    private int m_dayOfWeek;

    private static void checkDate(int day, int month, int year)
    {
        DateCheckCommon.checkDate(day, month, year,
                String.format("Invalid date value(s): d -> %d, m -> %d, y -> %d", day, month, year));
    }

    private void checkDay(int day)
    {
        DateCheckCommon.checkDate(day, m_month, m_year, "Invalid day value:" + m_day);
    }

    private void checkMonth(int month)
    {
        DateCheckCommon.checkDate(m_day, month, m_year, "Invalid month value:" + m_month);
    }

    private void checkYear(int year)
    {
        DateCheckCommon.checkDate(m_day, m_month, year, "Invalid year value:" + m_year);
    }

    private void set(int day, int month, int year)
    {
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = DateCheckCommon.getDayOfWeek(m_day, m_month, m_year);
    }

    public MutableDate(int day, int month, int year)
    {
        checkDate(day, month, year);
        set(day, month, year);
    }

    public int getDay()
    {
        return m_day;
    }

    public void setDay(int day)
    {
        if (m_day == day)
            return;

        checkDay(day);
        set(day, m_month, m_year);
    }

    public int getMonthValue()
    {
        return m_month;
    }

    public void setMonthValue(int month)
    {
        if (m_month == month)
            return;

        checkMonth(month);
        set(m_day, month, m_year);
    }

    public int getYear()
    {
        return m_year;
    }

    public void setYear(int year)
    {
        if (m_year == year)
            return;

        checkYear(year);
        set(m_day, m_month, year);
    }

    public int getDayOfWeekValue()
    {
        return m_dayOfWeek;
    }

    public String getDayOfWeekTR()
    {
        return DateCheckCommon.DAYS_OF_WEEK_TR[m_dayOfWeek];
    }

    public String getDayOfWeekEN()
    {
        return DateCheckCommon.DAYS_OF_WEEK_EN[m_dayOfWeek];
    }

    public boolean isLeapYear()
    {
        return DateCheckCommon.isLeapYear(m_year);
    }

    public boolean isWeekend()
    {
        return m_dayOfWeek == 6 || m_dayOfWeek == 0;
    }

    public boolean isWeekday()
    {
        return !isWeekend();
    }

    public String toString()
    {
        return toString('/');
    }

    public String toString(char delimiter)
    {
        return String.format("%02d%c%02d%c%04d", m_day, delimiter, m_month, delimiter, m_year);
    }

    public String toLongDateStringTR()
    {
        return DateCheckCommon.getDateTR(m_day, m_month, m_year, m_dayOfWeek);
    }

    public String toLongDateStringEN()
    {
        return DateCheckCommon.getDateEN(m_day, m_month, m_year, m_dayOfWeek);
    }
}
