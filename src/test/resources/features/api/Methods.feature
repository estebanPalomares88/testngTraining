@REGRESSION @API

@API_METHODS
Feature: Test the API methods

  @METHODS_SUCCESS
  Scenario Outline: Test http methods in success scenarios
    Given user has a Body Request
    When user "<method>" the endpoint
    Then user verify the 200 status code

    Examples:
    | method  |
    |  GET    |
    |  POST   |
    |  PUT    |
    |  PATCH  |
    |  DELETE |

  @METHODS_FAIL
  Scenario Outline:  Test http methods in fail scenarios
    When user "<method>" the "<endpoint>" endpoint
    Then user verify the 405 status code

    Examples:
      | method  | endpoint |
      |  GET    |  POST    |
      |  POST   |  PUT     |
      |  PUT    |  PATCH   |
      |  PATCH  |  DELETE  |
      |  DELETE |  GET     |
