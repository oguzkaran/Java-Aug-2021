/*----------------------------------------------------------------------------------------------------------------------
	MutableDate sınıfı
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.MutableDate;

class App {
    public static void main(String [] args)
    {
        MutableDate date = new MutableDate(8, 1, 2022);

        System.out.println(date.toString());
        System.out.println(date.toString('.'));
        System.out.println(date.toLongDateStringTR());
        System.out.println(date.toLongDateStringEN());
    }
}
