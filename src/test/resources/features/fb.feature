Feature: checking facebook login functionality
Scenario: user is able to login

Given user at facebook homepage
When user enter username as "mchh@gmail.com"
And user enter password as "bengk1234"
Then click on login button
And user should be login to their facebook page