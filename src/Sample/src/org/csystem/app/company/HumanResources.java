package org.csystem.app.company;

public class HumanResources {
    //...

    public void payInsurance(Employee e)
    {
        System.out.printf("Name:%s%n", e.getName());
        System.out.printf("Citizen Id:%s%n", e.getCitizenId());
        System.out.printf("Address:%s%n", e.getAddress());
        System.out.printf("Insurance Payment:%f%n", e.calculateInsurancePayment());
        System.out.println("----------------------------------------------");
    }
}
