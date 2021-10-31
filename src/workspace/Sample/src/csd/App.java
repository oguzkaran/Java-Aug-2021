/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı bir yazının yalnızca başındaki boşluk karakterlerini atan trimLeading ve
	yalnızca sonundaki boşluk karakterlerini atan trimTrailing isimli metotları yazınız ve aşağıdaki kod ile test
	ediniz.
	(Not: Java 11'e kadar bu işlemleri yapan metot String sınıfında bulunmuyordu)  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		TrimLeadingTrailingTest.run();
	}	
}

class TrimLeadingTrailingTest {	
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			System.out.println("--------------------------");
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", StringUtil.trimLeading(s));
			System.out.printf("(%s)%n", StringUtil.trimTrailing(s));
			System.out.println("--------------------------");
			
			if ("elma".equals(s))
				break;
		}	
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class StringUtil {
	public static String trimLeading(String s)
	{
		//TODO:
	}
	public static String trimTrailing(String s)
	{
		//TODO:
	}	
}

