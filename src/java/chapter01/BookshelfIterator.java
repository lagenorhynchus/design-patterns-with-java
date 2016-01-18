package chapter01;

public class BookshelfIterator implements Iterator<Book> {
  private Bookshelf bookshelf;

  private int index = 0;

  public BookshelfIterator(Bookshelf bookshelf) {
    this.bookshelf = bookshelf;
  }

  public boolean hasNext() {
    return this.index < this.bookshelf.getLength();
  }

  public Book next() {
    Book book = this.bookshelf.getBookAt(this.index);
    this.index++;
    return book;
  }
}
