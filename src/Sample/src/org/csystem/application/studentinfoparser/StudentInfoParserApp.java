/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana detayları yazdıran programı yazınız:
	<isim>:<gg/aa/yyyy>:<ders adı>:<arasınav>:<final>
	Oğuz Karan:10/09/1976:Matematik:90:56
	Açıklamalar:
	- Bu formata göre kişinin arasınav ve final notlarına göre arasınav * 0.4 + final * 0.6 formülüne göre geçeme
	notunu da yazdıracaktır
	- Doğum tarihinin hangi güne geldiği de ekrana yazdırılacaktır
	- Geçme notu 50 olarak düşünülmelidir. Geçti veya Kaldı bilgisi de ekrana yazdırılacaktır
	- Programda yazının format kontrolü yapılmayacaktır

	Not: Uygulama şu ana kadar gördüğümüz konulara göre yazılmıştır. İleride daha iyisi yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.application.studentinfoparser;

public class StudentInfoParserApp {
    public static void display(StudentInfo [] students)
    {
        for (int i = 0; i < students.length; ++i)
            System.out.println(students[i].toString());
    }

    public static void run()
    {
        RandomStudentInfoFactory factory = new RandomStudentInfoFactory();
        StudentInfo [] students = new StudentInfo[factory.getNumberOfStudents()];

        String str;

        int i = 0;

        while (!(str = factory.getRandomStudentInfoStr()).isEmpty()) { //for döngü deyimi ile daha iyi olabilir. Hatırlatma amaçlı while kullanılmıştır
            StudentInfoParser parser = new StudentInfoParser(str);

            //...
            students[i++] = parser.getStudentInfo();
        }

        display(students);
    }
}
