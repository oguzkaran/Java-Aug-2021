/*----------------------------------------------------------------
	FILE		: CSDArrayList.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 12.09.2022

	CSDArrayList class that represents dynamic array

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.collection;

import java.util.Arrays;

public class CSDArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E [] m_elems;
    private int m_index;

    private static void doWorkForIllegalArgumentException(String message)
    {
        throw new IllegalArgumentException(message);
    }

    private static void doWorkForIndexOutOfBoundsException(String message)
    {
        throw new IndexOutOfBoundsException(message);
    }

    private static void checkCapacity(int capacity)
    {
        if (capacity < 0)
            doWorkForIllegalArgumentException("Capacity value can not be negative:" + capacity);
    }

    private void checkIndex(int index)
    {
        if (index < 0 || m_index <= index)
            doWorkForIndexOutOfBoundsException("Index out of range:" + index);

    }

    private void changeCapacity(int capacity)
    {
        m_elems = Arrays.copyOf(m_elems, capacity);
    }

    public CSDArrayList()
    {
        m_elems = (E[])new Object[DEFAULT_CAPACITY];
    }

    public CSDArrayList(int initialCapacity)
    {
        checkCapacity(initialCapacity);
        m_elems = (E [])new Object[initialCapacity];
    }

    public boolean add(E elem)
    {
        if (m_elems.length == m_index)
            changeCapacity(m_elems.length == 0 ? 1 : m_elems.length * 2);

        m_elems[m_index++] = elem;

        return true;
    }

    public void add(int index, E elem)
    {
        if (m_elems.length == m_index)
            changeCapacity(m_elems.length == 0 ? 1 : m_elems.length * 2);

        //TODO:
    }

    public int capacity()
    {
        return m_elems.length;
    }

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_elems[i] = null;

        m_index = 0;
    }

    public void ensureCapacity(int minCapacity)
    {
        if (minCapacity > m_elems.length)
            changeCapacity(Math.max(m_elems.length * 2, minCapacity));
    }

    public E get(int index)
    {
        checkIndex(index);

        return m_elems[index];
    }

    public boolean isEmpty()
    {
        return m_index == 0;
    }

    public E set(int index, E elem)
    {
        checkIndex(index);
        E old = m_elems[index];

        m_elems[index] = elem;

        return old;
    }

    public int size()
    {
        return m_index;
    }

    public E remove(int index)
    {
        checkIndex(index);
        E old = m_elems[index];

        //TODO:


        m_elems[m_index--] = null; // Bu da yapılmazsa memory leak oluşabilir

        return old;
    }

    public void trimToSize()
    {
        if (m_elems.length != m_index)
            changeCapacity(m_index);
    }

    public String toString()
    {
        String str = "[";

        for (int i = 0; i < m_index; ++i) {
            if (str.length() != 1)
                str += ", ";
            str += m_elems[i];
        }

        return str + "]";
    }
}
