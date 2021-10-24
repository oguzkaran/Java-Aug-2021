/*----------------------------------------------------------------------------------------------------------------------	 
	Homework-003-7. sorunun bir çözümü
	(Not: Çözüm çalışma sorusunun verildiği tarihte görülen konulara göre yapılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IsDecimalHarshadTest.run();
	}	
}


class IsDecimalHarshadTest {
	public static void run()
	{
		for (int n = 1; n <= 999999; ++n)
			if (NumberUtil.isDecimalHarshad(n))
				System.out.printf("%d%n", n);
		
		System.out.println("Tekrar yapıyor musunuz?");
	}	
}


class NumberUtil {
	public static boolean isDecimalHarshad(int val)
	{
		return val >= 0 && val % sumDigits(val) == 0;
	}
	
	public static int sumDigits(int val)
	{
		int sum = 0;
		
		while (val != 0) {
			sum += val % 10;
			val /= 10;			
		}
		
		return Math.abs(sum);		
	}
	
}