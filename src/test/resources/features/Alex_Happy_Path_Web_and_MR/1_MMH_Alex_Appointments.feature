Feature: Appointments

  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @Mobile @ALEX_APPOINTMENTS1 @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1 @REVAMP
  Scenario Template: User Successfully logs in to the MMH Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address    | Password   |
      | &EMAIL_CSC_CARD& | &PASSWORD& |

  @WEB @Mobile @ALEX_APPOINTMENTS1 @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @REVAMP
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on Patient HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1
  Scenario Template: S1 - Patient Booking Appointment - Visit Appointment

    Given As a user I am on Patient HomePage
    And I navigate to the "<Appointment>" page
    And I enter the Alex visit appointment details click My usual Doctor Flow "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"
#    And I logout from the application

    Examples:
      | Appointment      | Appointment_Details                    | Details_For_Appointment          | Appointment_Summary              | Future_Date   |
      | Book Appointment | &BOOK_FLEXIBLE_SLOT_VISIT_APPOINTMENT& | &ALEX_VISIT_APPOINTMENT_DETAILS& | &ALEX_VISIT_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |

  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1
  Scenario Template: S2 - Patient Booking Appointment - Video Appointment - 0 Payment

    Given As a user I am on Patient HomePage
    And I navigate to the "<Appointment>" page
    And I enter the Alex video appointment details click By Doctor flow "<Appointment_Details>"
    When I click confirm button "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm your booking now
    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment      | Appointment_Details                    | Details_For_Appointment     | Appointment_Summary              | Future_Date   |
      | Book Appointment | &BOOK_FLEXIBLE_SLOT_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &ALEX_VIDEO_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |


  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1 @REVAMP
  Scenario Template: S3 - Patient Booking Appointment - Phone Appointment

    Given As a user I am on Patient HomePage
    And I navigate to the "<Appointment>" page
    And I enter the Alex phone appointment details click By earliest available flow "<Appointment_Details>"
    When I click Book button "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"


    Examples:
      | Appointment      | Appointment_Details                    | Details_For_Appointment          | Appointment_Summary              | Future_Date  |
      | Book Appointment | &BOOK_FLEXIBLE_SLOT_PHONE_APPOINTMENT& | &ALEX_PHONE_APPOINTMENT_DETAILS& | &ALEX_PHONE_APPOINTMENT_SUMMARY& | &TODAY_DATE& |


  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @REVAMP
  Scenario Template: S4 - Patient Booking Appointment - Using Card Payment

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" page
    And I enter the Alex In-person appointment details click By By location flow "<Appointment_Details>"
    When I click confirm button "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking using Paynow



    Examples:
      | Appointment      | Appointment_Details                                | Details_For_Appointment          | Appointment_Summary              | Future_Date   |
      | Book Appointment | &BOOK_FLEXIBLE_SLOT_VISIT_APPOINTMENT_BY_LOCATION& | &ALEX_VISIT_APPOINTMENT_DETAILS& | &ALEX_VISIT_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |

  @WEB @APP @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @REVAMP
  Scenario Template: S5 - Patient Booking Appointment - Using Card Payment

    And I see page navigated to the payment option
    When I enter the card details and confirm payment "<Payment_Details>"
    Then I should see online payment has been processed successfully with appointment details
    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Payment_Details | Appointment_Summary              |
      | &CARD_DETAILS&  | &ALEX_VISIT_APPOINTMENT_SUMMARY& |

  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1 @REVAMP
  Scenario Template: S1 - Patient Booking Appointment - Visit Appointment - CSC Card

    Given As a user I am on Patient HomePage
    And I navigate to the "<Appointment>" page
    And I enter the Alex visit appointment details click My usual Doctor Flow "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"
#    And I logout from the application

    Examples:
      | Appointment      | Appointment_Details                    | Details_For_Appointment          | Appointment_Summary              | Future_Date   |
      | Book Appointment | &BOOK_FLEXIBLE_SLOT_VISIT_APPOINTMENT& | &ALEX_VISIT_APPOINTMENT_DETAILS& | &ALEX_VISIT_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |


  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @REVAMP
  Scenario Template: S6 - Patient Cancel Appointment

    And I navigate to the "<Appointment>" Future Appointments page
    And I click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I enter reason to cancel appointment
    When I click cancel your appointment button
    Then I should see Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Appointment           | Appointment_Cancel_Button        | Appointment_After_Cancel              |
      | Upcoming Appointments | &APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |

  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1 @REVAMP
  Scenario Template: User Successfully logs in to the MMH Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address     | Password   |
      | &EMAIL_HUHC_CARD& | &PASSWORD& |

  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1 @REVAMP
  Scenario Template: S1 - Patient Booking Appointment - Visit Appointment - HUSC Card

    Given As a user I am on Patient HomePage
    And I navigate to the "<Appointment>" page
    And I enter the Alex visit appointment details click My usual Doctor Flow "<Appointment_Details>"
    When I click confirm button
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"
#    And I logout from the application

    Examples:
      | Appointment      | Appointment_Details                    | Details_For_Appointment          | Appointment_Summary              | Future_Date   |
      | Book Appointment | &BOOK_FLEXIBLE_SLOT_VISIT_APPOINTMENT& | &ALEX_VISIT_APPOINTMENT_DETAILS& | &ALEX_VISIT_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |
#
#  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1
#  Scenario Template: S3 - Patient Booking Appointment - Visit in video slot Appointment
#
#    Given As a user I am on HomePage
#    And I navigate to the "<Appointment>" page
#    And I enter the Flexible Slot video appointment details "<Appointment_Details>"
#    When I click confirm button "<Appointment_Details>"
#    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
#    And I accept the terms & conditions and confirm my booking
#    And I should see booked Flexible Slot appointment displayed under the future tab "<Appointment_Summary>"
#
#    Examples:
#      | Appointment      | Appointment_Details                             | Details_For_Appointment              | Appointment_Summary                  | Future_Date   |
#      | Book Appointment | &BOOK_FLEXIBLE_SLOT_VISIT_IN_VIDEO_APPOINTMENT& | &VISIT_IN_VIDEO_APPOINTMENT_DETAILS& | &VISIT_IN_VIDEO_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |
#
#
#  @WEB @Mobile @ALEX_APPOINTMENTS @ALEX_HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE1
#  Scenario Template: S4 - Patient Booking Appointment - Phone Appointment
#
#    Given As a user I am on HomePage
#    And I navigate to the "<Appointment>" page
#    And I enter the Flexible Slot phone appointment details "<Appointment_Details>"
#    When I click confirm button
#    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
#    And I accept the terms & conditions and confirm my booking
#    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"
#
#    Examples:
#      | Appointment      | Appointment_Details      | Details_For_Appointment     | Appointment_Summary         | Future_Date   |
#      | Book Appointment | &BOOK_PHONE_APPOINTMENT& | &PHONE_APPOINTMENT_DETAILS& | &PHONE_APPOINTMENT_SUMMARY& | &FUTURE_DATE& |