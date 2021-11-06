/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf Çalışması: Parametresi ile aldığı bir yazının içerisindeki en uzun palindromu döndüren getLongestPalindrome
	metodunu yazınız ve aşağıdaki kod ile test ediniz
	
		abcdadaeyedipadanadapideyeadaecealipapilaanastasmumsatsanaxyzt
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		GetLongestPalindromeTest.run();
	}	
}


class GetLongestPalindromeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("En uzun palindrom:%s%n", StringUtil.getLongestPalindrome(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil {
	public static String getLongestPalindrome(String s)
	{
		String maxStr = "";
		int right = s.length();
		
		while (right != 0) {
			int left = 0;
			
			while (left != right) {
				String str = s.substring(left++, right); 
				
				if (str.length() > 1 && isPalindrome(str) && str.length() > maxStr.length())
					maxStr = str;
			}
						
			--right;
		}
		
		return maxStr;
	}
	
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = s.charAt(left);
			
			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}			
			
			cLeft = Character.toLowerCase(cLeft);
			
			char cRight = s.charAt(right);
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			cRight = Character.toLowerCase(cRight);
			
			if (cLeft != cRight)
				return false;
			
			++left;
			--right;
		}
		
		return true;
	}
}
