/*----------------------------------------------------------------------------------------------------------------------	 
	Character sınıfının yararlı bazı toxxx metotları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		UpperLowerConvertApp.run();
	}	
}

class UpperLowerConvertApp {
	public static char getRandomLetter(java.util.Random r)
	{
		String lettersTR = "çğışöüÇĞIİŞÖÜ";
		
		int val = r.nextInt(3);
		
		char c;
		
		switch (val) {
		case 0:
			c = (char)(r.nextInt(26) + 'A');
			break;			
		case 1:
			c = (char)(r.nextInt(26) + 'a');
			break;
		default:
			c = lettersTR.charAt(r.nextInt(lettersTR.length()));
		}
		
		return c;
	}
	
	public static void run()
	{
		java.util.Random r = new java.util.Random();
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		for (int i = 0; i < n; ++i) {
			char ch = getRandomLetter(r);
			
			System.out.println("-------------------------");
			System.out.printf("[%d] -> %c -> ", (int)ch, ch);
			System.out.println(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
			System.out.println("-------------------------");
		}	
		
	}
}

