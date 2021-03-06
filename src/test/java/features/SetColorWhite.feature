@SetColorWhite
Feature: validate non-functional aspect of background color on techfios test webpage
Background:
Given Set White Background button exists

Scenario: user should be able to change background color to white
    When I press the button
    Then the background color will change to sky white