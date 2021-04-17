package solutions.questionb33f;

@FunctionalInterface
public interface Logger {

  void log(LogLevel logLevel, String message);
}
