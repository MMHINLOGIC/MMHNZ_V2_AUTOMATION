Feature: Appointment Reminder Setting Page

#  Background:Pref- User Successfully logs in to the Provider Portal.
#
#    Given As a user I am on Provider Portal login Page
#    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
#    And I click SignIn button then I should see user successfully logs in to the MMH portal
#    When As a user I am on Patient Portal login Page
#    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
#    Then I click SignIn button then I should see user successfully logs in to the MMH portal

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

    #################################################################################################################################################################



  @WEB @ALTERNATIVE_PROVIDER1 @PROVIDER_HAPPY_PATH @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

  @WEB @ALTERNATIVE_PROVIDER1 @PROVIDER_HAPPY_PATH @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1- Enable Alternative Providers

    Given As a Provider I am on HomePage and navigate to Alternative Provider page
    And I click Edit button Enable alternative provider details page and verify changed saved successfully Popup "<Location>"


    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @ALTERNATIVE_PROVIDER1 @PROVIDER_HAPPY_PATH @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1- Enable Alternative Providers

    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And Verify Alternative Provider option displayed "<Appointment_Details>"

    Examples:
      | Appointment_Details      |
      | &BOOK_VISIT_APPOINTMENT& |

  @WEB @ALTERNATIVE_PROVIDER1 @PROVIDER_HAPPY_PATH @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2- Disable Alternative Providers

    Given As a Provider I am on HomePage and navigate to Alternative Provider page
    And I click Edit button Disable alternative provider details page and verify changed saved successfully Popup "<Location>"

    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @ALTERNATIVE_PROVIDER1 @PROVIDER_HAPPY_PATH @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB @PROVIDER_HAPPY_PATH @ALTERNATIVE_PROVIDER1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2- Disable Alternative Providers

    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select any provider with any Location
    And Verify Alternative Provider option Not displayed "<Appointment_Details>"

    Examples:
      | Appointment_Details      |
      | &BOOK_VISIT_APPOINTMENT& |
