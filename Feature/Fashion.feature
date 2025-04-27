Feature: Test the Fashion Button functionality on Amazon

  @smoke
  Scenario: User clicks on the Fashion button and the page is opened
    Given User launch the official amazon page
    When User clicks on the Fashion button and Fashion page is opened
    Then Close the browser

  Scenario: User clicks on the Fashion button
    Given User launch the official amazon page
    When User clicks on the Fashion button
    Then Close the browser

  Scenario: User clicks on the back button after clicking Fashion
    Given User launch the official amazon page
    When User clicks on the Fashion button
    Then User clicks on the back button
    Then User should be on the amazon home page
    Then Close the browser

  Scenario: User clicks on the Fashion button and refreshes the page
    Given User launch the official amazon page
    When User clicks on the Fashion button again
    Then User refresh the page
    Then Fashion page remains loaded
    Then Close the browser
