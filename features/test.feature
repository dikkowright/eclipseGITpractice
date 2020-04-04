Feature: Test Twitter smoke scenario


Scenario: Test login with valid credentials


Given Open the firefox and start application
When I enter valid username and valid password
Then User should be able to login successfully
