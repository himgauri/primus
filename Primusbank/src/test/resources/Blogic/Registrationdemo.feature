
Feature: Login feature
Background: User is successfully Logged in
Given Users opens "webdriver.chrome.driver" browser and exe "C:\\Software\\automationsupport\\chromedriver.exe"
Given Users enters url as "http://demo.guru99.com/test/newtours/"


Scenario: Registrartion of new user with valid data
When user click on Register
When user enter "gauri" as First Name
When user enter "date" as Last Name
When user enter "9823044197" as phone
When user enter "gauri2010@gmail.com" as Email
When user enter "wagholi" as Adress
When user enter "pune" as city
When user enter "maharashtra" as State
When user enter "412207" as Postalcode
When user select "CANADA" as Country 
When user click on submit button
Then validate Registration of new users with valid data
Then close the browser

