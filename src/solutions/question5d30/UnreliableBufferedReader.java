package solutions.question5d30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Random;

public class UnreliableBufferedReader extends BufferedReader {

  private final double probabilityOfError;
  private final Random random;

  public UnreliableBufferedReader(Reader in, double probabilityOfError) {

    super(in);

    if (probabilityOfError < 0) {
      this.probabilityOfError = 0;
    } else if (probabilityOfError > 1) {
      this.probabilityOfError = 1;
    } else {
      this.probabilityOfError = probabilityOfError;
    }

    this.random = new Random();
  }

  @Override
  public String readLine() throws IOException {

    final String input = super.readLine();

    if (random.nextDouble() < probabilityOfError) {
      throw new IOException("Error occurred on input stream");
    }

    return input;
  }
}
