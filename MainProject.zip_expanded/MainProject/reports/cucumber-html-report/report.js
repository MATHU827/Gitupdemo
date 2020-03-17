$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Product_Store",
  "description": "",
  "id": "product-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "\r\nLogin to Product store",
  "id": "product-store;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Tc02_Login"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "user opens product store  homepage",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_steps.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 6471586375,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.user_opens_product_store_homepage()"
});
formatter.result({
  "duration": 1484479249,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 64417837183,
  "status": "passed"
});
formatter.match({
  "location": "Login_steps.user_clicks_login()"
});
formatter.result({
  "duration": 2363743624,
  "status": "passed"
});
});