package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class ClaimPage extends Baseclass{
	public WebDriver driver;

	public ClaimPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);


	}


    @FindBy(name ="email")
	public WebElement EnterUsername;

	@FindBy(xpath ="//input[@name='password']")
	public WebElement EnterPassword;

	@FindBy(xpath ="//span[text()='Login']")
	public WebElement ClickLoginButton;


	@FindBy(xpath ="//span[text()='Claims']")
	public WebElement ClickClaim;

	@FindBy (xpath ="//lable[text()='Add Claim']")
	public WebElement ClickAddclaim;


	@FindBy (xpath = "//input[@name='claimnumber']//preceding::input[1]")
	public WebElement SelectClient;

	@FindBy (xpath = "//input[@name='claimnumber']")
	public WebElement EnterClaimNumber;


	@FindBy(xpath = "//input[@name='policynumber']")
	public WebElement EnterPolicyNumber;


	@FindBy(xpath = "//span[text()='Create Claim']")
	public WebElement ClickCreateClaim;

	@FindBy(xpath = "//div[contains(text(),'Ryze File Number: ')]//following::span[1]")
	public WebElement RyzefileNumber;

	@FindBy (xpath ="//input[@name='insuredfirstname']")
	public WebElement EnterInsuredFirstname;

	@FindBy (xpath ="//input[@name='insuredlastname']")
	public WebElement EnterInsuredLastname;

	@FindBy (xpath = "//input[@name='address1']")
	public WebElement EnterAddress1;


	@FindBy (xpath = "//input[@name='address2']")
	public WebElement EnterAddress2;


	@FindBy (xpath = "//input[@name='zip']")
	public WebElement EnterZip;

	@FindBy (xpath = "//input[@name='primaryphonenumber']//preceding::input[1]")
	public WebElement PrimaryPhoneSelectType;

	@FindBy (xpath = "//input[@name='primaryphonenumber']")
	public WebElement PrimaryPhone;

	@FindBy (xpath = "//input[@name='primaryphonenumber']//following::div[1]")
	public WebElement SecondaryphoneSelectType;

	@FindBy (xpath = "//input[@name='secoundryphonenumber']")
	public WebElement SecondaryPhoneNumber;

	@FindBy (xpath = "//input[@name='emailid']")
	public WebElement EmailId;

	@FindBy (xpath = "(//input[contains(@aria-invalid,'false')])[12]")
	public WebElement AssignAdjuster;

	@FindBy (xpath = "(//input[@type='text'])[27]")
	public WebElement AssignExaminer;

	@FindBy (xpath = "(//input[@type='text'])[26]")
	public WebElement AssignTpaReviewer;

	 @FindBy (xpath = "(//input[@autocapitalize='none'])[5]")
	 public WebElement AssignmentType;

	 @FindBy (xpath = "(//input[contains(@aria-invalid,'false')])[12]//following::input[4]")
	 public WebElement ClientAdjuster;

	 @FindBy (xpath = "//span[text()='ACV']")
	 public WebElement ACV ;

	 @FindBy (xpath = "//span[text()='RCV']")
	 public WebElement RCV;



	@FindBy(xpath = "//span[contains(text(),'Update Claim')]")
	public WebElement updateClaimbutton;

	@FindBy(xpath = "//div[text()='Claim has been updated successfully!']")
	public WebElement UpdatedSuccessfullyPopUp;

	@FindBy (xpath = "//div[text()='Claim has been updated successfully!']//following::button[1]")
	public WebElement UpdatedclaimPop;

	@FindBy(xpath = "(//span[contains(.,'Cancel')])[1]")
	public WebElement ClickCancel;


	@FindBy(xpath = "//img[@src='assets/images/filter/open_filter.svg']")
	public WebElement AdvanceFilter;

	@FindBy(xpath = "//input[contains(@id,'quickFilter')]")
	public WebElement QuickSearch;

	@FindBy(xpath = "//input[@name='filterryzefilenumber']")
	public WebElement AdvanceFilterRyzezfile;

	@FindBy(xpath = "//lable[contains(.,'Search')]")
	public WebElement AdvanceSearch;


	@FindBy(xpath = "(//a[contains(.,'23')])[1]")
	public WebElement VerifyRyzefilenumber;

	@FindBy(xpath = "(//button[contains(@class,'claim')])[4]")
	public WebElement claimStatus;

	@FindBy(xpath = "//button[contains(.,'Yes')]")
	public WebElement changeClaimStatus;

	@FindBy(xpath = "//label[@id='deskcloseddate-label']//preceding::button[1]")
	public WebElement claimStatusSave;

	@FindBy (xpath = "//button[@type='button'][contains(.,'Yes')]")
	public WebElement ReopenConfirmPopUp;

	@FindBy (xpath = "(//input[contains(@autocomplete,'off')])[5]")
	public WebElement ReOpenReason;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[6]")
	public WebElement SubReason;

	@FindBy(xpath = "//span[contains(.,'Save')]")
	public WebElement ReopenSave;

}