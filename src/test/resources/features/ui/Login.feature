@REGRESSION @UI

  @LOGIN_SCENARIOS
  Feature: Scenarios related to login into a mail account

    @SUCCESS_LOGIN
    Scenario:
      Given User opens the website
      When User uses "valid" credentials
      Then User in logged
