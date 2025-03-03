package java.General_Sanity_Provider_Web.stepDefinitions;

import General_Sanity_Provider_Web.GeneralSanityPageContainer;
import cap.helpers.Constants;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GeneralSanityWebSteps {

    private GeneralSanityPageContainer generalSanityPageContainer;

    public GeneralSanityWebSteps(GeneralSanityPageContainer generalSanityPageContainer) {

        this.generalSanityPageContainer = generalSanityPageContainer;
    }




    @Given("As a user I am on MMH Provider login Page")
    public void asAUserIAmOnMMHProviderLoginPage() {
        generalSanityPageContainer.login.visit();
        Assert.assertTrue(generalSanityPageContainer.login.clickBetaLoginButton());

    }


    @And("I enter {string} and {string} in Provider login screen")
    public void iEnterAndInProviderLoginScreen(String strUserName, String strPassword) {
        generalSanityPageContainer.login.enterEmailForBeta(TestDataUtil.getValue(strUserName));
        generalSanityPageContainer.login.enterPasswordForBeta(TestDataUtil.getValue(strPassword));

    }

    @And("I click SignIn button then I should see user successfully logs in to the MMH Provider Portal")
    public void iClickSignInButtonThenIShouldSeeUserSuccessfullyLogsInToTheMMHProviderPortal() {
        generalSanityPageContainer.login.clickSignInButton();
        Assert.assertTrue(generalSanityPageContainer.login.verifyHomePageOfMMHPortal());

    }

    @And("I click on Home Icon and Verify the Provider BTB Home Page Menu")
    public void iClickOnHomeIconAndVerifyTheProviderBTBHomePageMenu() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.VerifyProviderBTBDashboardLeftMenu());
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {

//            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.verifyHomePageOfMMHPortal());


        }



    }

    @And("I click on Home Icon and Verify the Provider BTB Home Page Dashboard Icons")
    public void iClickOnHomeIconAndVerifyTheProviderBTBHomePageDashboardIcons() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.VerifyProviderBTBHomePageIcons());
        }

    }

    @When("I click on Search clients and Verify the Respective user details {string}")
    public void iClickOnSearchClientsAndVerifyTheRespectiveUserDetails(String strdata) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>"+TestDataUtil.getListOfValue(strdata));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickSearchClients());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickPraticeNameDropDown(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickLastNameFirstName());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.EnterClientName(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickRegistered());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickClientActivationStatus());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickSearch());
        }


    }

    @And("I click on Resources Page and Verify the user can able to view details")
    public void iClickOnResourcesPageAndVerifyTheUserCanAbleToViewDetails() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickResources());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickViewProviderGuide());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickDownload());
            generalSanityPageContainer.beatingTheBlues.DeleteFile();
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickViewUserGuide());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickViewUserGuideDownload());
            generalSanityPageContainer.beatingTheBlues.DeleteFile();


        }



    }

    @And("I click on Progress Reports and Verify the Live progress report Page")
    public void iClickOnProgressReportsAndVerifyTheLiveProgressReportPage() {
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickHomeIcon());
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickProgressReports());
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickHomeIcon());


    }

    @And("I click on usage Reports and verify Beating the Blues usage Reports Page")
    public void iClickOnUsageReportsAndVerifyBeatingTheBluesUsageReportsPage() {
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickUsageReports());
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickHomeIcon());
    }

    @Then("I click Setting options and verify the user can be able to enter the secondary Email Address")
    public void iClickSettingOptionsAndVerifyTheUserCanBeAbleToEnterTheSecondaryEmailAddress() {

        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickSetting());
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickHomeIcon());
    }


    @And("I click on MMH Dashboard option nad verify the Respective user card Details {string}")
    public void IClickOnMMHDashboardOptionNadVerifyTheRespectiveUserCardDetails(String arg0) {

        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.verifyRecentViewedDetails());
    }

    @And("I click on Existing MMH usage Reports and verify Beating the Blues usage Reports Page")
    public void iClickOnExistingMMHUsageReportsAndVerifyBeatingTheBluesUsageReportsPage() {

        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickExistingUsageReports());
        Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickHomeIcon());

    }

    @And("I click on Register New Client and Enter the register New Client Details {string}")
    public void iClickOnRegisterNewClientAndEnterTheRegisterNewClientDetails(String strdata) {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            System.out.println(">>>>>>>>"+TestDataUtil.getListOfValue(strdata));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickRegisterNewClient());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickRegisterNewClientPraticeNameDropDown(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.EnterRegisterNewClientFirstName(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.EnterRegisterNewClientLastName(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.SelectDate());
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.EnterEmailAddress(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.EnterVerifyEmailAddress(TestDataUtil.getListOfValue(strdata)));
            Assert.assertTrue(generalSanityPageContainer.beatingTheBlues.clickSendInvitation());
        }
    }
}
