/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Aşağıda açıklanan metotları StringUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz
		public static String padLeading(String s, int length, char ch);
		public static String padLeading(String s, int length);
		public static String padTrailing(String s, int length, char ch);
		public static String padTrailing(String s, int length);
	Açıklamalar:
	- padLeading metodunun 3(üç) parametreli overload'u ikinci parmetresi ile aldığı length uzunluğu yazıdan büyükse 
	yazının soldan ch karakteri ile doldurulmuş olduğu yeni bir String referansına döndecektir. Örneğin:
		padLeading("ankara", 8, 'x'); çağrısı
		xxankara
	yazısına ilişkin String referansına geri dönecektir
	
	 - length yazının uzunluğundan küçük ya da eşit ise aynı referansa geri dönecektir.
	 
	 - padLeading metodunun iki parametreli overload'u yazıyı soldan space karakteri ile dolduracaktır
	 
	 - padTrailing metotları sağdan dolduracak şekilde padLeading metotlarına benzer biçimde çalışacaktır 
	 
	 - Metotları Java 11 öncesi için yazınız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		PadLeadingTrailingTest.run();		
	}	
}

class PadLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);	
		
		for (;;) {
			System.out.printf("Bir yazı giriniz:");
			String s = kb.nextLine();			
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("Uzunluk giriniz:");
			int length = Integer.parseInt(kb.nextLine());
			
			System.out.println("--------------------------------");
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", StringUtil.padLeading(s, length, 'x'));
			System.out.printf("(%s)%n", StringUtil.padLeading(s, length));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, length, 'x'));
			System.out.printf("(%s)%n", StringUtil.padTrailing(s, length));
			System.out.println("--------------------------------");
		}	
	}
}

class StringUtil {
	public static String padLeading(String s, int length, char ch)
	{
		
	}
	
	public static String padLeading(String s, int length)
	{
		
	}
	
	public static String padTrailing(String s, int length, char ch)
	{
		
	}
	
	public static String padTrailing(String s, int length)
	{
		
	}
}