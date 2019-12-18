$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/demo/features/amazonTest.feature");
formatter.feature({
  "name": "The application should be running",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "simple search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonSteps.i_am_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"iphone 11\"",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSteps.i_search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the results",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSteps.i_should_see_the_results()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});