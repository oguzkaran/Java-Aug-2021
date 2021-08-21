/*----------------------------------------------------------------------------------------------------------------------
	Derleyiciler bir takım mesajlar verebilirler. Bu tür mesajlara "teşhis mesajları (diagnostics)" denir. Java derleyicisi
	3(üç) çeşit mesaj verebilir:
	1. Gerçek hatalar (errors): Dilin sentaks ve/veya semantik kurallarına uyulmamasından kaynaklanan hatalardır. Derleyici
	bu hatalara yönelik mesajlar verir. Bu durumda ara kod (byte code) üretilmez. Programcının bu hataları düzeltmesi
	gerekir.

	2. Uyarılar (warnings): Derleyicinin olası bir programlama hatası olabileceğini gördüğü sentaks ve semantik olarak
	bir problemin olmadığı durumlarda verilir. Bu durum arakodun üretimini engellemez. Ancak programcının uyarıcı 
	mesajlarını mutlaka dikkate alması gerekir. Özel durumlar dışında (ki bunlar da geliştirme sırasında olur) uyarı
	mesajları içeren kodlar düzeltilmelidir. Pratikte bir uygulamanın hiç uyarı mesajı olmayacak şekilde derlenmesi
	ve ürün haline getirilmesi (build) hedeflenmelidir. Bazı durumlarda IDE programlar derleyici dışında kendi uyarı
	mesajlarını verebilirler. Bunlar da dikkate alınmalıdır. Yine emin olmadıkça bu uyarılarla devam edilmemelidir.

	3. Ölümcül hatalar (fatal errors): Derleme işleminin bitirilmesini dahi engelleyecek ciddi hatalardır. Bu durumda
	programcının kodlama anlamında yapabileceği birşey yoktur. Ölümcül hataya yol açan durumu ortadan kaldırdıktan
	sonra derleme yapması gerekir. Örneğin, sitemdeki prblemler, diskte yer kalmaması, var olmayan bir java dosya ismi
	verilmesi vb.

	Anahtar Notlar: Biz örneklerimizde bazı uyarı mesajlarını dikkate almayabileceğiz. Ancak uyarılar zaman içerisinde
	konular ilerledikçe ortadan kaldırılacaktır

	Java programcısı için yazdığı program açısınjdan iki kavram çok önemlidir: derleme zamanı (compile time), çalışma zamanı (run time)
	Derleme zamanı derleme sırasındaki durumları, çalışma zamanı ise programın çalışması sırasındaki durumları betimler.

	Çalışma zamanı sırasında oluşan genel olarak hatalı durumlara "exception" denir. "Exception işlemleri (exception handling)"
	konusuna kadar bizim için exception oluşması programın çökmesi anlamına gelecektir. 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)  
	{
		int a = 10, b = 0;
		int c;

		c = a / b;

		System.out.println(c);		
	}
}

