package shop

object Main extends App {
  val checkout = new Checkout
  println("Shop checkout sample application")

  println(
    s"""
       |Scan: Apple, Apple, Orange, Apple
       |Cost: ${checkout scan List("apple", "apple", "orange", "orange")}""".stripMargin)
}
