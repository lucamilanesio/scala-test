package shop

import org.scalatest._


class CheckoutSpec extends FlatSpec with GivenWhenThen with Matchers with OptionValues {
  val checkout = new Checkout

  "A checkout" should
    "scan apples" in {
    When("scanning an apple")
    Then("should return an item")
    checkout scan "apple" should not be (empty)
  }

  it should "scan oranges" in {
    When("scanning an orange")
    Then("should return an item")
    checkout scan "orange" should not be (empty)
  }

  it should "not scan kiwis" in {
    When("scanning a kiwi")
    Then("should return nothing")
    checkout scan "kiwi" should be (empty)
  }

  it should "return 60p as cost for an apple" in {
    When("scanning an apple")
    Then("should return a 60p cost")
    (checkout scan "apple").value should be (BigDecimal("0.60"))
  }

  it should "return 25p as cost for an orange" in {
    When("scanning an orange")
    Then("should return a 25p cost")
    (checkout scan "orange").value should be (BigDecimal("0.25"))
  }
}
