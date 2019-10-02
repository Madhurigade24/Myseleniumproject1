Feature: Test Simple Form Demo

  Scenario Outline: Test Entered Message
    Given Launch the Page
    When I EnterbMy Message "<MyMesssage>"in the Text box
    And I Click on Show Message Button
    Then I Verify that the displayed messageis same as"<MyMessage>"

    Examples: 
      | MyMessage |
      | Selenium  |
