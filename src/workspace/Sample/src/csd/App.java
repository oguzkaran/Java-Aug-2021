/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı bir yazının ilk harfi büyük geri kalanları küçük olacak şekilde bir 
	yazı döndüren capitalize isimli metodu yazınız ve aşağıdaki kod ile test ediniz.
	Örneğin: yazı "bugün HAVA çok Güzel" ise "Bugün hava çok güzel" yazısına geri dönecektir  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		CapitalizeTest.run();
	}	
}

class CapitalizeTest {	
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			System.out.println("--------------------------");
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", StringUtil.capitalize(s));
			System.out.println("--------------------------");
			
			if ("elma".equals(s))
				break;
		}	
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class StringUtil {
	public static String capitalize(String s)
	{
		//TODO:
	}
}

