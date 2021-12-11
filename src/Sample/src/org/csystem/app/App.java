/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir matrisin devriğini (transpose) döndüren transposed isimli metodu yazınız
	ve aşağıdaki kod ile test ediniz.
	Açıklamalar:
	    - Metot matris olup olmama kontrolü yapmayacaktır
	    - Örneğin:
	    1 2 3
	    4 5 6
	    matrisinin devriği
	    1 4
	    2 5
	    3 6
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        TransposedTest.run();
    }
}

class TransposedTest {
    public static int [] [] getArray(Random r, int m, int n)
    {
        return r.nextBoolean() ? getRandomMatrix(r, m, n, 0, 99) : getRandomSquareMatrix(r, m, 0, 99);
    }

    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Satır sayısını giriniz:");
            int m = Integer.parseInt(kb.nextLine());

            if (m <= 0)
                break;

            System.out.print("Sütun sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            int [][] a = getRandomMatrix(r, m, n, 0, 99);

            System.out.println("-------------------------------------");
            display(2, a);
            display(2, transposed(a));
            System.out.println("-------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
