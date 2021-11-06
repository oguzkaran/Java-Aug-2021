/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı bir yazının Türkçe pangram olup olmadığını test eden ispangramTR ve İngilizce
	pangram olup olmadığını test eden isPangramEN metotlarını yazınız ve aşağıdaki kod ile test ediniz.
	Pangram: İçerisinde özel isim bulunmayan, anlamlı ve ilgili alfabenin tüm karakterlerinin kullanılmış olduğu
	cümlelere denir.  
	
	İngilizce pangram:
		The quick brown fox jumps over the lazy dog
	Türkçe pangram:
		Pijamalı hasta yağız şoföre çabucak güvendi
	Açıklama: Metotlar sadece karakterlerin hepsinin kullanılıp kullanılmadığına bakacaktır. Özel isim ya da anlamlı olması
	durumu gözardı edilecektir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		IsPangramTest.run();
	}	
}

class IsPangramTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String text = kb.nextLine();
			
			if ("elma".equals(text))
				break;
			
			System.out.println(StringUtil.IsPangramTR(text) ? "Pangram" : "Pangram değil");
			System.out.println(StringUtil.IsPangramEN(text) ? "Pangram" : "Not a pangram");
		}
	}
}

class StringUtil {
	public static boolean IsPangramTR(String text)
	{
		
	}
	
	public static boolean IsPangramEN(String text)
	{
		
	}
}

