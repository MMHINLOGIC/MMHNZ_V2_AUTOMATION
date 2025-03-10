Feature: Appointment Reason

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REASON
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REASON
  Scenario Template:S1- Add Appointment Reason

    Given As a Provider I am on HomePage and navigate to Appointment Reason page
    And Verify health Centre "<Location>" and default reason list is displayed with edit and delete option
    And I Enter the new reason in the appointment reason textbox "<Data>"
    When click on Save Button & verify new reason got added in the list "<Data>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to the "<Appointment>" page
    Then I enter the visit appointment details "<Appointment_Details>" & verify Appointment Reason "<Data>"
    And I should see details of created appointment Reason "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Location   | Appointment_Details      | Data          | Appointment      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | &LOCATION& | &BOOK_VISIT_APPOINTMENT& | &REASON_DATA& | Book Appointment | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REASON
  Scenario Template:S2- Edit Appointment Reason

    Given As a Provider I am on HomePage and navigate to Appointment Reason page
    And Verify health Centre "<Location>" and default reason list is displayed with edit and delete option
    And I click edit icon "<Data>" Update the new reason in the appointment reason textbox "<Upadte_Data>"
    When click on Update Button & verify Update reason got added in the list "<Upadte_Data>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to the "<Appointment>" page
    Then I enter the visit appointment details "<Appointment_Details>" & verify Appointment Reason "<Data>"
    And I should see details of created appointment Reason "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Location   | Appointment_Details      | Upadte_Data          | Appointment      | Details_For_Appointment     | Future_Date   | Appointment_Summary         | Data          |  |
      | &LOCATION& | &BOOK_VISIT_APPOINTMENT& | &UPADTE_REASON_DATA& | Book Appointment | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& | &REASON_DATA& |  |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_REASON
  Scenario Template:S3- Delete Appointment Reason

    Given As a Provider I am on HomePage and navigate to Appointment Reason page
    And Verify health Centre "<Location>" and default reason list is displayed with edit and delete option
    And I Enter the new reason in the appointment reason textbox "<Data>"
    When click on Save Button & verify new reason got added in the list "<Data>"
    And I click Delete icon select yes to delete and verify deleted reason is not updated in the list "<Data>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to the "<Appointment>" page
    Then I enter the visit appointment details "<Appointment_Details>" & verify Appointment Reason "<Data>"
    And I should see details of created appointment Reason "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Location   | Appointment_Details      | Data          | Appointment      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | &LOCATION& | &BOOK_VISIT_APPOINTMENT& | &REASON_DATA& | Book Appointment | &VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VISIT_APPOINTMENT_SUMMARY& |
