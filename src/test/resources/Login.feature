Feature: Automation Exercise login testing
#Description: write some important requirement/need (optional)
#Background: Common step (optional)
@smoke
Scenario: As a user, I want to login to Automation Exercise with valid credentials, 
so that I can use the website
Given Open the browser
And Pass the Automation Exercise URL

|https://www.automationexercise.com/|
When Click on Login button in the homepage
And Enter the email in the email field

|rezwanislam857@gmail.com |
And  Enter the password in the password field

|Boston2023 |
And Click on Login button in the Login  page
Then Validate login is  successful

@regression
Scenario Outline: As a  user, I want to login to Automation Exercise with multiple valid credentials
so that I can use the website
Given Open the browser
And Pass the Automation Exercise URL "<URL>"
When Click on Login button in the homepage
And Enter the email in the email field "<email>"
And  Enter the password in the password field "<password>"
And Click on Login button in the Login  page
Then Validate login is  successful
Examples:
|URL         												|email                   |password  |
|https://www.automationexercise.com/|rezwanislam857@gmail.com|Boston2023|
|https://www.automationexercise.com/|ahnaf.x.tahmid@gmail.com|passWord1!|
