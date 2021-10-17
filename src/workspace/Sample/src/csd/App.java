/*----------------------------------------------------------------------------------------------------------------------	 
	Yukarıdaki örnekte anlatılan olası problemler aşağıdaki gibi static veri elemanı kullanılarak çözülebilir. Böylece
	aşağıdaki gibi daha basit ve hata yapma olasılığı düşürülmüş olarak kod yazılabilir. Detaylar göz edilmiştir.
	Burada static veri elemanın kullanımına odaklanınız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		SpaceWarGameApp.run();
	}
}


class SpaceWarGameApp {
	public static void run()
	{		
		//...
		
		for (int i = 0; i < 10; ++i) {
			Alien a = new Alien();
			
			//...			
		}
		
		//...
		
		for (int i = 0; i < 20; ++i) {
			Soldier s = new Soldier();
			
			//...		
		}
		
		//...
		
		System.out.printf("Number of Aliens:%d%n", Alien.count);
		System.out.printf("Number of Soldiers:%d%n", Soldier.count);
	}
}


class Alien {
	public static int count;
	public int color;
	public int armsCount;
	public int gunsCount;	
	//...
	
	public Alien()
	{
		++count;
	}
}

class Soldier {
	public static int count;
	public int title;
	public int gunType;
	//...
	public Soldier()
	{
		++count;
	}
}

class Civilian {
	public static int count;
	//...
}

class Building {
	public static int count;
	//...
}

class Tank {
	public static int count;
	//...
}

