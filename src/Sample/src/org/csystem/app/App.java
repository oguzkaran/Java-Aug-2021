/*----------------------------------------------------------------------------------------------------------------------
    A ile B arasındaki "aggregation" ilişkisinin genel bir implementasyonu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.datetime.Date;

class App {
    public static void main(String [] args)
    {
        Driver driver1 = new Driver("Deniz Şahan", 27, 5, 1994);
        Driver driver2 = new Driver("Harun Çekinmez", 24, 3, 1995);
        Car car1 = new Car(driver1, GasType.Hybrid);
        Car car2 = new Car(driver2, GasType.Fuel);

        car1.run();
        car2.run();
    }
}

class Car {
    private Engine m_engine;
    private Driver m_driver;
    //...

    public Car(Driver driver, GasType gasType/*...*/)
    {
        m_driver = driver;
        m_engine = new Engine(gasType/*...*/);
    }

    public void brake()
    {
        //...
        m_engine.slowEngine();
        //...
    }

    public void run()
    {
        System.out.println("------------------------------");

        m_driver.drive();
        m_engine.startEngine();
        m_engine.accelerateEngine();

        //...
        System.out.println("Running");
        //...

        brake();
        m_engine.stopEngine();

        System.out.println("------------------------------");
    }
}

enum GasType {Fuel, Diesel, Hybrid, LPG}

class Engine {
    private GasType m_gasType;
    //...

    public Engine(GasType gasType)
    {
        m_gasType = gasType;
    }

    public void startEngine()
    {
        System.out.printf("Gas Type:%s%n", m_gasType.toString());
        System.out.println("Start engine");
    }

    public void accelerateEngine()
    {
        System.out.println("Accelerate engine");
    }

    public void slowEngine()
    {
        System.out.println("Slow engine");
    }

    public void stopEngine()
    {
        System.out.println("Stop engine");
    }
}


class Pilot {
    private String m_name;
    private Date m_birthDate;
    private String m_licence;

    //...
    public Pilot(String name, Date birthDate, String licence)
    {
        m_name = name;
        m_birthDate = birthDate;
        m_licence = licence;
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

    public String getLicence()
    {
        return m_licence;
    }

    public void setLicence(String licence)
    {
        m_licence = licence;
    }

    public String toString()
    {
        return String.format("[%s]%s, %s", m_licence, m_name, m_birthDate.toLongDateStringEN());
    }
    //...
}

class Driver {
    private String m_name;
    private Date m_birthDate;
    //...

    public Driver(String name, int day, int month, int year)
    {
        m_name = name;
        m_birthDate = Date.of(day, month, year);
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

    public void drive()
    {
        //...
        System.out.printf("Driver Info:%s%n", toString());
        //...
    }

    //...

    public String toString()
    {
        return String.format("%s, %s", m_name, m_birthDate.toString('.'));
    }
}