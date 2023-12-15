package Stepdefinition;

import java.io.IOException;

//import org.testng.Assert;
//import org.testng.asserts.Assertion;
import org.testng.Assert;

import Baseclass.Baseclass;
import Baseclass.Utils;
import PageObjectManager.PageObjectManager;
//import Baseclass.Applicationstate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Entity_StepDefinition extends Baseclass {


	PageObjectManager pm=new PageObjectManager(driver);
        Utils u=new Utils();
@Given("A User launch the {string} Browser")
public void a_user_launch_the_browser(String string) {
	Browserlaunch(string);
}


@Given("A User Navigate the Url {string}")
public void a_user_navigate_the_url(String string) throws IOException {

   getUrl(Utils.readExcelFile(filepath,"Sheet1", 2,0));

}

@Given("A User Enter valid UserName {string}")
public void a_user_enter_valid_user_name(String string) throws InterruptedException, IOException {

	//generateCompanyname(datevalue);

   elementSendKeys(pm.getEntityPage().EnterUsername,Utils.readExcelFile(filepath,"Sheet1", 1, 0));
   highlightElement(pm.getEntityPage().EnterUsername);
}
@Given("A User Enter Valid Password {string}")
public void a_user_enter_valid_password(String string) throws InterruptedException, IOException {


   elementSendKeys(pm.getEntityPage().EnterPassword,Utils.readExcelFile(filepath,"Sheet1", 1, 1));
   highlightElement(pm.getEntityPage().EnterPassword);
}
@Given("A User click the login Button")
public void a_user_click_the_login_button() {

	elementClick(pm.getEntityPage().ClickLoginButton);

	//highlightElement(pm.getEntityPage().ClickLoginButton);

}
@Then("A User Verify logined Successfully")
public void a_user_verify_logined_successfully() throws InterruptedException {

  gettext(pm.getEntityPage().Verify_LoGo);
  elementIsdisplayed(pm.getEntityPage().Verify_LoGo);
     //Thread.sleep(2000);

 // Assert.
}
@Then("A User clicks Entity menu")
public void aUserClicksEntityMenu() {
   elementClick(pm.getEntityPage().Click_Entity_Menu);

}

@Then("A User verify All Entities label")
public void aUserVerifyAllEntitiesLabel() {
   //Assert.assertTrue(elementIsdispalyed(pm.getEntityPage().Verify_AllEntity_Label));
elementIsdisplayed(pm.getEntityPage().Verify_AllEntity_Label);
//Assert.assertEquals(true, pm.getEntityPage().Verify_AllEntity_Label);
}

@Then("A User clicks Add Entities button")
public void aUserClicksAddEntitiesButton() {
				elementClick(pm.getEntityPage().AddEntityButton);

}
@Then("A User verify Create Entities label")
public void aUserVerifyCreateEntitiesLabel() {
  //Assert.assertTrue(elementIsdispalyed(pm.getEntityPage().VerifyCreateEntityLabel));
	elementIsdisplayed(pm.getEntityPage().VerifyCreateEntityLabel);

}


@Then("A User select Entity type dropdown As Company\"\"")
public void aUserSelectEntityTypeDropdownAsCompany() throws IOException {
	   dropdownselect(pm.getEntityPage().SelectEntityType,Utils.readExcelFile(filepath,"Sheet2", 0, 1));
}


@Then("A User Enter Company name {string}")
public void aUserEnterCompanyName(String string) throws IOException {
  String formatname=generateCompanyname(Utils.readExcelFile(filepath, "Sheet2", 1,1));
  writerFile(formatname);
  elementSendKeys(pm.getEntityPage().Enterthecompanyname,formatname);

}
@Then("A User Select A Role dropdown As Client")
public void aUserSelectARoleDropdownAsClient() throws InterruptedException {


	DropdownbyAction(pm.getEntityPage().selectRoledropdown, "Client");

}
@Then("A User Enter Dob\\/inc")
public void aUserEnterDobInc() {
   elementClick(pm.getEntityPage().Selectdate);
   elementClick(pm.getEntityPage().Clickupdatebutton);
}
@Then("A User Enter Tax ID {string}")
public void aUserEnterTaxID(String string) throws IOException {
   elementSendKeys(pm.getEntityPage().EnterTaxid, Utils.readExcelFile(filepath, "sheet2", 5, 1));
}
@Then("A User Enter Notification Email Id {string}")
public void aUserEnterNotificationEmailId(String string) throws IOException {
	RemoveText(pm.getEntityPage().EnterEmailNofitication);
    elementSendKeys(pm.getEntityPage().EnterEmailNofitication,Utils.readExcelFile(filepath, "sheet2", 6, 1) );
}

@Then("A User click Test Group CheckBox")
public void aUserClickTestGroupCheckBox() {
	pm.getEntityPage().clickTestGroup.click();

}

@Then("A User Enter First Report Due Days {string}")
public void aUserEnterFirstReportDueDays(String string) throws IOException {
    elementSendKeys(pm.getEntityPage().EnterFirstReport, Utils.readExcelFile(filepath, "Sheet2", 2, 1));
}
@Then("A User Enter Second Report Due Days {string}")
public void aUserEnterSecondReportDueDays(String string) throws IOException {
   elementSendKeys(pm.getEntityPage().EnterSecondReport,Utils.readExcelFile(filepath, "Sheet2", 3, 1) );
}
@Then("A User Enter Follow up Report Due Days {string}")
public void aUserEnterFollowUpReportDueDays(String string) throws IOException {
   elementSendKeys(pm.getEntityPage().EnterFollowupReport, Utils.readExcelFile(filepath, "Sheet2", 4, 1));
}

@Then("A User Select Client-Group dropdown")
public void aUserSelectClientGroupDropdown() throws InterruptedException {
	//DropdownbyAction(pm.getEntityPage().Select_clientGroup,"ACE" );
   dropdownselect(pm.getEntityPage().Select_clientGroup,"24/7 Claims Service");
}

/*
 * @Then("A User Select Reports") //public void aUserSelectReports() {
 * elementClick(pm.getEntityPage().SelectReport);
 * elementClick(pm.getEntityPage().AvailableReport);
 * elementClick(pm.getEntityPage().SelectedReport);
 * elementClick(pm.getEntityPage().ClickSaveReport); //}
 */
@Then("A User Select Email Type dropdown As Office")
public void aUserSelectEmailTypeDropdownAsOffice() {
    dropdownselect(pm.getEntityPage().Selectemailtype, "Office");
}
@Then("A User Enter Email id {string}")
public void aUserEnterEmailId(String string) throws IOException {
  elementSendKeys(pm.getEntityPage().EnterEmailid, Utils.readExcelFile(filepath, "sheet2", 7, 1));
}
@Then("A User Select Phone type as office")
public void aUserSelectPhoneTypeAsOffice() {
   dropdownselect(pm.getEntityPage().SelectPhonetype, "Office");
}
@Then("A User Enter phone Number {string}")
public void aUserEnterPhoneNumber(String string) throws IOException {
   elementSendKeys(pm.getEntityPage().EnterPhoneNumber, Utils.readExcelFile(filepath, "sheet2", 8, 1));
}
@Then("A User Select Address type dropdown As Residential")
public void aUserSelectAddressTypeDropdownAsResidential() {
   dropdownselect(pm.getEntityPage().selectAddresstype, "Residential");
}
@Then("A User Enter An Address {string}")
public void aUserEnterAnAddress(String string) throws IOException {
   elementSendKeys(pm.getEntityPage().EnterAddress1, Utils.readExcelFile(filepath, "sheet2", 9, 1));
}
@Then("A User Enter Zip code {string}")
public void aUserEnterZipCode(String string) throws IOException {
	elementSendKeys(pm.getEntityPage().EnterZip, Utils.readExcelFile(filepath, "sheet2", 10, 1));

}
@Then("A User Enter City  {string}")
public void aUserEnterCity(String string) throws IOException {
	elementSendKeys(pm.getEntityPage().EnterCity, Utils.readExcelFile(filepath, "sheet2", 11, 1));
}
@Then("A User Enter State  {string}")
public void aUserEnterState(String string) throws IOException {
	elementSendKeys(pm.getEntityPage().EnterState, Utils.readExcelFile(filepath, "sheet2", 12, 1));
}
@When("A User click Create Entities Button")
public void aUserClickCreateEntitiesButton() {
  elementClick(pm.getEntityPage().ClickcreateEntity);
}

@Then("A User should verify Entity has been created pop-up")
public void aUserShouldVerifyEntityHasBeenCreatedPopUp() throws InterruptedException {
	//Thread.sleep(2000);
    elementIsdisplayed(pm.getEntityPage().verifyEntitypopup);
}

//////////////////////////////update Entity////////////////////////////

@Then("A User search an Entity As {string}")
public void aUserSearchAnEntityAs(String string) throws IOException {
 String Clientname1 = FileReaderUtil(string);
  System.out.print(Clientname1+" ----- test");
  elementSendKeys(pm.getEntityPage().SearchAsClient, Clientname1);
 replacestring(Clientname1);

}


@Then("A User clicks ShowClaimContacts Box")
public void aUserClicksShowClaimContactsBox() {
	elementClick(pm.getEntityPage().ClickclaimContact);
		//click(pm.getEntityPage().ClickclaimContact);
}
@Then("A User verify a Entity")
public void aUserVerifyAEntity() {
	//Assert.assertTrue(elementIsdispalyed(pm.getEntityPage().verifyCreatedEntity));
	elementIsdisplayed(pm.getEntityPage().verifyCreatedEntity);
elementClick(pm.getEntityPage().verifyCreatedEntity);

}

@Then("A User update first report due day {string}")
public void aUserUpdateFirstReportDueDay(String string) throws IOException {
  RemoveText(pm.getEntityPage().EnterFirstReport);
  elementSendKeys(pm.getEntityPage().EnterFirstReport, Utils.readExcelFile(filepath, "sheet2", 17, 1));
}


@Then("A User update second report due day {string}")
public void aUserUpdateSecondReportDueDay(String string) throws IOException {
	 RemoveText(pm.getEntityPage().EnterSecondReport);
	  elementSendKeys(pm.getEntityPage().EnterSecondReport, Utils.readExcelFile(filepath, "sheet2", 18, 1));
}
@Then("A User update follow up report due day {string}")
public void aUserUpdateFollowUpReportDueDay(String string) throws IOException {
	 RemoveText(pm.getEntityPage().EnterFollowupReport);
	  elementSendKeys(pm.getEntityPage().EnterFollowupReport, Utils.readExcelFile(filepath, "sheet2", 19, 1));
}
@Then("A User update client group dropdown")
public void aUserUpdateClientGroupDropdown() {
   // DropdownbyAction(pm.getEntityPage().Select_clientGroup, null);
	dropdownselect(pm.getEntityPage().Select_clientGroup,"Acceptance Inc");
}


@Then("A User update Tax Id {string}")
public void aUserUpdateTaxId(String string) throws IOException {
   RemoveText(pm.getEntityPage().EnterTaxid);
   elementSendKeys(pm.getEntityPage().EnterTaxid, Utils.readExcelFile(filepath, "sheet2", 20, 1));
}
@Then("A User update Notification Email {string}")
public void aUserUpdateNotificationEmail(String string) throws IOException {
   RemoveText(pm.getEntityPage().EnterEmailNofitication);
   elementSendKeys(pm.getEntityPage().EnterEmailNofitication, Utils.readExcelFile(filepath, "sheet2", 21, 1));
}


@Then("A User update Additional Address As office")
public void aUserUpdateAdditionalAddressAsOffice() {
   //DropdownbyAction(pm.getEntityPage().selectAddresstype, "Office");
dropdownselect(pm.getEntityPage().selectAddresstype,"Office");

}
@Then("A User update Additional Addrees1  {string}")
public void aUserUpdateAdditionalAddrees1(String string) throws IOException {
  RemoveText(pm.getEntityPage().EnterAddress1);
  elementSendKeys(pm.getEntityPage().EnterAddress1, Utils.readExcelFile(filepath, "sheet2", 24, 1));

}
@Then("A User update Additional Zipcode   {string}")
public void aUserUpdateAdditionalZipcode(String string) throws IOException {
   RemoveText(pm.getEntityPage().EnterZip);
   elementSendKeys(pm.getEntityPage().EnterZip, Utils.readExcelFile(filepath, "sheet2", 25, 1));
}
@Then("A User update Additional city  {string}")
public void aUserUpdateAdditionalCity(String string) throws IOException {
  RemoveText(pm.getEntityPage().EnterCity);
  elementSendKeys(pm.getEntityPage().EnterCity, Utils.readExcelFile(filepath, "sheet2", 26, 1));
}
@Then("A User update Additional state {string}")
public void aUserUpdateAdditionalState(String string) throws IOException {
    RemoveText(pm.getEntityPage().EnterState);
    elementSendKeys(pm.getEntityPage().EnterState, Utils.readExcelFile(filepath, "sheet2", 27, 1));
}

@Then("A User update Additional Email type dropdown as business")
public void aUserUpdateAdditionalEmailTypeDropdownAsBusiness()  {
	 //DropdownbyAction(pm.getEntityPage().selectAddresstype, "Business");
	dropdownselect(pm.getEntityPage().selectAddresstype, "Business");
}
@Then("A User update Additional Email id {string}")
public void aUserUpdateAdditionalEmailId(String string) throws IOException {
   RemoveText(pm.getEntityPage().EnterEmailid);
   elementSendKeys(pm.getEntityPage().EnterEmailid, Utils.readExcelFile(filepath, "sheet2", 22, 1));
}
@Then("A User update Additional Phone type dropdown as mobile")
public void aUserUpdateAdditionalPhoneTypeDropdownAsMobile()  {
   //DropdownbyAction(pm.getEntityPage().SelectPhonetype, "Mobile");
dropdownselect(pm.getEntityPage().SelectPhonetype, "Mobile");
}

@Then("A User update Additional Phone type {string}")
public void aUserUpdateAdditionalPhoneType(String string) throws IOException {
  RemoveText(pm.getEntityPage().EnterPhoneNumber);
  elementSendKeys(pm.getEntityPage().EnterPhoneNumber, Utils.readExcelFile(filepath, "sheet2", 23, 1));
}

@Then("A User click update button")
public void aUserClickUpdateButton() {
	Scrolldown(pm.getEntityPage().ClickupdateEntity);
	elementClick(pm.getEntityPage().ClickupdateEntity);
}

@Then("A User should verify Entitty has been updated pop-up")
public void aUserShouldVerifyEntittyHasBeenUpdatedPopUp() {
    elementIsdisplayed(pm.getEntityPage().VerifyEntityupdated);
    Assert.assertTrue(pm.getEntityPage().VerifyEntityupdated.isDisplayed());
}

@Then("A User click Confirmation on pop-up")
public void aUserClickConfirmationOnPopUp() {
   elementClick(pm.getEntityPage().ClickOkButton);
   driver.quit();
}

}
