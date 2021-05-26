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
@bookingtickets
Feature: BookTickets for adults
  I want to Book tickets for a family trip

  @tag2
  Scenario Outline: Booking tickets
    Given I want to book tickets for <name> in booking website
    And   I want to check for the site with best offers 
    When  I openend booking site for booking tickets
    Then  I booked tickets for <family>

    Examples: 
      | name   | family  | 
      | flight | ABCD    | 
      | hotel  | XYZ     | 
