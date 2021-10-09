/*----------------------------------------------------------------------------------------------------------------------	 
	 Aşağıdaki örnekte Math sınıfının abs metotları simüle edilmiştir. Kodu çalıştırarak hangi metodun hangi durumda
	 çağrıldığını gözlemleyiniz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		{
			int i; //
			int a;
			
			
		}
		i = 10;
		a = 10;
	}
}

class MyMath {
	public static double abs(double a)
	{
		System.out.println("abs, double");
		
		return a < 0 ? -a : a;	
	}
	
	public static float abs(float a)
	{
		System.out.println("abs, float");
		
		return a < 0 ? -a : a;	
	}
	
	public static long abs(long a)
	{
		System.out.println("abs, long");
		
		return a < 0 ? -a : a;
	}
	
	public static int abs(int a)
	{
		System.out.println("abs, int");
		
		return a < 0 ? -a : a;
	}
	
	//...	
}
