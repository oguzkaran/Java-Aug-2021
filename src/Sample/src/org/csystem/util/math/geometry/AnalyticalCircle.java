/*----------------------------------------------------------------------
	FILE        : AnalyticalCirclev.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 29.12.2021

	Circle class that represents analytical circle

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private MutablePoint m_center;

    public AnalyticalCircle(double r, double x, double y)
    {
        super(r);
        m_center = MutablePoint.createCartesian(x, y);
    }

    //...
}
