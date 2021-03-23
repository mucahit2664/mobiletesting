@switchButtons
  Feature: IOS testing
    Scenario: switch buttons
      Given user clicks on Switches page on IOS
      Given user switched on first button
      Given user switched off second button
      Then verify them
      Then take the screenshot
