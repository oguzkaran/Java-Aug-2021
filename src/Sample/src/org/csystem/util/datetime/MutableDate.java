/*----------------------------------------------------------------------
	FILE        : MutableDate.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 22.01.2022

	MutableDate class that represents date with day, month, year and related
	values

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.csystem.util.datetime.DateCheckCommon.*;

public class MutableDate {
    private int m_day;
    private int m_month;
    private int m_year;
    private int m_dayOfWeek;

    private void checkDay(int day)
    {
        checkDate(day, m_month, m_year, "Invalid day value: " + day);
    }

    private void checkMonth(int month)
    {
        checkDate(m_day, month, m_year, "Invalid month value: " + month);
    }

    private void checkYear(int year)
    {
        checkDate(m_day, m_month, year, "Invalid year value: " + year);
    }

    private void set(int day, int month, int year)
    {
        m_day = day;
        m_month = month;
        m_year = year;
        m_dayOfWeek = DateCheckCommon.getDayOfWeek(m_day, m_month, m_year);
    }

     /*  Bu ctor o anki sistem tarihini alır. Burada yazılan kodların ne anlama geldiği şu an için önemsizdir.
        Tasarım açısından default ctor'un yaptığı iş için yazılmıştır
     */

    public MutableDate()
    {
        Calendar today = new GregorianCalendar();

        set(today.get(Calendar.DAY_OF_MONTH), today.get(Calendar.MONTH) + 1, today.get(Calendar.YEAR));
    }

    public MutableDate(int day, int month, int year)
    {
        checkDate(day, month, year);
        set(day, month, year);
    }

    public MutableDate(int day, Month month, int year)
    {
        checkDate(day, month.ordinal() + 1, year);
        set(day, month.ordinal() + 1, year);
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

    public Month getMonth()
    {
        return DateCheckCommon.MONTHS[m_month - 1];
    }

    public void setMonth(Month month)
    {
        setMonthValue(month.ordinal() + 1);
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

    public DayOfWeek getDayOfWeek()
    {
        return DateCheckCommon.DAY_OF_WEEKS[m_dayOfWeek];
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
        return Month.isLeapYear(m_year);
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
