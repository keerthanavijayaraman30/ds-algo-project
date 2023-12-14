Feature: feature to test Tree module

  Background:
Given user has logged to the homepage
|username|password|
|komala|Koms@123|

    #@TC:T-01
    #Scenario: login to page
    #Given user open the homepage
    #And user clicks sign in button
    #When user enter <username> and <password> values
    #And The user clicks login button
    #Then The user should be able to open the datastructure page
    
    @TC:T-02
    Scenario: navigate to tree module
    Given user on home page
    When user clicks opens the Tree
    And user click on overview of tree
    And The user clicks <Try Here> under  the topics
    Then The user enter to a page having an tryEditor with a Run button to test
    
    @TC:T-03
    Scenario: opens Terminologies
    Given user go previous page
    And user clicks on Terminologies button
    When The user clicks <Try Here> under  the topic Terminologies
    Then The user should move to a page having an tryEditor with a Run button to test
    
    @TC:T-04
    Scenario: opens Types of Trees
    Given user come to previous page
    And user clicks on Types of Trees
    When the user clicks <Try Here> under the topic
    Then user on page having an tryEditor with a Run Button to test
    
    @TC:T-05
    Scenario: opens Tree Traversals
    Given user go back
    And user clicks Tree Traversals
    When user clicks <Try Here> under topic of Tree Traversals
    Then The user  move to a page having an tryEditor with a Run button to test
    
    @TC:T-06
    Scenario: opens Traversals Illustration
    Given the user come to previous page
    And user clicks Traversals Illustration
    When user clicks <Try Here> under the topic of Traversals Illustration
    Then The user should move  a page having an tryEditor with a Run button to test
    
    @TC:T-07
    Scenario: opens Binary Trees
    Given user on previous page
    And user clicks Binary Trees
    When user clicks <Try Here> under the topic of Binary Trees
    Then user should move to a page having an tryEditor with a Run button to test
    
    @TC:T-08
    Scenario: opens Types of Binary Trees
    Given the user go back
    And user clicks Types of Binary Trees
    When user clicks <Try Here> under the topic of Types of Binary Trees
    Then The user on a page having an tryEditor with a Run button to test
    
    @TC:T-09
    Scenario: opens implementation in python
    Given the user on previous page
    And user clicks implementation in python
    When user clicks <Try Here> under the topic of implementation in python
    Then user should move a page having an tryEditor with a Run button to test
    
    @TC:T-10
    Scenario: opens binary tree trversals
    Given  user go  again previous
    And user clicks on binary tree trversals
    When user clicks <Try Here> under the topic of binary tree trversals
    Then The user should move to a page  and tryEditor with a Run button to test
    
    @TC:T-11
    Scenario: opens Implementation of binary trees
    Given user goes previous page
    And user clicks Implementation of binary trees
    When user clicks <Try Here> under the topic of Implementation of binary trees
    Then user on page have tryEditor with a Run Button to test
    
    @TC:T-12
    Scenario: opens application of binary trees
    Given the user move back to previous page
    And user clicks application of binary trees
    When user clicks <Try Here> under the topic of application of binary trees
    Then user will go a page having an tryEditor with a Run Button to test
    
    @TC:T-13
    Scenario: opens Binary search tree
    Given the user go back again
    And user clicks Binary search tree
    Then user clicks <Try Here> under the topic of Binary search tree
    When user enter to a page having an tryEditor with a Run button to test
    
    @TC:T-14 
    Scenario: opens Implementation of BST
    Given the user move to previous page
    And user clicks Implementation of BST
    When user clicks <Try Here> under the topic of Implementation of BST
    And The user enter to  page having an tryEditor with a Run button to test
    Then the enter to previous page