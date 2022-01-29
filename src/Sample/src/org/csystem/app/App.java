/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıfı yazan programcı "super ctpr sentaksı" ile taban sınıfının istediği bir ctor'unun çağrılmasını
    sağlayabilir. super ctor sentaksında hangi ctor'un çağrılacağı derleyici tarafondan "method overload resolution"
    kuralları ile belirlenir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        B x = new B();
        System.out.println("------------------------");
        B y = new B(10);

        //...
    }
}

class B extends A {
    public B()
    {
        super(0);
        System.out.println("B.B()");
    }

    public B(int a)
    {
        super(a);
        System.out.println("B.B(int)");
    }
}

class A {
    public A()
    {
        System.out.println("A.A()");
    }

    public A(int a)
    {
        System.out.println("A.A(int)");
    }
    //...
}