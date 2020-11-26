$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to the Application",
  "description": "",
  "id": "login-functionality;login-to-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "CtoK application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Clicks on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User validates the title of the page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-functionality;login-to-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-functionality;login-to-the-application;;1"
    },
    {
      "cells": [
        "letmetest@hotmail.com",
        "test123"
      ],
      "line": 13,
      "id": "login-functionality;login-to-the-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login to the Application",
  "description": "",
  "id": "login-functionality;login-to-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "CtoK application is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Clicks on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters username \"letmetest@hotmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Enters password \"test123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User validates the title of the page",
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