package solutions.question17b1;

public interface K extends I, J {

  void baz();

  default int foobar(int x) {
    return I.super.foobar(x);
  }
}
