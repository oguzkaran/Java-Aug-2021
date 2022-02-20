/*----------------------------------------------------------------------
	FILE        : ArrayUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 20.02.2022

	Utility class that is used for array operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.array;

import java.util.Random;

public final class ArrayUtil {
    private static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k + 1] < a[k])
                    swap(a, k, k + 1);
    }

    private static void bubbleSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k] < a[k + 1])
                    swap(a, k, k + 1);
    }

    private static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            min = a[i];
            minIndex = i;

            for (int k = i + 1; k < a.length; ++k) {
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }
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

            for (int k = i + 1; k < a.length; ++k) {
                if (max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }
            }
            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    private ArrayUtil()
    {
    }

    public static void addBy(int [] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] += val;
    }

    public static double average(int [] a)
    {
        return (double)sum(a) / a.length;
    }

    public static void bubbleSort(int []a)
    {
        bubbleSort(a, false);
    }

    public static void bubbleSort(int []a, boolean descending)
    {
        if (descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }


    public static void copy(int [] src, int [] dest)
    {
        for (int i = 0; i < src.length; ++i)
            dest[i] = src[i];
    }

    public static void copy(double [] src, double [] dest)
    {
        for (int i = 0; i < src.length; ++i)
            dest[i] = src[i];
    }

    public static void display(int [] a)
    {
        display(1, a);
    }

    public static void display(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int val : a)
            System.out.printf(fmt, val);

        System.out.println();
    }

    public static void display(double [] a)
    {
        for (double val : a)
            System.out.printf("%f%n", val);
    }

    public static void display(String [] str)
    {
        for (String s : str)
            System.out.println(s);
    }

    public static void display(int n, int [][] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int [] array : a) {
            for (int val : array)
                System.out.printf(fmt, val);

            System.out.println();
        }
    }

    public static void drawHistogram(int [] data, int n, char ch)
    {
        int maxVal = max(data);

        for (int val : data) {
            int count = (int)Math.ceil(val * n / (double)maxVal);

            while (count-- > 0)
                System.out.print(ch);

            System.out.println();
        }
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

    public static int [] getHistogramData(int [] a, int n) //[0, n]
    {
        int [] counts = new int[n + 1];

        for (int val : a)
            ++counts[val];

        return counts;
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

    public static int [][] getRandomMatrix(int m, int n, int min, int max)
    {
        return getRandomMatrix(new Random(), m, n, min, max);
    }

    public static int [][] getRandomMatrix(Random r, int m, int n, int min, int max)
    {
        int [][] matrix = new int[m][];

        for (int i = 0; i < m; ++i)
            matrix[i] = getRandomArray(r, n, min, max);

        return matrix;
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
        if (a.length == 0)
            return false;

        for (int i = 1; i < a.length; ++i)
            if (a[i].length != a[0].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a[0].length == a.length;
    }


    public static int min(int [] a)
    {
        int minVal = a[0];

        for (int i = 1; i < a.length; ++i)
            if (a[i] < minVal)
                minVal = a[i];

        return minVal;
    }

    public static int min(int [][] a)
    {
        int minVal = Integer.MAX_VALUE;

        for (int [] array : a)
            for (int val : array)
                if (val < minVal)
                    minVal = val;

        return minVal;
    }

    public static int max(int [] a)
    {
        int maxVal = a[0];

        for (int i = 1; i < a.length; ++i)
            if (maxVal < a[i])
                maxVal = a[i];

        return maxVal;
    }


    public static int max(int [][] a)
    {
        int maxVal = Integer.MIN_VALUE;

        for (int [] array : a)
            for (int val : array)
                if (maxVal < val)
                    maxVal = val;

        return maxVal;
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

    public static void reverse(int [] a)
    {
        int halfVal = a.length / 2;

        for (int i = 0; i < halfVal; ++i)
            swap(a, i, a.length - 1 - i);
    }

    public static void reverse(char [] a)
    {
        int halfVal = a.length / 2;

        for (int i = 0; i < halfVal; ++i)
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

        for (int [] array : a)
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


    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(char [] a, int i, int k)
    {
        char temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    public static int [][] transposed(int [][] a)
    {
        int [][] result = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                result[j][i] = a[i][j];

        return result;
    }
}
