/*----------------------------------------------------------------------------------------------------------------------
	IntValue sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.wrapper.IntValue;

class App {
    public static void main(String [] args)
    {
        IntValue intValue1 = IntValue.ZERO;
        IntValue intValue2 = IntValue.of(0);

        System.out.println(intValue1 == intValue2);
    }
}





