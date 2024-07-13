object InventaryManage{
    var itemName: Array[String] = Array("soap","eggs","vegetables")
    var quantities: Array[Int] = Array(10,20,30)

    def main(args: Array[String]) : Unit = {
        display()
        restockItem("soap", 5)
        display()
        restockItem("eggs",5)
        display()
        restockItem("vegetables", 10)
        display()
        sell("soap", 5)
        display()
        sell("vegetables", 20)
        sell("eggs", 15)
        display()
        

    }

    def display():Unit = {
        println("Current Inventory:")
        for(i <-itemName.indices){
            println(s"${itemName(i)}: ${quantities(i)}")
        }
    }

    def restockItem(itemName: String, quanty:Int) : Unit ={
        val index = this.itemName.indexOf(itemName)
        if(index >= 0){
            quantities(index) += quanty
            println(s"$quantities unit of $itemName restored")
        }
        else{
            println(s"Item $itemName does not exit in inventory.")
        }
    }

    def sell(itemName: String, quanty:Int):Unit = {
         val index = itemName.indexOf(itemName)
            if(index >= 0){
                if(itemName(index) >= quanty){
                    quantities(index) -= quanty
                    println(s"$quanty units of item sold ")
                }else{
                    println(s"Not enough item in inventory to sell")
                }
        }else{
            println(s"Item $itemName does not exist in inventory")
        }
    }
}