/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Paremetresi ile aldığı bir yazının tersini döndüren reversed isimli metodu StringUtil sınıfı
	içerisinde yazınız ve aşağıdaki kod ile test ediniz
	(İleride daha hızlı ve etkin olanı yazılacaktır) 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		ReverseTest.run();
	}	
}


class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.printf("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println("---------------------------");
			System.out.println(StringUtil.reversed(s));
			System.out.println("---------------------------");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String reversed(String s)
	{
		//TODO:
	}
}
