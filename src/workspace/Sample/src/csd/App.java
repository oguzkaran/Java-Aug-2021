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
		isWeekday ve hafta sonu olup olmadığını döndüren isWeeken metotlarını yazınız		 
		- Metotları DateUtil sınıfı içerisinde yazınız
		- Metotlarınızı aşağıdaki verilen kod ile test edebilirsiniz		
	(İleride daha iyisi yazılacaktır) 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		DateUtilTest.run();
	}
}

class DateUtilTest {
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
			
			
			DateUtil.displayDateTR(day, month, year);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static void displayDateTR(int day, int month, int year)
	{
		int dayOfWeek = getDayOfWeek(day, month, year);	
		
		
		switch (dayOfWeek) {
		case 0:
			System.out.printf("%02d/%02d/%04d Pazar%n", day, month, year);
			break;
		case 1:
			System.out.printf("%02d/%02d/%04d Pazartesi%n", day, month, year);
			break;
		case 2:
			System.out.printf("%02d/%02d/%04d Salı%n", day, month, year);
			break;
		case 3:
			System.out.printf("%02d/%02d/%04d Çarşamba%n", day, month, year);
			break;
		case 4:
			System.out.printf("%02d/%02d/%04d Perşembe%n", day, month, year);
			break;
		case 5:
			System.out.printf("%02d/%02d/%04d Cuma%n", day, month, year);
			break;
		case 6:
			System.out.printf("%02d/%02d/%04d Cumartesi%n", day, month, year);
			break;
		default:
			System.out.println("Geçersiz tarih");
		}		
	}
	
	public static boolean isWeekday(int day, int month, int year)
	{
		
	}
	
	public static boolean isWeekend(int day, int month, int year)
	{
		
	}
	
	public static int getDayOfWeek(int day, int month, int year)
	{
		
	}
	
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return 0;
		
		return day + getTotalDaysByMonth(month, year);
	}	
	
	public static int getTotalDaysByMonth(int month, int year)
	{
		int totalDays = 0;
		
		switch (month - 1) {
		case 11:
			totalDays += 30;
		case 10:
			totalDays += 31;
		case 9:
			totalDays += 30;
		case 8:
			totalDays += 31;
		case 7:
			totalDays += 31;
		case 6:
			totalDays += 30;
		case 5:
			totalDays += 31;
		case 4:
			totalDays += 30;
		case 3:
			totalDays += 31;
		case 2:
			totalDays += 28;
			if (isLeapYear(year))
				++totalDays;
		case 1:
			totalDays += 31;
		}
		
		return totalDays;
	}
	
	public static boolean isValidDate(int day, int month, int year)
	{
		if (day < 1 || day > 31 || month < 1 || month > 12)
			return false;
		
		int days = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			if (isLeapYear(year))
				++days;			
		}
		
		return day <= days;
	}
	
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

