/*----------------------------------------------------------------------------------------------------------------------
	System.out.printf metodu  ile geçilen argümanın türü ile yer tutucunun ilişkin olduğu tür farklı ise genel olarak
	exception oluşur. Bu durumun istisnaları vardır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		double a = 0.1, b = 0.2;
		
		System.out.format("%.20f%n", a + b);
	}
}

