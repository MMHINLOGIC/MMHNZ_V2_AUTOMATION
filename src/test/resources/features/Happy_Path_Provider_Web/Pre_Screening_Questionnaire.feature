Feature: Pre Screening Questionnaire

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @PRE_SCREENING_QUESTIONNAIRE @PROVIDER_SCRIPT1
  Scenario Template:S1- Add Appointment Reason

    Given As a Provider I am on HomePage and navigate to Pre Screening Questionnaire page
    And I select Health center"<HealthCentre>" and Location"<Location>"
    When I Enter Pre-Screening Information to be displayed while booking appointment"<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to the "<Appointment>" page
    Then I select "<HealthCentre>" and "<Location>" and verify the Covid Pre-Screening popup is displayed
    Examples:
      | HealthCentre | Location                           | Appointment      |
      | &LOCATION&   | &PRE_SCREENING_QUESTIONNAIRE_DATA& | Book Appointment |