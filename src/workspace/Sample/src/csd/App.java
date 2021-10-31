/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Klavyeden elma girilene kadar alınan yazıların arasında - karakteri olacak şekilde birleştirilmiş
	bir String oluşturan programı yazınız.
	Örneğin: ankara istanbul izmir zonguldak girildiğinde
	ankara-istanbul-izmir-zonguldak
	yazısı elde edilecektir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		String s = "ankara";
		
		System.out.println(s.substring(6, 6).isEmpty() ? "Boş string" : "Boş string değil");		
	}	
}

