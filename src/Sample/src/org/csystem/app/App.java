/*----------------------------------------------------------------------------------------------------------------------
    Sınıfın static ve final elemanlarının bir kullanımı. Math sınıfının PI ve E veri elemanları da final olarak
    bildirilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        System.out.println(ChemistryUtil.AVOGADRO_NUMBER);
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}

class ChemistryUtil {
    public static final double AVOGADRO_NUMBER = 6.02E23;
    //...
}



