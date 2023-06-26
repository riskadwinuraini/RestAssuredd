Feature: office
  @getListOffice
  Scenario: GET As an admin I can see List Office
    Given I set GET endpoints for List Office
    When I send GET HTTP request for List Office
    Then I receive valid HTTP response code 200 for list office
    And I receive valid data for list office

  @getDetailOffice
  Scenario: GET As an admin I can see details office
    Given I set GET endpoints by id
    When I send GET HTTP request by id
    Then I receive valid HTTP response code 200 for get id detail office
    And I receive valid data for id office


  @createOffice
  Scenario: POST - As admin I have be able to create new office
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201 for create office
    And I receive valid data for create office

  Scenario: POST - As admin I have be able to create new office with invalid data
    When I send POST HTTP request with input invalid data for create
    Then I receive valid HTTP response code 500 for invalid data to create

  Scenario: PUT - As admin I have be able to create new office with invalid endpoints
    When I send PUT HTTP request to invalid endpoints for create
    Then I receive valid HTTP response code 404 for invalid endpoints to create office

  Scenario: POST - As admin I have be able to create new office with invalid token
    When I send POST HTTP request with input invalid token for create
    Then I receive valid HTTP response code 401 to create

  @deleteOffice
  Scenario: DELETE As an admin I have be able to delete existing office
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200 in delete office


