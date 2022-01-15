/*----------------------------------------------------------------------
	FILE        : MutableFraction.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 15.01.2022

	MutableFraction class that represents fraction in mathematics

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.math;

public class MutableFraction {
    private int m_a;
    private int m_b;

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

    private void simplify()
    {
        int min = Math.min(Math.abs(m_a), m_b);

        for (int i = min; i >= 2; --i)
            if (m_a % i == 0 && m_b % i == 0) {
                m_a /= i;
                m_b /= i;
                break;
            }
    }

    private void setSign()
    {
        if (m_b < 0) {
            m_a = -m_a;
            m_b = -m_b;
        }
    }

    private void set(int a, int b)
    {
        if (a == 0) {
            m_a = 0;
            m_b = 1;
            return;
        }

        m_a = a;
        m_b = b;
        setSign();
        simplify();
    }

    public MutableFraction()
    {
        m_b = 1;
    }

    public MutableFraction(int a)
    {
        m_a = a;
        m_b = 1;
    }

    public MutableFraction(int a, int b)
    {
        check(a, b);
        set(a, b);
    }

    //...

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

    public String toString()
    {
        return String.format("%d / %d = %f", m_a, m_b, getRealValue());
    }
}
