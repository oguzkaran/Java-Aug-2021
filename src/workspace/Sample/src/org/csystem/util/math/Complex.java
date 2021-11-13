/*----------------------------------------------------------------------
	FILE        : Complex.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 13.11.2021

	Complex class that represents a complex number

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

import static java.lang.Math.sqrt;

public class Complex {
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
		return sqrt(real * real + imag * imag);
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
	
	public String toString()
	{
		return String.format("|%.2f + %.2f * i| = %f", real, imag, getNorm());		
	}
}
