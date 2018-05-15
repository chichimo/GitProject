
Feature: Free CRM website and Amazon 
  

 @Freecrm
  Scenario: Open FreeCrm Project
    Given I have Firefox browser running 
    When I go to the website 
    And I enter a valid username as "Hashmi"
    And I enter a valid password as "Hashmi123"
    And I click on the login Button
    
    @Amazon
    Scenario: Amazon test with invalid username and password
    Given I have Firefox browser running 
    When I go to the Website 
    And verify the Account & Lists link is present
    And I hover on the link
    And I click on the sign in button 
    And I enter invalid email as "abcd"
    And I enter invalid password as "abc1234"
    And I click on the sign in button in the form
    Then I should see the Error Message 
    

  
