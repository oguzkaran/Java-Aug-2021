package org.csystem.app.sensor;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreSensorsToArrayApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Başlangıç \"capaacity\" değerini giriniz:");
        ArrayList sensors = new ArrayList(Integer.parseInt(kb.nextLine()));

        int idx = 1;

        for (;;) {
            System.out.print("Sensor adını giriniz:");
            String name = kb.nextLine();

            if ("elma".equals(name))
                break;

            System.out.print("Sensor IP adresini giriniz:");
            String host = kb.nextLine();

            sensors.add(new Sensor(idx++, name, host));

            System.out.printf("Size:%d%n", sensors.size());
        }
        System.out.println("--------------------------------------------------------------");
        for (Object o : sensors) {
            Sensor s = (Sensor)o;
            System.out.println(s.toString());
        }


        System.out.printf("Size:%d%n", sensors.size());
    }
}
