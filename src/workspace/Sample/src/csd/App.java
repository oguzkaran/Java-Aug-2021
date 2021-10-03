/*----------------------------------------------------------------------------------------------------------------------	 
	 Homework-002-1. sorunun bir çözümü
	 (Not: Çözüm çalışma sorusunun verildiği tarihte görülmüş olan konulara göre yapılmıştır)	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		PrintDiamondApp.run();
	}
}

class PrintDiamondApp {
	public static void printDiamond(int n)
	{		
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k < n - i; ++k)
				System.out.print(' ');
			for (int k = 0; k < 2 * i - 1; ++k)
				System.out.print('*');
			System.out.println();
		}		
		
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k < i % n; ++k)
				System.out.print(' ');
			for (int k = 0; k < 2 * n - (i % n) * 2 - 1; ++k)
				System.out.print('*');
			
			System.out.println();
		}		
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		printDiamond(n);					
	}
}

