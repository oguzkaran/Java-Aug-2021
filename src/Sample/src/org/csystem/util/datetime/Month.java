/*----------------------------------------------------------------
	FILE		: Month.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 28.05.2022

	enum class for months

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.datetime;

public enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
    private final int m_days;

    Month(int d)
    {
        m_days = d;
    }

    int getDays(int year)
    {
        return ordinal() == 1 && Date.isLeapYear(year) ? 29 : m_days;
    }
}
