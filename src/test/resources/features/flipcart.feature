#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: flipcart login
  I want to use this template for my feature file

  @flipcartlogin
  Scenario: flipcart login
    Given i want to nevigate flipcart page
     When user enter user name in flipcart
    And user enter password in flipcart
    And user enter login button
    Then validate flipcart page
    

  @registration
  Scenario: registration
    Given i want to nevigate flipcart page
     When user enter user name in flipcart
    And user enter password in flipcart
    And user enter login button
    Then validate flipcart page
    