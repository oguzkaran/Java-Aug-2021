/*----------------------------------------------------------------------------------------------------------------------
	Referans dizileri:
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.random.RandomUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;

class App {
    public static void main(String [] args)
    {
        RemoveWhitespacesTest.run();
    }
}

class RemoveWhitespacesTest {
    public static void run()
    {
        Random r = new Random();
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < count; ++i) {
            System.out.println("-----------------------------------------------------------");
            String s = StringUtil.getRandomText(r, RandomUtil.nextInt(r, 10, 20), " \tabcdefg12345:? \t \t");
            System.out.printf("(%s)%n", s);
            System.out.printf("(%s)%n", StringUtil.removeWhiteSpaces(s));
            System.out.println("-----------------------------------------------------------");
        }
    }
}
