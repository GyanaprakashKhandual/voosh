Feature: Verify the functionality of the Today's Deal button

    Scenario: Verify the functionality of the Today's Deal button
        Given User launch the official amazon page
        When User clicks on the Today's Deal button and Deals page is opened
        Then Close the browser

    Scenario: Verify the functionality of the Today's Deal button with back technique
        Given User launch the amazon page
        When User clicks on the Today's Deal button
        Then User clicks on the back button
        And User should be on the amazon home page
        Then Close the browser

    Scenario: Verify the functionality of the Today's Deal button with refresh technique
        Given User launch the amazon page again
        When User clicks on the Today's Deal button again
        Then User refresh the page
        And Deals page remains loaded
        Then Close the browser
