Feature: Beating_The_Blues

  @WEB  @BEATING_THE_BLUES1
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address                 | Password   |
      | &EMAIL FOR BTB_MMH_V2_PORTAL& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES1
  Scenario:S1- Existing MMH Patient Register to BTB through MMH V2 Portal and Verify the All Dashboard Options
    Given As a Existing user I am on HomePage and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When I Click on Book an Appointment and Verify Patient see book an appointment successfully
    And I Click on New Repeat Prescription and Verify Patient see request an RRP Successfully
    And I Click on Health Records and Lab Results details and Verify Patient see view Health Records and Lab Results Records
    Then I Click on Messages and Verify Patient see send and receive messages successfully

  @WEB @BEATING_THE_BLUES1
  Scenario:S2- Existing MMH Patient Register to BTB Through BTB Web site
    Given As a Existing user I am on HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    When I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions


  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on Beating the Blues Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the BTB Portal
    Examples:
      | Email Address                 | Password   |
      | &EMAIL FOR BTB_MMH_V2_PORTAL& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES
  Scenario:S1- Existing MMH Patient Register to BTB through BTB Website
    Given As a Existing user I am on HomePage BTB Website and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When I Click on Book an Appointment and Verify Patient see book an appointment successfully
    And I Click on New Repeat Prescription and Verify Patient see request an RRP Successfully
    And I Click on Health Records and Lab Results details and Verify Patient see view Health Records and Lab Results Records
    Then I Click on Messages and Verify Patient see send and receive messages successfully

  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref- Login Self Registered Patient through BTB Website (or) MMH V2 Portal
    Given As a Self Registered user I am on BTB Website Login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the BTB Portal
    Examples:
      | Email Address                 | Password   |
      | &EMAIL FOR BTB_MMH_V2_PORTAL& | &PASSWORD& |







