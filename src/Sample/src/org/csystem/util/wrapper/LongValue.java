/*----------------------------------------------------------------------
	FILE        : DoubleValue.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 02.01.2022

	Immutable class that wraps a long value and caches values in [-128, 127]

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.wrapper;

public class LongValue {
    private static final int MIN_VALUE = -128;
    private static final int MAX_VALUE = 127;
    private static final int INDEX_PLUS_VALUE = -MIN_VALUE;
    private static final LongValue[] ms_cache = new LongValue[MAX_VALUE - MIN_VALUE + 1];
    private final long m_value;

    private LongValue(long value)
    {
        m_value = value;
    }

    public static final LongValue ZERO = of(0);
    public static final LongValue ONE = of(1);
    public static final LongValue TWO = of(1);
    public static final LongValue TEN = of(10);

    public static LongValue of(long value)
    {
        if (value < MIN_VALUE || MAX_VALUE < value)
            return new LongValue(value);

        int idx = (int)value + INDEX_PLUS_VALUE;
        if (ms_cache[idx] == null)
            ms_cache[idx] = new LongValue(value);

        return ms_cache[idx];
    }

    public long getValue()
    {
        return m_value;
    }

    public static long sum(long left, long right)
    {
        return left + right;
    }

    public LongValue add(long value)
    {
        return of(m_value + value);
    }

    public LongValue add(LongValue other)
    {
        return add(other.m_value);
    }

    public LongValue subtract(long value)
    {
        return add(-value);
    }

    public LongValue subtract(LongValue other)
    {
        return subtract(other.m_value);
    }

    public LongValue multiply(long value)
    {
        return of(m_value * value);
    }

    public LongValue multiply(LongValue other)
    {
        return multiply(other.m_value);
    }

    public LongValue divide(long value)
    {
        return of(m_value / value);
    }

    public LongValue divide(LongValue other)
    {
        return divide(other.m_value);
    }

    public LongValue[] divideAndRemainder(long value)
    {
        return new LongValue[] {of(m_value / value), of(m_value % value)};
    }

    public LongValue[] divideAndRemainder(LongValue other)
    {
        return divideAndRemainder(other.m_value);
    }

    public LongValue increment()
    {
        return add(1);
    }

    public LongValue decrement()
    {
        return subtract(1);
    }

    public int compareTo(LongValue other)
    {
        long diff = m_value - other.m_value;
        int result = -1;

        if (diff > 0)
            result = 1;
        else if (diff == 0)
            result = 0;

        return result;
    }

    public String toString()
    {
        return m_value + "";
    }

    //...
}
