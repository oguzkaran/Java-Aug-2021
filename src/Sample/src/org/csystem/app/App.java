/*----------------------------------------------------------------------------------------------------------------------
    İstenirse String sınıfının toCharArray metodu ile char türden dizi elde edilip for-each döngü deyimi ile
    dolaşılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.array.ArrayUtil;

class App {
    public static void main(String [] args)
    {
        int [][] a = ArrayUtil.getRandomMatrix(3, 4, 0, 99);

        ArrayUtil.display(2, a);
        System.out.println("----------------------------------");

        for (int [] array : a) {
            for (int val : array)
                System.out.printf("%02d ", val);
            System.out.println();
        }
    }
}