@Homepage @Regression  @smoketest
Feature: My Medicare Matters Validate Homepage

Scenario:  User validate MMM Logo, Resources, Complete Assessment button, Research Your Options, and Image on Homepage.
Given User is already on Ncoa Home page
Then User validate Explore Coverage Resources
And User validate Makes Sense of Costs Resources
And User validate Understand Enrollment Resources
And User validate Continue Learning Resources
And User Validate Research my options link
And User Validate NCOA My Medicare Matters Logo
And user Validate Complete Assessment Button
And user Validate the Homepage Image
Then user close the browser