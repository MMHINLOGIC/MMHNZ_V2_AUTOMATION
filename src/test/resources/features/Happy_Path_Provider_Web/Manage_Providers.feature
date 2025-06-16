Feature: Manage Providers

#  Background:Pref- User Successfully logs in to the Provider Portal.
#
#    Given As a user I am on Provider Portal login Page
#    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
#    And I click SignIn button then I should see user successfully logs in to the MMH portal
#    When As a user I am on Patient Portal login Page
#    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
#    Then I click SignIn button then I should see user successfully logs in to the MMH portal


#  @WEB @PROVIDER_HAPPY_PATH @MANAGE_PROVIDERS @PROVIDER_SCRIPT2
#  Scenario Template:S1-Manage Providers
#
#    Given As a Provider I am on HomePage and navigate to My Manage Providers page
#    And I should see doctor details in Manage Providers grid based on the select provider name "<Manage_Providers_Details>"
#    When I click the Edit Icon Edit Provider Type and verify Updated Successfully message "<Edit_Manage_Providers_Details>"
#    And As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
#    Then I select the Patient to collect Script Medication details"<Medication Details>" Verify patient should not able to view the Nurse "<Enable_Provider_data>"
#
#    Examples:
#      | Manage_Providers_Details   | Edit_Manage_Providers_Details   | Medication Details                                  | Enable_Provider_data    |
#      | &MANAGE_PROVIDERS_DETAILS& | &EDIT_MANAGE_PROVIDERS_DETAILS& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION NURSE& | &ENABLED_PROVIDER_DATA& |


    ############################################################################################################################################################################################

  @WEB @PROVIDER_HAPPY_PATH @MANAGE_PROVIDERS @PROVIDER_SINGLE_SCREEN1
  Scenario Template: User Successfully logs in to the MMH Provider Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password   |
      | &EMAIL FOR DOCTOR& | &PASSWORD& |

  @WEB @PROVIDER_HAPPY_PATH @MANAGE_PROVIDERS @PROVIDER_SINGLE_SCREEN1
  Scenario Template:S1-Manage Providers

    Given As a Provider I am on HomePage and navigate to My Manage Providers page
    When I should see doctor details in Manage Providers grid based on the select provider name "<Manage_Providers_Details>"
    Then I click the Edit Icon Edit Provider Type and verify Updated Successfully message "<Edit_Manage_Providers_Details>"

    Examples:
      | Manage_Providers_Details   | Edit_Manage_Providers_Details   |
      | &MANAGE_PROVIDERS_DETAILS& | &EDIT_MANAGE_PROVIDERS_DETAILS& |

  @WEB @PROVIDER_HAPPY_PATH @MANAGE_PROVIDERS @PROVIDER_SINGLE_SCREEN1
  Scenario Template: User Successfully logs in to the MMH Patient Portal.

    Given As a user Launch the "<V1 Portal>"
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | V1 Portal | Email Address        | Password              |
      | &URL&     | &PATIENT_USER_LOGIN& | &PASSWORD FOR DOCTOR& |

  @WEB @PROVIDER_HAPPY_PATH @MANAGE_PROVIDERS @PROVIDER_SINGLE_SCREEN1
  Scenario Template:S1-Manage Providers

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    Then I select the Patient to collect Script Medication details"<Medication Details>" Verify patient should not able to view the Nurse "<Enable_Provider_data>"

    Examples:
      | Medication Details                                  | Enable_Provider_data    |
      | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION NURSE& | &ENABLED_PROVIDER_DATA& |
