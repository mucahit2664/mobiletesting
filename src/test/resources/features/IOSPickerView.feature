@picker
  Feature: IOS testing
    Scenario: Picker View - Dropdown
      Given user clicks on Picker View page on IOS
      Given select first one as "50"
      Given select second one as "200"
      Given select third one as "150"
      Then verify all pickers
      Then take the screenshot