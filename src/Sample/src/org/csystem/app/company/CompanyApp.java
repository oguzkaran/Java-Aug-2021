package org.csystem.app.company;

public class CompanyApp {
    public static Manager getManager()
    {
        Manager m = new Manager();

        m.setName("Ali");
        m.setCitizenId("12345678912");
        m.setAddress("Mecidiyeköy");
        m.setDepartment("Pazarlama");
        m.setSalary(300000);

        return m;
    }

    public static SalesManager getSalesManager()
    {
        SalesManager sm = new SalesManager();

        sm.setName("Selami");
        sm.setCitizenId("12345678910");
        sm.setAddress("Mecidiyeköy");
        sm.setDepartment("Pazarlama");
        sm.setSalary(300000);
        sm.setExtra(10000);

        return sm;
    }

    public static Worker getWorker()
    {
        Worker w = new Worker();

        w.setName("Veli");
        w.setCitizenId("12345678918");
        w.setAddress("Şişli");
        w.setHourPerDay(8);
        w.setFeePerHour(100);

        return w;
    }

    public static ProjectWorker getProjectWorker()
    {
        ProjectWorker pw = new ProjectWorker();

        pw.setName("Secati");
        pw.setCitizenId("12345678914");
        pw.setAddress("Şişli");
        pw.setHourPerDay(8);
        pw.setFeePerHour(100);
        pw.setProjectName("Whatsapp");
        pw.setExtra(10000);

        return pw;
    }

    public static void run()
    {
        HumanResources hr = new HumanResources();
        Manager m = getManager();
        Worker w = getWorker();
        SalesManager sm = getSalesManager();
        ProjectWorker pw = getProjectWorker();

        hr.payInsurance(m);
        hr.payInsurance(w);
        hr.payInsurance(sm);
        hr.payInsurance(pw);
    }
}
