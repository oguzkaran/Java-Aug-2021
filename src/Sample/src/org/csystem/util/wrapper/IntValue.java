/*----------------------------------------------------------------------
	FILE        : IntValue.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 02.01.2022

	Immutable class that wraps int value and caches values in [-128, 127]

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.wrapper;

public class IntValue {
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

    public String toString()
    {
        return m_value + "";
    }

}
