/*----------------------------------------------------------------------------------------------------------------------	 
	Yıldızsız import static bildiriminin (import static single type declaration) genel biçimi:
	import static <paket ismi>[.<alt paketler>].<tür ismi>.<static eleman ismi>;
	
	Bu bildirim ile belirtilen static eleman ilgili Java dosyasında doğrudan kullanılabilir  
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static org.csystem.util.numeric.NumberUtil.isPrime;
import static org.csystem.util.string.StringUtil.getRandomTextTR;

import java.util.Random;

class App {
	public static void main(String [] args) 
	{
		Random r = new Random();
		
		for (int i = 0; i < 10; ++i) {
			int val = r.nextInt(100);
			
			System.out.println("----------------------------------------------");
			System.out.println(isPrime(val) ? "Asal" : "Asal değil");
			System.out.println(getRandomTextTR(r, val));
			System.out.println(sqrt(val));
			System.out.println(PI);
			System.out.println("----------------------------------------------");
		}
		
	}
}


