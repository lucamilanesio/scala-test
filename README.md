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
    - should return 2.05 GBP as cost for three apples and one orange
      + When scanning three apples and one orange 
      + Then should return a total cost of 2.05 GBP 
