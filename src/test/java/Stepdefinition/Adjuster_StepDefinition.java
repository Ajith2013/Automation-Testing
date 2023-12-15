package Stepdefinition;

import java.io.IOException;
import java.util.Date;

import Baseclass.Baseclass;
import Baseclass.Utils;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Adjuster_StepDefinition extends Baseclass{
	PageObjectManager pm=new PageObjectManager(driver);
	Utils u=new Utils();
	private String string;

	@Given("A User launch A {string} Browser")
	public void aUserLaunchABrowser(String string) {
	   Browserlaunch(string);
	}
	@Given("A User Navigate to the Login  Url {string}")
	public void aUserNavigateToTheLoginUrl(String string) throws IOException {
		 getUrl(Utils.readExcelFile(filepath,"Sheet1", 2,0));
	}
	@Given("A User enter the Username  {string}")
	public void aUserEnterTheUsername(String string) throws IOException {
		 elementSendKeys(pm.getAdjustertPage().EnterUsername,Utils.readExcelFile(filepath,"Sheet1", 1, 0) );
		   highlightElement(pm.getAdjustertPage().EnterUsername);
	}
	@Given("A User enter the Password  {string}")
	public void aUserEnterThePassword(String string) throws IOException {
	    elementSendKeys(pm.getAdjustertPage().EnterPassword,Utils.readExcelFile(filepath,"Sheet1", 1, 1));
	    highlightElement(pm.getAdjustertPage().EnterPassword);
	}

	@Given("A User clicks The Login Button")
	public void aUserClicksTheLoginButton() {
	   elementClick(pm.getAdjustertPage().ClickLoginButton);
	}
	@Then("A user verify Logined Successfully")
	public void aUserVerifyLoginedSuccessfully() {
		 //elementIsdisplayed(pm.getAdjustertPage().Verify_LoGo);
		elementIsdisplayed(pm.getAdjustertPage().Verify_LoGo);
	}
//////////////////////////////////////////////////////create an adjuster//////////////////////////
@Then("A User clicks Adjuster menu")
public void aUserClicksAdjusterMenu() {
    elementClick(pm.getAdjustertPage().ClickAdjusterMenu);
}
@Then("A User verify All Adjuster label")
public void aUserVerifyAllAdjusterLabel() {
   elementIsdisplayed(pm.getAdjustertPage().Verify_AllAdjuster_label);
}

@Given("A User click Add adjuster button")
public void aUserClickAddAdjusterButton() {
   elementClick(pm.getAdjustertPage().AddAdjusterButton);
}

@Given("A User Enter the First name {string}")
public void aUserEnterTheFirstName(String string) throws IOException {

   elementSendKeys(pm.getAdjustertPage().EnterFirstname, Utils.readExcelFile(filepath, "Sheet3", 0,1));
}

@Given("A User Enter A Second name {string}")
public void aUserEnterASecondName(String string) throws IOException {
	String FirstnameFromExcel=Utils.readExcelFile(filepath, "Sheet3", 0,1);
	String lastnameFromExcel=Utils.readExcelFile(filepath, "Sheet3", 1,1);

	String formatname=FirstnameFromExcel+" "+generateLastname(lastnameFromExcel);
	  writerFile(formatname);
    elementSendKeys(pm.getAdjustertPage().EnterLastname, formatname);
    System.out.println("AdjusterName"+" "+formatname);
    //replacestring(formatname);
}

@Given("A User Enter A Payroll id {string}")
public void aUserEnterAPayrollId(String string) throws IOException {

	//String formatname1=generateCompanyname(Utils.readExcelFile(filepath, "Sheet3", 1,1));
	//  writerFile(formatname1);
	Date date = new Date();
    Long timeInMilliSeconds = date.getTime();


	  elementSendKeys(pm.getAdjustertPage().EnterPayrollId,timeInMilliSeconds.toString()) ;
	 // replacestring(formatname1);
}

@Then("A User Enter Associated id {string}")
public void aUserEnterAssociatedId(String string) {
   Date date = new Date();
   Long timeInMilliSecond = date.getTime();
   elementSendKeys(pm.getAdjustertPage().EnterAssociatedId,timeInMilliSecond.toString());
}


@Given("A User Enter Bank Threshold {string}")
public void aUserEnterBankThreshold(String string) throws IOException {
    elementSendKeys(pm.getAdjustertPage().EnterBankThreshold,Utils.readExcelFile(filepath, "sheet3", 3, 1));
}

@Then("A User select A DOB date")
public void aUserSelectADOBDate() {
	elementClick(pm.getAdjustertPage().SelectdateDOB);
	elementClick(pm.getAdjustertPage().ClickupdatebuttonAdjuster);
}

@Then("A User Enter A Tax Id {string}")
public void aUserEnterATaxId(String string) throws IOException {
   elementSendKeys(pm.getAdjustertPage().EnterTaxidAdjuster, Utils.readExcelFile(filepath, "sheet3", 5, 1));
}
@Then("A User select Test group")
public void aUserSelectTestGroup() {
	Scrolldown(pm.getAdjustertPage().clickTestGroupAdjuster);
    elementClick(pm.getAdjustertPage().clickTestGroupAdjuster);
}
@Then("A User Enter  Notification Email {string}")
public void aUserEnterNotificationEmail(String string) throws IOException {
   elementSendKeys(pm.getAdjustertPage().EnterEmailNofiticationAdjuster, Utils.readExcelFile(filepath, "sheet3", 6, 1) );
}

@Then("A User select Address type as Business")
public void aUserSelectAddressTypeAsBusiness() {
   dropdownselect(pm.getAdjustertPage().selectAddresstypeAdjuster, "Business");
}
@Then("A User Enter An Address1 on adjuster page {string}")
public void aUserEnterAnAddress1OnAdjusterPage(String string) throws IOException {
	elementSendKeys(pm.getAdjustertPage().EnterAddress1Adjuster, Utils.readExcelFile(filepath, "sheet3", 9, 1));
}
@Then("A User Enter a Zipcode on adjuster page {string}")
public void aUserEnterAZipcodeOnAdjusterPage(String string) throws IOException {
  elementSendKeys(pm.getAdjustertPage().EnterZipAdjuster, Utils.readExcelFile(filepath, "sheet3", 10, 1));
}
@Then("A User Enter a City on adjuster page   {string}")
public void aUserEnterACityOnAdjusterPage(String string) throws IOException {
	elementSendKeys(pm.getAdjustertPage().EnterCityAdjuster, Utils.readExcelFile(filepath, "sheet3", 11, 1));
}
@Then("A User Enter  a State on adjuster page {string}")
public void aUserEnterAStateOnAdjusterPage(String string) throws IOException {
	elementSendKeys(pm.getAdjustertPage().EnterStateAdjuster, Utils.readExcelFile(filepath, "sheet3", 12, 1));
}


@Then("A User Select Email Type dropdown in Adjuster page")
public void aUserSelectEmailTypeDropdownInAdjusterPage() {
	 dropdownselect(pm.getAdjustertPage().SelectemailtypeAdjuster, "Office");

}
@Then("A User Enter Email id in Adjuster page {string}")
public void aUserEnterEmailIdInAdjusterPage(String string) throws IOException {
	elementSendKeys(pm.getAdjustertPage().EnterEmailidAdjuster, Utils.readExcelFile(filepath, "sheet2", 7, 1));
}
@Then("A User Select Phone type as in Adjuster page")
public void aUserSelectPhoneTypeAsInAdjusterPage() {
	dropdownselect(pm.getAdjustertPage().SelectPhonetypeAdjuster, "Mobile");
	//gettext(pm.getAdjustertPage().getfullname);
}

@Then("A User Enter phone Number in Adjuster page {string}")
public void aUserEnterPhoneNumberInAdjusterPage(String string) throws IOException {
    elementSendKeys(pm.getAdjustertPage().EnterPhoneNumberAdjuster, Utils.readExcelFile(filepath, "sheet3", 8, 1));
}
@When("A User click Create Adjuster Button")
public void aUserClickCreateAdjusterButton() {
  elementClick(pm.getAdjustertPage().ClickAdjusterButton);
}
@Then("A User should verify Adjuster has been created pop-up")
public void aUserShouldVerifyAdjusterHasBeenCreatedPopUp() {
    elementIsdisplayed(pm.getAdjustertPage().VerifyAdjusterCreateDone);

}
@Then("A User click confirm button on pop-up")
public void aUserClickConfirmButtonOnPopUp() {
	elementClick(pm.getAdjustertPage().ClickConfirmPopup);
	//driver.close();
}
///////////////////////////////////////////////////////////////update Adjuster//////////////////////////
@Given("A User search an adjuster")
public void aUserSearchAnAdjuster() throws IOException {

	String Adjuster=FileReaderUtil(string);
   elementSendKeys(pm.getAdjustertPage().SearchForAdjuster,Adjuster );
   elementClick(pm.getAdjustertPage().verifyCreatedAdjuster);
   replacestring(Adjuster);
}

@Then("A User update A Payroll id {string}")
public void aUserUpdateAPayrollId(String string) throws InterruptedException {
	Scrolldown(pm.getAdjustertPage().EnterPayrollId);
	Thread.sleep(2000);
   RemoveText(pm.getAdjustertPage().EnterPayrollId);


   Date date =new Date();
  Long updatepayrollid=date.getTime();
  elementSendKeys(pm.getAdjustertPage().EnterPayrollId, updatepayrollid.toString());
}

@Given("A User update Associated id {string}")
public void aUserUpdateAssociatedId(String string) {
	Date date =new Date();
	  Long updateAssociatedid=date.getTime();
	  elementSendKeys(pm.getAdjustertPage().EnterAssociatedId, updateAssociatedid.toString());
}

@Then("A User update Bank Threshold {string}")
public void aUserUpdateBankThreshold(String string) throws IOException {
   RemoveText(pm.getAdjustertPage().EnterBankThreshold);
   elementSendKeys(pm.getAdjustertPage().EnterBankThreshold, Utils.readExcelFile(filepath, "sheet3", 16, 1));
}
@Then("A User update A DOB date")
public void aUserUpdateADOBDate() {
	elementClick(pm.getAdjustertPage().SelectdateDOB);
	elementClick(pm.getAdjustertPage().ClickupdatebuttonAdjuster);
}
@Then("A User update A Tax Id {string}")
public void aUserUpdateATaxId(String string) throws IOException {
   RemoveText(pm.getAdjustertPage().EnterTaxidAdjuster);
   elementSendKeys(pm.getAdjustertPage().EnterTaxidAdjuster,Utils.readExcelFile(filepath, "sheet3", 17, 1) );
}
@Then("A User update A Notification Email {string}")
public void aUserUpdateANotificationEmail(String string) throws IOException {
	RemoveText(pm.getAdjustertPage().EnterEmailNofiticationAdjuster);
	 elementSendKeys(pm.getAdjustertPage().EnterEmailNofiticationAdjuster, Utils.readExcelFile(filepath, "sheet3", 18, 1) );
}
@Then("A User update Address type as Business")
public void aUserUpdateAddressTypeAsBusiness() {
   dropdownselect(pm.getAdjustertPage().selectAddresstypeAdjuster, "Mailing");
}
@Then("A User update An Address1 on adjuster page {string}")
public void aUserUpdateAnAddress1OnAdjusterPage(String string) throws IOException {
	RemoveText(pm.getAdjustertPage().EnterAddress1Adjuster);
    elementSendKeys(pm.getAdjustertPage().EnterAddress1Adjuster, Utils.readExcelFile(filepath, "sheet3", 21, 1));
}
@Then("A User update a Zipcode on adjuster page {string}")
public void aUserUpdateAZipcodeOnAdjusterPage(String string) throws IOException {
	RemoveText(pm.getAdjustertPage().EnterZipAdjuster);
    elementSendKeys(pm.getAdjustertPage().EnterZipAdjuster, Utils.readExcelFile(filepath, "sheet3", 22, 1));
}
@Then("A User update a City on adjuster page   {string}")
public void aUserUpdateACityOnAdjusterPage(String string) throws IOException {
	RemoveText(pm.getAdjustertPage().EnterCityAdjuster);
    elementSendKeys(pm.getAdjustertPage().EnterCityAdjuster, Utils.readExcelFile(filepath, "sheet3", 23, 1));
}



@Then("A User update a State on adjuster page {string}")
public void aUserUpdateAStateOnAdjusterPage(String string) throws IOException {
	RemoveText(pm.getAdjustertPage().EnterAddress1Adjuster);
    elementSendKeys(pm.getAdjustertPage().EnterAddress1Adjuster, Utils.readExcelFile(filepath, "sheet3", 24, 1));
}
@Then("A User update Email Type dropdown in Adjuster page")
public void aUserUpdateEmailTypeDropdownInAdjusterPage() {
	 dropdownselect(pm.getAdjustertPage().SelectemailtypeAdjuster, "Personal");
}
@Then("A User update Email id in Adjuster page {string}")
public void aUserUpdateEmailIdInAdjusterPage(String string) throws IOException {
    RemoveText(pm.getAdjustertPage().EnterEmailidAdjuster);
    elementSendKeys(pm.getAdjustertPage().EnterEmailidAdjuster, Utils.readExcelFile(filepath, "sheet3", 19, 1));
}
@Then("A User update Phone type as in Adjuster page")
public void aUserUpdatePhoneTypeAsInAdjusterPage() {
	dropdownselect(pm.getAdjustertPage().SelectPhonetypeAdjuster, "Fax");
}
@Then("A User update phone Number in Adjuster page {string}")
public void aUserUpdatePhoneNumberInAdjusterPage(String string) throws IOException, InterruptedException {
	 RemoveText(pm.getAdjustertPage().EnterPhoneNumberAdjuster);
	 Thread.sleep(2000);
	  elementSendKeys(pm.getAdjustertPage().EnterPhoneNumberAdjuster, Utils.readExcelFile(filepath, "sheet3", 20, 1));
}
@When("A User click update Adjuster Button")
public void aUserClickUpdateAdjusterButton() {
	Scrolldown(pm.getAdjustertPage().ClickUpdateAdjusterButton);
   elementClick(pm.getAdjustertPage().ClickUpdateAdjusterButton);
}
@Then("A User should verify Adjuster has been Updated pop-up")
public void aUserShouldVerifyAdjusterHasBeenUpdatedPopUp() {
    elementIsdisplayed(pm.getAdjustertPage().VerifyAdjusterupdated);
}
@Then("A User click ok button on updated pop-up")
public void aUserClickOkButtonOnUpdatedPopUp() {
	elementClick(pm.getAdjustertPage().ClickOkButton);
	driver.quit();

}



}
