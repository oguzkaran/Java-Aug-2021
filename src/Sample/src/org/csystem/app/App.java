/*----------------------------------------------------------------------------------------------------------------------
    Türetme/Kalıtım (inheritance) kavramı programlamada bir sınıfı kodlarına dokunmadan ve kodlarını kopyalamadan
    genişletmek (extension) için kullanılır. Burada genişletme var olan özelliklere ekleme olarak düşünülebilir. Bu
    ilişkide B sınıfı A sınıfından türetilmişse "B is a A" cümlesi geçerli olur.

    B sınıfı A sınıfından türetilmiş olsun. B sınıfına A sınıfının bir "türemiş sınıfı (derived class)" denir. A sınıfına da
    B sınıfının "taban sınıf (base class)" denir. Bu iki terim nesne yönelimli programlama tekniğine ilişkin terimlerdir.
    Java'da "base class" yerine "super class", "derived class" yerine de "sub class" terimleri daha çok kullanılır.

    Anahtar Notlar: Nesne yönelimli programlamada "base class" yerine Biyoloji'den gelen terim olan "parent class",
    "derived class" yerine de yine Biyoloji'den gelen "child class" terimleri de kullanılır

    Bir dizi türetme söz konusu olabilir. Örneğin C sınıfı B sınıfından, B sınıfı da A sınıfından türetilmiş olsun.

    Bu durumda C'nin taban sınıfı (super class) dendiğinden doğrudan taban sınıfı (direct base class) olan B sınıfı
    anlaşılır. Bu hiyerarşide A sınıfı C'nin dolaylı taban sınıfıdır (indirect super class). Örneğimizde
    "C'nin taban sınıfları B ve A'dır" cümlesi teknik olarak doğru değildir. Doğrusu şudur. "C'nin taban sınıfın B'dir,
    dolaylı taban sınıflarından biri A'dır" cümlesidir.

    Java'da bir sınıf birden fazla (doğrudan) taban sınıfa sahip olamaz. Yani Java'da "çoklu türetme (multiple inheritance)"
    yoktur. Java'da bir sınıf yalnızca tek bir sınıftan türetilebilir.

    Anahtar Notlar: Java'da çoklu türetmenin gerekli olduğu duurmlar için kısmi (partial) olarak desteklenmesini sağlayan
    "interface" denilen bir tür bulunmaktadır. Çok türetmenin pratikteki gerekliliği "interface"'ler ile karşılanabilmektedir.
    "interface" konusu ileride ele alınacaktır.

    Türetme kavramı programlamada "bir sınıfın kodlarına dokunmadan o sınıfı genişletmek" anlamına gelir. Bu kavrama
    İngilizce olarak "open for extension closed for modification" denilmektedir.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Date;

class App {
    public static void main(String [] args)
    {
        Driver driver1 = new Driver("Ferhat Ercüment Kuşkaya", 18, 7, 1979, EducationStatus.UNIVERSITY);
        Driver driver2 = new Driver("Oğuz Karan", 10, 9, 1976, EducationStatus.UNIVERSITY);
        Client client1 = new Client("merve", "Merve Gözükızıl");
        Client client2 = new Client("utku", "Utku Çalışkan");
        Taxi taxi = new Taxi("34 TTT 1234", driver1);

        taxi.take(client1);
        System.out.println("------------------------------");
        taxi.take(client2);

        taxi.setDriver(driver2);
        System.out.println("------------------------------");
        taxi.take(client2);
    }
}

class Taxi {
    private String m_plate;
    private Driver m_driver;
    //...

    public Taxi(String plate, Driver driver)
    {
        m_plate = plate;
        m_driver = driver;
    }

    //...


    public void setDriver(Driver driver)
    {
        m_driver = driver;
    }

    public void take(Client client)
    {
        m_driver.drive();
        System.out.printf("Client Info:%s%n", client.toString());
        System.out.printf("Driver Info:%s%n", m_driver.toString());
    }

    //...
}


class Client {
    private String m_username;
    private String m_name;
    //...

    public Client(String username, String name)
    {
        m_username = username;
        m_name = name;
    }

    public String getUsername()
    {
        return m_username;
    }

    public void setUsername(String username)
    {
        m_username = username;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    //...

    public String toString()
    {
        return String.format("%s, %s", m_username, m_name);
    }
}

enum EducationStatus {PRIMARY, SECONDARY, COLLAGE, UNIVERSITY}

class Driver {
    private String m_name;
    private Date m_birthDate;
    private EducationStatus m_educationStatus;
    //...

    public Driver(String name, int day, int month, int year, EducationStatus educationStatus)
    {
        m_name = name;
        m_birthDate = Date.of(day, month, year);
        m_educationStatus = educationStatus;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public Date getBirthDate()
    {
        return m_birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        m_birthDate = birthDate;
    }

    public EducationStatus getEducationStatus()
    {
        return m_educationStatus;
    }

    public void setEducationStatus(EducationStatus educationStatus)
    {
        m_educationStatus = educationStatus;
    }

    public void drive()
    {
        //...
        System.out.printf("Driver Info:%s%n", toString());
        //...
    }

    //...

    public String toString()
    {
        return String.format("%s, %s, %s", m_name, m_birthDate.toString('.'), m_educationStatus.toString());
    }
}


class B {
    //...
    public void doSomething()
    {
        //...
    }

    //...
}

