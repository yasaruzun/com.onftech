package pages;

import io.cucumber.java.zh_cn.假如;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    //Admin/Ticket/Tickets/Create/Subjact Text
    @FindBy (xpath = "//input[@class='primary_input_field'] ")
    public WebElement textAdminTicketsCreateSubjact;

    //Admin/Ticket/Tickets/Category List
    @FindBy(xpath = "(//span[text()='Select One'])[1]")
    public WebElement dropDownAdminTicketsCategoryList;

    //Admin/Ticket/Tickets/Priority
    @FindBy(xpath = "(//div[@class='nice-select primary_select mb-15'])[2]")
    public WebElement dropDownAdminTicketsPriorty;

    //Admin/Ticket/Tickets/Status
    @FindBy(xpath = "(//div[@class='nice-select primary_select mb-15'])[4]")
    public WebElement dropDownAdminTicketsStatus;

    //Admin/Ticket/Tickets/Create/AttachFile
    @FindBy(xpath = "//input[@id='ticket_file']")
    public WebElement buttonAdminTicketsCreateBrowse;

    //Admin/Ticket/Tickets/Create/Description
    @FindBy (xpath = "//div[@class='note-editable card-block']")
    public WebElement textAdminTicketsCreateDescription;

    //Admin/Ticket/Tickets/Create/Create Ticket button
    @FindBy (xpath = "//button[@class='primary-btn semi_large2 fix-gr-bg']")
    public WebElement buttonAdminTicketsCreateCreateTicket;

    //Admin/Ticket/Tickets/Category List => New Category
    @FindBy(xpath = "//li[text()='New Category ']")
    public WebElement dropDownAdminTicketsCategoryNewCategoryTitle;

    //Admin/Ticket/Tickets/Priorty => Select One
    @FindBy(xpath = "(//li[text()='Select One'])[2]")
    public WebElement adminTicketsPriortySelectOneTitle;

    //Admin/Ticket/Tickets/Priorty => High
    @FindBy(xpath = "//li[text()='High ']")
    public WebElement adminTicketsPriortyHighTitle;

    //Admin/Ticket/Tickets/Priorty => Medium
    @FindBy(xpath = "//li[text()='Medium ']")
    public WebElement dropDownAdminTicketsPriortyMediumTitle;

    //Admin/Ticket/Tickets/Priorty => Low
    @FindBy(xpath = "//li[text()='Low ']")
    public WebElement adminTicketsPriortyLowTitle;

    //Admin/Ticket/Tickets/Status => Select One
    @FindBy (xpath = "(//li[text()='Select One'])[3]")
    public WebElement adminTicketsStatusSelectOne;

    //Admin/Ticket/Tickets/Status => Pending
    @FindBy (xpath = "//li[text()='Pending ']")
    public WebElement adminTicketsStatusPending;

    //Admin/Ticket/Tickets/Status => On Going
    @FindBy (xpath = "//li[text()='On Going ']")
    public WebElement adminTicketsStatusOnGoing;

    //Admin/Ticket/Tickets/Status =>Completed
    @FindBy(xpath = "//li[text()='Completed ']")
    public WebElement adminTicketsStatusCompleted;

    //Admin/Ticket/Tickets/Status=> Closed
    @FindBy(xpath = "//li[text()='Closed ']")
    public WebElement adminTicketsStatusClosed;

    //Admin/Ticket/Tickets/Status => New Status
    @FindBy(xpath = "//li[text()='New Status ']")
    public WebElement dropDownAdminTicketsStatusNewStatusTitle;

    //Admin/Ticket/Tickets/succes message
    @FindBy (xpath = "//div[@class='toast-title']")
    public WebElement titleSuccessMessage;

    //Admin/Ticket/Tickets/StatusDropdown
    @FindBy (xpath = "(//div[@class='nice-select primary_select mb-15'])[3]")
    public WebElement dropDownAdminTicketsStatus2;

    //Admin/Ticket/Tickets/Search
    @FindBy(xpath = "//button[@id='search_btn']")
    public WebElement buttonAdminTicketsSearch;

    //Admin/Ticket/Ticket List/Category=> New Category
    @FindBy(xpath = "(//td[text()='New Category'])[1]")
    public WebElement textAdminTicketListCategoryNewCategory;

    //Admin/Ticket/Ticket List/Priorty=> High
    @FindBy (xpath = "(//td[text()='High'])[1]")
    public WebElement textAdminTicketListPriortyHigh;

    //Admin/Ticket/Ticket List/Status =>Pending
    @FindBy(xpath = "(//td[text()='Pending'])[1]")
    public WebElement textAdminTicketListStatusPending;

    //Admin/Ticket/TicketList/Subject
    @FindBy(xpath = "(//th[@class='sorting'])[2]")
    public WebElement titleAdminTicketListSubject;

    //Admin/Ticket/TicketList/Category
    @FindBy (xpath = "(//th[@class='sorting'])[3]")
    public WebElement titleAdminTicketListCategory;

    //Admin/Ticket/TicketList/User Name
    @FindBy(xpath = "//th[@class='sorting_asc']")
    public WebElement titleAdminTicketListUserName;

    //Admin/Ticket/TicketList/Priorty
    @FindBy(xpath = "(//th[@class='sorting'])[4]")
    public WebElement titleAdminTicketListPriorty;

    //Admin/Ticket/TicketList/User agent
    @FindBy (xpath = "(//th[@class='sorting'])[5]")
    public WebElement titleAdminTicketListUserAgent;

    //Admin/Ticket/TicketList/Status
    @FindBy(xpath = "(//th[@class='sorting'])[6]")
    public WebElement titleAdminTicketListStatus;

    //Admin/Ticket/TicketList/Agent Asign
    @FindBy(xpath = "(//th[@class='sorting'])[7]")
    public WebElement titleAdminTicketListAgentAsign;

    //Admin/Ticket/TicketList/Action
    @FindBy(xpath = "(//th[@class='sorting'])[8]")
    public WebElement titleAdminTicketListAction;

    //Admin/Ticket/TicketList/Agent Asign=> agent asign to
    @FindBy(xpath = "//div[@class='nice-select niceSelect w-100 bb form-control']")
    public WebElement formAdminTicketListAgentAsign;

    //Admin/Ticket/TicketList/Agent Asign=> UNASSIGNED
    @FindBy(xpath = "(//div[@class='nice-select niceSelect w-100 bb form-control'])[3]")
    public WebElement formAdminTicketListAgentUnassigned;

    //Admin/Ticket/TicketList/Unassigned => Agent asign to (Admin17)
    @FindBy (xpath = "(//li[text()='Super admin [info@trendlifebuy.com]'])[3]")
    public WebElement linkAdminTicketListSuperAdmin;

}
