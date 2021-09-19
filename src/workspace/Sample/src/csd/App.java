/*----------------------------------------------------------------------------------------------------------------------	 
	Aşağıdaki test kodunu yukarıda yazılan iki isPrime metodu için de ayrı ayrı çalıştırınız. Göreceksiniz ki
	son yazılan isPrime ilk yazılandan çok çok daha kısa zamanda sonuca ulaşacaktır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		IsPrimeTest.run();
	}
}

class IsPrimeTest {
	public static void run()
	{
		System.out.println(NumberUtil.isPrime(1603318868174368979L));
	}
}

class NumberUtil {
	public static boolean isPrime(long val)	
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
		
		for (int i = 11; i * i <= val; i += 2)	
			if (val % i == 0)
				return false;
		
		return true;
	}
}

