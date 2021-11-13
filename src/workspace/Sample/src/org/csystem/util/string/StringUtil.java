/*----------------------------------------------------------------------
	FILE        : StringUtil.java
	AUTHOR      : Java-Aug-2021 Group
	LAST UPDATE : 13.11.2021

	Utility class that is used for string operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free	
-----------------------------------------------------------------------*/
package org.csystem.util.string;

public class StringUtil {

    public static String capitalize(String s)
    {        
        return s.isBlank() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
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

    public static String getRandomText(java.util.Random r, int n, String sourceText)
    {
        String str = "";
        int length = sourceText.length();

        for (int i = 0; i < n; ++i)
            str += sourceText.charAt(r.nextInt(length));

        return str;
    }

    public static String getRandomTextTR(java.util.Random r, int n)
    {
        return getRandomText(r, n, "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZabcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static String getRandomTextTR(int n)
    {
        return getRandomTextTR(new java.util.Random(), n);
    }

    public static String getRandomTextEN(java.util.Random r, int n)
    {
        return getRandomText(r, n, "ABCDEFGHIJKLMNOPQRSTUWXVYZabcdefghijklmnopqrstuwxvyz");
    }

    public static String getRandomTextEN(int n)
    {
        return getRandomTextEN(new java.util.Random(), n);
    }

    public static boolean isAllLetter(String s)
    {
        int length = s.length();

        for (int i = 0; i < length; ++i)
            if (!Character.isLetter(s.charAt(i)))
                return false;

        return true;
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char chLeft = Character.toLowerCase(s.charAt(left));

            if (!Character.isLetter(chLeft)) {
                ++left;
                continue;
            }

            char chRight = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetter(chRight)) {
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
        return isPangram(text.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }

    public static boolean isPangramEN(String text)
    {
        return isPangram(text.toLowerCase(), "abcdefghijklmnopqrstuwxvyz");
    }

    public static boolean isPangram(String text, String alphabet)
    {
        int length = alphabet.length();

        for (int i = 0; i < length; ++i)
            if (!text.contains(alphabet.charAt(i) + ""))
                return false;

        return true;
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

    public static String reverse(String s)
    {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; --i)
            rev += s.charAt(i);

        return rev;
    }

    public static String trimLeading(String s)
    {
        int i;
        int length = s.length();

        for (i = 0; i < length && Character.isWhitespace(s.charAt(i)); ++i)
            ;

        return s.substring(i);
    }

    public static String trimTrailing(String s)
    {
        int i;

        for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
            ;

        return s.substring(0, i + 1);
    }
}