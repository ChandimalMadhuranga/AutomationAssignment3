Feature: Navigate to iFrame page on The Internet Herokuapp

  Scenario Outline: Successfully Navigate to iFrame and verify the displayed content
    Given I navigate to The Internet Herokuapp in "<browser>"
    When I click on the Frames Link
    Then I click on the iFrame Link
    And I should see the message Your content goes here
    Examples:
      |browser  |
      |edge     |
      |firefox  |
      |chrome   |
