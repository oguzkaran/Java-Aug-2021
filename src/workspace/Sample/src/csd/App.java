/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birincisi içerisinde ikincisinden kaç tane olduğunu döndüren
	 countString isimli metodu StringUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	 Örnek: aaa yazısı içerisinde aa dan 2 tane var	    
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		CountStringTest.run();
	}	
}


class CountStringTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.printf("Birinci yazıyı giriniz:");
			String s1 = kb.nextLine();
			
			if ("elma".equals(s1))
				break;
			
			System.out.printf("İkinci yazıyı giriniz:");
			String s2 = kb.nextLine();
			int count = StringUtil.countString(s1, s2);
			
			System.out.printf("Sayı:%d%n", count);
		}
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}	
}

class StringUtil {
	public static int countString(String s1, String s2)
	{
		//TODO:
	}
}