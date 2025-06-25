Feature: Sales Force Login Validation

  Scenario Outline:Login Validation

    Given user enter username "<Username>" and "<password>"
    Examples:

      | Username |  | Password |
      | abc      |  | cgb      |
      | xyz      |  | asd      |
      |ram       |  |tyz       |



    Scenario: Label Name Validation
      Given user navigate to home page
      Then user validate the label name
