package shop

class Checkout {
  def scan(product: String): Option[BigDecimal] = product match {
    case "apple" => Some(BigDecimal("0.60"))
    case "orange" => Some(BigDecimal("0.25"))
    case _ => None
  }

  def scan(products: Seq[String]): BigDecimal =
    products.map(scan).flatten.fold(BigDecimal("0"))(_+_) - appleDiscount(products) - orangeDiscount(products)

  def appleDiscount(products: Seq[String]): BigDecimal = {
    val numFreeApples = products.count(_ == "apple") / 2
    numFreeApples * BigDecimal("0.60")
  }

  def orangeDiscount(products: Seq[String]): BigDecimal = {
    val numFreeOranges = products.count(_ == "orange") / 3
    numFreeOranges * BigDecimal("0.25")
  }
}
