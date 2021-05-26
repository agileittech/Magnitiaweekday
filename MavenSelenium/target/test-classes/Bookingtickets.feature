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
@Booking
Feature: Booking Tickets
  I want to Book Tickets for a holiday to paris
Background:
    Given I want to book tickets for flight in booking website
    When  I openend booking site 
  @req1
  Scenario: Booking Tickets for Flight
    And   I want to check for the site with best offers
    But   I found that site giving offers only for to and fro
    Then  I 'booked my Tickets to and fro for' paris
    
  @req2
  Scenario: Booking Tickets for Hotel
    Then  I 'should book my Hotel rooms in' paris 