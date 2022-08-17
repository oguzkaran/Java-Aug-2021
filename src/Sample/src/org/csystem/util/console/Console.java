/*----------------------------------------------------------------
	FILE		: Console.java
	AUTHOR		: Java-Nov-2021 Group
	LAST UPDATE	: 12.08.2022

	Utility class for console operations

	Copyleft (c) 1993 C and System Programmers Association
	All Rights Free
----------------------------------------------------------------*/

package org.csystem.util.console;

import java.util.Scanner;

public final class Console {
    private static final Scanner KB = new Scanner(System.in);

    private Console()
    {
    }

    public static int readInt()
    {
        return readInt("");
    }

    public static int readInt(String message)
    {
        return readInt(message, "");
    }

    public static int readInt(String message, String errorMessage)
    {
        for (;;) {
            try {
                System.out.print(message);

                return Integer.parseInt(KB.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.print(errorMessage);
            }
        }
    }

    public static int readIntLine(String message)
    {
        return readInt(message, "");
    }

    public static int readIntLine(String message, String errorMessage)
    {
        return readInt(message + "\n", errorMessage + "\n");
    }

    /////////////////////////////////////////////////////////////////////////////

    public static double readDouble()
    {
        return readDouble("");
    }

    public static double readDouble(String message)
    {
        return readDouble(message, "");
    }

    public static double readDouble(String message, String errorMessage)
    {
        for (;;) {
            try {
                System.out.print(message);

                return Double.parseDouble(KB.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.print(errorMessage);
            }
        }
    }

    public static double readDoubleLine(String message)
    {
        return readDouble(message, "");
    }

    public static double readDoubleLine(String message, String errorMessage)
    {
        return readDouble(message + "\n", errorMessage + "\n");
    }

    ///////////////////////////////////////////////////////////////////////////////////

    public static long readLong()
    {
        return readLong("");
    }

    public static long readLong(String message)
    {
        return readLong(message, "");
    }

    public static long readLong(String message, String errorMessage)
    {
        for (;;) {
            try {
                System.out.print(message);

                return Long.parseLong(KB.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.print(errorMessage);
            }
        }
    }

    public static long readLongLine(String message)
    {
        return readLong(message, "");
    }

    public static long readLongLine(String message, String errorMessage)
    {
        return readLong(message + "\n", errorMessage + "\n");
    }

    //...

    //////////////////////////////////////////////////////////////////////////////////////////////////

    public static void writeLine()
    {
        System.out.println();
    }

    public static void write(Object object)
    {
        System.out.print(object);
    }

    public static void writeLine(Object object)
    {
        System.out.println(object);
    }

    public static void write(String fmt, Object...objects)
    {
        System.out.printf(fmt, objects);
    }

    public static void writeLine(String fmt, Object...objects)
    {
        write(fmt + "\n", objects);
    }
}
