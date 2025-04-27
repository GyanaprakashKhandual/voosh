Feature: Verify the functionality of the Sell button

    Scenario: Verify the functionality of the Sell button
        Given User launch the official amazon page
        When User clicks on the Sell button and Sell page is opened
        Then Close the browser

    Scenario: Verify the functionality of the Sell button with back technique
        Given User launch the amazon page
        When User clicks on the Sell button
        Then User clicks on the back button
        And User should be on the amazon home page
        Then Close the browser

    Scenario: Verify the functionality of the Sell button with refresh technique
        Given User launch the amazon page again
        When User clicks on the Sell button again
        Then User refresh the page
        And Sell page remains loaded
        Then Close the browser
