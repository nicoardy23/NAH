Feature: User Registration Shop DemoQA

  Scenario: Register User Account
    When User go to web registration
    And User input <username> <email> and <pass>
    And User click button regrister
    Then Account created

# jika test register invalid, data dapat diubah karena data lama sudah terdaftar
	Examples: 
		|username|email|pass|
|akuncoba16|akuncoba16@gmail.com|akuncoba1616|
|akuncoba17|akuncoba17@gmail.com|akuncoba1717|
|akuncoba18|akuncoba18@gmail.com|akuncoba1818|
|akuncoba19|akuncoba19@gmail.com|akuncoba1919|
|akuncoba20|akuncoba20@gmail.com|akuncoba2020|