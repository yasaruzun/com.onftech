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
            Assert.assertFalse(flag==1);
            //exception olusmazsa bekledigimiz durum gerceklesmedi demektir
            //bu durumda test failed olmali
            //bunun icin 119.satirda failed olacak bir assertion yazdik

        } catch (Exception e) {
            Assert.assertTrue(flag==1);
            //118. satirda delete butonu gorunmuyorsa exception olusur
            //bu bizi bekledigimiz durum oldugundan testin passed olmasi gerekir
            //exception olusuncaonu cath ile yakaladik ve
            // 125.satirda PASSED olacak bir Assetion yazdık
        }
    }
}
