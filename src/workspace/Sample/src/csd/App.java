/*----------------------------------------------------------------------------------------------------------------------
	 isEven metodunun en okunabilir yazılış şekli aşağıdaki gibidir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		if (NumberUtil.isEven(val))
			System.out.println("Çift sayı girdiniz");
		else
			System.out.println("Tek sayı girdiniz");
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class NumberUtil {
	public static boolean isEven(int val)
	{
		return val % 2 == 0;
	}
}

