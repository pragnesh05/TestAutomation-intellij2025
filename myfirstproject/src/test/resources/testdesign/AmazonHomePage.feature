Feature:Amazon Home Page Validation

@sc01 @amazon
  Scenario: search function
    Given user navigate to Amazon home page
    When user enter product name "laptop" in search bar
    And click on search icon
    Then verify the search result
    And verify the title of current page

   @sc02 @amazon

    Scenario Outline: search function
      Given user navigate to Amazon home page
      When user enter product name "<Product Name>" in search bar
      And click on search icon
      Then verify the search result
      And verify the title of current page
      Examples:
        | Product Name |
        | iphone       |
        | Toy          |
        | Fan          |
        | laptop       |



       @sc03
       Scenario: static Dropdown Validation
         Given user navigate to Amazon home page
         When user extracts dropdown values
         And user select value from dropdown
         Then user verify the office product value in dropdown


         @sc05
         Scenario: Mouse Action
           Given user click on baby list
           Then validate the navigation

           @sc06
          Scenario: Window Handling
            Given user search the product
            When user select specific product
            Then verify the title of page













  