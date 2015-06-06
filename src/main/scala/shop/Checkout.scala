package shop

class Checkout {
  def scan(product: String): Option[BigDecimal] = product match {
    case "apple" => Some(BigDecimal("0.60"))
    case "orange" => Some(BigDecimal("0.25"))
    case _ => None
  }

  def scan(products: Seq[String]): BigDecimal =
    products.map(scan).flatten.fold(BigDecimal("0"))(_+_)

}
