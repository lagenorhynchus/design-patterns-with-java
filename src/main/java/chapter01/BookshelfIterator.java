package chapter01;

public class BookshelfIterator implements Iterator<Book> {
  private Bookshelf bookshelf;

  private int index = 0;

  public BookshelfIterator(Bookshelf bookshelf) {
    this.bookshelf = bookshelf;
  }

  @Override
  public boolean hasNext() {
    return this.index < this.bookshelf.getLength();
  }

  @Override
  public Book next() {
    Book book = this.bookshelf.getBookAt(this.index);
    this.index++;
    return book;
  }
}
