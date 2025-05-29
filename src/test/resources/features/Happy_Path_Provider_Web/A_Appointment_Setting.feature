Feature: Appointment Setting

#  Background:Pref- User Successfully logs in to the Provider Portal.
#
#    Given As a user I am on Provider Portal login Page
#    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
#    And I click SignIn button then I should see user successfully logs in to the MMH portal
#    When As a user I am on Patient Portal login Page
#    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
#    Then I click SignIn button then I should see user successfully logs in to the MMH portal

#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template: Prep- Canceling all the appointments
#
#    Given As a user I am on HomePage
#    And I navigate to the "<Appointment>" Future Appointments page
#    And I canceling all the available appointments
#
#    Examples:
#      | Appointment           |
#      | Upcoming Appointments |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S0-Provider Enable Rule A verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select any provider with any Location
#    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
#    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
#    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
#    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"
#
#    Examples:
#      | Any_Location_with_Any_Provider_Appointment_Details      | Location   | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button                      | Appointment_After_Cancel              |
#      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &LOCATION& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &AUTO_PRA_LOC2_APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S1-Provider Enable Rule A verify Patient Book Visit Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location with Default Provider
#    Then I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Any Provider
#    And I enter the visit appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#
#    Examples:
#      | Any_Location_with_Any_Provider_Appointment_Details      | Location   | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     |
#      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S2-Provider Enable Rule A verify Patient Book Phone Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select any provider with any Location
#    And I enter the phone appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Any Provider
#    And I enter the phone appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#
#    Examples:
#      | Any_Location_with_Any_Provider_Appointment_Details      | Location   | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     |
#      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S3-Provider Enable Rule A verify Patient Book Video Appointment based on Rule A (Any Location with Any Provider) & (Default Location with Default Provider) & (Default Location with Any Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select any provider with any Location
#    And I enter the video appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    Then I enter the video appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Any Provider
#    And I enter the video appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#
#    Examples:
#      | Any_Location_with_Any_Provider_Appointment_Details      | Location   | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     |
#      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S4-Provider Enable Rule B verify Patient Book Visit Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    Then I navigate to Book Appointment select Default Location with Any Provider
#    And I enter the visit appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#
#    Examples:
#      | Location   | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name |
#      | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S5-Provider Enable Rule B verify Patient Book Phone Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the phone appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Rule B Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    Then I navigate to Book Appointment select Default Location with Any Provider
#    And I enter the phone appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#
#    Examples:
#      | Location   | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     |
#      | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_PHONE_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S6-Provider Enable Rule B verify Patient Book Video Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the video appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    Then I navigate to Book Appointment select Default Location with Any Provider
#    And I enter the video appointment details "<Default_Location_with_Any_Provider_Appointment_Details>" and Verify the Default Location Any ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>"
#
#    Examples:
#      | Location   | Default_Location_with_Default_Provider_Appointment_Details      | Default_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     |
#      | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &DEFAULT_LOCATION_WITH_ANY_PROVIDER_BOOK_VIDEO_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S7-Provider Enable Rule C verify Patient Book Visit,Phone and video Appointment based on Rule C (Default Location with Default Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleC Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Rule C Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Rule C Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    Examples:
#      | Location   | Default_Location_with_Default_Provider_Appointment_Details             | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c | Automation_Practice_Loc1_Doctor_Name |
#      | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S8-Provider Enable Rule D verify Ptient Book Visit,Phone and video Appointment based on Rule D (Default Location with Default Provider) & (Income Provider)
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleD Radio button and I click save button then I see Saved Successfully message"<Location>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Rule D Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Rule D Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    Examples:
#      | Location   | Default_Location_with_Default_Provider_Appointment_Details             | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c | Automation_Practice_Loc1_Doctor_Name |
#      | &LOCATION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S9-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Restricted provider are not displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleE Radio button and I click restrict providers checkbox"<Location>" click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"
#    And I Check restricted providers are not visible for phone and video appointments made online "<Restrict_Provider_Details>"
#    Then I navigate to Book Appointment select Default Provider based on Rule E
#    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify Restricted providers are not displayed Check Payments "<Automation_Practice_Loc1_Doctor_Name>"
#
#    Examples:
#      | Location   | Restrict_Provider_Details | Default_Location_with_Default_Provider_Appointment_Details             | Automation_Practice_Loc1_Doctor_Name |
#      | &LOCATION& | &RESTRICT_PROVIDER_DATA&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S10-Provider Enable Rule E verify Patient Book Phone and video Appointment based on Rule E Check Restricted provider are not displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"
#    And I Check restricted providers are not visible for phone and video appointments made online "<Restrict_Provider_Details>"
#    And I navigate to Book Appointment select Default Provider based on Rule E
#    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Rule E Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#
#    Examples:
#      | Location   | Restrict_Provider_Details | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | Automation_Practice_Loc1_Doctor_Name | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c |
#      | &LOCATION& | &RESTRICT_PROVIDER_DATA&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S11-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Not Restricted provider are displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable RuleE Radio button and I check Non restrict providers checkbox"<Location>"and click save button then I see Saved Successfully message"<Restrict_Provider_Details>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"
#    And I Check not restricted providers are visible for phone and video appointments made online "<Restrict_Provider_Details>"
#    Then I navigate to Book Appointment select Default Provider based on Rule E
#    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify Restricted providers are not displayed Check Payments "<Automation_Practice_Loc1_Doctor_Name>"
#
#    Examples:
#      | Location   | Restrict_Provider_Details    | Default_Location_with_Default_Provider_Appointment_Details             | Automation_Practice_Loc1_Doctor_Name |
#      | &LOCATION& | &NON_RESTRICT_PROVIDER_DATA& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S12-Provider Enable Rule E verify Patient Book Phone and video Appointment based on Rule E Check Not Restricted provider are displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"
#    And  I Check not restricted providers are visible for phone and video appointments made online "<Restrict_Provider_Details>"
#    And I navigate to Book Appointment select Default Provider based on Rule E
#    Then I enter the phone appointment details "<Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#    And I navigate to Book Appointment select Default Location with Default Provider
#    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
#
#    Examples:
#      | Location   | Restrict_Provider_Details    | Default_Location_with_Default_Provider_Phone_Appointment_Details_Rule_C | Automation_Practice_Loc1_Doctor_Name | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c |
#      | &LOCATION& | &NON_RESTRICT_PROVIDER_DATA& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT_RULE_C&  | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S13-Set Minimum notice for Cancellation
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message"<SET_MINIMUM_DATA>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
#    And I verify Myself and Friends and Family option is displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"
#    And I select the friends and family dropdown enter the visit appointment details "<Appointment_Details>"
#    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
#    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
#    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
#    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"
#    Examples:
#      | SET_MINIMUM_DATA               | Location   | Appointment_Reason | Appointment_Is_For_Details    | Appointment_Details                         | Details_For_Appointment                        | Future_Date                      | Appointment_Summary                            | Patient_User_Login   | Password   | Appointment         | Appointment_Cancel_Button                           | Appointment_After_Cancel                                 |
#      | &APPOINTMENT_SET_MINIMUM_DATA& | &LOCATION& | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_DETAILS& | &FRIENDS_AND_FAMILY_FUTURE_DATE& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Future Appointments | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_FOR_CANCEL& | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_AFTER_CANCELLED& |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S14-Provider Allow to book for family / friends verify Friends and Family option is displayed in Appointment is for dropdown
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable allow to book friends yes radio button"<Location>" and click save button then I see Saved Successfully message
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
#    And I verify Myself and Friends and Family option is displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"
#    And I select the friends and family dropdown enter the visit appointment details "<Appointment_Details>"
#    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
#    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
#    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
#    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"
#
#    Examples:
#      | Location   | Appointment_Reason | Appointment_Is_For_Details    | Appointment_Details                         | Details_For_Appointment                        | Future_Date                      | Appointment_Summary                            | Patient_User_Login   | Password   | Appointment         | Appointment_Cancel_Button                           | Appointment_After_Cancel                                 |
#      | &LOCATION& | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_DETAILS& | &FRIENDS_AND_FAMILY_FUTURE_DATE& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Future Appointments | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_FOR_CANCEL& | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_AFTER_CANCELLED& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S15-Provider don't Allow to book for family / friends verify Friends and Family option is Not displayed in Appointment is for dropdown
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I enable allow to book friends No radio button"<Location>" and click save button then I see Saved Successfully message
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
#    Then I verify Myself and Friends and Family option is Not displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"
#
#    Examples:
#      | Location   | Appointment_Reason | Appointment_Is_For_Details    |
#      | &LOCATION& | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S16-Provider Turn Off Online Appointments verify No Available appointment slot Text is displayed in Appointment Page
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
#    And I Log Out from Provider and Search for Health Centre Verify Online Appointment is not displayed for Easy booking"<Location1>"and"<Provider_Login>"
#    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
#    Examples:
#      | Location   | Provider_Login           | Appointment_Details      | Appointment      | Location1  |
#      | &LOCATION& | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment | Automation |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S17-Provider Turn on Online Appointments verify Available appointment slot Text is displayed in Appointment Page
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I navigate to Turn On Online Appointments "<Location>" and Enable turn-on online appointments checkbox click save button then I see turned-off Message
#    And I Log Out from Provider and Search for Health Centre Verify Online Appointment Slot is displayed for Easy booking"<Location1>"and"<Provider_Login>"
#    When As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    And I navigate to Book Appointment then I enter the visit appointment details "<Appointment>" and "<Appointment_Details>"
#    Examples:
#      | Location   | Provider_Login           | Appointment_Details      | Appointment      | Location1  |
#      | &LOCATION& | &PROVIDER_LOGIN_DETAILS& | &BOOK_VISIT_APPOINTMENT& | Book Appointment | Automation |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S18-Provider View Turn Off Appointments Audit verify Check Turn Off Appointments audit grid displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I navigate to Turn Off Online Appointments "<Location>" and Enable turn-off online appointments checkbox click save button then I see turned-off Message
#    When I navigate to Turn Off Appointment Audit page
#    Then I Should see Turn Off Appointments audit details displayed grid view "<Appointments_Audit_Details>"
#
#    Examples:
#      | Location   | Appointments_Audit_Details |
#      | &LOCATION& | &APPOINTMENT_AUDIT_DATA&   |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING @PROVIDER_SCRIPT1
#  Scenario Template:S19-Provider View Turn On Appointments Audit verify Check Turn On Appointments audit grid view displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I navigate to Turn On Online Appointments "<Location>" and Enable turn-On online appointments checkbox click save button then I see turned-On Message
#    When I navigate to Turn Off Appointment Audit page
#    Then I Should see Turn On Appointments audit details displayed grid view "<Appointments_Audit_Details>"
#    Examples:
#      | Location   | Appointments_Audit_Details |
#      | &LOCATION& | &APPOINTMENT_AUDIT_DATA&   |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING
#  Scenario Template:S20-Set Minimum notice for Cancellation
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message"<SET_MINIMUM_DATA>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When I navigate to Book Appointment select Default Location "<Location>"and"<Appointment_Reason>"
#    And I verify Myself and Friends and Family option is displayed in Appointment is for dropdown"<Appointment_Is_For_Details>"
#    And I select the friends and family dropdown enter the visit appointment details "<Appointment_Details>"
#    Then I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
#    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
#    And I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
#    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"
#    Examples:
#      | SET_MINIMUM_DATA               | Location         | Appointment_Reason | Appointment_Is_For_Details    | Appointment_Details                         | Details_For_Appointment                        | Future_Date                      | Appointment_Summary                            | Patient_User_Login   | Password   | Appointment         | Appointment_Cancel_Button                           | Appointment_After_Cancel                                 |
#      | &APPOINTMENT_SET_MINIMUM_DATA& | Automation1_Loc1 | A new issue        | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_DETAILS& | &FRIENDS_AND_FAMILY_FUTURE_DATE& | &FRIENDS_AND_FAMILY_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Future Appointments | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_FOR_CANCEL& | &FRIENDS_AND_FAMILY_APPOINTMENT_DETAILS_AFTER_CANCELLED& |

#=================================== Block Online Appointments for Provider=================IS NOT Working====================
#  @WEB @PROVIDER_HAPPY_PATH11 @APPOINTMENTS_SETTING11
#  Scenario Template:S21-Provider Block & Unblock Appointments doctor Name verify Patient Side Block & Unblock Appointment Provider Name Is Displayed or Not Displayed
#
#    Given As a Provider I am on HomePage and navigate to Appointment Setting page
#    And I navigate to Block Appointments for Provider and enter the all details"<Appointment_Details>" click save button then i see Setting saved successfully message
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    When Navigate to Appointment in the left menu and click Book Appointments "<Appointment>"
#    And I Should see Check Blocked provider is not displayed for Online Appointment "<Block_Appointment_Details>"
#    And As a Provider I am on HomePage and navigate to Appointment Setting page
#    Then Click Block link under status column in Blocked Appointments Grid "<Block_Appointment_Data>"
#    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    And Navigate to Appointment in the left menu and click Book Appointments "<Appointment>"
#    And I Should see Check Blocked provider is not displayed for Online Appointment "<Block_Appointment_Details>"
#
#    Examples:
#      | Appointment_Details | Appointment      | Block_Appointment_Details   | Block_Appointment_Data         |
#      | &BLOCK_APPOINTMENT& | Book Appointment | &BLOCK_APPOINTMENT_DETAILS& | &BLOCK_APPOINTMENT_TABLE_DATA& |

#  ====================================================================================================================================================

#  New Test

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING  @PROVIDER_SINGLE_SCREEN
  Scenario Template: Prep- Canceling all the appointments

    Given As a user I am on HomePage
    And I navigate to the "<Appointment>" Future Appointments page
    And I canceling all the available appointments

    Examples:
      | Appointment           |
      | Upcoming Appointments |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2-Provider Enable Rule B verify Patient Book Phone Appointment based on Rule B (Default Location with Default Provider) & (Default Location with Any Provider)

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleB Radio button and I click save button then I see Saved Successfully message"<Location>"
    And I enable allow to book friends No radio button"<Location>" and click save button then I see Saved Successfully message
    When I click Edit button to select "<Health_Centre>" and "<PRE_SCREENING_LOCATION>" and Disable Appointment Pre-Screening Popup
    And As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for Appointments by clicking No button and click the save button "<Location>"
    Then I navigate to Appointment setting page verify the Payonline or Payhealthcentre options Not displayed
    And I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message"<SET_MINIMUM_DATA>"
    And I Disable Additional Assistance Textbox and Enable Accident Yes Button

    Examples:
      | Location   | Health_Centre                 | PRE_SCREENING_LOCATION | SET_MINIMUM_DATA               |
      | &LOCATION& | &PRE_SCREENING_HEALTH_CENTRE& | &PRE_SCREENING&        | &APPOINTMENT_SET_MINIMUM_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S2- verify Patient Booked (Payment) Phone Appointment based on Rule B (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment select any provider with any Location
    And I enter the phone appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify the Rule B Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>" "<Appointment_Is_For_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    Then I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Automation_Practice_Loc1_Doctor_Name | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button                      | Appointment_After_Cancel              | Payment_Option   | Default_Location_with_Default_Provider_Appointment_Details      | Appointment_Is_For_Details    |
      | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTO_PRA_LOC1_PHONE_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC1_PHONE_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &AUTO_PRA_LOC1_APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& | &PAYMENT_OPTION& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_PHONE_APPOINTMENT& | &APPOINTMENT_IS_FOR_DROPDOWN& |




  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1-Provider Enable Rule A verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And I enable allow to book friends yes radio button"<Location>" and click save button then I see Saved Successfully message
    When I click Edit button to select "<Health_Centre>" and "<PRE_SCREENING_LOCATION>" and Enable Appointment Pre-Screening Popup
    And As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for Appointments by clicking Yes button and click the save button "<Location>"
    Then I navigate to Appointment setting page verify the Payonline or Payhealthcentre options displayed
    And I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message"<SET_MINIMUM_DATA>"
    And I Enable Additional Assistance Textbox and Enable Accident Yes Button

    Examples:
      | Location   | Health_Centre                 | SET_MINIMUM_DATA               | PRE_SCREENING_LOCATION |
      | &LOCATION& | &PRE_SCREENING_HEALTH_CENTRE& | &APPOINTMENT_SET_MINIMUM_DATA& | &PRE_SCREENING&        |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1- verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment select any provider with any Location
    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>" "<Appointment_Is_For_Details>" "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    When I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Any_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button                      | Appointment_After_Cancel              | Appointment_Is_For_Details    | Appointment_Details                         |
      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &AUTO_PRA_LOC2_APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& |



  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S3-Provider Enable Rule C verify Patient Booked (Payment) Video (Book to Video ) Appointment based on Rule C (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleC Radio button and I click save button then I see Saved Successfully message"<Location>"
    When As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable face to face appointment on a Video Consultation slot by clicking No button and I click save button then I see Saved Successfully message"<Location>"
    And I navigate to Appointment setting page verify the Payonline or Payhealthcentre options displayed choose the Pay online Option

    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S3- verify Patient Booked (Payment) Video (Book to Video ) Appointment based on Rule c (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
    When I navigate to Book Appointment Page Enter the Video Appointments Detail then verify Book Appointment Popup is not Displayed "<Appointment_Details>"
    And I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>"
    And I select payment option "<Payment_Option>" and I accept the terms & conditions and confirm my booking
    Then I see page navigated to the payment option and I enter the card details and confirm payment "<Payment_Details>"
    And I should see payment has been processed successfully with appointment details "<Card_Details_Verification>" "<Future_Date>"

    Examples:
      | Automation_Practice_Loc1_Doctor_Name | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c | Automation_Practice_Loc1_Doctor_Name | Appointment_Details      | Details_For_Appointment     | Future_Date   | Payment_Option   | Payment_Details | Card_Details_Verification  |
      | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PAYMENT_OPTION& | &CARD_DETAILS&  | &CARD_APPOINTMENT_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S4-Provider Enable Rule D verify Patient Booked (Payment) Video (Book to Video ) Appointment based on Rule D (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleD Radio button and I click save button then I see Saved Successfully message"<Location>"
    When As a Provider I am on HomePage and navigate to Video Consultations Setting page
    And I enable face to face appointment on a Video Consultation slot by clicking yes button and I click save button then I see Saved Successfully message"<Location>"
    Then I navigate to Appointment setting page verify the Payonline or Payhealthcentre options displayed and choose Payhealthcentre option

    Examples:
      | Location   |
      | &LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S4- verify Patient Booked (Payment) Video (Book to Video ) Appointment based on Rule D (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment select Default Location with Default Provider
    And I enter the video appointment details "<Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c>" and Verify the Default Location Default ProviderName and payment "<Automation_Practice_Loc1_Doctor_Name>"
    And I navigate to Book Appointment Page Enter the Video Appointments Detail "<Appointment_Details>"
    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
    When I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"

    Examples:
      | Automation_Practice_Loc1_Doctor_Name | Default_Location_with_Default_Provider_Video_Appointment_Details_Rule_c | Automation_Practice_Loc1_Doctor_Name | Appointment_Details      | Details_For_Appointment     | Future_Date   | Payment_Option   | Patient_User_Login   | Password   | Appointment_Summary         | Appointment           | Appointment_Cancel_Button                           | Appointment_After_Cancel              |
      | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VIDEO_APPOINTMENT_RULE_C&  | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &BOOK_VIDEO_APPOINTMENT& | &VIDEO_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &PAYMENT_OPTION& | &PATIENT_USER_LOGIN& | &PASSWORD& | &VIDEO_APPOINTMENT_SUMMARY& | Upcoming Appointments | &AUTO_PRA_LOC1_APPOINTMENT_DETAILS_AFTER_CANCELLED& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S5-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Restricted provider are not displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I click restrict providers checkbox"<Location>" click save button then I see Saved Successfully message"<Restrict_Provider_Details>"

    Examples:
      | Restrict_Provider_Details | Location   |
      | &RESTRICT_PROVIDER_DATA&  | &LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S5-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Restricted provider are not displayed

    And As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    When I navigate to Book Appointment select Default Location "<Location>"
    And I Check restricted providers are not visible for phone and video appointments made online "<Restrict_Provider_Details>"
    Then I navigate to Book Appointment select Default Provider based on Rule E
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify Restricted providers are not displayed Check Payments "<Automation_Practice_Loc1_Doctor_Name>"


    Examples:
      | Location   | Restrict_Provider_Details | Default_Location_with_Default_Provider_Appointment_Details             | Automation_Practice_Loc1_Doctor_Name |
      | &LOCATION& | &RESTRICT_PROVIDER_DATA&  | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S6-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Not Restricted provider are displayed

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleE Radio button and I check Non restrict providers checkbox"<Location>"and click save button then I see Saved Successfully message"<Restrict_Provider_Details>"

    Examples:
      | Location   | Restrict_Provider_Details    |
      | &LOCATION& | &NON_RESTRICT_PROVIDER_DATA& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S6-Provider Enable Rule E verify Patient Book Visit Appointment based on Rule E Check Not Restricted provider are displayed

    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
    And I navigate to Book Appointment select Default Location "<Location>"
    When I Check not restricted providers are visible for phone and video appointments made online "<Restrict_Provider_Details>"
    Then I navigate to Book Appointment select Default Provider based on Rule E
    And I enter the visit appointment details "<Default_Location_with_Default_Provider_Appointment_Details>" and Verify Restricted providers are displayed Check Payments "<Automation_Practice_Loc1_Doctor_Name>"


    Examples:
      | Location   | Restrict_Provider_Details    | Default_Location_with_Default_Provider_Appointment_Details             | Automation_Practice_Loc1_Doctor_Name |
      | &LOCATION& | &NON_RESTRICT_PROVIDER_DATA& | &DEFAULT_LOCATION_WITH_DEFAULT_PROVIDER_BOOK_VISIT_APPOINTMENT_RULE_C& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  |


  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
  Scenario Template:S1-Provider Enable Rule A verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status

    Given As a Provider I am on HomePage and navigate to Appointment Setting page
    And I enable RuleA Radio button and I click save button then I see Saved Successfully message"<Location>"
    And I enable allow to book friends yes radio button"<Location>" and click save button then I see Saved Successfully message
    When I click Edit button to select "<Health_Centre>" and "<PRE_SCREENING_LOCATION>" and Enable Appointment Pre-Screening Popup
    And As a Provider I am on HomePage and navigate to online payments setting page
    And I Enable Online Payments for Appointments by clicking Yes button and click the save button "<Location>"
    Then I navigate to Appointment setting page verify the Payonline or Payhealthcentre options displayed
    And I select Minimum notice for Cancellation and I click save button then I see Saved Successfully message"<SET_MINIMUM_DATA>"
    And I Enable Additional Assistance Textbox and Enable Accident Yes Button

    Examples:
      | Location   | Health_Centre                 | SET_MINIMUM_DATA               | PRE_SCREENING_LOCATION |
      | &LOCATION& | &PRE_SCREENING_HEALTH_CENTRE& | &APPOINTMENT_SET_MINIMUM_DATA& | &PRE_SCREENING&        |
#
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
#  Scenario Template: User Successfully logs in to the MMH Patient Portal.
#
#    Given As a user Launch the "<V1 Portal>"
#    And I enter "<Email Address>" and "<Password>"
#    When I click login button
#    Then I should see user successfully logs in to the MMH portal
#
#    Examples:
#      | V1 Portal | Email Address        | Password              |
#      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |
#
#  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_SETTING1 @PROVIDER_SINGLE_SCREEN
#  Scenario Template:S1- verify Patient Booked (Payment) Visit Appointment based on Rule A (Any Location with Any Provider) and Verify the Appointments Booking Status
#
#    Given As a user I am on HomePage and navigate to Patient Book Appointment Page in Appointments
#    And I navigate to Book Appointment select any provider with any Location
#    And I enter the visit appointment details "<Any_Location_with_Any_Provider_Appointment_Details>" and Verify the Any Locations Any ProviderName and payments "<Automation_Practice_Loc1_Doctor_Name>" "<Automation_Practice_Loc2_Doctor_Name>" "<Appointment_Is_For_Details>" "<Appointment_Details>"
#    When I should see details of created appointment "<Details_For_Appointment>" "<Future_Date>" and I should see booked appointment displayed under the future tab "<Appointment_Summary>"
#    And As a user I am on Patient Portal login Page and I enter "<Patient_User_Login>" and "<Password>" For Beta I should see user successfully logs in to the MMH portal
#    When I navigate to the "<Appointment>" Future Appointments page click cancel button for the created appointment "<Appointment_Cancel_Button>"
#    And I click cancel your appointment button Very the Appointment cancelled message "<Appointment_After_Cancel>"
#
#    Examples:
#      | Any_Location_with_Any_Provider_Appointment_Details      | Automation_Practice_Loc1_Doctor_Name | Automation_Practice_Loc2_Doctor_Name     | Details_For_Appointment                   | Future_Date   | Appointment_Summary                       | Patient_User_Login   | Password   | Appointment           | Appointment_Cancel_Button                      | Appointment_After_Cancel              | Appointment_Is_For_Details    | Appointment_Details                         |
#      | &ANY_LOCATION_WITH_ANY_PROVIDER_BOOK_VISIT_APPOINTMENT& | &AUTOMATION_PRACTICE1_DOCTOR_NAMES&  | &AUTOMATION_PRACTICE1_LOC2_DOCTOR_NAMES& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_DETAILS& | &FUTURE_DATE& | &AUTO_PRA_LOC2_VISIT_APPOINTMENT_SUMMARY& | &PATIENT_USER_LOGIN& | &PASSWORD& | Upcoming Appointments | &AUTO_PRA_LOC2_APPOINTMENT_DETAILS_FOR_CANCEL& | &APPOINTMENT_DETAILS_AFTER_CANCELLED& | &APPOINTMENT_IS_FOR_DROPDOWN& | &FRIENDS_AND_FAMILY_BOOK_VISIT_APPOINTMENT& |