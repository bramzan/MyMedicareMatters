@MakesSenseofCosts @Regression  @smoketest
Feature: My Medicare Matters Validate Makes Sense of Costs Resource Conetnt Library

Scenario:  Validate when user is in Make Sense Of Medicare Costs Content libarary user clicks on Learn more link user lands on Medicare Part C Costs page and user validate Content Resources and Back to Costs link and when user link on the link user navigate back to Make Sense Of Medicare Costs content library.
Given User is already on Ncoa Home page
And User validate Makes Sense of Costs Resources
Then User clicks on Makes Sense of Costs Resources
Then User clicks on How Much Does Meicare Cost button
Then User clicks on Back to Makes Sense of Costs link and validate user is on Makes Sense of Costs Page
Then user close the browser