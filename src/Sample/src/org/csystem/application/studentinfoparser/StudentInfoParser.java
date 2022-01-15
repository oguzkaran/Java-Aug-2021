package org.csystem.application.studentinfoparser;

import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.MutableDate;

public class StudentInfoParser {
    private final StudentInfo m_studentInfo;

    public StudentInfoParser(String str)
    {
        String [] studentInfoStr = str.split("[:]+");

        //... (Format kontrolü)

        m_studentInfo = new StudentInfo();

        m_studentInfo.setName(studentInfoStr[0]);
        String [] birthDateInfo = studentInfoStr[1].split("[/]");
        m_studentInfo.setBirthDate(Date.of(Integer.parseInt(birthDateInfo[0]), Integer.parseInt(birthDateInfo[1]), Integer.parseInt(birthDateInfo[2])));
        m_studentInfo.setLectureName(studentInfoStr[2]);
        m_studentInfo.setMidTermGrade(Integer.parseInt(studentInfoStr[3]));
        m_studentInfo.setFinalGrade(Integer.parseInt(studentInfoStr[4]));
    }

    public StudentInfo getStudentInfo()
    {
        return m_studentInfo;
    }

    //...
}
