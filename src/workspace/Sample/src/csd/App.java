/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının logaritmik işlem yapan metotları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		double val = Double.parseDouble(kb.nextLine());
		
		System.out.printf("log(%.2f) = %f%n", val, Math.log(val));		
		System.out.printf("log10(%.2f) = %f%n", val, Math.log10(val));
		System.out.printf("log1p(%.2f + 1) = %f%n", val, Math.log1p(val));		
	}
}

