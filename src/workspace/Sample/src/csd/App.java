/*----------------------------------------------------------------------------------------------------------------------	 
	Anahtar Notlar: Sınıfı yazan programcı bir ctor yazarsa default ctor'u yazıp yazmayacağına yönelik kararı nasıl
	verecektir? Şüphesiz sınıfa göre karar verecektir. Bu durumda programcı tarafından karar vermek için şöyle basit
	bir soru sorulabilir: "Bu sınıf türünden bir nesnenin default durumu var mı?" Örneğin, Random sınıfının default 
	ctor'u Random nesnenin default durumudur. Yani tohum değerini her çağrımada farklı verecek şekilde nesnenin
	yaratılmasını sağlamaktır. Ancak bazı özel durumlarda sınıfı kullanan başka sınıf default ctor zorunluluğu isteyebilir.
	Bu durumda progamcı sınıf için default ctor'u yazar 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Tohum değerini giriniz:");
		long seed = Long.parseLong(kb.nextLine());		
		
		java.util.Random r = new java.util.Random(seed);
		
		for (int i = 0; i < 10; ++i)
			System.out.printf("%02d ", r.nextInt(100));
		
		System.out.println();	
	}	
}

