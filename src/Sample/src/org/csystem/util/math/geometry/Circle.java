/*----------------------------------------------------------------------
	FILE        : Circle.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 25.12.2021

	Circle class that represents synthetic Circle

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Circle {
    private double m_r;

    public Circle()
    {
    }

    public Circle(double r)
    {
        setRadius(r);
    }

    public double getRadius()
    {
        return m_r;
    }

    public double getArea()
    {
        return PI * m_r * m_r;
    }

    public double getCircumference()
    {
        return 2 * PI * m_r;
    }

    public void setRadius(double radius)
    {
        m_r = abs(radius);
    }
}
