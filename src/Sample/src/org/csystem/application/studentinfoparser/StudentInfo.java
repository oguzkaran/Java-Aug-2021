package org.csystem.application.studentinfoparser;

import org.csystem.application.dateapp.DateUtil;

public class StudentInfo {
    public String name;
    public String birthDate;
    public String lectureName;
    public int midTermGrade;
    public int finalGrade;

    //...

    public double getGrade()
    {
        return 0.4 * midTermGrade + 0.6 * finalGrade;
    }

    public String getBirthDateTR()
    {
        String [] birthDateInfo = birthDate.split("[/]");
        int day = Integer.parseInt(birthDateInfo[0]);
        int month = Integer.parseInt(birthDateInfo[1]);
        int year = Integer.parseInt(birthDateInfo[2]);

        return DateUtil.getDateTR(day, month, year);
    }


    public String toString()
    {
        double grade = getGrade();
        String status = grade >= 50 ? "Geçti" : "Kaldı";
        String fmt = "{name: %s, birthDate: %s, lectureName: %s, midTermGrade: %d, finalGrade: %d, grade: %.2f, status: %s}";

        return String.format(fmt, name, getBirthDateTR(), lectureName, midTermGrade, finalGrade, grade, status);
    }
}
