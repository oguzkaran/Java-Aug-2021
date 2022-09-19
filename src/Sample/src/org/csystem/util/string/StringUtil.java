/*----------------------------------------------------------------
	FILE		: StringUtil.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 01.09.2022
	
	Utility class for string operations
	
	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/
package org.csystem.util.string;

import org.csystem.util.array.ArrayUtil;

import java.util.ArrayList;
import java.util.Random;

public final class StringUtil {
	private static final String ms_alphabetTR;
	private static final String ms_alphabetEN;
	private static final String ms_alphabetAllTR;
	private static final String ms_alphabetAllEN;

	static {
		ms_alphabetTR = "abcçdefgğhıijklmnoöprsştuüvyz";
		ms_alphabetEN = "abcdefghijklmnopqrstuwxvyz";
		ms_alphabetAllTR = ms_alphabetTR + "ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ";
		ms_alphabetAllEN = ms_alphabetEN + "ABCDEFGHIJKLMNOPQRSTUWXVYZ";
	}

	private StringUtil()
	{}

	public static String capitalize(String s) 
	{
		return s.isEmpty() ? "" : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
	}

	public static String changeCase(String s)
	{
		char [] c = s.toCharArray();

		for (int i = 0; i < c.length; ++i)
			c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.toUpperCase(c[i]);

		return String.valueOf(c);
	}

	public static boolean containsAll(String s, String text) 
	{
		int len = text.length();

		for (int i = 0; i < len; ++i)
			if (!s.contains(text.charAt(i) + ""))
				return false;

		return true;
	}

	public static int countString(String str, String s) 
	{
		int count = 0;

		for (int i = -1; (i = str.indexOf(s, i + 1)) != -1; ++count)
			;

		return count;
	}

	public static int countStringIgnoreCase(String str, String s) 
	{
		return countString(str.toLowerCase(), s.toLowerCase());
	}

	public static String getLongestPalindrome(String text) 
	{
		String result = "";

		int end = text.length();

		while (end != 0) {
			int begin = 0;

			while (begin != end) {
				String str = text.substring(begin++, end);

				if (str.length() > 1 && isPalindrome(str) && str.length() > result.length())
					result = str;
			}

			--end;
		}

		return result;
	}

	public static String getRandomText(Random r, int count, String text) 
	{
		char [] c = new char[count];
		int len = text.length();

		for (int i = 0; i < count; ++i)
			c[i] = text.charAt(r.nextInt(len));

		return String.valueOf(c);
	}

	public static String getRandomTextEN(int count) 
	{
		return getRandomTextEN(new Random(), count);
	}

	public static String getRandomTextEN(Random r, int count)
	{
		return getRandomText(r, count, ms_alphabetAllEN);
	}

	public static String getRandomTextTR(int count) 
	{
		return getRandomTextTR(new Random(), count);
	}

	public static String getRandomTextTR(Random r, int count) 
	{
		return getRandomText(r, count, ms_alphabetAllTR);
	}

	public static String [] getRandomTextsEN(Random r, int count, int min, int max) //[min, max]
	{
		String [] texts = new String[count];

		while (count-- > 0)
			texts[count] = getRandomTextEN(r, r.nextInt(min, max));

		return texts;
	}

	public static String [] getRandomTextsEN(int count, int min, int max)
	{
		return getRandomTextsEN(new Random(), count, min, max);
	}

	public static String [] getRandomTextsTR(Random r, int count, int min, int max) //[min, max]
	{
		String [] texts = new String[count];

		while (count-- > 0)
			texts[count] = getRandomTextTR(r, r.nextInt(min, max));

		return texts;
	}

	public static String [] getRandomTextsTR(int count, int min, int max)
	{
		return getRandomTextsTR(new Random(), count, min, max);
	}


	public static boolean isIdentifier(String s)
	{
		if (s.isBlank() || s.equals("_"))
			return false;

		if (!Character.isJavaIdentifierStart(s.charAt(0)))
			return false;

		int len = s.length();

		for (int i = 1; i < len; ++i)
			if (!Character.isJavaIdentifierPart(s.charAt(i)))
				return false;

		return true;
	}

	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));

			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}

			char cRight = Character.toLowerCase(s.charAt(right));

			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}

			if (cLeft != cRight)
				return false;

			++left;
			--right;
		}

		return Character.isLetter(s.charAt(left));
	}

	public static boolean isPangramEN(String s) 
	{
		return containsAll(s.toLowerCase(), ms_alphabetEN);
	}

	public static String join(String [] s, String delimiter)
	{
		String str = "";

		for (String value : s)
			str += value + delimiter;

		return str.substring(0, str.length() - delimiter.length());
	}

	public static String join(String [] s, char delimiter)
	{
		return join(s, delimiter + "");
	}

	public static String join(ArrayList<String> list, char delimiter)
	{
		return join(list, delimiter + "");
	}

	public static String join(ArrayList<String> list, String delimiter)
	{
		String str = "";

		for (String s : list)
			str += s + delimiter;

		return str.substring(0, str.length() - delimiter.length());
	}

	public static boolean isPangramTR(String s)
	{
		return containsAll(s.toLowerCase(), ms_alphabetTR);
	}

	public static String padLeading(String s, int length)
	{
		return padLeading(s, length, ' ');
	}

	public static String padLeading(String s, int length, char ch) 
	{
		int len = s.length();

		return (length <= len) ? s : ((ch + "").repeat(length - len) + s);
	}

	public static String padTrailing(String s, int length) 
	{
		return padTrailing(s, length, ' ');
	}

	public static String padTrailing(String s, int length, char ch) 
	{
		int len = s.length();

		return (length <= len) ? s : (s + (ch + "").repeat(length - len));
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
		int len = s.length();

		for (i = 0; i < len && Character.isWhitespace(s.charAt(i)); ++i)
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

	public static String wrapWith(String str, String begin, String end, boolean strip)
	{
		return String.format("%s%s%s", begin, strip ? str.strip() : str, end);
	}

	public static String wrapWith(String str, char begin, char end, boolean strip)
	{
		return wrapWith(str, begin + "", end + "", strip);
	}

	public static String wrapWith(String str, String begin, String end)
	{
		return wrapWith(str, begin, end, false);
	}

	public static String wrapWith(String str, char begin, char end)
	{
		return wrapWith(str, begin + "", end + "");
	}

	public static String wrapWithBraces(String str)
	{
		return wrapWith(str, '(', ')', true);
	}
}
