/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı dizi dizisinin matris olup olmadığını test isMatrix ve kare matris olup
	olmadığını test eden isSquareMatrix isimli metodu yazınız ve aşağıdaki kod ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import static org.csystem.util.array.ArrayUtil.*;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        IsMatrixSquareMatrixTest.run();
    }
}


class IsMatrixSquareMatrixTest {
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

            int [][] a = getArray(r, m, n);

            System.out.println("-------------------------------------");
            display(2, a);
            System.out.println(isMatrix(a) ? "Matris" : "Matris değil");
            System.out.println(isMatrix(a) ? "Kare matris" : "Kare matris değil");
            System.out.println("-------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
