/*----------------------------------------------------------------------
	FILE        : StringUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 20.02.2022

	Utility class that is used for string operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free	
-----------------------------------------------------------------------*/
package org.csystem.util.string;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.random.RandomUtil;

import java.util.Random;

import static java.lang.Character.*;

public final class StringUtil {
    private static final String ALPHABET_LOWER_TR = "abcçdefgğhıijklmnoöprsştuüvyz";
    private static final String ALPHABET_LOWER_EN = "abcdefghijklmnopqrstuwxvyz";
    private static final String ALPHABET_UPPER_TR = "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
    private static final String ALPHABET_UPPER_EN = "ABCDEFGHIJKLMNOPQRSTUWXVYZ";
    private static final String ALPHABET_ALL_TR = ALPHABET_UPPER_TR + ALPHABET_LOWER_TR;
    private static final String ALPHABET_ALL_EN = ALPHABET_UPPER_EN + ALPHABET_LOWER_EN;


    private StringUtil()
    {
    }

    public static String capitalize(String s)
    {        
        return s.isBlank() ? s : toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static String changeCase(String s)
    {
        char [] c = s.toCharArray();

        for (int i = 0; i < c.length; ++i)
            if (isUpperCase(c[i]))
                c[i] = toLowerCase(c[i]);
            else if (isLowerCase(c[i]))
                c[i] = toUpperCase(c[i]);

        return String.valueOf(c);
    }

    public static int countString(String s1, String s2)
    {
        int count = 0;

        for (int index = -1; (index = s1.indexOf(s2, index + 1)) != -1; ++count)
            ;

        return count;
    }

    public static String getLongestPalindrome(String s)
    {
        String result = "";

        int endIndex = s.length();

        while (endIndex != 0) {
            int beginIndex = 0;

            while (beginIndex != endIndex) {
                String str = s.substring(beginIndex++, endIndex);

                if (str.length() > 1 && isPalindrome(str) && str.length() > result.length())
                    result = str;
            }

            --endIndex;
        }

        return result;
    }

    public static String getRandomText(Random r, int n, String sourceText)
    {
        char [] c = new char[n];
        int length = sourceText.length();

        for (int i = 0; i < n; ++i)
            c[i] = sourceText.charAt(r.nextInt(length));

        return String.valueOf(c);
    }

    public static String getRandomTextTR(Random r, int n)
    {
        return getRandomText(r, n, ALPHABET_ALL_TR);
    }

    public static String getRandomTextTR(int n)
    {
        return getRandomTextTR(new Random(), n);
    }

    public static String getRandomTextEN(Random r, int n)
    {
        return getRandomText(r, n, ALPHABET_ALL_EN);
    }

    public static String getRandomTextEN(int n)
    {
        return getRandomTextEN(new Random(), n);
    }

    public static String [] getRandomTextsTR(Random r, int n, int min, int max)
    {
        String [] str = new String[n];

        for (int i = 0; i < n; ++i)
            str[i] = getRandomTextTR(r, RandomUtil.nextInt(r, min, max + 1));

        return str;
    }

    public static String [] getRandomTextsEN(Random r, int n, int min, int max)
    {
        String [] str = new String[n];

        for (int i = 0; i < n; ++i)
            str[i] = getRandomTextEN(r, RandomUtil.nextInt(r, min, max + 1));

        return str;
    }

    public static int indexOfStartsWith(String [] str, String s)
    {
        for (int i = 0; i < str.length; ++i)
            if (str[i].startsWith(s))
                return i;

        return -1;
    }

    public static boolean isAllLetter(String s)
    {
        int length = s.length();

        for (int i = 0; i < length; ++i)
            if (!isLetter(s.charAt(i)))
                return false;

        return true;
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char chLeft = toLowerCase(s.charAt(left));

            if (!isLetter(chLeft)) {
                ++left;
                continue;
            }

            char chRight = toLowerCase(s.charAt(right));

            if (!isLetter(chRight)) {
                --right;
                continue;
            }

            if (chLeft != chRight)
                return false;

            ++left;
            --right;
        }

        return true;
    }

    public static boolean isPangramTR(String text)
    {
        return isPangram(text.toLowerCase(), ALPHABET_LOWER_TR);
    }

    public static boolean isPangramEN(String text)
    {
        return isPangram(text.toLowerCase(), ALPHABET_LOWER_EN);
    }

    public static boolean isPangram(String text, String alphabet)
    {
        int length = alphabet.length();

        for (int i = 0; i < length; ++i)
            if (!text.contains(alphabet.charAt(i) + ""))
                return false;

        return true;
    }

    public static String join(String [] str, char delimiter)
    {
        return join(str, delimiter, false);
    }

    public static String join(String [] str, char delimiter, boolean removeEmpties)
    {
        return join(str, delimiter + "", removeEmpties);
    }

    public static String join(String [] str, String delimiter)
    {
        return join(str, delimiter, false);
    }

    public static String join(String [] str, String delimiter, boolean removeEmpties)
    {
        return join(str, 0, delimiter, removeEmpties);
    }

    public static String join(String [] str, int startIndex, char delimiter)
    {
        return join(str, startIndex, delimiter, false);
    }

    public static String join(String [] str, int startIndex, char delimiter, boolean removeEmpties)
    {
        return join(str, startIndex, delimiter + "", removeEmpties);
    }

    public static String join(String [] str, int startIndex, String delimiter)
    {
        return join(str, startIndex, delimiter, false);
    }

    public static String join(String [] str, int startIndex, String delimiter, boolean removeEmpties)
    {
        String result = "";

        for (int i = startIndex; i < str.length; ++i) {
            if (removeEmpties && str[i].isEmpty())
                continue;

            result += str[i] + delimiter;
        }

        return result.substring(0, result.length() - delimiter.length());
    }

    public static String padLeading(String s, int length, char ch)
    {
        return length <= s.length() ? s : (ch + "").repeat(length - s.length()) + s;
    }

    public static String padLeading(String s, int length)
    {
        return padLeading(s, length, ' ');
    }

    public static String padTrailing(String s, int length, char ch)
    {        
        return length <= s.length() ? s : s + (ch + "").repeat(length - s.length());
    }

    public static String padTrailing(String s, int length)
    {
        return padTrailing(s, length, ' ');
    }

    public static String removeWhiteSpaces(String s)
    {
        char [] c = new char[s.length()];
        int idx;

        idx = 0;
        for (int i = 0; i < c.length; ++i) {
            char ch = s.charAt(i);

            if (!Character.isWhitespace(ch))
                c[idx++] = ch;
        }

        return String.valueOf(c, 0, idx);
    }

    public static String reversed(String s)
    {
        char [] c = s.toCharArray();

        ArrayUtil.reverse(c);

        return String.valueOf(c);
    }

    public static String trimLeading(String s)
    {
        int i;
        int length = s.length();

        for (i = 0; i < length && isWhitespace(s.charAt(i)); ++i)
            ;

        return s.substring(i);
    }

    public static String trimTrailing(String s)
    {
        int i;

        for (i = s.length() - 1; i >= 0 && isWhitespace(s.charAt(i)); --i)
            ;

        return s.substring(0, i + 1);
    }
}