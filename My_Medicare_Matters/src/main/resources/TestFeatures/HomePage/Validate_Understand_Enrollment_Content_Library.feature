@UnderstandEnrollment @Regression  @smoketest
Feature: My Medicare Matters Validate Homepage Understand Enrollment Resource Content Library

Scenario:  Validate when user is in Understand Enrollment Content libarary user clicks on Enrollment Guide link user lands on A Complete Guide to Medicare Open Enrollment page and user validate Content Resources and Back to enrollment link and when user link on the link user navigate back to Understand Enrollment content library.
Given User is already on Ncoa Home page
And User validate Understand Enrollment Resources
Then User clicks on Understand Enrollment Resources
Then User clicks on Enrollment Guide button
Then User clicks on Back to Understand Enrollment link and validate user is on Understand Enrollment Page
Then user close the browser