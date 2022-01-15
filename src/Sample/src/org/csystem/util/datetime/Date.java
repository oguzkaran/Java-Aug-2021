/*----------------------------------------------------------------------
	FILE        : Date.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 15.01.2022

	Immutable Date class that represents date with day, month, year and related
	values

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.csystem.util.datetime.DateCheckCommon.*;

public class Date {
    private final int m_day;
    private final int m_month;
    private final int m_year;
    private final int m_dayOfWeek;

    /*  Bu ctor o anki sistem tarihini alır. Burada yazılan kodların ne anlama geldiği şu an için önemsizdir.
        Tasarım açısından default ctor'un yaptığı iş için yazılmıştır
     */
    private Date()
    {
        Calendar today = new GregorianCalendar();

        m_day = today.get(Calendar.DAY_OF_MONTH);
        m_month = today.get(Calendar.MONTH) + 1;
        m_year = today.get(Calendar.YEAR);
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

    private Date(int day, int month, int year)
    {
        checkDate(day, month, year);
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = getDayOfWeek(m_day, m_month, m_year);
    }

    public static Date today()
    {
        return new Date();
    }


    public static Date of(int day, int month, int year)
    {
        return new Date(day, month, year);
    }

    public int getDay()
    {
        return m_day;
    }

    public int getMonthValue()
    {
        return m_month;
    }

    public int getYear()
    {
        return m_year;
    }

    public int getDayOfWeekValue()
    {
        return m_dayOfWeek;
    }

    public String getDayOfWeekTR()
    {
        return DAYS_OF_WEEK_TR[m_dayOfWeek];
    }

    public String getDayOfWeekEN()
    {
        return DAYS_OF_WEEK_EN[m_dayOfWeek];
    }

    public String getMonthTR()
    {
        return MONTHS_TR[m_month];
    }

    public String getMonthEN()
    {
        return MONTHS_EN[m_month];
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
        return getDateTR(m_day, m_month, m_year, m_dayOfWeek);
    }

    public String toLongDateStringEN()
    {
        return getDateEN(m_day, m_month, m_year, m_dayOfWeek);
    }
}
