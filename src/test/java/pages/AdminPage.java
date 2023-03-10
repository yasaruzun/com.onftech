package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    /*
    20-300 yasir
    305-600 muhammed
    605-900 ibrahim
    905-1200 emrah
   1205-1500 mehmet
   1505-1800 ömer

     */
    //Admin/Login>E-mail Adress
    @FindBy(xpath = "//input[@name='login']")
    public WebElement textAdminEmail;

    // Admin/Login>Password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement textAdminPassword;

    //Admin/Login/Sig In button
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement buttonAdminSignIn;

    //Admin/Dashboard/Support Ticket
    @FindBy(xpath = "//span[text()='Support Ticket']")
    public WebElement titleSupportTicket;

    //Admin/Dashboard/Support Ticket/Support Ticket
    @FindBy(xpath = "//a[text()='Support Ticket']")
    public WebElement linkSupportTicket;

    //Admin/Ticket/Tickets/Add new Button
    @FindBy(xpath = "//a[@id='add_new']")
    public WebElement buttonAdminAddNew;

    //Admin/Ticket/Tickets/Create/Open a Ticket title
    @FindBy(xpath = "//h3[text()='Open a Ticket']")
    public WebElement titleAdminCreateOpenaTicket;

    //Admin/Ticket/Tickets/Create/Subjact title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[1]")
    public WebElement titleAdminTicketsCreateSubjact;

    //Admin/Ticket/Tickets/Create/Category List title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[2]")
    public WebElement titleAdminTicketsCreateCategoryList;

    //Admin/Ticket/Tickets/Create/Priority title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[3]")
    public WebElement titleAdminTicketsCreatePriority;

    //Admin/Ticket/Tickets/Create/User List title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[4]")
    public WebElement titleAdminTicketsCreateUserList;

    //Admin/Ticket/Tickets/Create/Status title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[5]")
    public WebElement titleAdminTicketsCreateStatus;

    //Admin/Ticket/Tickets/Create/Assign to title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[6]")
    public WebElement titleAdminTicketsCreateAssignTo;

    //Admin/Ticket/Tickets/Create/Attach File title
    @FindBy(xpath = "(//label[@class='primary_input_label'])[7]")
    public WebElement titleAdminTicketsCreateAttachFile;

    //Admin/Ticket/Tickets/Create/Description title
    @FindBy (xpath = "(//label[@class='primary_input_label'])[8]")
    public WebElement titleAdminTicketsCreateDescription;

    //Admin/Ticket/Tickets/Create/Plus button
    @FindBy (xpath = "//div[@class='col-1 mt-32 btn_margin']")
    public WebElement buttonAdminTicketsCreatePlus;

    //Admin/Ticket/Tickets/Create/Browse button
    @FindBy (xpath = "(//label[@class='primary-btn small fix-gr-bg'])[1]")
    public WebElement labelAdminTicketsCreateBrowse;

    //Admin/Ticket/Tickets/Create/Delete icon
    @FindBy (xpath = "//button[@class='primary-btn delete-ticket-message-attach small fix-gr-bg custom_plus_btn']")
    public WebElement buttonAdminTicketsDeleteIcon;

}
