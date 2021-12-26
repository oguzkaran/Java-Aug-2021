package org.csystem.application.studentinfoparser;

import java.util.Random;

public class RandomStudentInfoFactory {
    private String [] m_studentInfo;
    private boolean [] m_flags;
    private int m_count;
    private final Random m_random;

    private void init() //Öğrenci bilgileri herhangi bir yerden elde edebilir. Örnek amaçlı ilkdeğer verme ile yapılmıştır
    {
        m_studentInfo = new String[] {
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

        m_flags = new boolean[m_studentInfo.length];
    }

    public RandomStudentInfoFactory()
    {
        m_random = new Random();
        init();
    }

    public int getNumberOfStudents()
    {
        return m_studentInfo.length;
    }

    public String getRandomStudentInfoStr()
    {
        if (m_count == m_studentInfo.length)
            return "";

        int index;

        for (;;) {
            index = m_random.nextInt(m_studentInfo.length);
            if (!m_flags[index])
                break;
        }
        ++m_count;
        m_flags[index] = true;

        return m_studentInfo[index];
    }
}
