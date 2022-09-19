/*----------------------------------------------------------------
	FILE		: Pair.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 06.09.2022

	Immutable Value that represents Tuple<T1, T2>

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.tuple;

public class Pair<F, S> {
    private final F m_first;
    private final S m_second;

    public static <F, S> Pair<F, S> of(F first, S second)
    {
        return new Pair<>(first, second);
    }

    public Pair(F first, S second)
    {
        m_first = first;
        m_second = second;
    }

    public F getFirst()
    {
        return m_first;
    }

    public S getSecond()
    {
        return m_second;
    }

    public String toString()
    {
        return String.format("(%s, %s)", m_first, m_second);
    }

    //...
}
