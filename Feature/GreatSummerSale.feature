Feature: Test the Great Summer Sale button functionality on Amazon

  @smoke
  Scenario: User clicks on the Great Summer Sale button and the page is opened
    Given User launch the official amazon page
    When User clicks on the Great Summer Sale button and Great Summer Sale page is opened
    Then Great Summer Sale page title should be "Great Summer Sale"

  Scenario: User clicks on the Great Summer Sale button
    Given User launch the official amazon page
    When User clicks on the Great Summer Sale button
    Then Great Summer Sale page should load

  Scenario: User clicks on the back button from Great Summer Sale page
    Given User launch the official amazon page
    When User clicks on the Great Summer Sale button
    Then User clicks on the back button
    Then User should be on the amazon home page

  Scenario: User clicks on the Great Summer Sale button and refreshes the page
    Given User launch the official amazon page
    When User clicks on the Great Summer Sale button
    Then User refresh the page
    Then Great Summer Sale page remains loaded

  Scenario: User closes the browser after interacting with the Great Summer Sale button
    Given User launch the official amazon page
    When User clicks on the Great Summer Sale button
    Then Close the browser
