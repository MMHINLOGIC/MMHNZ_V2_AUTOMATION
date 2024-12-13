Feature: Turn_Off_Online_Appointment

  Background:Pref- User Successfully logs in to the Provider Portal

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @TURN_OFF_ONLINE_APPOINTMENT @PROVIDER_SCRIPT2
  Scenario Template:S1-Provider Turn Off Online Appointments verify No Available appointment slot Text is displayed in Appointment Page

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
    And I Log Out from Provider and Search for Health Centre Verify Online Appointment is not displayed for Easy booking"<Location1>"and"<Provider_Login>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
    Examples:
      | Location   | Provider_Login           | Appointment_Details      | Appointment      | Location1  |
      | &LOCATION& | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment | Automation |


  @WEB @PROVIDER_HAPPY_PATH @TURN_OFF_ONLINE_APPOINTMENT @PROVIDER_SCRIPT2
  Scenario Template:S2-Provider Turn on Online Appointments verify Available appointment slot Text is displayed in Appointment Page

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I navigate to Turn On Online Appointments "<Location>" and Enable turn-on online appointments checkbox click save button then I see turned-off Message
    And I Log Out from Provider and Search for Health Centre Verify Online Appointment Slot is displayed for Easy booking"<Location1>"and"<Provider_Login>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
    Examples:
      | Location   | Provider_Login           | Appointment_Details      | Appointment      | Location1  |
      | &LOCATION& | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment | Automation |