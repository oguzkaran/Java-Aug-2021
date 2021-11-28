/*----------------------------------------------------------------------
	FILE        : NumberUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 28.11.2021

	Utility class that is used for numeric operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.numeric;

import static java.lang.Math.abs;
import static java.lang.Math.log10;

import java.util.Random;

public class NumberUtil {

    public static int [] getDigits(int val)
    {
        int [] digits = new int[countDigits(val)];

        val = Math.abs(val);

        for (int i = digits.length - 1; i >= 0; digits[i] = val % 10, val /= 10, --i)
            ;

        return digits;
    }

	public static int getDigitsFactorialSum(int n)
    {
        int total = 0;

        while (n != 0) {
            total += factorial(n % 10);
            n /= 10;
        }

        return total;
    }

    public static int getDigitsPowSum(int val)
    {
        int n = countDigits(val);
        int result = 0;

        while (val != 0) {
            result += pow(val % 10, n);
            val /= 10;
        }

        return result;
    }


    public static int calculateDigitalRoot(int val)
    {
        int root = abs(val);

        while (root > 9)
            root = sumDigits(root);

        return root;
    }
    

    public static int countDigits(int val)
    {
        return val == 0 ? 1 : (int) log10(abs(val)) + 1;
    }
    
    public static long factorial(int n)
    {
        long result = 1;

        for (long i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    
    public static int getFibonacciNumber(int n)
    {
        if (n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, val = 0;

        for (int i = 2; i < n; ++i) {
            val = prev1 + prev2;
            prev2 = prev1;
            prev1 = val;
        }

        return val;
    }

    public static int getIndexOfPrime(long n)
    {
        int idx = 1;
        int val = 2;

        for (;;) {
            if (val == n)
                return idx;

            if (isPrime(val))
                ++idx;

            ++val;
        }
    }

    public static int getNextFibonacciNumber(int val)
    {
        if (val < 0)
            return 0;

        int prev1 = 1, prev2 = 0, result;

        for (;;) {
            result = prev1 + prev2;

            if (result > val)
                return result;

            prev2 = prev1;
            prev1 = result;
        }
    }

    public static int getPrime(int n)
    {
        int count = 0;
        int val = 2;

        for (int i = 2; count < n; ++i)
            if (isPrime(i)) {
                ++count;
                val = i;
            }

        return val;
    }

    public static long getRandomLongPrime(Random r)
    {
        long prime;

        while (!isPrime(prime = r.nextLong()))
            ;

        return prime;
    }

    public static boolean isArmstrong(int val)
    {
        return val >= 0 && getDigitsPowSum(val) == val;
    }

    public static boolean isDecimalHarshad(int val)
    {
        return val >= 0 && val % sumDigits(val) == 0;
    }

    public static boolean isEven(int val)
    {
        return val % 2 == 0;
    }

    public static boolean isFactorian(int n)
    {
        return n > 0 && getDigitsFactorialSum(n) == n;
    }

    public static boolean isHardyRamanujan(int val)
    {
        if (val <= 0)
            return false;

        int count = 0;

        EXIT_LOOP:
        for (int x = 1; x * x * x < val; ++x)
            for (int y = x + 1; x * x * x + y * y * y <= val; ++y)
                if (x * x * x + y * y * y == val) {
                    if (++count == 2)
                        break EXIT_LOOP;
                    ++x;
                }

        return count == 2;
    }

    public static boolean isOdd(int val)
    {
        return !isEven(val);
    }

    public static boolean isPrime(long val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (long i = 11; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }   

    public static boolean isPrimeX(long val)
    {
        boolean result;

        for (long sum = val; (result = isPrime(sum)) && sum > 9; sum = sumDigits(sum))
            ;

        return result;
    }

    public static boolean isSuperPrime(long val)
    {
        return isPrime(val) && isPrime(getIndexOfPrime(val));
    }

    public static int mid(int a, int b, int c)
    {
        if (a <= b && b <= c || c <= b && b <= a)
            return b;

        if (b <= a && a <= c || c <= a && a <= b)
            return a;

        return c;
    }

    public static int min(int a, int b, int c)
    {
        return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    }

    public static int pow(int a, int b)
    {
        int result = 1;

        for (int i = 0; i < b; ++i)
            result *= a;

        return result;
    }

    public static void printGoldbachPrimePairs(int val)
    {
        for (int a = 2; a < val; ++a) {
            int b = val - a;

            if (isPrime(a) && isPrime(b) && a <= b)
                System.out.printf("%d + %d = %d == %d%n", b, a, a + b, val);
        }
    }

    public static void printPrimeFactors(int n)
    {
        if (n == 0)
            return;

        n = abs(n);

        int i = 2;

        while (n != 1)
            if (n % i == 0) {
                System.out.printf("%d ", i);
                n /= i;
            }
            else
                ++i;

        System.out.println();
    }

    public static int reversed(int val)
    {
        int result = 0;

        while (val != 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }

        return result;
    }    

    public static int sumDigits(long val)
    {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return abs(sum);
    }
}