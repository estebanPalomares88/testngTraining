@REGRESSION @API

@API_AUTH
Feature: Test the API AUTH

  @GET_BEARER
  Scenario: Test AUTH BEARER
    Given I have a AUTH Request
    When I GET the Bearer endpoint status 200
    Then I verify the Bearer response

  @GET_BEARER_UNAUTHORIZED
  Scenario: Test AUTH BEARER UNAUTHORIZED
    Given I have a unauthorized Request
    When I GET the Bearer endpoint status 401
    Then I verify the Bearer response is empty
