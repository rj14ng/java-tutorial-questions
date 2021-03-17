package solutions.question6346;

public class Demo {

  public static void main(String[] args) {

    // 1 + (2 + 3)! = 121
    Expr a =
        new AddExpr(
            new LiteralExpr(1), new FactExpr(new AddExpr(new LiteralExpr(2), new LiteralExpr(3))));
    // 3 * 4 = 12
    Expr b = new MulExpr(new LiteralExpr(3), new LiteralExpr(4));

    // (1 + (2 + 3)!) * (3 * 4) = 1452
    Expr c = new MulExpr(a, b);

    System.out.println("Evaluates to: " + c.eval());
    System.out.println("Literal count: " + c.literalCount());
    System.out.println("Depth: " + c.depth());
  }
}
