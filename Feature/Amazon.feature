Feature: Test the Amazon Pay functionality on Amazon

  @smoke
  Scenario: User clicks on the Amazon Pay button and the page is opened
    Given User launch the official amazon page
    When User clicks on the Amazon Pay button and Amazon Pay page is opened
    Then Amazon Pay page title should be "Amazon Pay"

  Scenario: User clicks on the Amazon Pay button
    Given User launch the official amazon page
    When User clicks on the Amazon Pay button
    Then Amazon Pay page should load

  Scenario: User clicks on the back button from Amazon Pay page
    Given User launch the official amazon page
    When User clicks on the Amazon Pay button
    Then User clicks on the back button
    Then User should be on the amazon home page

  Scenario: User clicks on the Amazon Pay button and refreshes the page
    Given User launch the official amazon page
    When User clicks on the Amazon Pay button
    Then User refresh the page
    Then Amazon Pay page remains loaded

  Scenario: User closes the browser after interacting with the Amazon Pay button
    Given User launch the official amazon page
    When User clicks on the Amazon Pay button
    Then Close the browser
