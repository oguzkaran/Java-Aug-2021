package org.csystem.application.studentinfoparser;

public class StudentInfoParser {
    private StudentInfo m_studentInfo;

    public StudentInfoParser(String str)
    {
        String [] studentInfoStr = str.split("[:]+");

        //... (Format kontrolü)

        m_studentInfo = new StudentInfo();

        m_studentInfo.setName(studentInfoStr[0]);
        m_studentInfo.setBirthDate(studentInfoStr[1]);
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
