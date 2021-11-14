/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin en küçük elemanını, en büyük elemanını, toplamını ve
    ortalamasını döndüren sırasıyla min, max, sum average metotlarını yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        MinMaxSumAverageTest.run();
    }
}

class MinMaxSumAverageTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            int [] a = getRandomArray(r, n, 0, 99);

            System.out.println("------------------------------------");
            display(2, a);
            System.out.printf("En küçük eleman:%d%n", min(a));
            System.out.printf("En büyük eleman:%d%n", max(a));
            System.out.printf("Toplam:%d%n", sum(a));
            System.out.printf("Ortalama:%f%n", average(a));
            System.out.println("------------------------------------");
        }
    }
}

