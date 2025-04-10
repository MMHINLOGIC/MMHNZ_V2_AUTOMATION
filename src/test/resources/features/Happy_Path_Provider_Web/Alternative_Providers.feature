Feature: Appointment Reminder Setting Page

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER @PROVIDER_SCRIPT1
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER @PROVIDER_SCRIPT1
  Scenario Template:S1- Enable Alternative Providers

    Given As a Provider I am on HomePage and navigate to Alternative Provider page
    And I click Edit button Enable alternative provider details page and verify changed saved successfully Popup "<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And Verify Alternative Provider option displayed "<Appointment_Details>"

    Examples:
      | Location   | Appointment_Details      |
      | &LOCATION& | &BOOK_VISIT_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER @PROVIDER_SCRIPT1
  Scenario Template:S2- Disable Alternative Providers

    Given As a Provider I am on HomePage and navigate to Alternative Provider page
    And I click Edit button Disable alternative provider details page and verify changed saved successfully Popup "<Location>"
    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And Verify Alternative Provider option Not displayed "<Appointment_Details>"

    Examples:
      | Location   | Appointment_Details      |
      | &LOCATION& | &BOOK_VISIT_APPOINTMENT& |

