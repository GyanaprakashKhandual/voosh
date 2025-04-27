Feature: Verify the functionality of the Fresh button

    Scenario: Verify the functionality of the Fresh button
        Given User launch the official amazon page
        When User clicks on the Fresh button and Fresh page is opened
        Then Close the browser

    Scenario: Verify the functionality of the Fresh button with back technique
        Given User launch the amazon page
        When User clicks on the Fresh button
        Then User clicks on the back button
        And User should be on the amazon home page
        Then Close the browser

    Scenario: Verify the functionality of the Fresh button with refresh technique
        Given User launch the amazon page again
        When User clicks on the Fresh button again
        Then User refresh the page
        And Fresh page remains loaded
        Then Close the browser
