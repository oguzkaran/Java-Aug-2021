/*----------------------------------------------------------------------
	FILE        : MutableComplex.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 08.01.2022

	MutableComplex class that represents a complex number

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

import static java.lang.Math.sqrt;

public class MutableComplex {
	private static MutableComplex add(double a1, double b1, double a2, double b2)
	{
		return new MutableComplex(a1 + a2, b1 + b2, false);
	}

	private static MutableComplex subtract(double a1, double b1, double a2, double b2)
	{
		return add(a1, b1, -a2, -b2);
	}

	private static MutableComplex multiply(double a1, double b1, double a2, double b2)
	{
		return new MutableComplex(a1 * a2 - b1 * b2, a1 * b2 + b1 * a2, false);
	}

	private static MutableComplex divide(double a1, double b1, double a2, double b2)
	{
		MutableComplex z = multiply(a1, b1, a2, -b2);

		return multiply(1 / (a2 * a2 + b2 * b2), z);
	}

	private double m_real;
	private double m_imag;

	private MutableComplex(double a, double b, boolean polar)
	{
		m_real = polar ? a * Math.cos(b) : a;
		m_imag = polar ? a * Math.sin(b) : b;
	}

	public static MutableComplex create(double real, double imag)
	{
		return new MutableComplex(real, imag, false);
	}

	public static MutableComplex createPolar(double r, double theta)
	{
		return new MutableComplex(r, theta, true);
	}

	public double getReal()
	{
		return m_real;
	}

	public void setReal(double real)
	{
		m_real = real;
	}

	public double getImag()
	{
		return m_real;
	}

	public void setImag(double imag)
	{
		m_imag = imag;
	}

	public double getLength()
	{
		return getNorm();
	}
	
	public double getNorm()
	{
		return sqrt(m_real * m_real + m_imag * m_imag);
	}
	
	public MutableComplex getConjugate()
	{
		return new MutableComplex(m_real, -m_imag, false);
	}
	
	//add methods
	public static MutableComplex add(double val, MutableComplex z)
	{
		return add(val, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex add(double val)
	{
		return add(m_real, m_imag, val, 0);
	}
	
	public MutableComplex add(MutableComplex other)
	{
		return add(m_real, m_imag, other.m_real, other.m_imag);
	}	
	
	//subtract methods
	public static MutableComplex subtract(double val, MutableComplex z)
	{
		return subtract(val, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex subtract(double val)
	{
		return subtract(m_real, m_imag, val, 0);
	}
	
	public MutableComplex subtract(MutableComplex other)
	{
		return subtract(m_real, m_imag, other.m_real, other.m_imag);
	}	
	
	//multiply methods
	public static MutableComplex multiply(double val, MutableComplex z)
	{
		return multiply(val, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex multiply(double val)
	{
		return multiply(m_real, m_imag, val, 0);
	}
	
	public MutableComplex multiply(MutableComplex other)
	{
		return multiply(m_real, m_imag, other.m_real, other.m_imag);
	}
	
	//divide methods
	public static MutableComplex divide(double val, MutableComplex z)
	{
		return divide(val, 0, z.m_real, z.m_imag);
	}
	
	public MutableComplex divide(double val)
	{
		return divide(m_real, m_imag, val, 0);
	}
	
	public MutableComplex divide(MutableComplex other)
	{
		return divide(m_real, m_imag, other.m_real, other.m_imag);
	}	
	
	public String toString()
	{
		return String.format("|%.2f + %.2f * i| = %f", m_real, m_imag, getNorm());
	}
}
