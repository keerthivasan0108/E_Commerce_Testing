
Feature: Amazon Search Functionality
	@tag1
  Scenario Outline: Verify search results for multiple items
    Given the Amazon URL Should opened
    When I search for "<item>"
    Then the first product in the search results should contain "<item>" in its title
    And I close the browser window

    Examples:
      | item    |
      | Watches |
      | Shoes   |
      | Laptop  |
