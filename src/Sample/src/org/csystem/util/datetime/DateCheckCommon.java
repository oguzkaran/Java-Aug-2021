/*----------------------------------------------------------------------
	FILE        : DateCheckCommon.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 15.01.2022

	Utility package private class that is used for checking date

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

class DateCheckCommon {
    private DateCheckCommon()
    {
    }

    static final int [] DAYS_OF_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final String [] DAYS_OF_WEEK_TR = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
    static final String [] DAYS_OF_WEEK_EN = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static final String [] MONTHS_TR = {"", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
            "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"
    };
    static final String [] MONTHS_EN = {"",
            "Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    static void doWorkForException(String message)
    {
        System.out.println(message);
        System.exit(1); //Exception işlemlerine kadar sabredin
    }

    static void checkDate(int day, int month, int year)
    {
        DateCheckCommon.checkDate(day, month, year,
                String.format("Invalid date value(s): d -> %d, m -> %d, y -> %d", day, month, year));
    }

    static void checkDate(int day, int month, int year, String message)
    {
        if (!isValidDate(day, month, year))
            doWorkForException(message);
    }

    static String getDateTR(int day, int month, int year, int dayOfWeek)
    {
        return String.format("%d %s %d %s", day, MONTHS_TR[month], year, DAYS_OF_WEEK_TR[dayOfWeek]);
    }

    static String getDateEN(int day, int month, int year, int dayOfWeek)
    {
        return String.format("%d%s %s %d %s", day, getDaySuffix(day), MONTHS_EN[month], year,
                DAYS_OF_WEEK_EN[dayOfWeek]);
    }
    static int getDayOfWeek(int day, int month, int year)
    {
        int totalDays;

        if (year < 1900 || (totalDays = getDayOfYear(day, month, year)) == 0)
            return -1;

        for (int y = 1900; y < year; ++y)
            totalDays += isLeapYear(y) ? 366 : 365;

        return totalDays % 7;

    }

    static String getDaySuffix(int day)
    {
        String suffix = "th";

        switch (day) {
            case 1:
            case 21:
            case 31:
                suffix = "st";
                break;
            case 2:
            case 22:
                suffix = "nd";
                break;
            case 3:
            case 23:
                suffix = "rd";
        }

        return suffix;
    }

    static int getDays(int month, int year)
    {
        return month == 2 && isLeapYear(year) ? 29 : DAYS_OF_MONTH[month];
    }

    static int getDayOfYear(int day, int month, int year)
    {
        return isValidDate(day, month, year) ? day + getTotalDaysByMonth(month, year) : 0;
    }

    static int getTotalDaysByMonth(int month, int year)
    {
        int totalDays = 0;

        for (int m = month - 1; m >= 1; --m)
            totalDays += DAYS_OF_MONTH[m];

        return month > 2 && isLeapYear(year) ? totalDays + 1 : totalDays;
    }

    static boolean isValidDate(int day, int month, int year)
    {
        if (day < 1 || day > 31 || month < 1 || month > 12)
            return false;

        return day <= (month == 2 && isLeapYear(year) ? 29 : DAYS_OF_MONTH[month]);
    }

    static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
