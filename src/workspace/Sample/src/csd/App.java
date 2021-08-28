/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun parametrelerine değerler çağrılırken aktarılır. Metot çağrısında bir parametreye verilen ifadeye 
	"argüman (argument)" denir. Argümanlardan parametrelere yapılan aktarımda bir atama işlemi olarak düşünülmelidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		double b = Double.parseDouble(kb.nextLine());
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo(int a, double b)
	{		
		System.out.println(a);
		System.out.println(b);
	}	
	
}
