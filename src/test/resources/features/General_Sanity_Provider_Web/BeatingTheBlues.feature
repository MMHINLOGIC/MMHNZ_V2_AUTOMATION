Feature: Beating_The_Blues

  @WEB  @BEATING_THE_BLUES @SANITY_PATH
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address                 | Password                         |
      | &EMAIL FOR BEATING_THE_BLUES& | &PASSWORD FOR BEATING_THE_BLUES& |

  @WEB @BEATING_THE_BLUES @SANITY_PATH
    Scenario:S1- Existing MMH Patient Register to BTB Through BTB Web site
    Given As a Existing user I am on HomePage and I click the Beating the Blues Option
    When click on My Health Centres option and verify Patient is Connected the Health centre
    Then click view all the steps of session in Beating the Blues