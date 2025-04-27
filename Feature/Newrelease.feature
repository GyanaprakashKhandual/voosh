Feature: Test the New Release Button functionality on Amazon

  @smoke
  Scenario: User clicks on the New Release button and the page is opened
    Given User launch the official amazon page
    When User clicks on the New Release button and New Release page is opened
    Then Close the browser

  Scenario: User clicks on the New Release button
    Given User launch the official amazon page
    When User clicks on the New Release button
    Then Close the browser

  Scenario: User clicks on the back button after clicking New Release
    Given User launch the official amazon page
    When User clicks on the New Release button
    Then User clicks on the back button
    Then User should be on the amazon home page
    Then Close the browser

  Scenario: User clicks on the New Release button and refreshes the page
    Given User launch the official amazon page
    When User clicks on the New Release button again
    Then User refresh the page
    Then New Release page remains loaded
    Then Close the browser
