$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SetColorWhite.feature");
formatter.feature({
  "line": 2,
  "name": "validate non-functional aspect of background color on techfios test webpage",
  "description": "",
  "id": "validate-non-functional-aspect-of-background-color-on-techfios-test-webpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SetColorWhite"
    }
  ]
});
formatter.before({
  "duration": 4199462800,
  "status": "passed"
});
formatter.before({
  "duration": 3521386400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Set White Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "SetWhiteSteps.set_white_background_button_exists()"
});
formatter.result({
  "duration": 139237300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "user should be able to change background color to white",
  "description": "",
  "id": "validate-non-functional-aspect-of-background-color-on-techfios-test-webpage;user-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I press the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky white",
  "keyword": "Then "
});
formatter.match({
  "location": "SetWhiteSteps.i_press_the_button()"
});
formatter.result({
  "duration": 2052144700,
  "status": "passed"
});
formatter.match({
  "location": "SetWhiteSteps.the_background_color_will_change_to_sky_white()"
});
formatter.result({
  "duration": 328722700,
  "status": "passed"
});
formatter.after({
  "duration": 681388400,
  "status": "passed"
});
formatter.after({
  "duration": 670857800,
  "status": "passed"
});
});