/*----------------------------------------------------------------------------------------------------------------------
	Dosya İşlemleri:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.collection.CSDArrayList;
import org.csystem.util.console.Console;
import org.csystem.util.tuple.Triple;

import java.util.Random;

import static org.csystem.util.string.StringUtil.getRandomTextTR;

class App {
	public static void main(String[] args)
	{
		CSDArrayList<Triple<String, String, String>> passwords = new CSDArrayList<>();
		Random r = new Random();
		int count = Console.readInt("Bir sayı giriniz:");

		for (int i = 0; i < count; ++i)
			passwords.add(Triple.of(getRandomTextTR(r, r.nextInt(5, 10)), getRandomTextTR(r, r.nextInt(5, 10)),
					getRandomTextTR(r, r.nextInt(5, 10))));

		int size = passwords.size();

		for (int i = 0; i < size; ++i)
			Console.writeLine(passwords.get(i));
	}
}

