$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/apply.feature");
formatter.feature({
  "name": "apply shine Data creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "apply shine data creation scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@uat"
    }
  ]
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "title of page shine",
  "keyword": "When "
});
formatter.step({
  "name": "click on login link",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and  \"\u003cpassword\u003e\" login",
  "keyword": "Then "
});
formatter.step({
  "name": "user is on home page title",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "dhanu.jnv@gmail.com",
        "nilgirian"
      ]
    }
  ]
});
formatter.scenario({
  "name": "apply shine data creation scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@uat"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.StepsShine.user_is_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of page shine",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.StepsShine.title_of_page_shine()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepsShine.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"dhanu.jnv@gmail.com\" and  \"nilgirian\" login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepsShine.user_enters_and_login(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepsShine.user_is_on_home_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});