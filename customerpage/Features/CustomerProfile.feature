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
Feature: customer services

Background:
Given customer is logged in
And Customer is on home page

Scenario: View customer profile

When customer clicks on view profile 
Then customer details are shown successfully

Scenario: Update customer profile 

When customer clicks on update profile
And  customers enters the value on his profile to be updated
Then customer profile is updated successfully
And  prompt is generated having message 'profile updated successfully'

Scenario: View all orders

When customer clicks on get orders
Then all customer orders is displayed
  
