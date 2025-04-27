Feature: Verify the functionality of the Mobiles button

    Scenario: Verify the functionality of the Mobiles button
        Given User launch the official amazon page
        When User clicks on the Mobiles button and Mobiles page is opened
        Then Close the browser

    Scenario: Verify the functionality of the Mobiles button with back technique
        Given User launch the amazon page
        When User clicks on the Mobiles button
        Then User clicks on the back button
        And User should be on the amazon home page
        Then Close the browser

    Scenario: Verify the functionality of the Mobiles button with refresh technique
        Given User launch the amazon page again
        When User clicks on the Mobiles button again
        Then User refresh the page
        And Mobiles page remains loaded
        Then Close the browser
