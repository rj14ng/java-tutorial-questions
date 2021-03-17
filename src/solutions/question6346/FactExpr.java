package solutions.question6346;

public class FactExpr implements Expr{

  private final Expr operand;

  public FactExpr(Expr operand) {
    this.operand = operand;
  }

  @Override
  public int eval() {
    int x = operand.eval();
    if (x < 0) {
      throw new RuntimeException("Negative factorial undefined");
    }

    int result = 1;
    while (x > 1) {
      result *= x;
      x--;
    }

    return result;
  }

  @Override
  public int literalCount() {
    return operand.literalCount();
  }

  @Override
  public int depth() {
    return 1 + operand.depth();
  }
}
