/*----------------------------------------------------------------------------------------------------------------------	 
	short, byte ve char türlerine "sınırlar içerisinde kalması koşuluyla int türden bir sabitin doğrudan atanabilmesi"
	kuralı metodun çağrısında argümanlardan parametrelere yapılan atama işleminde geçersizdir 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		Sample.foo(10); //error
		Sample.bar(100); //error
		Sample.tar(67); //error
	}
}

class Sample {
	public static void foo(short a)
	{
		//...
	}
	
	public static void bar(byte a)
	{
		//...
	}
	
	public static void tar(char a)
	{
		//...
	}
}