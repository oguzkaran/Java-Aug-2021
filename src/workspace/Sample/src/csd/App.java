/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı günü
	olduğunu döndüren getDayOfYear isimli metodu DateUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Metot tarihin geçersiz olması durumunda sıfır değerine geri dönecektir
	(İleride daha iyisi yazılacaktır) 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		GetDayOfWeekTest.run();
	}
}

class GetDayOfWeekTest {
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
			
			
			int dayOfYear = DateUtil.getDayOfYear(day, month, year);
			
			if (dayOfYear != 0)
				System.out.printf("%02d/%02d/%04d tarihi yılın %d. günüdür%n", day, month, year, dayOfYear);
			else
				System.out.println("Geçersiz tarih");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class DateUtil {
	public static int getDayOfYear(int day, int month, int year)
	{
		if (!isValidDate(day, month, year))
			return 0;
		
		
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

