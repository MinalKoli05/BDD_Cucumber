
Feature: Products webpage Functionality


Background: 

Given user is logged to Saucedemo app
And user is on the product page


Scenario: add product to the cart
When user add "Sauce Labs Bolt T-Shirt" in the cart
Then cart should contain "1" item 


Scenario: add multiple products to the cart   
When user add "Sauce Labs Backpack" in the cart from product page
And user add "Sauce Labs Bike Light" in the cart from product page
Then cart should contains "2" items

