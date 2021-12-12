package org.csystem.application.commandprompt;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    public static String [] commands = {"length", "reverse", "upper", "lower", "clear", "chgprom", "quit"};
    public String prompt;
    public Scanner kb = new Scanner(System.in);

    public static boolean checkCommandEqual(String [] cmdInfo, int length, String message)
    {
        if (cmdInfo.length == length) {
            System.out.println(message);
            return true;
        }

        return false;
    }

    public static void lengthProc(String [] cmdInfo)
    {
        if (checkCommandEqual(cmdInfo, 1, "length command must have at least one argument"))
            return;

        String args = StringUtil.join(cmdInfo, 1, "");

        System.out.printf("Length without whitespaces:%d%n", args.length());
    }

    public static void reverseProc(String [] cmdInfo)
    {
        if (checkCommandEqual(cmdInfo, 1, "reverse command must have at least one argument"))
            return;

        String args = StringUtil.join(cmdInfo, 1, ' ');

        System.out.printf("Reverse with a space delimiter:%s%n", StringUtil.reversed(args));
    }

    public static void upperProc(String [] cmdInfo)
    {
        if (checkCommandEqual(cmdInfo, 1, "upper command must have at least one argument"))
            return;

        String args = StringUtil.join(cmdInfo, 1, ' ');

        System.out.printf("Reverse with a space delimiter:%s%n",args.toUpperCase());
    }

    public static void lowerProc(String [] cmdInfo)
    {
        if (checkCommandEqual(cmdInfo, 1, "lower command must have at least one argument"))
            return;

        String args = StringUtil.join(cmdInfo, 1, ' ');

        System.out.printf("Reverse with a space delimiter:%s%n",args.toLowerCase());
    }

    public static void clearProc(String [] cmdInfo)
    {
        for (int i = 0; i < 100; ++i)
            System.out.println();
    }

    public void changePromptProc(String [] cmdInfo)
    {
        if (cmdInfo.length == 1) {
            System.out.print("Input prompt:");
            String p = kb.nextLine();

            if (!p.isBlank())
                prompt = p.strip();
            else
                System.out.println("Prompt must include at least one character without whitespace");
        }
        else
            prompt = StringUtil.join(cmdInfo, 1, ' ');
    }

    public static void quitProc(String [] cmdInfo)
    {
        if (cmdInfo.length != 1) {
            System.out.println("quit command can not have any argument");
            return;
        }

        System.out.println("C and System Programmers Association");
        System.out.println("Thanks!...");
        System.exit(0);
    }

    public void parseCommand(String [] cmdInfo)
    {
        if (cmdInfo[0].length() < 3) {
            System.out.println("Any command must include at least 3(three) character");
            return;
        }

        int index = StringUtil.indexOfStartsWith(commands, cmdInfo[0]);

        if (index != -1) {
            cmdInfo[0] = commands[index];
            doWorkForCommand(cmdInfo);
        }
        else
            System.out.println("Invalid command");
    }

    public void doWorkForCommand(String [] cmdInfo)
    {
        switch (cmdInfo[0]) {
            case "length":
                lengthProc(cmdInfo);
                break;
            case "reverse":
                reverseProc(cmdInfo);
                break;
            case "upper":
                upperProc(cmdInfo);
                break;
            case "lower":
                lowerProc(cmdInfo);
                break;
            case "clear":
                clearProc(cmdInfo);
                break;
            case "chgprom":
                changePromptProc(cmdInfo);
                break;
            case "quit":
                quitProc(cmdInfo);
                break;
        }
    }

    public CommandPrompt(String p)
    {
        prompt = p;
    }

    public void run()
    {
        for (;;) {
            System.out.print(prompt + ">");
            String cmd = kb.nextLine().strip();

            parseCommand(cmd.split("[ \t]+"));
        }
    }
}
