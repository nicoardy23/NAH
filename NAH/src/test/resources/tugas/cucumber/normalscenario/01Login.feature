Feature: Login user NOPCommerce

  Scenario: Login user invalid
    When User go to Web NOPCommerce
    And User enter username password inv
    And User click login inv
    Then User invalid login

  Scenario: Login user valid
    When User enter username password val
    And User click login val
    Then User valid login
