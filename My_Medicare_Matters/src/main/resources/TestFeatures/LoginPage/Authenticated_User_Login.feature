@Login_page @Regression
Feature: My Medicare Matters Login page

Scenario:  User Login with valid username and password
Given User is already on Ncoa Home page
And User clicks on login link
Then User enter Username and Password
Then User clicks on login button and validate user is logged in successfully
Then close the browser












