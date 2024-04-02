Feature: Searches in Demoqa Page

  Scenario: As a user I want to check the functionality of the "Text Box" section from the "Elemets" menu
    Given I click on the "elements" meniu from the ToolsQA page
    And I click on the "arrow" button from the "Elements" menu
    And I click on the "Text box" section from the "Elements" menu
    When I enter "Nume" in the "Full Name" field
    And I enter "ada@yahoo.com" in the "Email" field
    And I enter "strada Aurel" in the "Current Address" field
    And I enter "strada Miron" in the "Permanent Address" field
    Then I click on "Submit" button in Text box dialog
    And I should see the new data in all the fields
