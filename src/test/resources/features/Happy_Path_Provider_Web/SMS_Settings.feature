Feature: SMS Setting
#
#  Background:Pref- User Successfully logs in to the Provider Portal.
#
#    Given As a user I am on Provider Portal login Page
#    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
#    And I click SignIn button then I should see user successfully logs in to the MMH portal
#    When As a user I am on Patient Portal login Page
#    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
#    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @SMS_SETTING @PROVIDER_SCRIPT2
  Scenario Template:S1 - Enable -SMS Settings in secure Message

    Given As a Provider I am on HomePage and navigate to SMS Setting page
    And I click Edit button select the Health center "<Location>" and select Module Dropdown
    When I select Enable secure Messaging SMS yes radio button and click save button see Saved Successfully Popup
    And I click Inbox navigate to Compose screen verify the SMS Tab Displayed
    Then I should see SMS info message displayed


    Examples:
      | Location       |  |
      | &SMS_LOCATION& |  |

  @WEB @PROVIDER_HAPPY_PATH @SMS_SETTING @PROVIDER_SCRIPT2
  Scenario Template:S1 - Disable -SMS Settings in secure Message

    Given As a Provider I am on HomePage and navigate to SMS Setting page
    And I click Edit button select the Health center "<Location>" and select Module Dropdown
    When I select Enable secure Messaging SMS No radio button and click save button see Saved Successfully Popup
    And I click Inbox navigate to Compose screen verify the SMS Tab Displayed
    Then I should see SMS info message displayed


    Examples:
      | Location       |  |
      | &SMS_LOCATION& |  |


    ###########################################################################################################################################

  @WEB @PROVIDER_HAPPY_PATH @SMS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |



  @WEB @PROVIDER_HAPPY_PATH @SMS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1 - Enable -SMS Settings in secure Message

    Given As a Provider I am on HomePage and navigate to SMS Setting page
    And I click Edit button select the Health center "<Location>" and select Module Dropdown
    When I select Enable secure Messaging SMS yes radio button and click save button see Saved Successfully Popup
    Given I click Inbox navigate to Compose screen verify the SMS Tab Displayed
    Then I should see SMS info message displayed

    Examples:
      | Location       |
      | &SMS_LOCATION& |


  @WEB @PROVIDER_HAPPY_PATH @SMS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |



  @WEB @PROVIDER_HAPPY_PATH @SMS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2 - Disable -SMS Settings in secure Message

    Given As a Provider I am on HomePage and navigate to SMS Setting page
    And I click Edit button select the Health center "<Location>" and select Module Dropdown
    When I select Enable secure Messaging SMS No radio button and click save button see Saved Successfully Popup
    Given I click Inbox navigate to Compose screen verify the SMS Tab Displayed
    Then I should see SMS info message displayed

    Examples:
      | Location       |
      | &SMS_LOCATION& |





