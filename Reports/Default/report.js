$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scholastic/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 10031051096,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User is not able to login using invalid credentials",
  "description": "",
  "id": "login-feature;user-is-not-able-to-login-using-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@invalidLogin"
    },
    {
      "line": 11,
      "name": "@sanity"
    },
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter dt@schl.com in email",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter passw0rd1 in password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify I get error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "dt@schl.com",
      "offset": 8
    }
  ],
  "location": "LoginSD.enterEmail(String)"
});
formatter.result({
  "duration": 6433817131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passw0rd1",
      "offset": 8
    }
  ],
  "location": "LoginSD.enterPassword(String)"
});
formatter.result({
  "duration": 1073402517,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.clickSignIn()"
});
formatter.result({
  "duration": 755563841,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.isSignInErrorDisplayed()"
});
formatter.result({
  "duration": 627664992,
  "status": "passed"
});
formatter.after({
  "duration": 368040936,
  "status": "passed"
});
});