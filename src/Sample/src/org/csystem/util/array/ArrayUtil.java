/*----------------------------------------------------------------
	FILE		: ArrayUtil.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 28.06.2022

	Utility class for array operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public final class ArrayUtil {
    private static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - i - 1; ++k)
                if (a[k + 1] < a[k])
                    swap(a, k, k + 1);
    }

    private static void bubbleSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - i - 1; ++k)
                if (a[k] < a[k + 1])
                    swap(a, k, k + 1);
    }

    private static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            min = a[i];
            minIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }
            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    private static void selectionSortDescending(int [] a)
    {
        int max, maxIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            max = a[i];
            maxIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }
            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    private ArrayUtil()
    {}

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }

    public static void bubbleSort(int [] a, boolean descending)
    {
        if (descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static void drawHistogram(int [] data, int count, char ch)
    {
        int maxVal = max(data);

        for (int val : data) {
            int n = (int)Math.floor(val * (double)count / maxVal);

            while (n-- > 0)
                System.out.print(ch);

            System.out.println();
        }
    }

    public static void fillRandomArray(Random r, int [] a, int min, int max)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(min, max + 1); //Since Java 17
    }

    public static void fillRandomArray(int [] a, int min, int max)
    {
        fillRandomArray(new Random(), a, min, max);
    }

    public static void fillRandomArray(Random r, double [] a, double min, double bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextDouble(min, bound); //Since Java 17
    }

    public static void fillRandomArray(double [] a, double min, int bound)
    {
        fillRandomArray(new Random(), a, min, bound);
    }

    public static int [] getHistogramData(int [] a, int n) //[0, n]
    {
        int[] counts = new int[n + 1];

        for (int val : a)
            ++counts[val];

        return counts;
    }

    public static int [] getRandomArray(Random r, int count, int min, int max) //[min, max]
    {
        int [] a = new int[count];

        fillRandomArray(r, a, min, max);

        return a;
    }

    public static int [] getRandomArray(int count, int min, int max) //[min, max]
    {
        return getRandomArray(new Random(), count, min, max);
    }

    public static double [] getRandomArray(Random r, int count, double min, double bound) //[min, bound)
    {
        double [] a = new double[count];

        fillRandomArray(r, a, min, bound);

        return a;
    }

    public static double [] getRandomArray(int count, double min, double bound) //[min, max)
    {
        return getRandomArray(new Random(), count, min, bound);
    }

    public static int [][] getRandomMatrix(int m, int n, int min, int max)
    {
        return getRandomMatrix(new Random(), m, n, min, max);
    }

    public static int [][] getRandomMatrix(Random r, int m, int n, int min, int max)
    {
        int [][] a = new int[m][];

        for (int i = 0; i < m; ++i)
            a[i] = getRandomArray(r, n, min, max);

        return a;
    }

    public static int [][] getRandomSquareMatrix(int n, int min, int max)
    {
        return getRandomSquareMatrix(new Random(), n, min, max);
    }

    public static int [][] getRandomSquareMatrix(Random r, int n, int min, int max)
    {
       return getRandomMatrix(r, n, n, min, max);
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[i].length != a[0].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a[0].length == a.length;
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            if (result < a[i])
                result = a[i];

        return result;
    }

    public static int max(int [][] a)
    {
        int result = Integer.MIN_VALUE;

        for (int[] array : a)
            for (int val : array)
                if (result < val)
                    result = val;

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            if (result > a[i])
                result = a[i];

        return result;
    }

    public static int min(int [][] a)
    {
        int result = Integer.MAX_VALUE;

        for (int[] array : a)
            for (int val : array)
                if (val < result)
                    result = val;

        return result;
    }

    public static int partition(int [] a, int threshold)
    {
        int partitionIndex = 0;

        while (partitionIndex != a.length && a[partitionIndex] < threshold)
            ++partitionIndex;

        if (partitionIndex == a.length)
            return partitionIndex;

        for (int i = partitionIndex + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, partitionIndex++);

        return partitionIndex;
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(int n, int [] a)
    {
        for (int val : a)
            System.out.printf("%0" + n + "d ", val);

        System.out.println();
    }

    public static void print(long [] a)
    {
        print(1, a);
    }

    public static void print(int n, long [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (long val : a)
            System.out.printf(fmt, val);

        System.out.println();
    }

    public static void print(String [] s)
    {
        for (String str : s)
            System.out.println(str);
    }

    public static void print(int [][] a)
    {
        print(1, a);
    }

    public static void print(int n, int [][] a)
    {
        for (int[] array : a)
            print(n, array);
    }

    public static void reverse(int [] a)
    {
        for (int i = 0;i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static void reverse(char [] a)
    {
        for (int i = 0;i < a.length / 2; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static void selectionSort(int [] a)
    {
        selectionSort(a, false);
    }

    public static void selectionSort(int [] a, boolean descending)
    {
        if (descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(char [] c, int i, int k)
    {
        char temp;

        temp = c[i];
        c[i] = c[k];
        c[k] = temp;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int val : a)
            total += val;

        return total;
    }

    public static int sum(int [][] a)
    {
        int total = 0;

        for (int[] array : a)
            total += sum(array);

        return total;
    }

    public static int sumDiagonal(int [][] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i][i];

        return total;
    }

    public static int [][] transposed(int [][] a)
    {
        int [][] t = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                t[j][i] = a[i][j];

        return t;
    }
}
