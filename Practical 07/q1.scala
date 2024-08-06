
def filterEvenNumbers(): Unit = {
  val input = List(1,2,3,4,5,6,7,8,9,10)
  val output = input.filter(n => n % 2 == 0)
  println(output)
}

