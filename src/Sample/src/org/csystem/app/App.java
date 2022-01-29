/*----------------------------------------------------------------------------------------------------------------------
    MutableTime sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.MutableTime;
import org.csystem.util.math.geometry.AnalyticalCircle;

class App {
    public static void main(String [] args)
    {
        AnalyticalCircle ac = new AnalyticalCircle(-2.3, 100, 100);

        System.out.println(ac.getRadius());
    }
}

