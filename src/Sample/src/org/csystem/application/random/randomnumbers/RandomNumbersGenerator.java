package org.csystem.application.random.randomnumbers;

import org.csystem.util.array.ArrayUtil;

public class RandomNumbersGenerator {
    private final int [] m_numbers;

    public RandomNumbersGenerator(int n, int min, int max)
    {
        m_numbers = ArrayUtil.getRandomArray(n, min, max);
    }

    public int [] getNumbers()
    {
        int [] result = new int[m_numbers.length];

        ArrayUtil.copy(m_numbers, result);

        return result;
    }

    public int getNumber(int index)
    {
        return m_numbers[index];
    }

    public int length()
    {
        return m_numbers.length;
    }

    public String toString()
    {
        String result = "[";

        for (int val : m_numbers) {
            if (result.length() != 1)
                result += ", ";

            result += val;
        }

        return result + "]";
    }
}
