package org.csystem.application.commandprompt;

public class CommandPromptApp {
    private CommandPromptApp()
    {
    }

    public static void run()
    {
        CommandPrompt cp = new CommandPrompt("CSD");

        cp.run();
    }
}
