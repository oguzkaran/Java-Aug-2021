/*----------------------------------------------------------------------------------------------------------------------
    MutableFraction sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.MutableFraction;

class App {
    public static void main(String [] args)
    {
        MutableFraction fraction = new MutableFraction(3, 0);

        System.out.println(fraction.toString());
    }
}
