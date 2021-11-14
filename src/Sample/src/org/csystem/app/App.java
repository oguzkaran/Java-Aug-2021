/*----------------------------------------------------------------------------------------------------------------------
    Diziye ilkdeğer olarak verilen elemanlar sabit ifadesi olmak zorunda değildir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());
        int [] a = {val, val + 1, val + 3, 3 * val + 2,};

        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.println();
    }
}
