$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/Oxford.feature");
formatter.feature({
  "line": 2,
  "name": "Oxford_website",
  "description": "",
  "id": "oxford-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_website"
    }
  ]
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "print the user mail id",
  "id": "oxford-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@tc02_Print_email_id"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user opens oxford website",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "print the user email id",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});