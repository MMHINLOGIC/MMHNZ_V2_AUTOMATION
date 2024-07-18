Feature: Beating_The_Blues


  @WEB  @BEATING_THE_BLUES_PROVIDER
  Scenario Template:Pref 1- Login Self Registered Provider through Beating the Blues Website

    Given As a Self Registered user I am on BTB Website Login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the Provider BTB Portal
    Examples:
      | Email Address                          | Password   |
      | &EMAIL_FOR_BTB_SELF_REGISTER_PROVIDER& | &PASSWORD& |


  @WEB  @BEATING_THE_BLUES_PROVIDER
  Scenario Template:S1- New provider (Not enrolled to MMH) -> Self-registered via Beating The Blues website -> start using Beating The Blues

    Given As a Self Registered user I am on Provider BTB Home Page and Verify the BTB Left Menu
    And I click on Home Icon and Verify the Provider BTB Home Page Menu
    And I click on Home Icon and Verify the Provider BTB Home Page Dashboard Icons
    When I click on Search clients and Verify the Respective user details "<Search_Client_Details>"
    And I click on Register New Client and Enter the register New Client Details "<Register_New_Client_Details>"
    And  I click on Resources Page and Verify the user can able to view details
    And I click on Progress Reports and Verify the Live progress report Page
    And I click on usage Reports and verify Beating the Blues usage Reports Page
    Then I click Setting options and verify the user can be able to enter the secondary Email Address
    And I click on MMH Dashboard option nad verify the Respective user card Details "<Dashboard_details>"


    Examples:
      | Search_Client_Details | Register_New_Client_Details        |
      | &SEARCH_CLIENT&       | &NEW_PROVIDER_REGISTER_NEW_CLIENT& |

  @WEB  @BEATING_THE_BLUES_PROVIDER
  Scenario Template:Pref 2- Login Existing MMH Provider through Beating the Blues Website

    Given As a Self Registered user I am on BTB Website Login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the Provider BTB Portal
    Examples:
      | Email Address                         | Password   |
      | &EMAIL_FOR_BTB_EXISTING_MMH_PROVIDER& | &PASSWORD& |


  @WEB  @BEATING_THE_BLUES_PROVIDER
  Scenario Template:S2- Existing MMH provider (linked to Health Centre) -> Register to Beating The Blues via Beating The Blues website -> start using Beating The Blues

    Given As a Self Registered user I am on Provider BTB Home Page and Verify the BTB Left Menu
    And I click on Home Icon and Verify the Provider BTB Home Page Menu
    And I click on Home Icon and Verify the Provider BTB Home Page Dashboard Icons
    When I click on Search clients and Verify the Respective user details "<Search_Client_Details>"
    And  I click on Resources Page and Verify the user can able to view details
    And I click on Progress Reports and Verify the Live progress report Page
    And I click on Existing MMH usage Reports and verify Beating the Blues usage Reports Page
    Then I click Setting options and verify the user can be able to enter the secondary Email Address
    And I click on MMH Dashboard option nad verify the Respective user card Details "<Dashboard_details>"

    Examples:
      | Search_Client_Details    |
      | &EXISTING_SEARCH_CLIENT& |

  @WEB  @BEATING_THE_BLUES_PROVIDER
  Scenario Template:Pref 3- Login Existing MMH Provider through Beating the Blues Website

    Given As a Existing MMH Provider user I am on BTB Website Login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the Existing Provider BTB Portal
    Examples:
      | Email Address                         | Password   |
      | &EMAIL_FOR_BTB_EXISTING_MMH_PROVIDER& | &PASSWORD& |

  @WEB  @BEATING_THE_BLUES_PROVIDER
  Scenario Template:S3- Existing MMH provider (linked to Health Centre) -> Register to Beating The Blues via MMH Portal -> start using Beating The Blues

    Given As a Existing MMH Provider user I am on Provider BTB Home Page and Verify the BTB Left Menu
    And I click on Home Icon and Verify the Provider BTB Home Page Menu
    And I click on Home Icon and Verify the Provider BTB Home Page Dashboard Icons
    When I click on Search clients and Verify the Respective user details "<Search_Client_Details>"
    And  I click on Resources Page and Verify the user can able to view details
    And I click on Progress Reports and Verify the Live progress report Page
    And I click on Existing MMH usage Reports and verify Beating the Blues usage Reports Page
    Then I click Setting options and verify the user can be able to enter the secondary Email Address
    And I click on MMH Dashboard option nad verify the Respective user card Details "<Dashboard_details>"

    Examples:
      | Search_Client_Details    | Dashboard_details |
      | &EXISTING_SEARCH_CLIENT& |                   |










