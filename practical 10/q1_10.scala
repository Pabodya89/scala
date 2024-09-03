object MyApp3 extends App{
    val x = new Rational4(2,3)
    println(x.neg)
}

class Rational4(n:Int , m: Int){
    require( m != 0, "m must be greater than 0")
    
    def numer = n / gcd(Math.abs(n),m)
    def denom = m / gcd(Math.abs(n),m)
    
    def this(n : Int) = this(n, 1)

    private def gcd(a:Int, b:Int): Int =  if(b == 0) a else gcd(b, a % b)

    def neg = new Rational4(-this.numer,this.denom)

    override def toString(): String = numer + "/" + denom
}