Feature: feature to test Graph module

Background:
Given user has logged to the application
|username|password|
|komala|Koms@123|

    @TC:G-01 
    Scenario: user navigate Graph
    Given User on home page
    When user clicks open the Graph
    Then user click graph topic
    
    @TC:G-02
    Scenario:user open the python editer on graph topic
    Given user on graph page
    When user clicks <Try Here> under the topic of graph
    Then the user should move to a page having an tryEditor with a Run button to test
    
    @Tc:G-03
    Scenario: user the python editer in Graph Representation
    Given user comes back graph page
    When user clicks on Graph Representation
    Then user clicks <Try Here> under the topic of Graph Representation
    And User should move to a page having an tryEditor with a Run button to test
    
    @TC:G-06
    Scenario: user come out the page
    
    Given user go back to previous page of graph
    When user clicks Sign out 
    Then user comes back to home page