/*----------------------------------------------------------------------------------------------------------------------
    Partition Algoritması: Bir dizinin içerisinde bulunan elemanlardan belirli koşula uyanları mantıksal solda, uymayanları
    sağda kalacak şekilde dizi üzerinde değişiklik yapmaktadır. Bu algoritma için ikinci bir dizi kullanılmamalıdır. ArrayUtil
    sınıfında partition metodu bir eşik değerinde küçük olan elemanları dizinin solunda büyük veya eşit olanları dizinin
    sağında toplayacak şekilde yazılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        PartitionTest.run();
    }
}

class PartitionTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i) {
            int [] a = ArrayUtil.getRandomArray(r, r.nextInt(10) + 1, 0, 99);
            int threshold = r.nextInt(220) - 110;

            System.out.println("---------------------------------------");
            System.out.printf("Threshold:%d%n", threshold);
            ArrayUtil.display(2, a);
            int partitionPoint = ArrayUtil.partition(a, threshold);
            System.out.printf("Partition point (index):%d%n", partitionPoint);
            ArrayUtil.display(2, a);
            System.out.println("---------------------------------------");
        }
    }
}
