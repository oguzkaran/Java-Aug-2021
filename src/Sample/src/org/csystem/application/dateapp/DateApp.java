/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Aşağıda açıklanan metotları ve programı yazınız
	Açıklamalar:
		- Parametresi ile aldığı gün ay ve yıl bilgisine ilişkin tarihin yılın hangi günü olduğu bilgisini döndüren
		getDayOfWeek isimli metodu yazınız
		- getDayOfWeek metodu geçersiz bir tarih için -1 değerine geri dönecektir
		- 1.1.1900 öncesi tarihler geçersiz olarak kabul edilecektir
		- Haftanın günü 1.1.1900 ile verilen arasındaki gün sayısının 7(yedi) ile bölümünden elde edilen kalan ile bulunabilir.
		Buna göre sıfır Pazar olmak üzere, sırasıyla Cumartesi 6(altı) değerinde olarak düşünülecektir.
		-  Parametresi ile aldığı gün, ay ve yıl bilgisine ilişkin tarihin hafta içi olup olmadığını test eden
		isWeekday ve hafta sonu olup olmadığını döndüren isWeeken metotlarını yazınız. Bu metotlar tarih geçerlilik
		kontrolü yapmayacaktır.
		- Metotları DateUtil sınıfı içerisinde yazınız
		- Metotlarınızı aşağıdaki verilen kod ile test edebilirsiniz
	(İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.application.dateapp;

public class DateApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Gün?");
            int day = Integer.parseInt(kb.nextLine());

            if (day == 0)
                break;

            System.out.print("Ay?");
            int month = Integer.parseInt(kb.nextLine());

            System.out.print("Y?l?");
            int year = Integer.parseInt(kb.nextLine());


            DateUtil.displayDateTR(day, month, year);
        }

        System.out.println("Tekrar yap?yor musunuz?");
    }
}
