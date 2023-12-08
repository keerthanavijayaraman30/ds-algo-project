Feature: Login functionality 


  Scenario Outline: 
    Given User clicks the Signin link
    When user gives correct "<username>" and "<password>"
    And clicks the login button
    Then The user should be redirected to Homepage with the text displayed as You are logged in
 

    Examples: 
      | username | password |
      | keerv   | Heat6er@123 |
     
     
     
     # |smrithu  |  komala1956! |
      