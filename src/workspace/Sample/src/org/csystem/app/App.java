/*----------------------------------------------------------------------------------------------------------------------	 
	java.lang paketi altındaki tüm sınıflar her yerden görülebilirdir. Yani isimleri doğrudan kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args) 
	{
		String s = "ankara"; // ~ karşılığı: java.lang.String s = "ankara";
		
		System.out.println(s); // ~ karşılığı: java.lang.System.out.println(s);
	}	
}
