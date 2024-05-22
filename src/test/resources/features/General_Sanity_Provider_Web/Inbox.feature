Feature: Inbox


  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the V2UAT Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |




  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S2- Patient Sending Message

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Compose Details>" to compose an email
    When I Click Send Message Button
    Then I should see message sent Successfully popup
    And I navigate to Patient Sent items and verify the Sent "<Compose Details>"
    And I move the Sent Message into Archive and verify the Archive "<Message>"
    And I move Archive Message into sent Items and Verify the Sent "<Message>"
    And I log out from Patient Portal

    Examples:
      | Compose Details   | Message           |
      | &COMPOSE_MESSAGE& | &COMPOSE_MESSAGE& |



  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S3- User successfully login into Doctor Portal

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address      | Password              |
      | &URL&     | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |


  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S3- Preparation for Received Message

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And As I enter the Compose "<Message Details>"
    When I Click the send message and verify success pop up
    Then I navigate to Sent items and verify the Sent "<Message Details>"
    And I log out from Doctor Portal

    Examples:
      | Message Details        |
      | &SENT_MESSAGE_DETAILS& |

  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S3- User Successfully logs in to the V2UAT Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

#    Note: {
#    49:Received messages must be displayed under Inbox
#    50:Move messages in inbox to archive by clicking on move to archive for specific message
#    These test Case Covered The Scenario NO: S3
#  }
  @WEB @MESSAGES @SANITY_PATH
  Scenario Outline: S3- User verify the Received Message and move the Received Message into Archive
    Given As a user I am on HomePage and navigate to Inbox
    When I verify received "<Message>" in the Patient Inbox
#    Then I download the attachment file and delete the downloaded attachment file
    And I move the Received "<Message>" into Archive
    Examples:
      | Message                |
      | &SENT_MESSAGE_DETAILS& |


  @WEB @MESSAGES @SANITY_PATH
  Scenario: S4- User Select Multiple message in Inbox and Click Mark as Unread
    Given As a user I am on HomePage and navigate to Inbox
    And I Select multiple messages in the Inbox
    When I Click Mark as UnRead
    Then I should verify the UnRead Messages

  @WEB @MESSAGES @SANITY_PATH
  Scenario: S5- User Select Multiple message in Inbox and Click Mark as Read
    Given As a user I am on HomePage and navigate to Inbox
    And I Select multiple messages in the Inbox
    When I Click Mark as Read
    Then I should verify the Read Messages



  @WEB @MESSAGES @SANITY_PATH
  Scenario: S6- User Select Multiple message in Inbox and Click Move into Archive
    Given As a user I am on HomePage and navigate to Inbox
    And I Select multiple messages in the Inbox
    When I Click Archive
    Then I should see the Archive Success Pop message


  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S7- Patient Save Message as Draft

    Given As a Existing user I am on HomePage and navigate to Compose Message
    And I enter the "<Details>" to compose an email
    When I Click Draft Message Button
    Then I should see message Drop Successfully popup
    And I navigate to Patient Draft items and verify the Draft "<Details>"
    And I Click Delete All under draft
    And I log out from Patient Portal

    Examples:
      | Details         |
      | &DRAFT_MESSAGE& |


  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S8- User successfully login into Doctor Portal

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | V1 Portal | Email Address      | Password              |
      | &URL&     | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |


  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S8- Patient Group Message

    Given As a user I am on Doctor portal homepage and Navigate to GroupMessage
    When I enter the Compose GroupMessage "<Message Details>"
    Then I send the group message to the patient users
    And I log out from Doctor Portal

    Examples:
      | Message Details              |
      | &SENT_GROUP_MESSAGE_DETAILS& |

  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S8- User Successfully logs in to the V2UAT Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |



  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S8-  Patient Group Message
    Given As a user I am on HomePage and navigate to GroupMessage
    And I verify the provider sent Group"<Message>"
#    And I move the Received Group "<Message>" into Archive

    Examples:
      | Message                      |
      | &SENT_GROUP_MESSAGE_DETAILS& |


  @WEB @MESSAGES @SANITY_PATH
  Scenario Outline: S9- Patient Signature Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Signature Setting and Enter the "<Signature Message>"
    When I click the Save Button
    Then I Should see the Signature Based on "<Signature Message>" entered and signature must get auto populated in Compose mail
    Examples:
      | Signature Message   |
      | &SIGNATURE MESSAGE& |


  @WEB @MESSAGES @SANITY_PATH
  Scenario Outline: S10- Patient Automatic Reply Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Automatic Replies Settings and Enable Replies Settings option
    And I Enter the Automatic Replies "<Message>"
    When I click the Save Button
    Then I Should Verify the Automatic Replies "<Message>"
    And I log out from Patient Portal
    Examples:
      | Message                   |
      | &AUTOMATIC REPLY MESSAGE& |

  @WEB  @MESSAGES @SANITY_PATH
  Scenario Template: S10- User successfully login into Doctor Portal

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address      | Password              |
      | &URL&     | &EMAIL FOR DOCTOR& | &PASSWORD FOR DOCTOR& |



  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S10- Patient verifies the Automatic Reply Messages.

    Given As a user I am on Doctor portal homepage and Navigate to Compose in Inbox module
    And I enter the Compose Mail"<Message Details>"
    When I Click the send message and verify success pop up
    Then I Should verify the Patient "<Automatic Reply Message>" in the Inbox
    And I log out from Doctor Portal

    Examples:
      | Message Details             | Automatic Reply Message |
      | &AUTOMATIC_MESSAGE_DETAILS& | &VERIFY_DATA_FOR_ARM&   |

  @WEB @MESSAGES @SANITY_PATH
  Scenario Template: S11- User Successfully logs in to the V2UAT Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @MESSAGES @SANITY_PATH1
  Scenario Outline: S11- Patient Out Of Office Settings
    Given As a user I am on HomePage and navigate to Messages Setting
    And I click the Out of Office Settings and Enable Out Of Office Reply option
    And I select the Out of office "<Start Date>" and "<End Date>" and Enter the"<Message>"
    When I click the Save Button
    Then I Should Verify the Out Of Office Reply "<Message>"
    And I Disable Out of Setting
    Examples:
      | Start Date   | End Date   | Message          |
      | &START DATE& | &END DATE& | &OUT OF MESSAGE& |










