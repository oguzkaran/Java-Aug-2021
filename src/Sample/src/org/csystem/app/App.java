/*----------------------------------------------------------------------------------------------------------------------
    AnalyticalCircle sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.AnalyticalCircle;

class App {
    public static void main(String [] args)
    {
        AnalyticalCircle ac1 = new AnalyticalCircle(-7.8, 100, 200);
        AnalyticalCircle ac2 = new AnalyticalCircle(-7.8, 97, 204);

        System.out.printf("d = %f%n", ac1.centerDistance(ac2));
    }
}

