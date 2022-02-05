package org.csystem.application.company;

import org.csystem.util.datetime.Date;

public class CompanyApp {
    private CompanyApp()
    {
    }

    private static Manager getManager()
    {
        Manager m = new Manager();

        m.setName("Ali");
        m.setCitizenId("12345678912");
        m.setAddress("Mecidiyeköy");
        m.setEntryDate(Date.today());
        m.setDepartment("Yazılım");
        m.setSalary(35000);

        return m;
    }

    private static Worker getWorker()
    {
        Worker w = new Worker();

        w.setName("Veli");
        w.setCitizenId("12245678912");
        w.setAddress("Fulya");
        w.setEntryDate(Date.of(1, 2, 2021));
        w.setFeePerHour(100);
        w.setHourPerDay(6);

        return w;
    }

    private static ProjectWorker getProjectWorker()
    {
        ProjectWorker pw = new ProjectWorker();

        pw.setName("Selami");
        pw.setCitizenId("12745678912");
        pw.setAddress("Beşiktaş");
        pw.setEntryDate(Date.of(1, 3, 2021));
        pw.setFeePerHour(100);
        pw.setHourPerDay(6);
        pw.setExtra(2000);
        pw.setProjectName("Device-Auto");

        return pw;
    }

    public static void run()
    {
        HumanResources hr = new HumanResources();
        Manager m = getManager();
        Worker w = getWorker();
        ProjectWorker pw = getProjectWorker();

        hr.payInsurance(m);
        hr.payInsurance(w);
        hr.payInsurance(pw);
    }
}
