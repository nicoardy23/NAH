Feature: Login Invalid Username Password NOPCommerce

  Scenario Outline: Invalid login outline
    When Browser open web NOPCommerce outline
    And Enter invalid <email> and <password> outline
    And Click button login outline
    Then Check credentials invalid online

    Examples: 
      | email               | password |
      | ADMIN@YOURSTORE.COM | admin1   |
      | ADMIN@yourstore.com | admin2   |
      | Admin@yourstore.com | admin3   |
      | admin@yourstore.com | admin4   |
