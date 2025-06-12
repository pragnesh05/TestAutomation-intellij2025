Feature:Amazon Home Page Validation
@sc01
  Scenario: search function
    Given user navigate to amazon home page
    When user search product name "laptop" in search bar
    And click on search icon
    Then verify the search result
    And verify the title of current page

   @sc02

    Scenario Outline: search function
      Given user navigate to amazon home page
      When user search product name "<Product Name>" in search bar
      And click on search icon
      Then verify the search result
      And verify the title of current page
      Examples:
        | Product Name |
        | iphone       |
        | Toys         |
        | Fan          |
         |laptop        |










  