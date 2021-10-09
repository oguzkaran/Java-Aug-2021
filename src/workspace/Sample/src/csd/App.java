/*----------------------------------------------------------------------------------------------------------------------	 
	 1. Aday metotlar: 1, 2, 3, 4, 5, 6, 7, 8
	 2. Uygun metotlar: 4, 8
	 3. En uygun metot: 4 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		float a = 10.3F;
		short b = 345;
		
		Sample.foo(a, b); //#4
	}
}

class Sample {
	public static void foo() //#1
	{
		System.out.println("foo");
	}
	
	public static void foo(int a) //#2
	{
		System.out.println("foo, int");
	}
	
	public static void foo(int a, int b) //#3
	{
		System.out.println("foo, int, int");	
	}

	public static void foo(double a, int b) //#4
	{
		System.out.println("foo, double, int");	
	}
	
	public static void foo(int a, long b) //#5
	{
		System.out.println("foo, int, long");	
	}
	
	public static void foo(int a, double b) //#6
	{
		System.out.println("foo, int, double");	
	}
	
	public static void foo(int a, char b) //#7
	{
		System.out.println("foo, int, char");	
	}
	
	public static void foo(double a, long b) //#8
	{
		System.out.println("foo, double, long");	
	}
	
	public static void bar(double a) //#9
	{
		System.out.println("bar, double");
	}
}

