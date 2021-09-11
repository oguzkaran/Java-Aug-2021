/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte atama operatörünün birinci operandının değişken olmamasından dolayı error oluşur
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 45, b = 23, c = 34;
		
		a = b = c = 10; //error
		
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
	}
}

