package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class ClientPage extends Baseclass{
     public WebDriver driver;

     public ClientPage(WebDriver driver) {
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

	@FindBy(xpath = "//span[text()='Dashboard']")
	public WebElement Verify_Dashboard;

	@FindBy(xpath ="//span[text()='Clients']")
	public WebElement ClickClientMenu;

	@FindBy(xpath ="//button[text()='All Clients']")
	public WebElement Verify_AllClient_label;

	@FindBy(xpath="//lable[text()='Add Client']")
	public WebElement AddClientButton;

	@FindBy(xpath="//button[text()='Create']")
	public WebElement verify_CreateClient;

	@FindBy(xpath = "//input[@name='companyname']")
	public WebElement EnterthecompanynameClient;

	@FindBy(xpath = "//input[@name='firstReport']")
	public WebElement EnterFirstReportClient;

	@FindBy(xpath = "//input[@name='secondReport']")
	public WebElement EnterSecondReportclient;

	@FindBy(xpath = "//input[@name='thirdReport']")
	public WebElement EnterFollowupReportclient;

	@FindBy(xpath = "//button[@aria-label=\"change date\"]")
	public WebElement SelectdateDOB;

	@FindBy(xpath = "//span[text()='Update']")
	public WebElement ClickupdatebuttonClient;

	@FindBy(xpath = "//input[@name='taxid']")
	public WebElement EnterTaxidClient;

	@FindBy(xpath = "//input[@name='emailNotiication']")
	public WebElement EnterEmailNofiticationclient;

	@FindBy(xpath = "//input[@name='testgroup']")
	public WebElement clickTestGroupClient;

	@FindBy(xpath = "//select[@name='clientgroupselectedlist']")
	public WebElement Select_clientGroupClient;


	@FindBy(xpath = "//select[@name='emailtypeid']")
	public WebElement Selectemailtypeclient;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement EnterEmailidclient;

	@FindBy(xpath = "//select[@name='phonenotypeid']")
	public WebElement SelectPhonetypeclient;

	@FindBy(xpath = "//input[@name='phoneno']")
	public WebElement EnterPhoneNumberClient;

	@FindBy(xpath = "//select[@name='addresstypeid']")
	public WebElement selectAddresstypeClient;

	@FindBy(xpath ="//input[@name='address1']")
	public WebElement EnterAddress1Client;

	@FindBy(xpath = "//input[@name='zip']")
	public WebElement EnterZipClient;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement EnterCityClient;

	@FindBy(xpath = "//input[@name='state']")
	public WebElement EnterStateClient;

	@FindBy(xpath = "//select[@name='emailtypeid']")
	public WebElement SelectemailtypeClient1;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement EnterEmailidClient1;

	@FindBy(xpath = "//select[@name='phonenotypeid']")
	public WebElement SelectPhonetypeClient1;

	@FindBy(xpath = "//input[@name='phoneno']")
	public WebElement EnterPhoneNumberClient1;


	@FindBy(xpath ="//button[@value='CreateClient']")
	public WebElement ClickClientButton;

	@FindBy(xpath ="//div[contains(text(),'Client ')]")
	public WebElement VerifyClientCreateDone;

	@FindBy(xpath ="//button[text()='OK']")
	public WebElement ClickConfirmPopup;

	@FindBy(xpath = "//button[text()='Users']")
	public WebElement ClickUserTab;

	@FindBy(xpath ="//select[@name='type']")
	public WebElement SelectType;

	@FindBy(xpath = "//span[contains(.,'Cancel')]")
	public WebElement cancelbutton;

	@FindBy (xpath = "(//input[@type='text'])[3]")
	public WebElement ClientUser;

	@FindBy (xpath = "//input[@name='firstname']")
	public WebElement UserFirstname;

	@FindBy (xpath = "//input[@name='lastname']")
	public WebElement Userlastname;

	@FindBy (xpath = "(//input[@type='text'])[6]")
	public WebElement UserEmail;

	@FindBy (xpath = "//input[@name='phone']")
	public WebElement Userphone;

	@FindBy (xpath = "//span[contains(.,'Save')]")
	public WebElement UsersaveButton;

	/////////////////////update client/////////
	@FindBy(xpath="//input[@id='quickFilter']")
	public WebElement SearchForClient;

	@FindBy(xpath = "//lable[text()='Add Client']//following::button[1]")
	public WebElement verifyCreatedClient;

	@FindBy(xpath = "//span[text()='Update ']")
	public WebElement ClickupdateClient;

	@FindBy(xpath = "//div[contains(text(),'Client')]")
	public WebElement VerifyClientupdated;

	@FindBy(xpath="//div[contains(text(),'Client')]//following::button")
	public WebElement ClickOkButton;


	/////////Login Error message////////////
	@FindBy(xpath ="//p[contains(text(),'Invalid ')]")
	public WebElement VerifyErrorMessage;





}
