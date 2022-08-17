/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin aşağıdaki açıklamalara
	göre haftanın hangi gününe geldiği bilgisini döndüren getDayOfWeek isimli metodu yazarak aşağıdaki açıklamalara uygun
	programı yazınız.
	Açıklamalar:
	- Metot geçersiz tarih için -1 değerine geri dönecektir.
	- 01.01.1900 tarihinden öncesi geçersiz kabul edilecektir.
	- Haftanın günü 01.01.1900 ile verilen tarih arasında (verilen tarih dahil) geçen gün sayısının 7 ile bölümünden elde
	edilen kalan ile bulunabilir. Değer 0(sıfır) ise "Pazar", 1(bir) ise "Pazartesi", ..., 6 ise Cumartesi günlerine
	karşılık gelir.
	- Parametresi ise aldığı gün, ay ve yıl bilgilerine ilişkin tarihin hafta sonu olup olmadığını test eden isWeekend
	ve hafta içi olup olmadıpını test eden isWeekday metotlarını da yazınız. Metotlar tarih geçerlilik kontrolü
	yapmayacaktır
	 (İleride daha iyisi yazılacaktır)
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app.datetime;

import org.csystem.util.datetime.Date;

public class DateApp {
	private static void displayDateTR(Date date)
	{
		System.out.println(date.toLongDateStringTR());
		System.out.println(date.isWeekend() ? "Bugün kurs var. Tekrar yaptınız mı?" : "Kurs günü yaklaşıyor. Tekrar yapmayı unutmayınız");
	}

	private static void displayDateEN(Date date)
	{
		System.out.println(date.toLongDateStringEN());
		System.out.println(date.isWeekend() ? "That is the course day. Did you review?" : "Course day is coming. Do not forget to review?");
	}
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
			
			System.out.print("Yıl?");
			int year = Integer.parseInt(kb.nextLine());

			System.out.println("----------------------------------");

			Date date = new Date(day, month, year);

			displayDateTR(date);
			displayDateEN(date);
			System.out.println("----------------------------------");
		}		
	}
}
