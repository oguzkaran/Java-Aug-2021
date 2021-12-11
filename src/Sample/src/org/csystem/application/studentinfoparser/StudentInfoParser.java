package org.csystem.application.studentinfoparser;

public class StudentInfoParser {
    public StudentInfo studentInfo;

    public StudentInfoParser(String str)
    {
        String [] studentInfoStr = str.split("[:]+");

        //... (Format kontrolü)

        studentInfo = new StudentInfo();

        studentInfo.name = studentInfoStr[0];
        studentInfo.birthDate = studentInfoStr[1];
        studentInfo.lectureName = studentInfoStr[2];
        studentInfo.midTermGrade = Integer.parseInt(studentInfoStr[3]);
        studentInfo.finalGrade = Integer.parseInt(studentInfoStr[4]);
    }

    public StudentInfo getStudentInfo()
    {
        return studentInfo;
    }

    //...
}
