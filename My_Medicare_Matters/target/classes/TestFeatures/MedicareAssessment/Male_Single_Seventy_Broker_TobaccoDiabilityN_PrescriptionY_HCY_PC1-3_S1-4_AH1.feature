@MedicareAssessment1 @Regression
Feature: My Medicare Matters Medicare page

Scenario:  User Medicare Assessment
Given user is on MMM Home page
And user clicks on Complete Assessment button
Then user select Yes for Are you completing this for yourself
Then user enters First name and Last name
Then user enters Phone number
And user verify May we contact you via text question is displayed and user select Yes
Then user enters email address
Then user enters Zipcode
Then user enters Date of Birth
Then User select Male for what is your gender question
Then user select Single from Marital Status dropdown
Then user select Yes for Do you use any tobacco products? *
Then user select Yes for Do you have a disability? *
Then user select None of these apply to me for Do any of the following apply to you?(Check all that apply) question
Then user select Yes for Is your monthly household income $1,900 or more? (consider all sources of income) question
Then user select Yes for Are you currently enrolled in Medicare A and B? question
Then user select Yes for Are you interested in dental/hearing/vision coverage? question'
And user clicks on Next button and verify user is on Health tab
Then user select No for Do you take any prescription drugs? *
Then user select None for from Health condition dropdown field
Then user selct 1-3 times for How many times did you visit your primary care physician in the last 12 months? question
Then user select 1-4 times How many times did you visit a specialist in the last 12 months? question
Then user select 1 time for How many times were you admitted to a hospital in the last 12 months? question
And User clicks on submit button and verify user on Medicare assessment summary page