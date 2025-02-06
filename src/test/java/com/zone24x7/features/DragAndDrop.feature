Feature: Drag and Drop functionality on The Internet application

  Scenario Outline: Drag object B and drop it onto object As position
    Given I navigate to The Internet Herokuappp in "<browser>"
    When I click on the Drag and Drop link
    Then I drag the object B onto the object A position
    And I should see object B in object A position successfully
    Examples:
      |browser  |
      |edge     |
      |firefox  |
      |chrome   |