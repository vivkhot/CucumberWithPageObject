$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/CucumberSelenium/Cucumber With PageObject/CucumberPageObject/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login",
  "description": "",
  "id": "free-crm-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify login action for user",
  "description": "",
  "id": "free-crm-login;verify-login-action-for-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on CRM landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user login to the CRM application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_CRM_landing_page()"
});
formatter.result({
  "duration": 14663994200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 739097400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.click_on_submit_button()"
});
formatter.result({
  "duration": 60270000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_login_to_the_CRM_application()"
});
formatter.result({
  "duration": 703997100,
  "status": "passed"
});
});