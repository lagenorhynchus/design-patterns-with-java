package chapter01;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf implements Aggregate<Book> {
  private List<Book> books;

  public Bookshelf(int initialSize) {
    this.books = new ArrayList<>(initialSize);
  }

  public void appendBook(Book book) {
    this.books.add(book);
  }

  public Book getBookAt(int i) {
    return this.books.get(i);
  }

  public int getLength() {
    return this.books.size();
  }

  public Iterator<Book> iterator() {
    return new BookshelfIterator(this);
  }
}
