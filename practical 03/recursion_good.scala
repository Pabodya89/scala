object One extends App{

    def check(x:Int):Any = x match{
    case x if(x%3 == 0 && x%5 == 0)=> "FizzBuzz"
    case x if (x % 3 == 0) => "Fizz"
    case x if(x %5 == 0) => "Buzz"
    case _ => x
}

    def FizzBuzz(n:Int, m:Int):Any={
        print(check(n))
        if(n < m) FizzBuzz(n+1,m)
}   
}
