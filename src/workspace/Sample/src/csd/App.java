/*----------------------------------------------------------------------------------------------------------------------	 
	 Aşağıdaki örnekte klavyeden sıfır girilene kadar alınan sayıların toplamı bulunmuştur
	 
	 011 -> 101 -> 010 + 1 = 011
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);		
		
		int sum = 0;
		
		System.out.print("Sayıları girmeye başlayınız\nBir sayı giriniz:");
		
		for (int val = 0; (val = Integer.parseInt(kb.nextLine())) != 0; sum += val, System.out.print("Bir sayı giriniz:"))
			;
		
		System.out.printf("Toplam:%d%n", sum);
	}
}

