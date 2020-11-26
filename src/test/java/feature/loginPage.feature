Feature: Login functionality
  @LoginTest
  Scenario Outline: Login to the Application
  Given CtoK application is launched
  When User Clicks on Signin button
  And User Enters username "<username>"
  And User Enters password "<password>"
  And User Clicks on login button
    Then User validates the title of the page

    Examples:
    |username|password|
    |letmetest@hotmail.com|test123|