$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage/Authenticated_User_Login.feature");
formatter.feature({
  "line": 2,
  "name": "My Medicare Matters Login page",
  "description": "",
  "id": "my-medicare-matters-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login_page"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "User Login with valid username and password",
  "description": "",
  "id": "my-medicare-matters-login-page;user-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Testcase#1"
    },
    {
      "line": 4,
      "name": "@First"
    },
    {
      "line": 4,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is already on Ncoa Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button and validate user is logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateSignInProcess.User_is_already_on_Ncoa_Home_page()"
});
formatter.result({
  "duration": 7183402400,
  "status": "passed"
});
formatter.match({
  "location": "ValidateSignInProcess.user_clicks_on_login_link()"
});
formatter.result({
  "duration": 2141199300,
  "status": "passed"
});
formatter.match({
  "location": "ValidateSignInProcess.user_enter_Username_and_Password()"
});
formatter.result({
  "duration": 2180981100,
  "status": "passed"
});
formatter.match({
  "location": "ValidateSignInProcess.user_clicks_on_login_button_and_validate_user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 6175075600,
  "status": "passed"
});
formatter.match({
  "location": "ValidateSignInProcess.Teardown()"
});
formatter.result({
  "duration": 211010600,
  "status": "passed"
});
});