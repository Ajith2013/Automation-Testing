package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class EntityPage extends Baseclass{

	public WebDriver driver;


	public EntityPage(WebDriver driver)
	{
		 this.driver=driver;
		 PageFactory.initElements(driver, this);

	}

	@FindBy(name ="email")
	public WebElement EnterUsername;

	@FindBy(xpath ="//input[@name='password']")
	public WebElement EnterPassword;

	@FindBy(xpath ="//span[text()='Login']")
	public WebElement ClickLoginButton;

	@FindBy(css ="img[src=\"assets/images/logos/NavbarLogo.png\"]")
	public WebElement Verify_LoGo;

	@FindBy(xpath = "//span[text()='Entities']")
	public WebElement Click_Entity_Menu;

	@FindBy (xpath = "//button[text()='All Entities']")
	public WebElement Verify_AllEntity_Label;

	@FindBy (xpath = "//button[@type=\"button\"]//lable[text()='Add Entities']")
	public WebElement AddEntityButton;

	@FindBy(xpath = "//button[text()=' Create ']")
	public WebElement VerifyCreateEntityLabel;

	@FindBy (xpath = "//select[@name ='entitytype']")
	public WebElement SelectEntityType;

	@FindBy(xpath = "//input[@name='companyname']")
	public WebElement Enterthecompanyname;

	@FindBy(xpath = "//label[text()='Role *']")
	public WebElement selectRoledropdown;

	@FindBy(xpath = "//button[@aria-label=\"change date\"]")
	public WebElement Selectdate;

	@FindBy(xpath = "//span[text()='Update']")
	public WebElement Clickupdatebutton;

	@FindBy(xpath = "//input[@name='taxid']")
	public WebElement EnterTaxid;

	@FindBy(xpath = "//input[@name='emailNotiication']")
	public WebElement EnterEmailNofitication;

	@FindBy(xpath = "//input[@name='testgroup']")
	public WebElement clickTestGroup;

	@FindBy(xpath = "//input[@name='firstReport']")
	public WebElement EnterFirstReport;

	@FindBy(xpath = "//input[@name='secondReport']")
	public WebElement EnterSecondReport;

	@FindBy(xpath = "//input[@name='thirdReport']")
	public WebElement EnterFollowupReport;

	@FindBy(xpath = "//select[@name='clientgroupselectedlist']")
	public WebElement Select_clientGroup;

	@FindBy(xpath = "//span[text()='Select']")
	public WebElement SelectReport;

	@FindBy(xpath = "//div[text()='#7c RYZE Final Narrative Report - PDL']")
	public WebElement AvailableReport;

	@FindBy(xpath = "//input[@alt='rightArrow']")
	public WebElement SelectedReport;

	@FindBy(xpath ="//span[text()='Save']")
	public WebElement ClickSaveReport;

	@FindBy(xpath = "//select[@name='emailtypeid']")
	public WebElement Selectemailtype;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement EnterEmailid;

	@FindBy(xpath = "//select[@name='phonenotypeid']")
	public WebElement SelectPhonetype;

	@FindBy(xpath = "//input[@name='phoneno']")
	public WebElement EnterPhoneNumber;

	@FindBy(xpath = "//select[@name='addresstypeid']")
	public WebElement selectAddresstype;

	@FindBy(xpath ="//input[@name='address1']")
	public WebElement EnterAddress1;

	@FindBy(xpath = "//input[@name='zip']")
	public WebElement EnterZip;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement EnterCity;

	@FindBy(xpath = "//input[@name='state']")
	public WebElement EnterState;

	@FindBy(xpath = "//button[@value='CreateClient']")
	public WebElement ClickcreateEntity;

	@FindBy(xpath = "//button[text()='Yes']")
	public WebElement ClickConfirmYes;

	@FindBy(xpath = "//div[contains(text(),'Entities')]")
	public WebElement verifyEntitypopup;



	@FindBy(xpath = "//span[text()='Show Claim Contacts']")
	public WebElement ClickclaimContact;

	@FindBy(xpath = "//input[@id='quickFilter']")
	public WebElement SearchAsClient;

	@FindBy(xpath = "//lable[text()='Add Entities']//following::button[1]")
	public WebElement verifyCreatedEntity;

	@FindBy(xpath = "//label[text()='State *']//following::img")
	public WebElement ClickAdditionalAddress;

	@FindBy(xpath = "//input[@name='emailNotiication']//following::div[1]")
	public WebElement AddAdditionalRole;
//
//	@FindBy(xpath = "(//select[@name='addresstypeid'])[2]")
//	public WebElement selectAdditionAddresstype;
//
//	@FindBy(xpath ="(//input[@name='address1'])[2]")
//	public WebElement EnterAdditionalAddress1;
//
//	@FindBy(xpath = "(//input[@name='zip'])[2]")
//	public WebElement EnterAdditionalZip;
//
//	@FindBy(xpath = "(//input[@name='city'])[2]")
//	public WebElement EnterAdditionalCity;
//
//	@FindBy(xpath = "(//input[@name='state'])[2]")
//	public WebElement EnterAdditionalState;
//
//	@FindBy(xpath = "//input[@name='email']//following::img[1]")
//	public WebElement ClickAdditionalEmailbutton;
//
//	@FindBy(xpath = "(//select[@name='emailtypeid'])[2]")
//	public WebElement SelectAdditionalemailtype;
//
//	@FindBy(xpath = "(//input[@name='email'])[2]")
//	public WebElement EnterAdditionalEmailid;
//
//	 @FindBy(xpath = "//input[@name='phoneno']//following::img[1]")
//	 public WebElement clickadditionalphonebutton;
//
//	@FindBy(xpath = "(//select[@name='phonenotypeid'])[2]")
//	public WebElement SelectAdditionalPhonetype;
//
//	@FindBy(xpath = "(//input[@name='phoneno'])[2]")
//	public WebElement EnterAdditionalPhoneNumber;

	@FindBy(xpath = "//span[text()='Update ']")
	public WebElement ClickupdateEntity;

	@FindBy(xpath = "//div[contains(text(),'Entities')]")
	public WebElement VerifyEntityupdated;

	@FindBy(xpath="//div[contains(text(),'Entities')]//following::button")
	public WebElement ClickOkButton;

}
