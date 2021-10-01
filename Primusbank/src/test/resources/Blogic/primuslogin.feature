Feature: Login feature
Background: User is successfully Logged in
Given User opens "webdriver.chrome.driver" browser and exe "C:\\Software\\automationsupport\\chromedriver.exe"
Given User enter "http://primusbank.qedgetech.com/" as link

@SmokeTest
Scenario Outline: user is logged in with valid data
When user enter <username> as username
When user enter <password> as password
When user click on login button
Then validate Login functionality using Valid username and valid password
Then Close the Brower

Examples:
       |username|password|
       |Admin|Admin|
       |admin|Admin|
       
@RegressionTest
Scenario Outline: user is logged in with invalid data
When user enter <username> as username
When user enter <password> as password
When user click on login button
Then validate Login functionality using Invalid username and Invalid password
Then Close the Brower

Examples:
       |username|password|
       |admin|admin@|
       |12345|admin$|
