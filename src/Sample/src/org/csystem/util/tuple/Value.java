/*----------------------------------------------------------------
	FILE		: Value.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 06.09.2022

	Immutable Value that represents Tuple<T>

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.tuple;

public class Value<T> {
    private final T m_t;

    public static <T> Value<T> of(T value)
    {
        return new Value<>(value);
    }

    public Value(T value)
    {
        m_t = value;
    }

    public T getValue()
    {
        return m_t;
    }

    public String toString()
    {
        return m_t + "";
    }

    //...
}
