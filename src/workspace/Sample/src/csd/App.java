/*----------------------------------------------------------------------------------------------------------------------
    Java'da alt programlara "metot (method)" denir. Metot bildirimi o metodun (alt programın) program kodlarının yani
    ne iş yapacağının yazılmasıdır. Metot bildiriminin genel biçimi:
    
    [erişim belirleyici] [static] <geri dönüş bilgisi> <isim>([parametreler])
    {
    	//...
    } 
    
    Erişim belirleyici şunlardan biri olabilir: public, protected, no-modifier (hiçbir şey yazmamak), private
    İlgili konuya gelene kadar metotları public olarak bildireceğiz
    
    Bir metot static veya non-static olabilir. static yazılmaması non-static olduğu anlamına gelir. Yine ilgili 
    konuya gelene kadar metotlarımızı hep static olarak bildireceğiz. 
    
    Anahtar Notlar: Erişim belirleyici anahtar sözcük ve static anahtar sözcüğü yer değişmeli kullanılabilir. Ancak
    okunabilirlik açısından erişim belirleyiciyi static'den önce yazacağız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		System.out.println("Hello, World");
	}
}

class Sample {
	public static void foo()
	{
		
	}
}

class Mample {
	public static void bar()
	{
		
	}
}

