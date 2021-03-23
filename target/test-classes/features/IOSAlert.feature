@alert
  Feature: IOS Testing
    Scenario: handling alert on IOS device
      Given user clicks on Alert Views page on IOS
      And user clicks on Simple page on IOS
      Then verify Alert popup
      Then click OK
