def patternmatch():Unit = {
    println("Enter the number")
    var x = scala.io.StdIn.readLine().toInt

    x match{
        case x if x<= 0 => println("Negative/Zero")
        case x if  x % 2 == 0 => println("Even")
        case _ => println("Odd")
    }
}