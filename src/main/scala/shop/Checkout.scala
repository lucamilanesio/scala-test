package shop

class Checkout {
  def scan(product: String): Option[Any] = product match {
    case "apple" => Some("60p")
    case "orange" => Some("25p")
    case _ => None
  }

}
