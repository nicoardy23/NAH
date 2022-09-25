Feature: User Login Shop DemoQA

  Scenario: Login User Account
    When User go to web Login
    And User input <username> <password> login
    And User click button login
    Then User loged in

	Examples: 
			|username|pass|
|akuncoba16|akuncoba1616|
|akuncoba17|akuncoba1717|
|akuncoba18|akuncoba1818|
|akuncoba19|akuncoba1919|
|akuncoba20|akuncoba2020|
