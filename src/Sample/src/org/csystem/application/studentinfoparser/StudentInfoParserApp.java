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
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.application.studentinfoparser;

public class StudentInfoParserApp {
    private static void display(StudentInfo [] students)
    {
        for (StudentInfo si : students)
            System.out.println(si.toString());
    }

    private StudentInfoParserApp()
    {
    }

    public static void run()
    {
        RandomStudentInfoFactory factory = new RandomStudentInfoFactory();
        StudentInfo [] students = new StudentInfo[factory.getNumberOfStudents()];

        String str;

        for (int i = 0; !(str = factory.getRandomStudentInfoStr()).isEmpty(); ++i) {
            StudentInfoParser parser = new StudentInfoParser(str);

            //...
            students[i] = parser.getStudentInfo();
        }

        display(students);
    }
}
