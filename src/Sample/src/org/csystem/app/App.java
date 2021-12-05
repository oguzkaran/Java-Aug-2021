/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının en fazla 3(üç) basamaklı ayrılmış sayılarından
	oluşan int türden bir diziyi döndüren getDigitsInThrees mettodunu NumberUtil sınıfı içeriside yazınız ve aşağıdaki
	kod ile test ediniz
	Örnek: 6987456 -> 6 987 456
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.numeric.NumberUtil;
import org.csystem.util.random.RandomUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        GetDigitsInThreesTest.run();
    }
}

class GetDigitsInThreesTest {
    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; ++i) {
            long val = r.nextLong();

            ArrayUtil.display(NumberUtil.getDigitsInThrees(val));
        }
    }
}
