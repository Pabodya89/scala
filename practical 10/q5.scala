object LetterCounter extends App {

  def count(words: List[String]): Int = {
    
    val wordLengths = words.map(_.length)

    val totalLetterCount = wordLengths.reduce(_ + _)

    totalLetterCount
  }

  val words = List("apple", "banana", "cherry", "date")
  val totalLetters = count(words)
  
  println(s"Total count of letter occurrences: $totalLetters")
}
