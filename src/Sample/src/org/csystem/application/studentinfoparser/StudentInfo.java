package org.csystem.application.studentinfoparser;

import org.csystem.util.datetime.Date;

public class StudentInfo {
    private String m_name;
    private Date m_birthDate;
    private String m_lectureName;
    private int m_midTermGrade;
    private int m_finalGrade;

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public void setBirthDate(Date birthDate)
    {
        m_birthDate = birthDate;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public int getMidTermGrade()
    {
        return m_midTermGrade;
    }

    public void setMidTermGrade(int midTermGrade)
    {
        m_midTermGrade = midTermGrade;
    }

    public int getFinalGrade()
    {
        return m_finalGrade;
    }

    public void setFinalGrade(int finalGrade)
    {
        m_finalGrade = finalGrade;
    }

    public double getGrade()
    {
        return 0.4 * m_midTermGrade + 0.6 * m_finalGrade;
    }

    public String getBirthDateTR()
    {
        return m_birthDate.toLongDateStringTR();
    }

    public String toString()
    {
        double grade = getGrade();
        String status = grade >= 50 ? "Geçti" : "Kaldı";
        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midTermGrade: %d, finalGrade: %d, grade: %.2f, status: %s}";

        return String.format(fmt, m_name, getBirthDateTR(), m_lectureName, m_midTermGrade, m_finalGrade, grade, status);
    }
}
