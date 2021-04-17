package solutions.questionb33f;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInspector {

  private final Logger logger;

  public FileInspector(Logger logger) {
    this.logger = logger;
  }

  public void inspectFile(String filename, StringInspector stringInspector) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader(filename));

    String line = br.readLine();
    while (line != null) {
      stringInspector.inspect(line).ifPresent(e -> logger.log(e.getFirst(), e.getSecond()));
      line = br.readLine();
    }
  }
}
