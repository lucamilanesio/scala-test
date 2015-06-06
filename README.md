# Shopping cart Scala exercise
A simple Scala exercise for developing a shopping card using TDD

# How to build the project
This Scala project is built using sbt.

To compile the project simply type:

    sbt compile

To execute the tests:

    sbt test

To run the project main class:

    sbt run

# Sample run
By running the project it is possible to see a sample output
for checkout scanning a series of products.

Example:

    Shop checkout sample application
    
    Scan: Apple, Apple, Orange, Apple
    Cost: 1.70

# Unit tests
The execution of unit-tests shows the specs of the checkout 
and verify that the checkout respects them

Example:

    CheckoutSpec:
    A checkout
    - should scan apples
      + When scanning an apple 
      + Then should return an item 
    - should scan oranges
      + When scanning an orange 
      + Then should return an item 
    - should not scan kiwis
      + When scanning a kiwi 
      + Then should return nothing 
    - should return 60p as cost for an apple
      + When scanning an apple 
      + Then should return a 60p cost 
    - should return 25p as cost for an orange
      + When scanning an orange 
      + Then should return a 25p cost 
    - should return 85p as cost for one apple and one orange
      + When scanning one apple and one orange 
      + Then should return a total cost of 85p 
    - should return 1.45 GBP as cost for three apples and one orange
      + When scanning three apples and one orange 
      + Then should return a total cost of 1.45 GBP 
    - should get the second apple free of charge
      + When scanning two apples 
      + Then should cost only 60p as the second is free 
    - should get one free if you buy three oranges
      + When scanning three oranges 
      + Then should cost only 50p as the third orange was free 
    - should get one apple and one orange free
      + When scanning three apples and four oranges 
      + Then should cost only 1 GBP and 95p as one apple and one orange are free 
    Run completed in 329 milliseconds.
    Total number of tests run: 10
    Suites: completed 1, aborted 0
    Tests: succeeded 10, failed 0, canceled 0, ignored 0, pending 0
    All tests passed.    
