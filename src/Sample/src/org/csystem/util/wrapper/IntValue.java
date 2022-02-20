/*----------------------------------------------------------------------
	FILE        : IntValue.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 20.02.2022

	Immutable class that wraps an int value and caches values in [-128, 127]

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.wrapper;

public final class IntValue {
    private static final int MIN_VALUE = -128;
    private static final int MAX_VALUE = 127;
    private static final int INDEX_PLUS_VALUE = -MIN_VALUE;
    private static final IntValue [] ms_cache = new IntValue[MAX_VALUE - MIN_VALUE + 1];
    private final int m_value;

    private IntValue(int value)
    {
        m_value = value;
    }

    public static final IntValue ZERO = of(0);
    public static final IntValue ONE = of(1);
    public static final IntValue TWO = of(1);
    public static final IntValue TEN = of(10);

    public static IntValue of(int value)
    {
        if (value < MIN_VALUE || MAX_VALUE < value)
            return new IntValue(value);

        if (ms_cache[value + INDEX_PLUS_VALUE] == null)
            ms_cache[value + INDEX_PLUS_VALUE] = new IntValue(value);

        return ms_cache[value + INDEX_PLUS_VALUE];
    }

    public int getValue()
    {
        return m_value;
    }

    public static int sum(int left, int right)
    {
        return left + right;
    }

    public IntValue add(int value)
    {
        return of(m_value + value);
    }

    public IntValue add(IntValue other)
    {
        return add(other.m_value);
    }

    public IntValue subtract(int value)
    {
        return add(-value);
    }

    public IntValue subtract(IntValue other)
    {
        return subtract(other.m_value);
    }

    public IntValue multiply(int value)
    {
        return of(m_value * value);
    }

    public IntValue multiply(IntValue other)
    {
        return multiply(other.m_value);
    }

    public IntValue divide(int value)
    {
        return of(m_value / value);
    }

    public IntValue divide(IntValue other)
    {
        return divide(other.m_value);
    }

    public IntValue [] divideAndRemainder(int value)
    {
        return new IntValue[] {of(m_value / value), of(m_value % value)};
    }

    public IntValue [] divideAndRemainder(IntValue other)
    {
        return divideAndRemainder(other.m_value);
    }

    public IntValue increment()
    {
        return add(1);
    }

    public IntValue decrement()
    {
        return subtract(1);
    }

    public int compareTo(IntValue other)
    {
        return m_value - other.m_value;
    }

    public String toString()
    {
        return m_value + "";
    }

    //...
}
