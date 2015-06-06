package shop

import org.scalatest._


class CheckoutSpec extends FlatSpec with GivenWhenThen with Matchers {

  "A checkout" should
    "scan apples" in {
    Given("a shop checkout")
    val checkout = new Checkout

    When("scanning an apple")
    val item = checkout scan "apple"

    Then("item should be scanned")
    item should not be(empty)
  }
}
