Feature: Service Page tests

  Scenario: Service Page Interface test
    Given I am on "Home Page"
    Then The browser title is Home Page
    When I login as 'epam'/'1234'
    Then The user name in the left-top side is 'PITER CHAILOVSKII'
    When I click on "Service" button in Header
    Then Check that drop down contains options
    When Click on "Service" subcategory in the left section
    Then Check that drop down contains options
    When Open through the header menu Service -> Different Elements Page
    When Check interface on Different elements page
    Then Assert that there is Right Section
    Then Assert that there is Left Section
    When Select checkboxes: Water, Wind
    Then Check for each checkbox individual log row
    When Select radio: Selen
    Then Check for radio button individual log row
    When Select in dropdown: Yellow
    Then Check for dropdown individual log row
    When Unselect checkboxes: Water, Wind
    Then Check for each unselected checkbox individual log row

