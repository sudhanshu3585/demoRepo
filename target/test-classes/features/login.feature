
Feature: Application login


Scenario: Login with valid credential
Given Open any browser
And Navigate tologin page
When User enters username as "abc1cdkjein234@gmail.com" and password as "12345678"
And User click on login button
Then: Verify user is able to ;ogin successfully