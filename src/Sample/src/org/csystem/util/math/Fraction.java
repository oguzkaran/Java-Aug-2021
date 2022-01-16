/*----------------------------------------------------------------------
	FILE        : Fraction.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 16.01.2022

	Immutable Fraction class that represents fraction in mathematics

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

public class Fraction {
    private final int m_a;
    private final int m_b;

    private static Fraction add(int a1, int b1, int a2, int b2)
    {
        return new Fraction(a1 * b2 + a2 * b1, b1 * b2);
    }

    private static Fraction subtract(int a1, int b1, int a2, int b2)
    {
        return add(a1, b1, -a2, b2);
    }

    private static Fraction multiply(int a1, int b1, int a2, int b2)
    {
        return new Fraction(a1 * a2, b1 * b2);
    }

    private static Fraction divide(int a1, int b1, int a2, int b2)
    {
        return multiply(a1, b1, b2, a2);
    }

    private static void check(int a, int b)
    {
        if (b == 0) {
            if (a == 0)
                System.out.println("Indeterminate");
            else
                System.out.println("Undefined");

            System.exit(1); // Exception işlemleri konusuna kadar sabredin
        }
    }

    private int gcd(int a, int b)
    {
        int i = Math.min(Math.abs(a), b);

        for (; i >= 2; --i)
            if (a % i == 0 && b % i == 0)
                break;

        return i;
    }

    public Fraction()
    {
        m_a = 0;
        m_b = 1;
    }

    public Fraction(int a)
    {
        m_a = a;
        m_b = 1;
    }

    public Fraction(int a, int b)
    {
        check(a, b);
        if (a == 0) {
            m_a = 0;
            m_b = 1;
            return;
        }

        if (b < 0) {
            a = -a;
            b = -b;
        }

        int val = gcd(a, b);

        m_a = a / val;
        m_b = b / val;
    }

    public int getNumerator()
    {
        return m_a;
    }

    public int getDenominator()
    {
        return m_b;
    }

    public double getRealValue()
    {
        return (double)m_a / m_b;
    }

    //add methods
    public static Fraction add(int val, Fraction f)
    {
        return add(val, 1, f.m_a, f.m_b);
    }

    public Fraction add(Fraction other)
    {
        return add(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction add(int val)
    {
        return add(m_a, m_b, val, 1);
    }

    //subtract methods
    public static Fraction subtract(int val, Fraction f)
    {
        return subtract(val, 1, f.m_a, f.m_b);
    }

    public Fraction subtract(Fraction other)
    {
        return subtract(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction subtract(int val)
    {
        return subtract(m_a, m_b, val, 1);
    }

    //multiply methods
    public static Fraction multiply(int val, Fraction f)
    {
        return multiply(val, 1, f.m_a, f.m_b);
    }

    public Fraction multiply(Fraction other)
    {
        return multiply(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction multiply(int val)
    {
        return multiply(m_a, m_b, val, 1);
    }

    //divide methods
    public static Fraction divide(int val, Fraction f)
    {
        return divide(val, 1, f.m_a, f.m_b);
    }

    public Fraction divide(Fraction other)
    {
        return divide(m_a, m_b, other.m_a, other.m_b);
    }

    public Fraction divide(int val)
    {
        return divide(m_a, m_b, val, 1);
    }

    public String toString()
    {
        return String.format("%d%s", m_a, m_b == 1 ? "" : " / " + m_b + " = " + getRealValue());
    }
}
