/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n tane rasgele belirlenmiş Türkçe karaketerlerden
	oluşan bir yazı döndüren getRandomTextTR ile n tane rasgele belirlenmiş İngilizce karaketerlerden oluşan bir yazı 
	döndüren getRandomTextEN metotlarını yazınız ve aşağıdaki kod ile test ediniz  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

import java.util.Random;

class App {
	public static void main(String [] args) 
	{
		GetRandomTextTest.run();
	}	
}

class GetRandomTextTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.out.println(StringUtil.getRandomTextTR(n));
		}
	}
}

class StringUtil {
	
	public static String getRandomTextTR(int n)
	{
		return getRandomTextTR(new Random(), n);
	}
	
	public static String getRandomTextTR(Random r, int n)
	{
		
	}
	
	public static String getRandomTextEN(int n)
	{
		return getRandomTextEN(new Random(), n);
	}
	
	public static String getRandomTextEN(Random r, int n)
	{
		
	}
}
