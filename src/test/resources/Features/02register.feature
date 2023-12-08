Feature: registration functionality 

  Scenario Outline: 
    Given User clicks the register link
    When user provides correct "<username>" and "<password>"
    And clicks the register button
    Then The user should be redirected to Homepage with the message New Account Created. You are logged in with your username

 

    Examples: 
      | username | password |
      | smrithu   | komala1956! | 
      |button     |  Numpy1988!|
      

      
  #keerv 
    #Heat6er@123