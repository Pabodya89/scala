def fab(number:Int):Int=number match{
    case x if x==0 => 0
    case x if  x==1 => 1
    case x => fab(number-1) + fab(number-2)
 }

 def fabseq(n:Int):Unit={
    if(n > 0)fabseq(n-1)
    println(fab(n))
 }