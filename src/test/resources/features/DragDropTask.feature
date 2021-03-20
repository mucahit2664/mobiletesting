@task
  Feature: Appium
    Scenario: Drag and drop task
      Given user clicks API Demos page
#      Given user clicks on "API Demos" page
      Given user clicks on "Views" page
      Given user clicks on "Drag and Drop" page
      Given user drag first circle and drop it on self
      Then verify the text contains "Dropped on self!"