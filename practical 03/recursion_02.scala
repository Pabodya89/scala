def filter(): List[String] = {
    val strings = List("hello", "scala", "programming", "is")
    strings.filter(_.length > 5)
}

def mean(num1: Int, num2: Int): Unit = {
    val average = (num1 + num2) / 2.0
    println(average)
}

def mean2(): Unit = {
    val num1 = 20;
    val num2 = 30;
    val avg = (num1 + num2) / 2.0
    println(avg)
}

def Sum(): Int = {
    val num = List(10,40,30)
    num.filter(_ % 2 == 0).sum

}

def Sum2(Numbers:List[Int]): Int ={
    Numbers.filter(_%2 == 0).sum
}

def fun(string:List[String]):List[String]={
    var newfilter = string.filter(_.length > 5)
    newfilter;
}