Feature: mid transaction

  @transaction
  Scenario: GET - As admin I can see detail payment
    Given I set GET endpoints detail payment
    When I send GET HTTP request detail payment
    Then I receive valid HTTP response code 200 for get id detail payment
    And I receive valid data for id detail payment

  Scenario: GET - As admin set invalid token detail payment
    Given I set GET endpoints detail payment
    When I send GET HTTP request with input invalid token for detail payment
    Then I receive valid HTTP response code 401 to detail payment

  Scenario: POST - As admin set invalid endpoints detail payment
    When I send POST HTTP request to invalid endpoints detail payment
    Then I receive valid HTTP response code 404 for detail payment

  Scenario: GET - As admin enters id which is not registered
    Given I set GET endpoints detail payment using invalid id
    Then I receive valid HTTP response code 404 for detail payment