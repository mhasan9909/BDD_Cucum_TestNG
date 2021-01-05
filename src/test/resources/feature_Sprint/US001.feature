Feature: checking facebook signup functionality 

@smoke 
Scenario Outline: user is able to login 

	Given user at facebook homepage 
	Then click on create new account
	Then user entering "<uFname>" "<Fvalue>"
	Then user entering "<uLname>" "<Lvalue>"
	When user entering "<phEmail>" "<Phvalue>"
	And user entering "<passWord>" "<Pvalue>"
#	Then click on login button 
#	And user should be login to their facebook page 


Examples:
|uFname|Fvalue|uLname|Lvalue|phEmail  |Phvalue      |passWord|Pvalue   |	
|fName |jon   |lName |Kan   |phonEmail|amd@gmail.com|newPass |hfdh$123|



@Adhoc 
Scenario Outline: user is able to login 

	Given user at facebook homepage 
	Then click on create new account
	Then user entering "<uFname>" "<Fvalue>"
	Then user entering "<uLname>" "<Lvalue>"
	When user entering "<phEmail>" "<Phvalue>"
	And user entering "<passWord>" "<Pvalue>"
#	Then click on login button 
#	And user should be login to their facebook page 


Examples:
|uFname|Fvalue|uLname|Lvalue|phEmail  |Phvalue      |passWord|Pvalue   |	
|fName |jon   |lName |Kan   |phonEmail|amd@gmail.com|newPass |hfdh$123|

