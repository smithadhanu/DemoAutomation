Feature: login

@regression
Scenario: user enters valid credentials to login

Given user is on login page
When user enters valid username   "dhanu.jnv@gmail.com"
And  user enters valid password   "Vidal@123"
And user clicks on login button
Then Home page should be displayed

@smoke @ft
Scenario Outline: user enters invalid credentials to login

Given user is on login page
When user enters invalid username "<username>"
And  user enters invalid password "<password>"
And user clicks on login button
Then Home page should not be displayed "<expected_title>"

Examples:
|username|password|expected_title|
|dhanu.j@gmail.com|Vidal@123|Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!|
|dhau.jnv@gmail.com|Vidal@17|Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!|
|dhanu.jnv@gmail.com|Vidal@12893|Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!|
|dhanu.jnv@gmail.com|Vidal@123|Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!|

@sanity
Scenario: order should be placed successfully

When user selects payment mode
|mode |
|credit card|
|debit card |
|COD|
Then order is placed

@system
Scenario Outline: Shine Login Test Scenario

Given user is already on login pages
When title of page is shine
Then click on login link
Then user enters "<username>" and "<password>"
Then user pinch on login button
Then user is on home page
Then user allow button popup
Then user moves searchjobs
Then close the browser

Examples:

 |username|password|
 |dhanu.jnv@gmail.com|nilgirian|
 |dhanu@gm           |nilgiri  |
 