package shop

class Checkout {
  val PriceApple = BigDecimal("0.60")
  val PriceOrange = BigDecimal("0.25")

  val Apple = "apple"
  val Orange = "orange"

  def scan(product: String): Option[BigDecimal] = product match {
    case Apple => Some(PriceApple)
    case Orange => Some(PriceOrange)
    case _ => None
  }

  def scan(products: Seq[String]): BigDecimal =
    products.map(scan).flatten.fold(BigDecimal("0"))(_+_) - appleDiscount(products) - orangeDiscount(products)

  def appleDiscount(products: Seq[String]): BigDecimal = {
    val numFreeApples = products.count(_ == Apple) / 2
    numFreeApples * PriceApple
  }

  def orangeDiscount(products: Seq[String]): BigDecimal = {
    val numFreeOranges = products.count(_ == Orange) / 3
    numFreeOranges * PriceOrange
  }
}
