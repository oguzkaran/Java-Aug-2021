/*----------------------------------------------------------------------------------------------------------------------	 
	Point sınıfı 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		Point p = new Point(100, 100);
		
		System.out.println(p.toString());
	}	
}


class Point {
	public int x;
	public int y;
	
	public Point()
	{		
	}
	
	public Point(int a)
	{
		x = a;
	}
	
	public Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
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
	
	public String toString()
	{
		return String.format("{x: %d, y: %d}", x, y);		
	}
}
