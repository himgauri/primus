Feature:Feature: Login feature
Background: User is successfully Logged in
Given Users oopens "webdriver.chrome.driver" browser and exe "C:\\Software\\automationsupport\\chromedriver.exe"
Given Users eenter "http://demo.guru99.com/test/newtours/" as link

@SmokeTest
Scenario Outline: user is logged in with valid data
When user enter <username> as username
When user enter <password> as password
When user click on submit button
Then validate Login functionality using Valid username and valid password
Then Close the Brower

Examples:
       |username|password|
       |Admin|Admin|
       |Admin|Admin123|
       |Admin123|Admin|
       |Admin123|Admin123|
@RegressionTest
Scenario Outline: user is logged in with invalid data
When user enter <username> as username
When user enter <password> as password
When user click on submit button
Then validate Login functionality using Invalid username and Invalid password
Then Close the Brower

Examples:
       |username|password|
       |Admin@#|Admin1$E|
       |$#%$$|Admin|
       |Admin|76761|
       |S$%D|ss*&n|
