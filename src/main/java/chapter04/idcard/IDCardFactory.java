package chapter04.idcard;

import java.util.HashMap;
import java.util.Map;

import chapter04.framework.Factory;
import chapter04.framework.Product;

public class IDCardFactory extends Factory {
  private int serialNo = 100;

  private Map<Integer, String> database = new HashMap<>();

  @Override
  protected synchronized Product createProduct(String owner) {
    this.serialNo++;
    return new IDCard(owner, this.serialNo);
  }

  @Override
  protected void registerProduct(Product product) {
    IDCard card = (IDCard) product;
    this.database.put(card.getSerialNo(), card.getOwner());
  }

  public Map<Integer, String> getDatabase() {
    return this.database;
  }
}
