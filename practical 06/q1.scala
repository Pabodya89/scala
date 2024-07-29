import scala.io.StdIn

case class Product (name :String, n: Int ,price: Double)

val product1 : Map[Int, Product] = Map(
    10 ->Product("laptop", 10, 100000.0),
    16 ->Product("tab", 13, 105000.0),
    12 ->Product("phone", 14, 10400.0),
    13 ->Product("handfree", 15, 100.0)

)

val product2 : Map[Int, Product] = Map(
    16 -> Product("tab", 6, 90000),
    20-> Product("buffle", 4, 3000.0)
)

def getProductName(products:Map[Int,Product]):List[String] = {
    products.values.map(_.name).toList
}

def getTotalValue(products:Map[Int,Product]): Double = {
    products.values.map(product => product.n * product.price).sum
}

def isInventoryEmpty(products: Map[Int, Product]) : Boolean ={
    products.isEmpty
}

def mergeInventories(inventory1: Map[Int, Product], inventory2: Map[Int, Product]): Map[Int, Product] = {
    inventory2.foldLeft(inventory1) {
      case (acc, (id, newProduct)) =>
        acc.get(id) match {
          case Some(existingProduct) =>
            val mergedProduct = existingProduct.copy(
              n = existingProduct.n + newProduct.n,
              price = math.max(existingProduct.price, newProduct.price)
            )
            acc.updated(id, mergedProduct)
          case None => acc + (id -> newProduct)
        }
    }
  }

 def checkProductExists(inventory: Map[Int, Product], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some(product) =>
        println(s"Product ID: $productId, Name: ${product.name}, Quantity: ${product.n}, Price: ${product.price}")
      case None =>
        println(s"Product ID $productId does not exist in the inventory.")
    }
  } 
