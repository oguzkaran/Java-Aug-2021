/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Color enum sınıfına eklenen ctor ile her bir sabite ilişkin nesne için bilgiler iliştirilmiştir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        RandomColorFactory factory = new RandomColorFactory(new Random());

        System.out.print("Bir sayı giriniz:");
        int count = Integer.parseInt(kb.nextLine());

        while (count-- > 0) {
            Color color = factory.getColor();

            System.out.println("--------------------------------------------");
            System.out.printf("%s:{r: %d, g: %d, b: %d}%n", color.toString(), color.r, color.g, color.b);
            System.out.println("--------------------------------------------");
        }
    }
}

class RandomColorFactory {
    private final Random m_random;
    private static final Color[] m_colors = Color.values();

    public RandomColorFactory(Random random)
    {
        m_random = random;
    }

    public Color getColor()
    {
        return m_colors[m_random.nextInt(m_colors.length)];
    }
}

enum Color {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), WHITE(255, 255, 255), BLACK(0, 0, 0);

    public final int r, g, b;

    Color(int rVal, int yVal, int zVal)
    {
        r = rVal;
        g = yVal;
        b = zVal;
    }
}