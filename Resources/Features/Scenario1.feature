Feature: Add a Product in Amazon


Feature: Amazon Deals Navigation

	@tag1
  Scenario: Verify Todays Deals and Product Details
  
    Given the browser and Amazon URL is launched
    Then the page title and URL should be correct
    When I click on "Today's Deals"
    Then the page should contain the title "Deals"
    When I click on the first item in "Today's Deals"
    Then the product name should be displayed
    When I navigate back to the Deals page
    And I click on the second item in "Today's Deals"
    Then the product name should be correctly displayed
    And I close the browser

	
