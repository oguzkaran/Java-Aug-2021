/*----------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        X x = new X();
        Y y = new Y();
        Z z = new Z();
        T t = new T();
        U u = new U();

        Sample.doWork(x);
        Sample.doWork(y); //upcasting
        Sample.doWork(z); //upcasting
        Sample.doWork(t); //upcasting
        Sample.doWork(u); //upcasting

        //...
    }
}

class Sample {
    public static void doWork(X x)
    {
        //...
        ++x.a;
    }
}

class X {
    public int a;
    //...
}

class Y extends X {
    //...
}

class Z extends X {
    //...
}

class T extends Y {
    //...
}

class U extends Z {
    //...
}



