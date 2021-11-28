/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir dizi ve int türden bir n değeri için, int türden dizi içerisindeki
    elemanların [0, n] olduğunu varsayarak (yani kontrol yapmayarak) [0, n] arasındaki sayıların sıklık sayısını yani
    her sayıdan kaç tane olduğu bilgisine dönen getHistogramData isimli metodu yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        GetHistogramDataTest.run();
    }
}


class GetHistogramDataTest {
    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        System.out.print("n değerini giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        System.out.print("Üretilecek dizlerin eleman sayısını giriniz:");
        int nArray = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < count; ++i) {
            System.out.println("-----------------------------------------");
            int [] a = ArrayUtil.getRandomArray(r, nArray, 0, n);
            int [] data = ArrayUtil.getHistogramData(a, n);
            ArrayUtil.display(a);
            ArrayUtil.display(data);
            System.out.println("-----------------------------------------");
        }
    }
}

