/*----------------------------------------------------------------------
	FILE        : ArrayUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 14.11.2021

	Utility class that is used for array operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void addBy(int [] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] += val;
    }

    public static double average(int [] a)
    {

    }

    public static void display(int [] a)
    {
        display(1, a);

    }

    public static void display(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i]);

        System.out.println();
    }

    public static void display(double [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%f%n", a[i]);
    }

    public static void fillRandomArray(int [] a, int min, int max)
    {
        fillRandomArray(new Random(), a, min, max);
    }

    public static void fillRandomArray(Random r, int [] a, int min, int max)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(max - min + 1) + min;
    }

    public static int [] getRandomArray(int n, int min, int max)
    {
        return getRandomArray(new Random(), n, min, max);
    }

    public static int [] getRandomArray(Random r, int n, int min, int max)
    {
        int [] a = new int[n];

        fillRandomArray(r, a, min, max);

        return a;
    }


    public static int min(int [] a)
    {

    }

    public static int max(int [] a)
    {

    }

    public static void reverse(int [] a)
    {
        int halfVal = a.length / 2;

        for (int i = 0; i < halfVal; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static int sum(int [] a)
    {

    }

    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}
