/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri return deyimi ile oluşturulur. return deyiminin genel biçimi:
	
	return [ifade];
	
	return deyiminin temel görevi metodu sonlandırmaktır. return deyimine ilişkin ifadenin değeri metodu çağıran
	metoda aktarılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		int result;
		
		result = Sample.foo() * 2;
		
		System.out.println(result);
	}
}

class Sample {
	public static int foo()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		int result = val * val;
		
		return result;				
	}
}


