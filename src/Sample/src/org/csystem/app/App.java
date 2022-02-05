/*----------------------------------------------------------------------------------------------------------------------
    Taban sınıf türünden bir referans türemiş sınıf türünden bir referansa doğrudan atanamaz. Bu işlem tür dönüştürme
    operatörü ile (explicit conversion, cast) yapılabilir. Bu kavrama "downcasting" denir. Burada tür dönüştürme
    operatörü derlemeden geçmek için kullanılır.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        int [] a = new int[10];
        double [] b = new double[20];
        boolean [] c = new boolean[30];
        char [] d = new char[10];
        String [] e = new String[20];
        Sample [] f = new Sample[40];
        int [][] g = new int[12][];
        int [][][] h = new int[12][][];

        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
        System.out.println(d.getClass().getName());
        System.out.println(e.getClass().getName());
        System.out.println(f.getClass().getName());
        System.out.println(g.getClass().getName());
        System.out.println(h.getClass().getName());
    }
}

class Sample {
    //...
}