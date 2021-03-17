@dragdrop
  Feature: working with elements
    Scenario: Drag and drop
      Given user clicks API Demos page
      Given user clicks on Views
      Given user click on Drag and Drop Page
      And user drag first circle and drop third one
      Then verify text is displayed