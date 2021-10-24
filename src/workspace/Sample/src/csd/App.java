/*----------------------------------------------------------------------------------------------------------------------	 
	Complex sınıfı	
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{
		Complex z1, z2;
		
		z1 = new Complex(3, 4);
		z2 = new Complex(5.6, -9.7);
		
		Complex z = z1.add(z2);
		
		z.display();
		
		z = z1.add(3.5);
		
		z.display();
		
		z = Complex.add(3.5, z1);
		
		z.display();
		
	}	
}


class Complex {
	public static Complex add(double a1, double b1, double a2, double b2) //ileride gizlenecek
	{		
		return new Complex(a1 + a2, b1 + b2);
	}
	
	public static Complex subtract(double a1, double b1, double a2, double b2) //ileride gizlenecek
	{
		return add(a1, b1, -a2, -b2);
	}
	
	public static Complex multiply(double a1, double b1, double a2, double b2) //ileride gizlenecek
	{
		return new Complex(a1 * a2 - b1 * b2, a1 * b2 + b1 * a2);
	}
	
	public static Complex divide(double a1, double b1, double a2, double b2) //ileride gizlenecek
	{
		Complex z = multiply(a1, b1, a2, -b2);
		
		return multiply(1 / (a2 * a2 + b2 * b2), z);
	}
	
	public double real;
	public double imag;
	
	public Complex()
	{		
	}
	
	public Complex(double re)
	{
		real = re;
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public double getLength()
	{
		return getNorm();
	}
	
	public double getNorm()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	//add methods
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}
	
	public Complex add(Complex other)
	{
		return add(real, imag, other.real, other.imag);
	}	
	
	//subtract methods
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(real, imag, other.real, other.imag);
	}	
	
	//multiply methods
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.real, z.imag);
	}
	
	public Complex multiply(double val)
	{
		return multiply(real, imag, val, 0);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(real, imag, other.real, other.imag);
	}	

	
	//divide methods
	public static Complex divide(double val, Complex z)
	{
		return divide(val, 0, z.real, z.imag);
	}
	
	public Complex divide(double val)
	{
		return divide(real, imag, val, 0);
	}
	
	public Complex divide(Complex other)
	{
		return divide(real, imag, other.real, other.imag);
	}	

	
	public void display()
	{
		System.out.printf("|%.2f + %.2f * i| = %f%n", real, imag, getNorm());		
	}
}
