Feature: Verify the functionality of the Best Seller button

    Scenario: Verify the functionality of the Best Seller button
        Given User launch the official amazon page
        When User clicks on the Best Seller button and Best Seller page is opened
        Then Close the browser

    Scenario: Verify the functionality of the Best Seller button with back technique
        Given User launch the amazon page
        When User clicks on the Best Seller button
        Then User clicks on the back button
        And User should be on the amazon home page
        Then Close the browser

    Scenario: Verify the functionality of the Best Seller button with refresh technique
        Given User launch the amazon page again
        When User clicks on the Best Seller button again
        Then User refresh the page
        And Best Seller page remains loaded
        Then Close the browser
