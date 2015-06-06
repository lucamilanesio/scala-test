package shop

class Checkout {
  def scan(product: String): Option[Any] = product match {
    case "apple" => Some("item")
    case "orange" => Some("item")
    case _ => None
  }

}
