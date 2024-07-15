import scala.io.StdIn.readLine

def addproduct( ) : Unit = {
    var productList: List[String] = List()
    var continue = true;

    while (continue) {
        val productname = readLine("Enter name: ")
        if(productname.toLowerCase == "done"){
            continue = false
    }
    else{
        productList = productList :+ productname
    }
}
}

def display(productList: List[String]) :Unit ={
    if(productList.isEmpty){
        println("This has no products entered")
    }
    else{
        productList.foreach(println)
    }
}

def productLength(productList: List[String]) :Unit = {
    println(productList.length)
}


