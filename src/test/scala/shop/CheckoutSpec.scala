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
    item should not be (empty)
  }

  it should "scan oranges" in {
    Given("a shop checkout")
    val checkout = new Checkout

    When("scanning an orange")
    val item = checkout scan "orange"

    Then("item should be scanned")
    item should not be (empty)
  }

  it should "not scan kiwis" in {
    Given("a shop checkout")
    val checkout = new Checkout

    When("scanning a kiwi")
    val item = checkout scan "kiwi"

    Then("item should not be found")
    item should be (empty)
  }
}
