@switch
  Feature: working with element
  Scenario: Switch element
    #pre-condition app installed the device
    Given user clicks API Demos page
    Given user clicks Preference page
    Given user clicks Switch
    Given first switch button should switched on
    Then verify first switch button switched on
    Given second switch button should switched off
    Then verify second switch button switch