package org.csystem.application.company;

public class HumanResources {
    //...

    public void payInsurance(Employee employee)
    {
        System.out.println("--------------------------------------------");
        System.out.printf("Name:%s%n", employee.getName());
        System.out.printf("Citizen Id:%s%n", employee.getCitizenId());
        System.out.printf("Address:%s%n", employee.getAddress());
        System.out.printf("Entry Date:%s%n", employee.getEntryDate().toString());

        //...

        System.out.println("--------------------------------------------");
    }
}
