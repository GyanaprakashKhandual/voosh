Feature: Test the Electronics Button functionality on Amazon

  @smoke
  Scenario: User clicks on the Electronics button and the page is opened
    Given User launch the official amazon page
    When User clicks on the Electronics button and Electronics page is opened
    Then Electronics page title should be "Electronics"

  Scenario: User clicks on the Electronics button
    Given User launch the official amazon page
    When User clicks on the Electronics button
    Then Electronics page should load

  Scenario: User clicks on the back button from Electronics page
    Given User launch the official amazon page
    When User clicks on the Electronics button
    Then User clicks on the back button
    Then User should be on the amazon home page

  Scenario: User clicks on the Electronics button and refreshes the page
    Given User launch the official amazon page
    When User clicks on the Electronics button
    Then User refresh the page
    Then Electronics page remains loaded

  Scenario: User closes the browser after interacting with the Electronics button
    Given User launch the official amazon page
    When User clicks on the Electronics button
    Then Close the browser
