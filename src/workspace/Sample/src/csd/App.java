/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parmetresi ile aldığı bir sayının factorial değerini döndüren factorial isimli metodu yazınız ve
	aşağıdaki kod ile test ediniz.
	0! = 1
	1! = 1
	2! = 1 * 2
	3! = 1 * 2 * 3
	
	...
	n! = 1 * 2 * 3 * ... * (n- 1) * n
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		FactorialTest.run();
	}
}

class FactorialTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		for (int i = 0; i <= n; ++i)
			System.out.printf("%d! = %d%n", i, NumberUtil.factorial(i));		
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class NumberUtil {
	public static int factorial(int n)
	{
		int result = 1;
		
		for (int i = 2; i <= n; ++i)
			result *= i;
		
		return result;
	}
}