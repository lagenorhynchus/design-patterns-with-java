package chapter01;

public class Main {
  public static void main(String[] args) {
    Bookshelf bookshelf = new Bookshelf(4);
    bookshelf.appendBook(new Book("Around the World in 80 Days"));
    bookshelf.appendBook(new Book("Bible"));
    bookshelf.appendBook(new Book("Cinderella"));
    bookshelf.appendBook(new Book("Daddy-Long-Legs"));

    for (Iterator<Book> iter = bookshelf.iterator(); iter.hasNext();) {
      Book book = iter.next();
      System.out.println(book.getName());
    }
  }
}
