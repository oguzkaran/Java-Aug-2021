/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı bir sayının basamaklarından oluşan diziye geri dönen getDigits isimli metodu
    NumberUtil sınıfı içerisinde yazınız ve aşağıdaki kod ile test ediniz. Metot negatif sayılar içim sayının pozitif
    olması durumunda elde edilen diziye geri dönecektir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.numeric.NumberUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        GetDigitsTest.run();
    }
}

class GetDigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        Random r = new Random();

        for (int i = 0; i < n; ++i) {
            int val = r.nextInt(2_000_000_001) - 1_000_000_000;
            System.out.printf("%d -> ", val);
            ArrayUtil.display(NumberUtil.getDigits(val));
        }

        System.out.printf("%d -> ", 0);
        ArrayUtil.display(NumberUtil.getDigits(0));
    }
}

