@SetColorBlue
Feature: validate non-functional aspect of background color on techfios test webpage
Background:
Given SetSkyBlue Background button exists

Scenario: user should be able to change background color to blue
    When I click on the button
    Then the background color will change to sky blue