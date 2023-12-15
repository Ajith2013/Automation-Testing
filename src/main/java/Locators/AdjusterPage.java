package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class AdjusterPage extends Baseclass {
	public WebDriver driver;
	  public AdjusterPage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);

	  }
	  @FindBy(name ="email")
	 	public WebElement EnterUsername;

	 	@FindBy(xpath ="//input[@name='password']")
	 	public WebElement EnterPassword;

	 	@FindBy(xpath ="//span[text()='Login']")
	 	public WebElement ClickLoginButton;

		@FindBy(css ="img[src=\"assets/images/logos/NavbarLogo.png\"]")
		public WebElement Verify_LoGo;

		@FindBy(xpath ="//span[text()='Adjuster']")
	 	public WebElement ClickAdjusterMenu;


		@FindBy(xpath ="//button[text()='All Adjuster']")
		public WebElement Verify_AllAdjuster_label;

		@FindBy(xpath="//lable[text()='Add Adjuster']")
		public WebElement AddAdjusterButton;

		@FindBy(xpath="//button[text()=' Create ']")
		public WebElement verify_CreateAdjuster;

		@FindBy(xpath ="//input[@name='firstname']")
		public WebElement EnterFirstname;

		@FindBy(xpath ="//input[@name='lastname']")
		public WebElement EnterLastname;

		@FindBy(xpath ="//input[@name='payrollId']")
		public WebElement EnterPayrollId;

		@FindBy(xpath ="//input[@name='associateId']")
		public WebElement EnterAssociatedId;

		@FindBy(xpath ="//input[@name='bankthreshold']")
		public WebElement EnterBankThreshold;


		@FindBy(xpath = "//input[@name='fullname']")
		public WebElement getfullname;

		@FindBy(xpath = "//button[@aria-label=\"change date\"]")
		public WebElement SelectdateDOB;

		@FindBy(xpath = "//span[text()='Update']")
		public WebElement ClickupdatebuttonAdjuster;



		@FindBy(xpath = "//input[@name='taxid']")
		public WebElement EnterTaxidAdjuster;

		@FindBy(xpath = "//input[@name='emailNotiication']")
		public WebElement EnterEmailNofiticationAdjuster;

		@FindBy(xpath = "//input[@name='testgroup']")
		public WebElement clickTestGroupAdjuster;


		@FindBy(xpath = "//select[@name='emailtypeid']")
		public WebElement SelectemailtypeAdjuster;

		@FindBy(xpath = "//input[@name='email']")
		public WebElement EnterEmailidAdjuster;

		@FindBy(xpath = "//select[@name='phonenotypeid']")
		public WebElement SelectPhonetypeAdjuster;

		@FindBy(xpath = "//input[@name='phoneno']")
		public WebElement EnterPhoneNumberAdjuster;


		@FindBy(xpath ="//button[@value='CreateClient']")
		public WebElement ClickAdjusterButton;

		@FindBy(xpath ="//div[contains(text(),'Adjuster')]")
		public WebElement VerifyAdjusterCreateDone;

		@FindBy(xpath ="//button[text()='OK']")
		public WebElement ClickConfirmPopup;

		@FindBy(xpath = "//select[@name='addresstypeid']")
		public WebElement selectAddresstypeAdjuster;

		@FindBy(xpath ="//input[@name='address1']")
		public WebElement EnterAddress1Adjuster;

		@FindBy(xpath = "//input[@name='zip']")
		public WebElement EnterZipAdjuster;

		@FindBy(xpath = "//input[@name='city']")
		public WebElement EnterCityAdjuster;

		@FindBy(xpath = "//input[@name='state']")
		public WebElement EnterStateAdjuster;

		///////////////////////update adjuster/////////
		@FindBy(xpath="//input[@id='quickFilter']")
		public WebElement SearchForAdjuster;

		@FindBy(xpath ="//lable[text()='Add Adjuster']//following::button[1]")
		public WebElement verifyCreatedAdjuster;

		@FindBy(xpath = "//span[text()='Update ']")
		public WebElement ClickUpdateAdjusterButton;

		@FindBy(xpath = "//div[contains(text(),'Adjuster')]")
		public WebElement VerifyAdjusterupdated;

		@FindBy(xpath="//button[text()=\"OK\"]")
		public WebElement ClickOkButton;









}
