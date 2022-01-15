package org.csystem.application.dateapp;

import org.csystem.util.datetime.Date;

public class DateReport {
    private final Date m_date;

    public DateReport(int day, int month, int year)
    {
        m_date = Date.of(day, month, year);
    }

    public void displayDateTR()
    {
        System.out.println(m_date.toLongDateStringTR());

        System.out.println(m_date.isWeekday() ? "Hafta sonu kursu yaklaşıyor. Tekrar yapmayı unutmayınız!..."
                : "Bugün kurs var. Tekrar yaptınız mı?");
    }

    public void displayDateEN()
    {
        System.out.println(m_date.toLongDateStringEN());

        System.out.println(m_date.isWeekday() ? "Course day is comming. Do not forget to review!..."
                : "Today is a course day. Did you review?");
    }

}
