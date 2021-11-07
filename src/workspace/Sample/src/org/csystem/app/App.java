/*----------------------------------------------------------------------------------------------------------------------	 
	Yukarıdaki iki kurala göre bir sınıfın veri elemanı ile aynı isimde metot parametre değişkeni veya yerel değişken
	bildirilebilir. Aşağıdaki örnekte a parametre değişkeninin değeri kendisine atanmıştır. Kod tamamen durumu
	anlatmak için yazılmıştır. Veri elemanı olan a'ya erişim ileride ele alınacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args) 
	{
	
	}	
}


class Sample {
	public void foo(int a)
	{
		a = a; //Dikkat self assignment
	}
	
	public int a;
}


