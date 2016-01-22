package chapter02;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    FileIO f = new FileProperties();
    try {
      f.readFromFile("file.txt");
      f.setValue("month", "4");
      f.setValue("day", "21");
      f.writeToFile("newfile1.txt");
      f.setValue("year", "2004");
      f.writeToFile("newfile2.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
