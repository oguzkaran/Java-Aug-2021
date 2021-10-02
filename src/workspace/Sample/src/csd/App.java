/*----------------------------------------------------------------------------------------------------------------------	 
	Herhangi bir türden boolean türüne explicit dönüşüm geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 1;
		boolean b;
		
		b = (boolean)a; //error
	}
}

