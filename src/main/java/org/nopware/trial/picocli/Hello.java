package org.nopware.trial.picocli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

/**
 * Hello world!
 */
@Command(name = "hello", version = "1.0.0", mixinStandardHelpOptions = true)
public class Hello implements Runnable {
    @Parameters(paramLabel = "<name>", defaultValue = "World", description = "Name that say hello to.")
    private String name;

    @Override
    public void run() {
        System.out.printf("Hello %s!%n", name);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Hello()).execute(args);
        System.exit(exitCode);
    }
}
