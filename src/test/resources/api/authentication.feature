Feature: authentication

  @authentication
  Scenario: Successfully login
    Given I have valid credentials
    When I submit a POST request to "/auth/login" with email "testingg11@gmail.com" and password "test123"
    Then I receive valid HTTP response code Login 200

  @authentication
  Scenario: Post login with valid api endpoints and input incorrect email
    When I submit a POST request to "/auth/login" with incorrect email "t3st123*@#.com" and password "testi123"
    Then I receive valid HTTP response code 500 for login

  @authentication
  Scenario: Post login with valid api endpoints and input incorrect password
    When I submit a POST request to "/auth/login" with email "testi123@gmail.com" and incorrect password "testi1234"

  @authentication
  Scenario: Get login invalid endpoints
    When I submit a GET request to "/auth/login" with email "testingg11@gmail.com" and incorrect password "test123"
    Then I receive valid HTTP response code 404 for invalid token