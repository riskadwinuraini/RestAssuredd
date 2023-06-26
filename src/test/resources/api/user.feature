Feature: user

  @user
  Scenario: Get As an User I have be able to get data of my profile
    Given I Set GET Endpoints my profile
    When I Send GET HTTP Request my profile
    Then I Receive HTTP Response Code 200 my profile

  Scenario: Get As an User I have not be able to get data of my profile if i use wrong bearer token
    Given I set GET Endpoints
    When I send GET HTTP Request
    Then I receive Valid HTTP Response Code 401

  Scenario: Get As an User I have not be able to get data of my profile if i use wrong url
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive Valid HTTP response Code 404

  Scenario: Put As an User I have be able to update data of my profile
    Given I Set PUT Api Endpoints
    When I Send PUT HTTP Request
    Then I Receive Valid HTTP Response 200

  Scenario: Put As an Admin I have be able to update data of some profile
    Given I Set PUT Api endpoints
    When I Send PUT HTTP request
    Then I Receive Valid HTTP response 200

  Scenario: Get As an Admin I have be able to get data of all user
    Given I Set GET endpoints
    When I Send GET HTTP request
    Then I Receive Valid HTTP Response Code 201

  Scenario: Get As an Admin I have not be able to get data of all user if i use wrong bearer token
    Given I set get endpoints
    When I send get http request
    Then I receive valid http response code 401

  Scenario: DELETE As Admin I have be able to delete existing user
    Given I Set Delete Api Endpoints
    When I Send Delete HTTP Request
    Then I Receive Valid HTTP Response Code 200

  Scenario: DELETE As Admin I have not be able to delete existing user if i use wrong bearer token
    Given I set Delete Api Endpoints
    When I send Delete HTTP Request
    Then I receive Valid HTTP response Code 401

  Scenario: Put As an User I have not be able to update data of my profile with wrong date format
    Given I set PUT Api Endpoints
    When I send PUT HTTP Request
    Then I receive Valid HTTP Response 500

  Scenario: Put As an Admin I have not be able to update data of some profile with wrong date format
    Given I set PUT Api endpoints
    When I send PUT HTTP request
    Then I receive Valid HTTP response 500

