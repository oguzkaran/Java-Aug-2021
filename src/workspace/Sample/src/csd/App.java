/*----------------------------------------------------------------------------------------------------------------------	 
	Referans parametreli metotlar olabilir. Bu durumda metot içerisinde referans paametresine geçilen adresteki nesneye
	erişilebilir	  
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		Date birthDate;
		
		birthDate = new Date();
		
		birthDate.day = 11;
		birthDate.month = 7;
		birthDate.year = 1983;
		
		DateUtil.display(birthDate);
		DateUtil.display(birthDate);
	}
}


class DateUtil {
	public static void display(Date d)
	{
		System.out.printf("%02d/%02d/%04d%n", d.day, d.month, d.year);
	}
}

class Date {
	public int day, month, year;
	//...
} 
