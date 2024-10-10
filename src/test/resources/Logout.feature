Feature: Automation Exercise logout testing
#Description: write some important requirement/need (optional)
#Background: Common step (optional)
@smoke
Scenario: As a logged-in user, I want to logout successfully, so that my information is not
saved
Given Open the browser
And Pass the Automation Exercise URL

|https://www.automationexercise.com/|
When Click on Login button in the homepage
And Enter the email in the email field

|rezwanislam857@gmail.com |
And  Enter the password in the password field

|Boston2023 |
And Click on Login button in the Login  page
And Click on Logout button
Then Validate logout is successful
And Quit all  browsers