package org.nopware.trial.picocli.say;

import picocli.CommandLine;
import picocli.CommandLine.Parameters;

@CommandLine.Command(name = "bye", description = "say bye.")
public class Bye implements Runnable {
    @Parameters(arity = "1", paramLabel = "<name>", description = "name that say bye to.")
    private String name;

    @Override
    public void run() {
        System.out.printf("Bye %s!%n", name);
    }
}
