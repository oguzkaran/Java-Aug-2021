/*----------------------------------------------------------------------
	FILE        : AnalyticalCircle.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 30.01.2022

	Circle class that represents analytical circle

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math.geometry;

public class AnalyticalCircle extends Circle {
    private final MutablePoint m_center;

    public AnalyticalCircle()
    {
        this(0);
    }

    public AnalyticalCircle(double r)
    {
        this(r, 0, 0);
    }

    public AnalyticalCircle(Point center)
    {
        this(0, center);
    }

    public AnalyticalCircle(double r, Point center)
    {
        this(r, center.getX(), center.getY());
    }

    public AnalyticalCircle(MutablePoint center)
    {
        this(0, center);
    }

    public AnalyticalCircle(double r, MutablePoint center)
    {
        this(r, center.getX(), center.getY());
    }

    public AnalyticalCircle(double r, double x, double y)
    {
        super(r);
        m_center = MutablePoint.createCartesian(x, y);
    }

    public double getX()
    {
        return m_center.getX();
    }

    public void setX(double x)
    {
        m_center.setX(x);
    }

    public double getY()
    {
        return m_center.getY();
    }

    public void setY(double y)
    {
        m_center.setY(y);
    }

    public void setCenter(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public void setCenter(MutablePoint point)
    {
        setCenter(point.getX(), point.getY());
    }

    public void setCenter(Point point)
    {
        setCenter(point.getX(), point.getY());
    }

    public Point getCenterAsPoint()
    {
        return m_center.toPoint();
    }

    public MutablePoint getCenterAsMutablePoint()
    {
        return new MutablePoint(m_center);
    }

    public double centerDistance(AnalyticalCircle other)
    {
        return m_center.distance(other.m_center);
    }

    public double shortestDistance(AnalyticalCircle other)
    {
        return centerDistance(other) - getRadius() - other.getRadius();
    }

    public void offset(double dx, double dy)
    {
        m_center.offset(dx, dy);
    }

    public void offset(double dxy)
    {
        offset(dxy, dxy);
    }

    //...
}
