object MyApp4 extends App{
    val r1 = new Rational5(3,4)
    val r2 = new Rational5(5,8)
    val r3 = new Rational5(2,7)
    val x = r1.sub(r2)
    val z = x.sub(r3)

    println(z)
    
}

class Rational5(n:Int , m: Int){
    require( m > 0, "m must be greater than 0")
    def numer = n/gcd(Math.abs(n),m)
    def denom = m/gcd(Math.abs(n),m)
    def this(n : Int) = this(n, 1)

    private def gcd(a:Int, b:Int): Int =  if(b == 0) a else gcd(b, a % b)

    def sub(r:Rational5) = new Rational5(this.numer * r.denom - this.denom * r.numer, this.denom * r.denom);

    override def toString(): String = numer + "/" + denom
}