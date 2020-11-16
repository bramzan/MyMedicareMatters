@VerifyAccount @Regression @smoketest
Feature: My Medicare Matters Verifying Email

Scenario:  Validate user is able to verify the verification email and then Login to MMM.
Given User is already on Gmail
When User clicks on Sign In Link
Then User enter Email address in Email field and click on Next button
Then User enter Password in Password field and click on Next button
Then User Search For My Medicare Matter verification Email and clicks on Email
Then User clicks on the Email and clicks on Click here link to verify the Email
When User clicks on Click here link in the verification email
Then user is navigated to MMM on different tab
Then User enters username and password
Then user clicks on Login In button
And User verify user is succfully logged in
Then close the browser