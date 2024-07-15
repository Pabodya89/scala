def fibonacii(n:Int):Int = n match{
    case x if x==1 => 1
    case x if x == 0 => 0
    case _ => fibonacii(n-1)+ fibonacii(n-2)
}

def fibseq(n:Int):Unit = {
    if( n > 0 ) fibseq(n-1)
    println(fibonacii(n))
}