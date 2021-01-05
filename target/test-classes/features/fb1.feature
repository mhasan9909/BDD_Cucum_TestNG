Feature: checking facebook login functionality 

@smoke 
Scenario Outline: user is able to login 

	Given user at facebook homepage 
	When user enter username as "<uName>" 
	And user enter password as "<pWord>" 
	Then click on login button 
	And user should be login to their facebook page 
	
	Examples: 
		|uName|pWord|
		|ah.133@gmail.com|tohdsd9f|
		|am.133@gmail.com|asdf@dsd9f|