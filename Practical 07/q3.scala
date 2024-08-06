def filterPrime() : Unit ={

    val input = List(1,2,3,4,5,6,7,8,9,10)
    val output = input.filter( n=> isPrime(n))
    println(output)
}

def isPrime(n: Int): Boolean = {
  if (n <= 1) false
  else if (n == 2) true
  else if  (n % 2 == 0) false
  else !(3 to Math.sqrt(n).toInt by 2).exists(d => n % d == 0)
}

