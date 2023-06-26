Feature: widget

  @GetDashboardWidget
  Scenario: As admin I can see dashboard widget
    Given I set GET endpoints dashboard widget
    When I send GET HTTP request for dashboard widget
    Then I receive valid HTTP response code 200 for get dashboard widget
    And I receive valid data for dashboard widget

  Scenario: GET - As admin I set invalid token for dashboard widget
    Given I set GET endpoints dashboard widget
    When I send GET HTTP request with input invalid token for dashboard widget
    Then I receive valid HTTP response code 401 for dashboard widget

  Scenario: POST - As admin I set invalid endpoints for dashboard widget
    Given I set GET endpoints dashboard widget
    When I send GET HTTP request with invalid endpoints for dashboard widget
    Then I receive valid HTTP response code 404 dashboard widget

  @GetOfficeWidget
  Scenario: GET - As admin I can see office widget
    Given I set GET endpoints office widget
    When I send GET HTTP request for office widget
    Then I receive valid HTTP response code 200 for get office widget
    And I receive valid data for office widget

  Scenario: GET - As admin I set invalid token for office widget
    Given I set GET endpoints office widget
    When I send GET HTTP request with input invalid token for office widget
    Then I receive valid HTTP response code 401 for office widget

  Scenario: POST - As admin I set invalid endpoints for office widget
    Given I set GET endpoints office widget
    When I send GET HTTP request with input invalid endpoints for office widget
    Then I receive valid HTTP response code 404 office widget

  Scenario: GET - As admin I can see revenue widget
    Given I set GET endpoints revenue widget
    When I send GET HTTP request code for get revenue widget
    Then I receive valid HTTP response code 200 for get revenue widget
    And I receive valid data for revenue widget

  Scenario: GET - As admin I set invalid token for revenue widget
    Given I set GET endpoints revenue widget
    When I send GET HTTP request with invalid token for revenue widget
    Then I receive valid HTTP response code 401 for revenue widget

  Scenario: POST - As admin I set invalid endpoints for revenue widget
    Given I set GET endpoints revenue widget
    When I send GET HTTP request with input invalid endpoints for revenue widget
    Then I receive valid HTTP response code 404 revenue widget

  Scenario: GET - As admin I can see user widget
    Given I set GET endpoints user widget
    When I send GET HTTP request for user widget
    Then I receive valid HTTP response code 200 for get user widget
    And I receive valid data for user widget

  Scenario: GET - As admin I set invalid token for user widget
    Given I set GET endpoints user widget
    When I send GET HTTP request with input invalid token for user widget
    Then I receive valid HTTP response code 401 for user widget

  Scenario: POST - As admin I set invalid endpoints for revenue widget
    Given I set GET endpoints user widget
    When I send GET HTTP request with input invalid endpoints for user widget
    Then I receive valid HTTP response code 404 user widget

