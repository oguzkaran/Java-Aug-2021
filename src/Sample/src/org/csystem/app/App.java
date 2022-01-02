/*----------------------------------------------------------------------------------------------------------------------
	Immutable Complex sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.Complex;

class App {
    public static void main(String [] args)
    {
        Complex z = new Complex(Math.PI * 6);

        System.out.println(z.toString());
    }
}

