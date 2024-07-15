case class Book(title: String, author: String, ISBN: String)

var library: Set[Book] = Set(
  Book("Madol Doowa", "Martin Wikramasinghe", "123"),
  Book("Amba Yaluwo", "Martin Wikramasinghe", "453"),
  Book("Vendor's of Sweets", "Narayan", "190"),
  Book("Tom and Jerry", "Wimalasiri", "456"),
  Book("Sura Pappa", "Susila", "183")
)

def addBook(book: Book): Unit = {
  if (library.exists(_.ISBN == book.ISBN)) {
    println("The book already exists.")
  } else {
    library = library + book
    println("New book added.")
  }
}

def removeBook(ISBN: String): Unit = {
  val bookToRemove = library.find(_.ISBN == ISBN)
  bookToRemove match {
    case Some(book) => 
      library = library - book
      println("Book removed.")
    case None => 
      println("There exists no book with that ISBN.")
  }
}

def isBookInLibrary(ISBN: String): Boolean = {
  library.exists(_.ISBN == ISBN)
}

def display(): Unit = {
  if (library.isEmpty) {
    println("The library is empty.")
  } else {
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.ISBN}")
    }
  }
}

def searchByTitle(title: String): Unit = {
  val books = library.filter(_.title.equalsIgnoreCase(title))
  if (books.isEmpty) {
    println("The book is not there.")
  } else {
    books.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.ISBN}")
    }
  }
}

def searchByAuthor(author: String): Unit = {
  val books = library.filter(_.author.equalsIgnoreCase(author))
  if (books.isEmpty) {
    println("The book is not there.")
  } else {
    books.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.ISBN}")
    }
  }
}
