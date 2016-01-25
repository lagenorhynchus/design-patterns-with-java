package chapter04.idcard;

import chapter04.framework.Product;

public class IDCard implements Product {
  private String owner;

  private int serialNo;

  IDCard(String owner, int serialNo) {
    System.out.println(owner + "(" + serialNo + ")のカードを作ります。");
    this.owner = owner;
    this.serialNo = serialNo;
  }

  @Override
  public void use() {
    System.out.println(this.owner + "(" + this.serialNo + ")のカードを使います。");
  }

  public String getOwner() {
    return this.owner;
  }

  public int getSerialNo() {
    return this.serialNo;
  }
}
