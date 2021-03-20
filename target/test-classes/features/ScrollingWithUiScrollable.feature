
  Feature: Appium test
    Scenario: Scrolling with UiScrollable
      Given user clicks API Demos page
      Given user clicks on Views
      Given user click on TextSwitcher
      And user clicks on Next button twice
      Then verify the value is "2"
