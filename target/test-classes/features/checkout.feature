Feature: checkout validation

Scenario: complete checkout with validations

Given user is logged in
When user add product and proceed to checkout
And user enters details "DHANOJ" "SINGH" "794390"
And user reviews summary
Then total price should be correct
And order compeletes successfully
