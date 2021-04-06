package org.nopware.trial.picocli;

import picocli.CommandLine;
import org.nopware.trial.picocli.say.*;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Spec;

/**
 * Say
 */
@CommandLine.Command(
        name = "say", version = "1.0.0", mixinStandardHelpOptions = true,
        subcommands = { Hi.class, Bye.class, CommandLine.HelpCommand.class })
public class Say {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new Say()).execute(args);
        System.exit(exitCode);
    }
}
