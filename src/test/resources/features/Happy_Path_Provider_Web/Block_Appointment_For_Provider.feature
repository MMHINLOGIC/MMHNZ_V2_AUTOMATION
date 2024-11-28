Feature: Block_Appointment_For_Provider

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH11 @APPOINTMENTS_SETTING11
  Scenario Template:S1-Provider Block & Unblock Appointments doctor Name verify Patient Side Block & Unblock Appointment Provider Name Is Displayed or Not Displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Block Appointments for Provider and enter the all details"<Appointment_Details>" click save button then i see Setting saved successfully message
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When Navigate to Appointment in the left menu and click Book Appointments "<Appointment>"
    And I Should see Check Blocked provider is not displayed for Online Appointment "<Block_Appointment_Details>"
    And As a Provider I am on HomePage and navigate to Appointment Setting page
    Then Click Block link under status column in Blocked Appointments Grid "<Block_Appointment_Data>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And Navigate to Appointment in the left menu and click Book Appointments "<Appointment>"
    And I Should see Check Blocked provider is not displayed for Online Appointment "<Block_Appointment_Details>"

    Examples:
      | Appointment_Details | Appointment      | Block_Appointment_Details   | Block_Appointment_Data         |
      | &BLOCK_APPOINTMENT& | Book Appointment | &BLOCK_APPOINTMENT_DETAILS& | &BLOCK_APPOINTMENT_TABLE_DATA& |