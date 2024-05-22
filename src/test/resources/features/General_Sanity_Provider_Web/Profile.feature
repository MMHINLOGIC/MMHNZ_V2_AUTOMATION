Feature: Profile

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal



  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S1- Existing Patient change the password.

    Given As a Existing user I am on HomePage and I navigate to change password in the My Profile
    And I enter the "<Current Password>" and New "<Password>"
    When I click Update Button
    Then I should see the Password changed Success Popup
#    And I log out from Patient Portal

    Examples:
      | Current Password       | Password                   |
      | &PASSWORD_FOR_PROFILE& | &NEW_PASSWORD_FOR_PROFILE& |



  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S2- Existing Patient change the Address.

    Given As a Existing user I am on HomePage and I navigate to change address in the My Profile
    And I enter the New "<Address>"
    When I click Update Button
    Then I should see the Address changed Success Popup
    And I verify the New "<Address>"
    Examples:
      | Address               |
      | &ADDRESS_FOR_PROFILE& |

  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S3- Existing Patient change the Phone Number.

    Given As a Existing user I am on HomePage and I navigate to change Phone number in the My Profile
    And I enter the New Phone "<Number>"
    When I click Update Button
    Then I should see the Phone number changed Success Popup
    And I navigate to Profile and I see View Profile tab
    And I navigate to View Profile and I see My Health Centres
    And I navigate to View Profile and I see My Subscriptions
    And I navigate to View Profile and I see Access Information
    Examples:
      | Number                     |
      | &PHONE_NUMBER_FOR_PROFILE& |


  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S4- Existing Patient Add the New Emergency Contacts.

    Given As a Existing user I am on HomePage and I navigate to Emergency Contacts in the My Profile
    And I click Add New Contact Button
    And I enter the New Emergency Contact"<Details>"
    When I click Add Contact Button and verify the Success Popup
    Then I verify the Added Emergency Contact Details "<In Grid>" view
    And I verify the Added Emergency Contact details In "<In Grid>" And "<More Info>"

    Examples:
      | Details                         | In Grid                                        | More Info                                          |
      | &EMERGENCY_CONTACT_FOR_PROFILE& | &VERIFY_EMERGENCY_CONTACT_FOR_PROFILE_IN_GRID& | &VERIFY_EMERGENCY_CONTACT_FOR_PROFILE_IN_MOREINFO& |

  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S5- Existing Patient view the Calendar and calendar setting.

    Given As a Existing user I am on HomePage and I navigate to Calendar in the Profile module
    And I view the calendar in the Day,Week and Month view format
    And I navigate to Calendar settings
    And I modify the General calendar settings "<Details>"
    When I click the save button for General Calendar settings and Verify the Success Popup
    Then I navigate to General setting and verify the modified General calendar settings "<Details>"

    Examples:
      | Details                     |
      | &CALENDAR_GENERAL_SETTINGS& |

  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S5- Existing Patient Add Category in calendar settings- update Category /Cancel.

    Given As a Existing user I am on HomePage and I navigate to Calendar in the Profile module
    And I navigate to Calendar settings
    And I add the Categories "<Details>" in the calendar settings
    When I click the Update button for category Calendar settings and Verify the Success Popup
    Then I navigate to categories and verify the Added Category "<Details>"

    Examples:
      | Details                             |
      | &ADD_CATEGORY_FOR_CALENDAR_SETTING& |

  @WEB @PROFILE @GENERAL_SANITY
  Scenario Template: S6- Existing Patient Add Event in calendar and Delete the Event.

    Given As a Existing user I am on HomePage and I navigate to Calendar in the Profile module
    And I open the event page in the calendar
    And I enter the Event "<Details>" in the calendar
    When I click the Event save button
    Then I verify the created event "<Details>" in the calendar
    And I Edit the created event "<Details>" in the calendar
    And I click the Event save button
    And I delete the create event "<Details>" in the calendar

    Examples:
      | Details                    |
      | &CREATE_EVENT_IN_CALENDAR& |

