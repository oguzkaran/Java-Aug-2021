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
package org.csystem.app;

import org.csystem.application.studentinfoparser_todo.StudentInfoParserApp;

class App {
    public static void main(String [] args)
    {
        StudentInfoParserApp.run();
    }
}
