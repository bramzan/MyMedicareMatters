@CreateAccount @Regression @smoketest
Feature: My Medicare Matters Create account Email

Scenario:  Validate user is able to create account on MMM.
Given User is already on Ncoa Home page
When User clicks on Create Account link
Then User enter Email address 
Then User enter Password in Password field
Then User enter Password in Confirm Password field
Then User clicks on Sign Up button
Then close the browser