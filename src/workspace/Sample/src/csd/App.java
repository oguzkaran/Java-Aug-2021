/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Kalvyeden bir kullanıcı adı ve şifre isteyen basit bir ATM uygulamasının b ir parçası olan 
	programı aşağıdaki açıklamalara göre yazınız:	
	Açıklamalar:
	- Kullanıcı adı ve şifre 3(üç) kez denenebilecektir.
	- 3(üç) kez deneme sırasında doğru giriş yapılırsa "Giriş başarılı", 3(üç) kez deneme de yanlış olursa 
	"Giriş başarısız. Deneme hakkınız bitti!..." mesajı verilecektir. 
	- Kullanıcı adı ve şifrenin doğruluk kontrolü program içerisinde belirlenen bir kullanıcı ve şifre ile yapılacaktır
	- Programı genel düşünerek yazınız
	
	Not:Program şu ana kadar gördüklerimiz ile yazılmıştır	
	 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		ReverseTest.run();
	}	
}

class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.printf("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.println("---------------------------");
			System.out.println(StringUtil.reversed(s));
			System.out.println("---------------------------");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String reversed(String s)
	{
		String rev = "";
		
		for (int i = s.length() - 1; i >= 0; --i)
			rev += s.charAt(i);	
		
		return rev;
	}
}
