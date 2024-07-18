Feature: Beating_The_Blues


  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref 1- Login Self Registered Patient through Beating the Blues Website
    Given As a Self Registered user I am on BTB Website Login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the BTB Portal
    Examples:
      | Email Address                 | Password   |
      | &EMAIL FOR BTB_SELF_REGISTER& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES
  Scenario:S1- New Patient (not enrolled to MMH) --> Self registered via Beating the Blues Website --> Start using Beating the Blues

    Given As a Self Registered user I am on BTB Home Page and Verify the BTB Left Menu
    And I click on Home Icon and Verify the BTB Home Page Menu
    And I click on My Health Centres option and verify Patient is Not Connected the Health centre
    And I click on MyAccount option Navigate to Update Profile Page and Verify Patient is MySubscriptions to Beating the Blues
    When I click on MMH Dashboard option and Verify the MMH Home Page Icons
    And I click on Book an Appointment and New Repeat Prescription Option the user should be able to see the pop-up message
    And I click on Health Records and Lab Results Option the user should be able to see the pop-up message
    Then I click on Messages Option the user should be able to see the pop-up message

  @WEB @BEATING_THE_BLUES
  Scenario:S2-New Patient (not enrolled to MMH) --> Self registered via Beating the Blues Website --> Start using Beating the Blues
    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    When I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions


  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref 2- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via Beating The Blues website -> start using Beating The Blues
    Given As a Self Registered user I am on BTB Website Login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the BTB Portal
    Examples:
      | Email Address             | Password   |
      | &EMAIL _FOR _MMH_PATIENT& | &PASSWORD& |


  @WEB @BEATING_THE_BLUES
  Scenario:S3- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via Beating The Blues website -> start using Beating The Blues

    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When I Click on Book an Appointment and Verify Patient see book an appointment successfully
    And I Click on New Repeat Prescription and Verify Patient see request an RRP Successfully
    And I Click on Health Records and Lab Results details and Verify Patient see view Health Records and Lab Results Records
    Then I Click on Messages and Verify Patient see send and receive messages successfully

  @WEB @BEATING_THE_BLUES
  Scenario:S4-Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via Beating The Blues website -> start using Beating The Blues
    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    When I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions


  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref 3- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via MMH Portal -> start using Beating The Blues
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address                 | Password   |
      | &EMAIL FOR BTB_MMH_V2_PORTAL& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES
  Scenario:S5- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via MMH Portal -> start using Beating The Blues

    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When I Click on Book an Appointment and Verify Patient see book an appointment successfully
    And I Click on New Repeat Prescription and Verify Patient see request an RRP Successfully
    And I Click on Health Records and Lab Results details and Verify Patient see view Health Records and Lab Results Records
    Then I Click on Messages and Verify Patient see send and receive messages successfully

  @WEB @BEATING_THE_BLUES
  Scenario:S6- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via MMH Portal -> start using Beating The Blues
    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    When I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions

  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref 4- Self-register patient from MMH portal (not linked to Health centre) -> link to Health Centre -> enrol to Beating The Blues from MMH Portal
    Given As a  Self Registered user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address             | Password   |
      | &BTB_SELF_REGISTER_EMAIL& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES
  Scenario:S7- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via MMH Portal -> start using Beating The Blues

    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    Then I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions

  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref 5- Self-register patient from MMH portal (not linked to Health Centre) -> enrol to Beating The Blues from MMH Portal
    Given As a  Self Registered user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address              | Password   |
      | &BTB_SELF_REGISTER_EMAIL1& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES
  Scenario:S8- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via MMH Portal -> start using Beating The Blues

    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    Then I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions

  @WEB  @BEATING_THE_BLUES
  Scenario Template:Pref 6-Existing BTB provider -> Register New Client -> Client login to MMH Portal -> start using Beating The Blues
    Given As a  Self Registered user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the BTB Home Page
    Examples:
      | Email Address              | Password   |
      | &BTB_SELF_REGISTER_EMAIL2& | &PASSWORD& |

  @WEB @BEATING_THE_BLUES
  Scenario:S9- Existing MMH patient (linked to Health Centre) -> Enrol to Beating The Blues via MMH Portal -> start using Beating The Blues

    Given As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And click on My Health Centres option and verify Patient is Connected the Health centre
    And click on MyHealth Centres Option and Verify Patient is Subscribed to Beating the Blues
    When As a Existing user I am on MMH HomePage and I click the Beating the Blues Option
    And I click on Home Icon and Verify Patient can see Session Overview
    Then I click Session Overview icon from Home Page and Verify Patient can see all eight Sessions description
    And I Click Resume Session icon from Home page and Verify Patient can attended sessions

  @WEB  @BEATING_THE_BLUES1
  Scenario Template:Pref 1- Login Self Registered Patient through Beating the Blues Website

    Given As a Patient Self Registered user I am on BTB Website Login Page
    And I click on Create an Individual Account and Enter the BTB Self Registered form "<BTB_Self_Registered>"
    When I Navigate Gmail and click the Confirm your registration user is navigated to Manage My Health portal "<Gmail_Login_Details>"

    Examples:
      | BTB_Self_Registered         | Gmail_Login_Details |
      | &BTB_SELF_REGISTER_DETAILS& | &GMAIL_DETAILS&     |

























