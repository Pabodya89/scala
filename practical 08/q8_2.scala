def check(number:Int) :Unit = {
    val multipleOfThree = (n: Int) => n % 3 == 0
    val multipleOfFive = (n: Int) => n % 5 == 0

    if(multipleOfFive(number) && multipleOfThree(number)){
        println("Multiple of Both Three and Five")
        
    }else if(multipleOfThree(number)){
        println("Multiple of Three")
    }else if (multipleOfFive(number)){
        println("Multiple of Five.")
    }else{
        println("Not a Multiple of Three or Five")
    }
}


