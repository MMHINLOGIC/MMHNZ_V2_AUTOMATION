Feature: Setup_Services

#  Background:Pref- User Successfully logs in to the Provider Portal
#
#    Given As a user I am on Provider Portal login Page
#    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
#    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
#    When As a user I am on Patient Portal login Page
#    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
#    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S1- Provider Add New Service (Initiated by Clinical and applies to Staff)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services all details "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S2- Provider Add New Service (Initiated by Clinical and applies to Patient)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Patient radio button "<Setup_Service>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Message Details>" to compose an email
    When I Click Send Message Button
    And I navigate to provider portal and verify the Patient message "<Message>"
    Examples:
      | Setup_Modules    | Setup_Service        | Message Details           | Message                   |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &COMPOSE_MESSAGE_DETAILS& | &PATIENT_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S3-Provider Add New Service (Initiated by Non-Clinical and applies to Patient)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Non Clinical "<Setup_Service>"
    When As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Message Details>" to compose an email
    Then I Click Send Message Button
    And I navigate to provider portal and verify the Patient message "<Message>"


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details           | Message                   |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &COMPOSE_MESSAGE_DETAILS& | &PATIENT_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S4- Provider Add New Service (Initiated by Non-Clinical and applies to Staff)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Non Clinical to Patient Staff "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |


  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S5- Provider  Allow Patient to Reply
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services all details "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to provider "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    And I Click Reply button and Send Reply message to provider "<Reply Message>"
    And As a user I am on Doctor portal homepage and Navigate to Provider inbox "<Reply Message>"
    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           | Reply Message              |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S6- Provider Do Not Allow Patient to Reply
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Do Not Allow to patient to Reply  "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"
    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    And I Click Reply button and verify Excepted Message Displayed

    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES
  Scenario Template: S7 -Provider Restrict to patient default location
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Restrict to patient default location "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to provider "<Message Details>"
    When As a Existing user I am on HomePage and navigate to Patient Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox

    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            | Message           |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& | &MESSAGE_DETAILS& |

    ##################################################################################################################################################################################################################





  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S1- Provider Add New Service (Initiated by Clinical and applies to Staff)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services all details "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to patient "<Message Details>"


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S1- Provider Add New Service (Initiated by Clinical and applies to Staff)

    And As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox

    Examples:
      | Message           |
      | &MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |


  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S2- Provider Add New Service (Initiated by Clinical and applies to Patient)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Patient radio button "<Setup_Service>"

    Examples:
      | Setup_Modules    | Setup_Service        |
      | Secure Messaging | &SETUP_SERVICE_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S2- Provider Add New Service (Initiated by Clinical and applies to Patient)

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Message Details>" to compose an email
    When I Click Send Message Button

    Examples:
      | Message Details           |
      | &COMPOSE_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S2- Provider Add New Service (Initiated by Clinical and applies to Patient)

    Given I navigate to provider portal and verify the Patient message "<Message>"
    Examples:
      | Message                   |
      | &PATIENT_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S3-Provider Add New Service (Initiated by Non-Clinical and applies to Patient)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    Then I click the Add new Button then select the setup services Non Clinical "<Setup_Service>"

    Examples:
      | Setup_Modules    | Setup_Service        |
      | Secure Messaging | &SETUP_SERVICE_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S3-Provider Add New Service (Initiated by Non-Clinical and applies to Patient)

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Message Details>" to compose an email
    When I Click Send Message Button



    Examples:
      | Message Details           |
      | &COMPOSE_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S3-Provider Add New Service (Initiated by Non-Clinical and applies to Patient)

    Given I navigate to provider portal and verify the Patient message "<Message>"


    Examples:
      | Message                   |
      | &PATIENT_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S4- Provider Add New Service (Initiated by Non-Clinical and applies to Staff)
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    When I click the Add new Button then select the setup services Non Clinical to Patient Staff "<Setup_Service>"
    Then I click Provider Inbox Button then create a compose message to patient "<Message Details>"

    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S4- Provider Add New Service (Initiated by Non-Clinical and applies to Staff)

    And As a Existing user I am on HomePage and navigate to Compose Message
    When As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox
    Examples:
      | Message           |
      | &MESSAGE_DETAILS& |


  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S5- Provider  Allow Patient to Reply
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services all details "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to provider "<Message Details>"

    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& |


  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S5- Provider  Allow Patient to Reply

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    When I verify received Message "<Message>" in the Patient Inbox
    Then I Click Reply button and Send Reply message to provider "<Reply Message>"

    Examples:
      | Message           | Reply Message              |
      | &MESSAGE_DETAILS& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |


  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S5- Provider  Allow Patient to Reply

    Given As a user I am on Doctor portal homepage and Navigate to Provider inbox "<Reply Message>"
    Examples:
      | Reply Message              |
      | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S6- Provider Do Not Allow Patient to Reply
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Do Not Allow to patient to Reply  "<Setup_Service>"
    Then I click Provider Inbox Button then create a compose message to patient "<Message Details>"


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details                          |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &SETUP_SERVICE_RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S6- Provider Do Not Allow Patient to Reply

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And As a user I am on HomePage and navigate to Inbox
    When I verify received Message "<Message>" in the Patient Inbox
    Then I Click Reply button and verify Excepted Message Displayed

    Examples:
      | Message           |
      | &MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |


  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S7 -Provider Restrict to patient default location
    Given As a Provider I am on HomePage and navigate to Setup services in "<Setup_Modules>"
    And I click the Add new Button then select the setup services Restrict to patient default location "<Setup_Service>"
    When I click Provider Inbox Button then create a compose message to provider "<Message Details>"


    Examples:
      | Setup_Modules    | Setup_Service        | Message Details            |
      | Secure Messaging | &SETUP_SERVICE_DATA& | &RECEIVED_MESSAGE_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB  @PROVIDER_HAPPY_PATH @PROVIDER_SETUP_SERVICES1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: S7 -Provider Restrict to patient default location

    When As a Existing user I am on HomePage and navigate to Patient Compose Message
    And As a user I am on HomePage and navigate to Inbox
    Then I verify received Message "<Message>" in the Patient Inbox

    Examples:
      | Message           |
      | &MESSAGE_DETAILS& |




