Feature: Turn_Off_Appointment_Audit

  Background:Pref- User Successfully logs in to the Provider Portal

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S1-Provider View Turn Off Appointments Audit verify Check Turn Off Appointments audit grid displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
    When I navigate to Turn Off Appointment Audit page
    Then I Should see Turn Off Appointments audit details displayed grid view "<Appointments_Audit_Details>"

    Examples:
      | Location   | Appointments_Audit_Details |
      | &LOCATION& | &APPOINTMENT_AUDIT_DATA&   |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
  Scenario Template:S2-Provider View Turn On Appointments Audit verify Check Turn On Appointments audit grid view displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn On Online Appointments "<Location>" and Enable turn-On online appointments checkbox click save button then I see turned-On Message
    When I navigate to Turn Off Appointment Audit page
    Then I Should see Turn On Appointments audit details displayed grid view "<Appointments_Audit_Details>"
    Examples:
      | Location   | Appointments_Audit_Details |
      | &LOCATION& | &APPOINTMENT_AUDIT_DATA&   |
