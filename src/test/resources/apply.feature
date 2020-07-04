Feature: apply shine Data creation
@uat
Scenario Outline: apply shine data creation scenario

Given user is already on login page
When title of page shine
Then click on login link
Then user enters "<username>" and  "<password>" login
Then user is on home page title

Examples:
|username|password|
|dhanu.jnv@gmail.com|nilgirian|
