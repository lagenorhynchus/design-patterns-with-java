package chapter02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
  private Properties properties = new Properties();

  @Override
  public void readFromFile(String filename) throws IOException {
    this.properties.load(new FileInputStream(filename));
  }

  @Override
  public void writeToFile(String filename) throws IOException {
    this.properties.store(new FileOutputStream(filename), "written by FileProperties");
  }

  @Override
  public void setValue(String key, String value) {
    this.properties.setProperty(key, value);
  }

  @Override
  public String getValue(String key) {
    return this.properties.getProperty(key);
  }
}
