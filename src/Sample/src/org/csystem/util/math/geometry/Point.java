/*----------------------------------------------------------------------
	FILE        : Point.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 30.01.2022

	Immutable Point class that represents 2D point

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
	private final double m_x;
	private final double m_y;

	private Point(double a, double b, boolean polar)
	{
		m_x = polar ? a * Math.cos(b) : a;
		m_y = polar ? a * Math.sin(b) : b;
	}

	Point(Point p)
	{
		this(p.m_x, p.m_y, false);
	}

	public static Point createCartesian()
	{
		return createCartesian(0);
	}

	public static Point createCartesian(double x)
	{
		return createCartesian(x, 0);
	}

	public static Point createCartesian(double x, double y)
	{
		return new Point(x, y, false);
	}

	public static Point createPolar()
	{
		return createPolar(0, 0);
	}

	public static Point createPolar(double r)
	{
		return createPolar(r, 0);
	}

	public static Point createPolar(double r, double theta)
	{
		return new Point(r, theta, true);
	}

	public static Point create(MutablePoint p)
	{
		return createCartesian(p.getX(), p.getY());
	}

	public double getX()
	{
		return m_x;
	}

	public double getY()
	{
		return m_y;
	}

	public double distance()
	{
		return distance(0, 0);
	}
	
	public double distance(Point other)
	{
		return distance(other.m_x, other.m_y);
	}

	public double distance(double a, double b)
	{
		return sqrt(pow(m_x - a, 2) + pow(m_y - b, 2));
	}

	public Point offset(double dxy)
	{
		return offset(dxy, dxy);
	}

	public Point offset(double dx, double dy)
	{
		return new Point(m_x + dx, m_y + dy, false);
	}

	public MutablePoint toMutablePoint()
	{
		return MutablePoint.createCartesian(m_x, m_y);
	}

	public String toString()
	{
		return String.format("{x: %f, y: %f}", m_x, m_y);
	}
}