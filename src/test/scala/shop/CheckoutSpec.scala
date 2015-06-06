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

  it should "return 85p as cost for one apple and one orange" in {
    When("scanning one apple and one orange")
    val scannedCost = checkout scan List("apple", "orange")

    Then("should return a total cost of 85p")
    scannedCost should be (BigDecimal("0.85"))
  }

  it should "return 1.45 GBP as cost for three apples and one orange" in {
    When("scanning three apples and one orange")
    val scannedCost = checkout scan List("apple", "apple", "orange", "apple")

    Then("should return a total cost of 1.45 GBP")
    scannedCost should be (BigDecimal("1.45"))
  }

  it should "get the second apple free of charge" in {
    When("scanning two apples")
    val scannedCost = checkout scan List("apple", "apple")

    Then("should cost only 60p as the second is free")
    scannedCost should be (BigDecimal("0.60"))
  }
}
