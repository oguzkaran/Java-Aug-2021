/*----------------------------------------------------------------------
	FILE        : Month.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 22.01.2022

	enum class for months

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

public enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);

    final int days;

    Month(int d)
    {
        days = d;
    }

    int getDays(int month, int year)
    {
        return month == 2 && isLeapYear(year) ? 29 : days;
    }

    static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}