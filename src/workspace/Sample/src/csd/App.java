/*----------------------------------------------------------------------------------------------------------------------	 
	 Sınıf Çalışması: 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		String s = "Bugün hava bulutlu. Yağmur yağabilir. Yağmur yağma ihtimaline karşılık şemsiye alınız";
		String str = "Yağmur";
		
		int index = s.lastIndexOf(str);		
		
		System.out.printf("Index:%d%n", index);		
	}	
}

