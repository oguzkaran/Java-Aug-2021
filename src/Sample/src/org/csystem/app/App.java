/*----------------------------------------------------------------------------------------------------------------------
    Bir veri elemanı gizlendiğinde sınıfın müşteri kodlarının bu elemana değer vermesi veya değerini elde etmesi için
    yani bu elemana dolaylı olarak erişebilmesi için public metotlar yazılır. Veri elemanlarına erişip değerini elde
    etmek için kullanılan metotlara "get metotları (getters)" denir. Veri elemanlarına erişip değerini değiştirmeye
    yarayan metotlara ise "set metotları (setters)" denir. Sınıfın bu şekildeki metotlarına "accessors" denir. Tersine
    get veya set metotlarının bir veri elemanına karşılık gelmesi gerekmez. Hangi durumda olursa olsun bu metotlar
    sınıfı kullanan (client) bakış açısıyla "accessor" metotlardır. Bu durum tamamen sınıfın tasarımıyla ilgilidir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        Date d = new Date();

        d.setDay(6);

        System.out.println(d.getDay());
    }
}

class Date {
    private int m_day, m_month, m_year;

    public int getDay()
    {
        return m_day;
    }

    public void setDay(int day)
    {
        //...
        m_day = day;
    }
}