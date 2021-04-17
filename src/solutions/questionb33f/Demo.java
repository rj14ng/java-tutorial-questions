package solutions.questionb33f;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public class Demo {

  private static final int MAX_LINE_SIZE = 100;

  public static void main(String[] args) throws IOException {

    assert args.length == 3;

    final Logger stderrLogger = (logLevel, message) -> {
      switch (logLevel) {
        case WARNING, ERROR, FATAL -> System.err.println("*** IMPORTANT ***");
        default -> System.err.println("* NOTE *");
      }
      System.err.println(message);
    };

    final StringInspector lineTooLongInspector = (line) -> {
      if (line.length() > MAX_LINE_SIZE) {
        return Optional.of(new ImmutablePair<>(LogLevel.ERROR, "Line too long: " + line));
      }
      return Optional.empty();
    };

    final FileLogger fileLogger1 = new FileLogger(args[1]);
    final FileLogger fileLogger2 = new FileLogger(args[2]);

    final FileInspector inspector1 = new FileInspector(stderrLogger);
    final FileInspector inspector2 = new FileInspector(fileLogger1);
    final FileInspector inspector3 = new FileInspector(fileLogger2);

    final Set<String> errorWords = Set.of("goto", "finalize", "static");
    final Set<String> verboseWords = Set.of("continue", "break");
    final KnownWordsStringInspector knownWordsInspector = new KnownWordsStringInspector(
        errorWords, verboseWords
    );

    System.err.println("Starting inspection 1:");
    inspector1.inspectFile(args[0], lineTooLongInspector);
    System.err.println("\nStarting inspection 2:");
    inspector1.inspectFile(args[0], knownWordsInspector);
    System.err.println("\nStarting inspection 3 (see " + args[1] + " for details).");
    inspector2.inspectFile(args[0], lineTooLongInspector);
    System.err.println("\nStarting inspection 4 (see " + args[2] + " for details).");
    inspector3.inspectFile(args[0], knownWordsInspector);

    fileLogger1.close();
    fileLogger2.close();
  }
}
