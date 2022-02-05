/*----------------------------------------------------------------------------------------------------------------------
    Sarmalayan Sınıflar (wrapper classes): Java'da her temel türe karşılık gelen bir sınıf vardır. Bu sınıflara sarmalayan
    sınıflar denir. Böyle bir tasarımın nedeni sınıfları tanıdıkça anlaşılacaktır. Bu sınıflarda sarmalamanın dışında
    ilgili türe ilişkin yararlı işlemler yapan static metotlar da bulunur. Örneğin, Integer sınıfının parseInt metodu
    bir yazıdan int türden bir değer elde etmek için kullanılır. Temel türlere karşılık gelen sınıflar aşağıdaki
    tabloda gösterilmektedir:

    Temel Tür               Sarmalayan Sınıfı
    ------------------------------------------
    short                       Short
    int                         Integer
    long                        Long
    byte                        Byte
    double                      Double
    float                       Float
    char                        Character
    boolean                     Boolean

    Bu sınıflardan tamsayı ve gerçek sayı türlerine ilişkin olanlarına (Short, Integer, Long, Byte, Double ve Float)
    mumerik sarmalayan sınıflar da denebilir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        AFactory factory = new AFactory();
        A x;

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        while (count-- > 0) {
            System.out.println("-----------------------------------------");
            x = factory.getRandomA();
            System.out.println(x.getClass().getName());
            if (x instanceof B) {
                B y = (B)x;

                y.foo();
            }
            else
                System.out.println("B veya B'den türetilmiş bir tür değil");

            System.out.println("-----------------------------------------");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class AFactory {
    private final Random m_random = new Random();

    //...
    public A getRandomA()
    {
        int val = m_random.nextInt(5);
        A x;

        switch (val) {
            case 0:
                x = new B();
                break;
            case 1:
                x = new C();
                break;
            case 2:
                x = new D();
                break;
            case 3:
                x = new F();
                break;
            default:
                x = new E();
        }

        return x;
    }
}

class F extends D {
    //...
}

class E extends B {
    //...
}

class D extends A {
    //...
}

class C extends B {
    //...
}

class B extends A {
    //...
    public void foo()
    {
        System.out.println("B.foo");
    }
}

class A {
    //...
}
