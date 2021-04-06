package org.nopware.trial.picocli.say;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "hi", description = "say hi.")
public class Hi implements Runnable{
    @Parameters(arity = "1", paramLabel = "<name>", description = "name that say hi to.")
    private String name;

    @Override
    public void run() {
        System.out.printf("Hi %s!%n", name);
    }
}
