/*----------------------------------------------------------------------------------------------------------------------	 
	Point sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		Point p1, p2;
		
		p1 = new Point();
		p2 = new Point();	
		
		
		p1.x = 100;
		p1.y = 200;
		p2.x = 103;
		p2.y = 396;
		
		p1.display();
		p2.display();				
		System.out.println("----------------");
		
		double dist;
		
		dist = p1.distance(p2);
		
		System.out.printf("distance: %f%n", dist);
		System.out.println("----------------");
		
		int x = 103, y = 396;
		
		dist = p1.distance(x, y);
		
		System.out.printf("distance: %f%n", dist);
		System.out.println("----------------");
		
		dist = p1.distance();
		
		System.out.printf("distance: %f%n", dist);
		System.out.println("----------------");
	}
}

class Point {
	public int x;
	public int y;
	
	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}
	
	public double distance(int a, int b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
	}
	
	public void offset(int dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public void display()
	{
		System.out.printf("{x: %d, y: %d}%n", x, y);		
	}
}

