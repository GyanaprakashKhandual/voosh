Feature: Test the Custom Service Button functionality on Amazon

  @smoke
  Scenario: User clicks on the Custom Service button and the page is opened
    Given User launch the official amazon page
    When User clicks on the Custom Service button and Custom Service page is opened
    Then Close the browser

  Scenario: User clicks on the Custom Service button only
    Given User launch the official amazon page
    When User clicks on the Custom Service button
    Then Close the browser

  Scenario: User clicks on back button after clicking Custom Service
    Given User launch the official amazon page
    When User clicks on the Custom Service button
    Then User clicks on the back button
    Then User should be on the amazon home page
    Then Close the browser

  Scenario: User clicks on Custom Service button and refreshes the page
    Given User launch the official amazon page
    When User clicks on the Custom Service button again
    Then User refresh the page
    Then Custom Service page remains loaded
    Then Close the browser
