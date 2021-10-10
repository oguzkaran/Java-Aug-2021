/*----------------------------------------------------------------------------------------------------------------------	 
	Sınıf türünden bellekte ayrılan alanlara nesne (object) denir. Nesneler heap'te yaratılır. Java'da stack'te nesne
	yaratılamaz. Java'da bir nesnenin ismi yoktur. Nesnenin adresi vardır ve bu adres uygun bir referans değişkende 
	tutulur. Bir nesne yaratmak için new operatörü kullanılır. new operatörü özel amaçlı, tek operandlı ve araek
	durumunda bir operatördür. new operatörü heap'de yaratılmış olan nesnenin adresini (referansını) üretir. Operatörün
	genel biçimi:
		new <referans tür ismi>([argümanlar]);
	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{			
		Sample s;
		
		s = new Sample();
	}
}

class Sample {
	
}