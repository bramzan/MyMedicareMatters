@Delete_User_Account @Regression @smoketest
Feature: My Medicare Matters Deleting User Account Email

Scenario:  Validate user is able to Delete account in DynamoDB.
Given User is already on AWS Amazon Homepage
When User clicks on Sign In to the Console button
Then User user is navigated to AWS Sign page
Then user enters 12 digit Account ID in Account ID field
Then User enters username in username field
Then User enter Password in Password field
When User clicks on Sign In button
Then User is on AWS Management Console Pgae
And User Clicks on Cognito link 
Then clicks on Manage User pools
Then User Clicks on qaCommon-Cognito button
And User cicks on User and groups and verify users is on User tabs 
Then User clicks on the dropdown and select email
Then user eneter the email address
Then user select the username link
Then User clicks on Disable user button 
Then user clicks on Delete user button
Then close the browser