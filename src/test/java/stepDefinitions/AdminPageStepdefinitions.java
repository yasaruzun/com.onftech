package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class AdminPageStepdefinitions {

    AdminPage adminPage = new AdminPage();
    @Given("goes to {string}.")
    public void goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }

    @Then("enters his e-mail address and password to access the site as admin.")
    public void enters_his_e_mail_address_and_password_to_access_the_site_as_admin() {
        adminPage.textAdminEmail.sendKeys(ConfigReader.getProperty("admin017Email"));
        adminPage.textAdminPassword.sendKeys(ConfigReader.getProperty("admin17Password"));
    }

    @Then("clicks on the {string} button and accesses the site as admin.")
    public void clicks_on_the_button_and_accesses_the_site_as_admin(String string) {
        adminPage.buttonAdminSignIn.click();
    }

    @When("clicks on the {string} title from the menu on the left side.")
    public void clicks_on_the_title_from_the_menu_on_the_left_side(String string) {
        adminPage.titleSupportTicket.click();
    }

    @Then("after clicking on the {string} title, click on the {string} title from the menu that opens in the lower section.")
    public void after_clicking_on_the_title_click_on_the_title_from_the_menu_that_opens_in_the_lower_section(String string, String string2) {
        adminPage.linkSupportTicket.click();
    }

    @Then("confirms that they are on the {string}.")
    public void confirms_that_they_are_on_the(String string) {
        String expectedUrl = ConfigReader.getProperty("adminTicketUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("clicks on the {string} button")
    public void clicksOnTheButton(String arg0) {
        adminPage.buttonAdminAddNew.click();
    }

    @And("confirms that they are on the {string} page.")
    public void confirmsThatTheyAreOnThePage(String arg0) {
        String expectedTitle = "Open a Ticket";
        String actualAdminCreatePage = adminPage.titleAdminCreateOpenaTicket.getText();
        Assert.assertEquals(expectedTitle, actualAdminCreatePage);
    }

    @And("tests that the user is asked to enter information under the headings Subject, User List, Assign to, Description, Category List, Priority, Status, Attach File.")
    public void testsThatTheUserIsAskedToEnterInformationUnderTheHeadingsSubjectUserListAssignToDescriptionCategoryListPriorityStatusAttachFile() {
        String expectedTitleSubjact = "SUBJECT *";
        String actualTitleSubjact = adminPage.titleAdminTicketsCreateSubjact.getText();
        Assert.assertEquals(expectedTitleSubjact, actualTitleSubjact);

        String expectedTitleCategoryList = "CATEGORY LIST *";
        String actualTitleCategoryList = adminPage.titleAdminTicketsCreateCategoryList.getText();
        Assert.assertEquals(expectedTitleCategoryList, actualTitleCategoryList);

        String expectedTitlePriority = "PRIORITY *";
        String actualTitlePriority = adminPage.titleAdminTicketsCreatePriority.getText();
        Assert.assertEquals(expectedTitlePriority, actualTitlePriority);

        String expectedTitleUserList = "USER LIST";
        String actualTitleUserList = adminPage.titleAdminTicketsCreateUserList.getText();
        Assert.assertEquals(expectedTitleUserList, actualTitleUserList);

        String expectedTitleStatus = "STATUS *";
        String actualTitleStatus = adminPage.titleAdminTicketsCreateStatus.getText();
        Assert.assertEquals(expectedTitleStatus, actualTitleStatus);

        String expectedTitleAssignTo = "ASSIGN TO";
        String actualTitleAssignTo = adminPage.titleAdminTicketsCreateAssignTo.getText();
        Assert.assertEquals(expectedTitleAssignTo, actualTitleAssignTo);

        String expectedTitleAttachFile = "ATTACH FILE";
        String actualTitleAttachFile = adminPage.titleAdminTicketsCreateAttachFile.getText();
        Assert.assertEquals(expectedTitleAttachFile, actualTitleAttachFile);

        String expectedTitleDescription = "DESCRIPTION *";
        String actualTitleDescription = adminPage.titleAdminTicketsCreateDescription.getText();
        Assert.assertEquals(expectedTitleDescription, actualTitleDescription);
    }

    @And("clicks on the {string} button next to the {string} button")
    public void clicksOnTheButtonNextToTheButton(String arg0, String arg1) {
        adminPage.buttonAdminTicketsCreatePlus.click();
        ReusableMethods.bekle(2);
    }

    @When("Verifies that a new {string} button is created after clicks the {string} button.")
    public void verifiesThatANewButtonIsCreatedAfterClicksTheButton(String arg0, String arg1) {
        Assert.assertTrue(adminPage.labelAdminTicketsCreateBrowse.isDisplayed());

    }

    @And("clicks on the delete icon next to the new {string} button")
    public void clicksOnTheDeleteIconNextToTheNewButton(String arg0) {
        adminPage.buttonAdminTicketsDeleteIcon.click();
        ReusableMethods.bekle(2);
    }

    @Then("confirms that the newly opened {string} button is deleted after clicks the delete button.")
    public void confirmsThatTheNewlyOpenedButtonIsDeletedAfterClicksTheDeleteButton(String arg0) {
        int flag = 1;
        try {
            adminPage.buttonAdminTicketsDeleteIcon.click();
            Assert.assertFalse(flag == 1);
            //exception olusmazsa bekledigimiz durum gerceklesmedi demektir
            //bu durumda test failed olmali
            //bunun icin failed olacak bir assertion yazdik

        } catch (Exception e) {
            Assert.assertTrue(flag == 1);
            //delete butonu gorunmuyorsa exception olusur
            //bu bizim bekledigimiz durum oldugundan testin passed olmasi gerekir
            //exception olusuncaonu cath ile yakaladik ve
            //PASSED olacak bir Assetion yazdık
        }
    }

    @And("after filling in the necessary information, the user clicks on the {string} button")
    public void afterFillingInTheNecessaryInformationTheUserClicksOnTheButton(String arg0) {
        adminPage.textAdminTicketsCreateSubjact.sendKeys("Test017");

        adminPage.dropDownAdminTicketsCategoryList.click();
        adminPage.dropDownAdminTicketsCategoryNewCategoryTitle.click();

        adminPage.dropDownAdminTicketsPriorty.click();
        adminPage.dropDownAdminTicketsPriortyMediumTitle.click();

        adminPage.dropDownAdminTicketsStatus.click();
        adminPage.dropDownAdminTicketsStatusNewStatusTitle.click();

        String dinamikDosyaYolu =System.getProperty("user.home")+ "\\Documents\\Test017.png";
        adminPage.buttonAdminTicketsCreateBrowse.sendKeys(dinamikDosyaYolu);

        adminPage.textAdminTicketsCreateDescription.sendKeys("test17");

        adminPage.buttonAdminTicketsCreateCreateTicket.click();
    }

    @When("tests that a new ticket has been added")
    public void testsThatANewTicketHasBeenAdded() {
        String expectedTitle = "Success";
        String actualTitle = adminPage.titleSuccessMessage.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("clicks on the {string} dropbox option")
    public void clicksOnTheDropboxOption(String arg0) {
        adminPage.dropDownAdminTicketsCategoryList.click();
    }

    @When("tests that the dropbox options are visible")
    public void testsThatTheDropboxOptionsAreVisible() {
        adminPage.dropDownAdminTicketsCategoryNewCategoryTitle.isDisplayed();
    }

    @Then("tests that the dropbox options are selectable")
    public void testsThatTheDropboxOptionsAreSelectable() {
        System.out.println(adminPage.dropDownAdminTicketsCategoryNewCategoryTitle.getText());
        adminPage.dropDownAdminTicketsCategoryNewCategoryTitle.isSelected();
    }

    @And("clicks on {string} dropdown option")
    public void clicksOnDropdownOption(String arg0) {
        adminPage.dropDownAdminTicketsPriorty.click();
    }

    @When("tests that {string}, {string}, {string}, {string} are visible in the dropdown options")
    public void testsThatAreVisibleInTheDropdownOptions(String arg0, String arg1, String arg2, String arg3) {
        adminPage.adminTicketsPriortySelectOneTitle.isDisplayed();
        adminPage.adminTicketsPriortyHighTitle.isDisplayed();
        adminPage.dropDownAdminTicketsPriortyMediumTitle.isDisplayed();
        adminPage.adminTicketsPriortyLowTitle.isDisplayed();
    }

    @Then("tests that {string}, {string}, {string}, {string} are selectable in the dropdown options")
    public void testsThatAreSelectableInTheDropdownOptions(String arg0, String arg1, String arg2, String arg3) {
        adminPage.adminTicketsPriortySelectOneTitle.isSelected();
        adminPage.adminTicketsPriortyHighTitle.isSelected();
        adminPage.dropDownAdminTicketsPriortyMediumTitle.isSelected();
        adminPage.adminTicketsPriortyLowTitle.isSelected();
    }

    @And("clicks on the {string} dropdown option")
    public void clicksOnTheDropdownOption(String arg0) {
        adminPage.dropDownAdminTicketsStatus2.click();
    }

    @When("tests that {string}, {string}, {string}, {string}, {string} are visible in the dropdown options")
    public void testsThatAreVisibleInTheDropdownOptions(String arg0, String arg1, String arg2, String arg3, String arg4) {
        adminPage.adminTicketsStatusSelectOne.isDisplayed();
        adminPage.adminTicketsStatusPending.isDisplayed();
        adminPage.adminTicketsStatusOnGoing.isDisplayed();
        adminPage.adminTicketsStatusCompleted.isDisplayed();
        adminPage.adminTicketsStatusClosed.isDisplayed();
    }

    @Then("tests that {string}, {string}, {string}, {string}, {string} are selectable in the dropdown options")
    public void testsThatAreSelectableInTheDropdownOptions(String arg0, String arg1, String arg2, String arg3, String arg4) {
        adminPage.adminTicketsStatusSelectOne.isSelected();
        adminPage.adminTicketsStatusPending.isSelected();
        adminPage.adminTicketsStatusOnGoing.isSelected();
        adminPage.adminTicketsStatusCompleted.isSelected();
        adminPage.adminTicketsStatusClosed.isSelected();
    }

    @And("filters from {string}, {string}, {string} dropdown options.")
    public void filtersFromDropdownOptions(String arg0, String arg1, String arg2) {
        adminPage.dropDownAdminTicketsCategoryList.click();
        adminPage.dropDownAdminTicketsCategoryNewCategoryTitle.click();

        adminPage.dropDownAdminTicketsPriorty.click();
        ReusableMethods.bekle(1);
        adminPage.adminTicketsPriortyHighTitle.click();
        ReusableMethods.bekle(1);

        adminPage.dropDownAdminTicketsStatus2.click();
        ReusableMethods.bekle(1);
        adminPage.adminTicketsStatusPending.click();
    }

    @When("clicks on the Search button")
    public void clicksOnTheSearchButton() {
        adminPage.buttonAdminTicketsSearch.click();
    }

    @Then("tests that a Ticket List is created according to the filtering he-she has selected")
    public void testsThatATicketListIsCreatedAccordingToTheFilteringHeSheHasSelected() {
        adminPage.textAdminTicketListCategoryNewCategory.isDisplayed();
        adminPage.textAdminTicketListPriortyHigh.isDisplayed();
        adminPage.textAdminTicketListStatusPending.isDisplayed();
    }

    @And("verifies that the tickets opened in Ticket List are listed under the headings {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
    public void verifiesThatTheTicketsOpenedInTicketListAreListedUnderTheHeadingsAnd(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {

        adminPage.titleAdminTicketListSubject.isDisplayed();
        adminPage.titleAdminTicketListCategory.isDisplayed();
        adminPage.titleAdminTicketListUserName.isDisplayed();
        adminPage.titleAdminTicketListPriorty.isDisplayed();
        adminPage.titleAdminTicketListUserAgent.isDisplayed();
        adminPage.titleAdminTicketListStatus.isDisplayed();
        adminPage.titleAdminTicketListAgentAsign.isDisplayed();
        adminPage.titleAdminTicketListAction.isDisplayed();

    }

    @And("tests that the account information is visible if there is an account assigned from the tickets opened under {string}.")
    public void testsThatTheAccountInformationIsVisibleIfThereIsAnAccountAssignedFromTheTicketsOpenedUnder(String arg0) {
        String expectedTitle ="UNASSIGNED";
        String actualTitle = adminPage.formAdminTicketListAgentAsign.getText();

        Assert.assertFalse(expectedTitle.contains(actualTitle));
    }

    @When("tests that the {string} text is visible if an account is not specified in the tickets opened under {string}.")
    public void testsThatTheTextIsVisibleIfAnAccountIsNotSpecifiedInTheTicketsOpenedUnder(String arg0, String arg1) {
        String expectedTitle ="UNASSIGNED";
        String actualTitle = adminPage.formAdminTicketListAgentUnassigned.getText();
        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }

    @And("selects an account for the ticket that is {string} under the {string} heading.")
    public void selectsAnAccountForTheTicketThatIsUnderTheHeading(String arg0, String arg1) {
        adminPage.formAdminTicketListAgentUnassigned.click();
        adminPage.linkAdminTicketListSuperAdmin.click();
        ReusableMethods.bekle(3);
    }

    @When("tests that {string} is replaced by an account name.")
    public void testsThatIsReplacedByAnAccountName(String arg0) {
        String expectedTitle ="UNASSIGNED";
        String actualTitle = adminPage.formAdminTicketListAgentUnassigned.getText();
        System.out.println(adminPage.formAdminTicketListAgentUnassigned.getText());
        Assert.assertFalse(expectedTitle.contains(actualTitle));
    }
}
