/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamkları toplamına geri dönen sumDigits 
	metodunu NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz.
	Açıklama: Metot negatif sayılar için de basamakları toplamını pozitif olarak döndürecektir 	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		SumDigitsTest.run();
	}
}

class SumDigitsTest {	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);			
		
		int val;
		
		System.out.println("Bir sayı giriniz:");
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {
			int sum = NumberUtil.sumDigits(val);
			
			System.out.printf("%d sayısının basamakları toplamı:%d%n", val, sum);
			System.out.println("Bir sayı giriniz:");			
		}
		
		
		System.out.printf("0(sıfır) sayısının basamak sayısı:%d%n", NumberUtil.sumDigits(0));
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}


class NumberUtil {
	public static int sumDigits(int val)
	{
						
	}
}

