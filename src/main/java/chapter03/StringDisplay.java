package chapter03;

public class StringDisplay extends AbstractDisplay {
  private String s;

  private int width;

  public StringDisplay(String s) {
    this.s = s;
    this.width = s.getBytes().length;
  }

  @Override
  protected void open() {
    printLine();
  }

  @Override
  protected void print() {
    System.out.println("|" + this.s + "|");
  }

  @Override
  protected void close() {
    printLine();
  }

  private void printLine() {
    StringBuilder sb = new StringBuilder();
    sb.append("+");
    for (int i = 0; i < this.width; i++) {
      sb.append("-");
    }
    sb.append("+");
    System.out.println(sb.toString());
  }
}
