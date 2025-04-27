Feature: Verify the functionality of the All side dropdown

    Scenario: Verify the functionality of the All side dropdown
        Given User launch the official amazon page
        When User clicks on the All side dropdown and the dropdown is opened
        Then Close the browser

    Scenario: Verify the functionality of the All side dropdown with back technique
        Given User lauch the amazon page
        When User clicks on the All side dropdown
        Then User clicks on the back button
        And User on the amazon hoem page
        Then Close the browser

    Scenario: Verify the functionality of the All side dropdown with refresh technique
        Given User lauch the amazon page again
        When User clicks on the All side dropdown again
        Then User refresh the page
        And Side dropdown is not visible
        Then Close the browser