$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage/Homepage_Footer_More_Information.feature");
formatter.feature({
  "line": 2,
  "name": "My Medicare Matters Validate Homepage footer More Information",
  "description": "",
  "id": "my-medicare-matters-validate-homepage-footer-more-information",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Homepage_Footer_More_information"
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
  "id": "my-medicare-matters-validate-homepage-footer-more-information;user-login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is already on Ncoa Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User validate About Us Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate Conatct Us Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User validate Standard of Excellence Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validate Privacy Policy Link in the Footer",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateHomePage.User_is_already_on_Ncoa_Home_page()"
});
formatter.result({
  "duration": 7977217700,
  "status": "passed"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_About_Us_Link_in_the_Footer()"
});
formatter.result({
  "duration": 5173197800,
  "status": "passed"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_Conatct_Us_Link_in_the_Footer()"
});
formatter.result({
  "duration": 7074159900,
  "status": "passed"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_Standard_of_Excellence_Link_in_the_Footer()"
});
formatter.result({
  "duration": 7093675500,
  "status": "passed"
});
formatter.match({
  "location": "ValidateHomePage.user_validate_Privacy_Policy_Link_in_the_Footer()"
});
formatter.result({
  "duration": 5105702400,
  "status": "passed"
});
formatter.match({
  "location": "ValidateHomePage.Teardown()"
});
formatter.result({
  "duration": 179955300,
  "status": "passed"
});
});