Feature: Video Consultations Setting Page

#  Background:Pref- User Successfully logs in to the Provider Portal.
#
#    Given As a user I am on Provider Portal login Page
#    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
#    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
#    When As a user I am on Patient Portal login Page
#    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
#    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S1-Provider Enable Video Consultations No Button Check Video appointment slots are Not displayed in All tab

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking No button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are Not displayed in All tab

    Examples:
      | Location   | Appointment_Details      |
      | &LOCATION& | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S2-Provider Enable Video Consultations yes Button Check Video appointment slots are displayed in All tab

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking Yes button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are displayed in All tab

    Examples:
      | Location   | Appointment_Details      |
      | &LOCATION& | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S3-Provider Disable face to face appointment on a Video Consultation slot

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable face to face appointment on a Video Consultation slot by clicking No button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Detail then verify Book Appointment Popup is not Displayed "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Location   | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | &LOCATION& | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S4-Provider Enable face to face appointment on a Video Consultation slot

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable face to face appointment on a Video Consultation slot by clicking yes button and I click save button then I see Saved Successfully message"<Location>"
    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Detail "<Appointment_Details>"
    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    And I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Location   | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | &LOCATION& | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S5-Provider Enable OnDemand Video Consultations Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to OnDemand Video consultations Settings tab
    When I click Edit button to select OnDemand Video Consultations by clicking Yes button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S6-Provider Disable OnDemand Video Consultations Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to OnDemand Video consultations Settings tab
    When I click Edit button to select OnDemand Video Consultations by clicking No button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S7-Provider Enable SMS Video Invite Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to SMS Video Invite Settings tab
    When I click Edit button to select SMS Video Invite Settings by clicking Yes button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING @PROVIDER_SCRIPT3
  Scenario Template:S8-Provider Disable SMS Video Invite Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to SMS Video Invite Settings tab
    When I click Edit button to select SMS Video Invite Settings by clicking No button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |


    ###########################################################################################################################################################

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1-Provider Enable Video Consultations No Button Check Video appointment slots are Not displayed in All tab

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    And I enable Video Consultations by clicking No button and I click save button then I see Saved Successfully message"<Location>"

    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1-Provider Enable Video Consultations No Button Check Video appointment slots are Not displayed in All tab


    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are Not displayed in All tab

    Examples:
      | Appointment_Details      |
      | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2-Provider Enable Video Consultations yes Button Check Video appointment slots are displayed in All tab

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    Then I enable Video Consultations by clicking Yes button and I click save button then I see Saved Successfully message"<Location>"

    Examples:
      | Location   |
      | &LOCATION& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2-Provider Enable Video Consultations yes Button Check Video appointment slots are displayed in All tab

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment Page Enter the Video Appointments Details "<Appointment_Details>"
    Then I should see Video appointment slots are displayed in All tab

    Examples:
      | Appointment_Details      |
      | &BOOK_VIDEO_APPOINTMENT& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S3-Provider Disable face to face appointment on a Video Consultation slot

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    And I enable face to face appointment on a Video Consultation slot by clicking No button and I click save button then I see Saved Successfully message"<Location>"


    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S3-Provider Disable face to face appointment on a Video Consultation slot

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Detail then verify Book Appointment Popup is not Displayed "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    Then I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
      | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
      | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S4-Provider Enable face to face appointment on a Video Consultation slot

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    Then I enable face to face appointment on a Video Consultation slot by clicking yes button and I click save button then I see Saved Successfully message"<Location>"


    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S4-Provider Enable face to face appointment on a Video Consultation slot


    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment Page Enter the Video Appointments Detail "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I accept the terms & conditions and confirm my booking
    Then I should see booked appointment displayed under the future tab "<Appointment_Summary>"

    Examples:
     | Appointment_Details      | Details_For_Appointment     | Future_Date   | Appointment_Summary         |
     | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &VIDEO_APPOINTMENT_SUMMARY& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1  @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S5-Provider Enable OnDemand Video Consultations Settings

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    And I navigate to OnDemand Video consultations Settings tab
    When I click Edit button to select OnDemand Video Consultations by clicking Yes button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S6-Provider Disable OnDemand Video Consultations Settings

    Given As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I navigate to OnDemand Video consultations Settings tab
    When I click Edit button to select OnDemand Video Consultations by clicking No button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S7-Provider Enable SMS Video Invite Settings

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    And I navigate to SMS Video Invite Settings tab
    When I click Edit button to select SMS Video Invite Settings by clicking Yes button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |


  @WEB @PROVIDER_HAPPY_PATH @VIDEO_CONSULTATIONS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S8-Provider Disable SMS Video Invite Settings

    Given As a Provider I am on HomePage navigate to Video Consultations Setting page
    And I navigate to SMS Video Invite Settings tab
    When I click Edit button to select SMS Video Invite Settings by clicking No button "<details>"
    Then I click save button should see saved successfully Message

    Examples:
      | details                    |
      | &VIDEO_CONSULTATIONS_DATA& |



