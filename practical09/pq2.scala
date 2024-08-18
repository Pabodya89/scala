def checkNumberIsEvenOrOdd(number : Int) : Unit = {
    number match {
        case x if x % 2 == 0 => println("Even")
        case _  => println("Odd")
    }
}

def checkNumber(num : Int) : Unit = {
    num match {
        case n if n <= 0 => println("Negative/Zero")
        case _ => checkNumberIsEvenOrOdd(num)
    }
}