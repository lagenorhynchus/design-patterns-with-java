package chapter01

case class Book(name: String)

class Bookshelf(books: Book*) extends Traversable[Book] {
  def foreach[U](f: Book => U) = books.foreach(f)
}

object Main {
  def main(args: Array[String]): Unit = {
    val bookshelf = new Bookshelf(
      Book("Around the World in 80 Days"),
      Book("Bible"),
      Book("Cinderella"),
      Book("Daddy-Long-Legs")
    )
    for (book <- bookshelf) println(book.name)
  }
}
