package org.csystem.application.studentinfoparser;

import java.util.Random;

public class RandomStudentInfoFactory {
    public String [] studentInfo;
    public boolean [] flags;
    public int count;
    public Random random;

    public void init() //Öğrenci bilgilerinin herhangi bir yerden elde edebilir. Örnek amaçlı ilkdeğer verme ile yapılmıştır
    {
        studentInfo = new String[] {
                "Oğuz Karan:10/09/1976:Matematik:34:45",
                "Abdullah Eren Kılınç:14/05/2001:Programlamaya Giriş:89:100",
                "Deniz Şahan:27/05/1994:Algorithmic Trading:90:100",
                "Mehmet Deniz Kadir:13/01/1999:İngilizce:40:40",
                "Harun Çekinmez:24/05/1995:Java Programming:80:100",
                "Merve Gözükızıl:20/05/1992:Kimya:30:50",
                "Halil İbrahim Aker:22/11/1981:Fizik:78:75",
                "Refik Can Devşeli:11/01/2000:Kimya:30:51",
                "İrem Manavoğlu:06/03/1997:Fizik:78:75",
                "Utku Çalışkan:13/01/1997:İngilizce:50:50",
        };

        flags = new boolean[studentInfo.length];
    }

    public RandomStudentInfoFactory()
    {
        random = new Random();
        init();
    }

    public int getNumberOfStudents()
    {
        return studentInfo.length;
    }

    public String getRandomStudentInfoStr()
    {
        if (count == studentInfo.length)
            return "";

        int index;

        for (;;) {
            index = random.nextInt(studentInfo.length);
            if (!flags[index])
                break;
        }
        ++count;
        flags[index] = true;

        return studentInfo[index];
    }
}
