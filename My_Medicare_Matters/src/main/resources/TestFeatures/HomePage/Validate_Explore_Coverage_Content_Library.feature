@ExploreCoverage @Regression  @smoketest
Feature: My Medicare Matters Validate Explore Coverage Resource Content Library

Scenario:  Validate when user is in Explore Coverage Content libarary user clicks on When Does Medicare Coverage Start? button and user lands on When Does Medicare Coverage Start? Page and user validate Content Resources and the Back to Coverage link and when user click on the link user navigate back to Explore Coverage content library.
Given User is already on Ncoa Home page
Then User validate Explore Coverage Resources
Then User clicks on Explore Coverage Resources
Then User clicks on When Does Medicare coverage Starts button
Then User clicks on Back to Explore Coverage link and validate user is on Explore Coverage Page
Then user close the browser