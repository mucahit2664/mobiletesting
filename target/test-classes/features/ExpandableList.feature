
  Feature: Appium test
    Scenario: Expandable list
      Given user clicks API Demos page
      Given user clicks on Views
      Given user clicks on Expandable List
      And user clicks on Customer Adapter
      And user clicks on People Names
      Then verify "Arnold" is displayed
