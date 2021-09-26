/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden yıl bilgisinin artık yıl olup olmadığını test eden isLeapYear
	isimli metodu DateUtil isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		IsLeapYearTest.run();
	}
}

class IsLeapYearTest {
	public static void run()
	{
		for (int year = 1999; year <= 2104; ++year)
			if (DateUtil.isLeapYear(year))
				System.out.println(year);
	}
}

class DateUtil {
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}

