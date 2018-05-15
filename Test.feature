
Feature: As a valid user when I enter my credentials, I should be to login
 

  @Sprint1 @Firefox
  Scenario: As an editor I should be able to login to the application.
    Given I have a firefox browser running
    When I go to the application
    And I enter valid username and password 
  			 |admin|admin|
    When I click on the login button 
    Then I click on the Recruitment link
    And I click on the Add Button
    And I enter Full Name 
    	  |Munir|Mohammed|Said|
    And I enter Email
        |mms@gmail.com|
    And I enter phone Number 
    	  |00291191900|
    	       	  
    	       	  
   @Firefox1 	  
    Scenario Outline: As an editor I should be able to login to the application.
    Given I have a firefox browser runningg
    When I go to the Application
    And I enter valid "<username>" and valid "<password>"
    And I click on the login button 
    	 
    	  Examples:
    	  |username|password|
    	  |admin|admin|
   
   
    	   
        	  
    
   
    
    
    
    
    

 
