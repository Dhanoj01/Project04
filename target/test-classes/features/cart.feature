Feature: Cart validation

Scenario: add and remove items

Given user is logged in
When user add two products
And remove one product
Then cart count should be 1

 
