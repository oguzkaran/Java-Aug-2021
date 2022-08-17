/*----------------------------------------------------------------
	FILE		: LongValue.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 15.05.2022

	Immutable LongValue class for wrapping a long value by using
	cache for [-128, 17] closed interval value

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.wrapper;

public final class LongValue {
    private static final int CACHE_MIN = -128;
    private static final int CACHE_MAX = 127;
    private static final LongValue[] ms_cache = new LongValue[CACHE_MAX - CACHE_MIN + 1];
    private final long m_value;

    private LongValue(long value)
    {
        m_value = value;
    }

    public static final LongValue ZERO = of(0);
    public static final LongValue ONE = of(1);
    public static final LongValue TEN = of(10);

    public static LongValue of(long value)
    {
        if (value < CACHE_MIN || CACHE_MAX < value)
            return new LongValue(value);

        int idx = (int)value + 128;

        if (ms_cache[idx] == null)
            ms_cache[idx] = new LongValue(value);

        return ms_cache[idx];
    }

    public long getValue()
    {
        return m_value;
    }

    public int compareTo(LongValue other)
    {
        return (int)(m_value - other.m_value);
    }

    public LongValue add(long value)
    {
        return of(m_value + value);
    }

    public LongValue add(LongValue value)
    {
        return add(value.m_value);
    }

    public LongValue subtract(long value)
    {
        return add(-value);
    }

    public LongValue subtract(LongValue value)
    {
        return subtract(value.m_value);
    }

    public LongValue multiply(long value)
    {
        return of(m_value * value);
    }

    public LongValue multiply(LongValue value)
    {
        return multiply(value.m_value);
    }

    public LongValue divide(long value)
    {
        return of(m_value / value);
    }

    public LongValue divide(LongValue value)
    {
        return divide(value.m_value);
    }

    public LongValue[] divideAndRemainder(long value)
    {
        LongValue[] result = new LongValue[2];

        result[0] = divide(value);
        result[1] = of(m_value % value);

        return result;
    }

    public LongValue[] divideAndRemainder(LongValue value)
    {
        return divideAndRemainder(value.m_value);
    }

    public LongValue inc()
    {
        return add(1);
    }

    public LongValue dec()
    {
        return subtract(1);
    }

    public String toString()
    {
        return m_value + "";
    }

}
