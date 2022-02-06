package org.csystem.application.generator.random;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.datetime.Date;
import org.csystem.util.math.Complex;
import org.csystem.util.math.Fraction;

import java.util.Random;
import java.util.Scanner;

public class RandomObjectArrayGeneratorApp {
    private RandomObjectArrayGeneratorApp()
    {
    }

    public static void run()
    {
        Random random = new Random();
        RandomObjectArrayFactory factory = new RandomObjectArrayFactory(random);
        Scanner kb = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        for (Object object : factory.getObjects(count)) {
            System.out.println("---------------------------------------------");
            System.out.printf("Dinamik tür ismi:%s%n", object.getClass().getName());

            if (object instanceof String) {
                String s = (String)object;

                System.out.println(s.toUpperCase());
            }
            else if (object instanceof Fraction) {
                Fraction f = (Fraction)object;
                System.out.println(f.toString());
                System.out.printf("Real Value:%f%n", f.getRealValue());
            }
            else if (object instanceof Date) {
                Date date = (Date)object;

                System.out.println(date.toLongDateStringTR());
            }
            else if (object instanceof int[]) {
                int [] a = (int[])object;

                ArrayUtil.display(2, a);
            }
            else if (object instanceof Integer) {
                int val = (int)object;
                System.out.printf("%d * %d = %d%n", val, val, val * val);
            }
            else if (object instanceof Double) {
                double val = (double)object;
                System.out.printf("val = %f%n", val);
            }
            else if (object instanceof Character) {
                char ch = (char)object;
                System.out.printf("ch = %c%n", ch);
            }
            else if (object instanceof Boolean) {
                boolean b = (boolean)object;
                System.out.printf("b = %b%n", b);
            }
            else {
                Complex z = (Complex)object;

                System.out.println(z.toString());
                System.out.printf("Norm:%f%n", z.getNorm());
            }


            System.out.println("---------------------------------------------");
        }
    }
}
