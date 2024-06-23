def maximum(a:Int,b:Int):Int = {
    (a >= b) match {
        case true => a
        case false => b
    }
}

def iseven(x:Int) : Boolean ={
    (x % 2) match {
        case 0 => true
        case _ => false
    }
}

def calc (): Unit = {
    var k,i,j = 2;
    var m,n = 5;
    var f = 12.0f;
    var g = 4.0f;
    var c = 'X'; 

    val A = k + 12 * m ;
    val B = m / j;
    val C = n % j;
    val D = m/j * j;
    val E = f + 10 * 5 + g;
    i += 1;
    val F = i * n;

    println(s"a) k + 12 * m = $A" )
    println(s"b) m / j = $B" )
    println(s"c) n % j = $C" )
    println(s"d) m / j * j = $D" )
    println(s"e) f + 10 * 5 + g = $E" )
    println(s"f) ++i * n = $F" )
}

def calc2() : Unit = {
    var a = 2;
    var b = 3;
    var c = 4;
    var d = 5;
    var k = 4.3f;
    var g = 0;

        b -= 1;
    val G = b * a + c * d;
        d -= 1;
    val H = a ;
        a += 1;
    val I = ( -2 * ( g - k) + c);
    val J = c ;
        c += 1;
    val K = c  * a;
        a += 1;

        println(s"$G");
        println(s"$H");
        println(s"$I");
        println(s"$J"); 
        println(s"$K");
        
}

def salary (normal_hour: Float,ot_hour: Float): Unit = {
    var normal_salary = 250.0;
    var ot_salary = 85.0 ;

    var full_salary = ( normal_hour * normal_salary) + ( ot_salary * ot_hour);
    var correct_salary = full_salary - (full_salary * 12/100);

    println(s"$correct_salary");
}

def attendence(ticket_price : Float): Float={
    120 + (15 - ticket_price) / 5 * 20;
}

def income(reduce_price : Float): Float={
        reduce_price * attendence(reduce_price);
}

def cost (reduce_price : Float): Float={
    3 * attendence(reduce_price) + 500;
}

def profit(reduce_price: Float): Float={
    income(reduce_price)-cost(reduce_price);
}
