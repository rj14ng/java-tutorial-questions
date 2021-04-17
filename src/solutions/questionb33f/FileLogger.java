package solutions.questionb33f;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

  private final BufferedWriter bw;

  public FileLogger(String filename) throws IOException {
    this.bw = new BufferedWriter(new FileWriter(filename));
  }

  @Override
  public void log(LogLevel logLevel, String message) {
    switch (logLevel) {
      case WARNING, ERROR, FATAL -> {
        try {
          bw.write(logLevel + ": " + message + "\n");
        } catch (IOException ignored) {
          // Ignore exception
        }
      }
    }
  }

  public void close() throws IOException {
    bw.close();
  }
}
