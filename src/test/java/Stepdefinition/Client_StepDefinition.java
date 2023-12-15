package Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import Baseclass.Baseclass;
import Baseclass.Utils;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Client_StepDefinition extends Baseclass {

PageObjectManager pm=new PageObjectManager(driver);
Utils u=new Utils();

@Given("A User launch the chrome {string} Browser")
public void aUserLaunchTheChromeBrowser(String string) {
   Browserlaunch(string);
}
@Given("A User Navigate to the Url {string}")
public void aUserNavigateToTheUrl(String string) throws IOException {
	 getUrl(Utils.readExcelFile(filepath,"Sheet1", 2,0));
}
@Given("A User enter the Username {string}")
public void aUserEnterTheUsername(String string) throws IOException {
   elementSendKeys(pm.getClientPage().EnterUsername,Utils.readExcelFile(filepath,"Sheet1", 1, 0) );
   highlightElement(pm.getClientPage().EnterUsername);
}
@Given("A User enter the Password {string}")
public void aUserEnterThePassword(String string) throws IOException {
	 elementSendKeys(pm.getClientPage().EnterPassword, Utils.readExcelFile(filepath,"Sheet1", 1, 1));
	   highlightElement(pm.getClientPage().EnterPassword);
}
@Given("A User clicks Login Button")
public void aUserClicksLoginButton() {
    elementClick(pm.getClientPage().ClickLoginButton);
}
@Then("A User verify Logined Successfully")
public void aUserVerifyLoginedSuccessfully() {
  elementIsdisplayed(pm.getClientPage().Verify_LoGo);
}

@Then("A User clicks Client menu")
public void aUserClicksClientMenu() {
    elementClick(pm.getClientPage().ClickClientMenu);
}
@Then("A User verify All Client label")
public void aUserVerifyAllClientLabel() {
    elementIsdisplayed(pm.getClientPage().Verify_AllClient_label);
}

//////////////////////////////////////////////////////////////////Create Client////////////////////////
@Then("A User clicks Add Client button")
public void aUserClicksAddClientButton() {
   elementClick(pm.getClientPage().AddClientButton);
}
@Then("A User verify A Create client label")
public void aUserVerifyACreateClientLabel() {
   elementIsdisplayed(pm.getClientPage().verify_CreateClient);

}

@Then("A User Enter the Company name {string}")
public void aUserEnterTheCompanyName(String string) throws IOException {
	String formatname=generateCompanyname(Utils.readExcelFile(filepath, "Sheet2", 1,1));
	  writerFile(formatname);
	  elementSendKeys(pm.getClientPage().EnterthecompanynameClient, formatname);

}
@Then("A User Enter A First Report due days {string}")
public void aUserEnterAFirstReportDueDays(String string) throws IOException {
   elementSendKeys(pm.getClientPage().EnterFirstReportClient, Utils.readExcelFile(filepath, "Sheet2", 2, 1));
}
@Then("A User Enter A Second Report due day {string}")
public void aUserEnterASecondReportDueDay(String string) throws IOException {
	elementSendKeys(pm.getClientPage().EnterSecondReportclient, Utils.readExcelFile(filepath, "Sheet2", 3, 1));
}
@Then("A User Enter Follow Up report due days {string}")
public void aUserEnterFollowUpReportDueDays(String string) throws IOException {
	elementSendKeys(pm.getClientPage().EnterFollowupReportclient, Utils.readExcelFile(filepath, "Sheet2", 4, 1));
}

@Then("A User select DOB date")
public void aUserSelectDOBDate() {
	elementClick(pm.getClientPage().SelectdateDOB);
	   elementClick(pm.getClientPage().ClickupdatebuttonClient);

}
@Then("A User Enter Tax Id {string}")
public void aUserEnterTaxId(String string) throws IOException {
	elementSendKeys(pm.getClientPage().EnterTaxidClient, Utils.readExcelFile(filepath, "sheet2", 5, 1));
}
@Then("A User Enter A Notification Email {string}")
public void aUserEnterANotificationEmail(String string) throws IOException {
	  elementSendKeys(pm.getClientPage().EnterEmailNofiticationclient,Utils.readExcelFile(filepath, "sheet2", 6, 1) );
}
@Then("A User select Client group")
public void aUserSelectClientGroup() {
	 dropdownselect(pm.getClientPage().Select_clientGroupClient,"24/7 Claims Service");

}
@Then("A User check a Test Group")
public void aUserCheckATestGroup() {
	pm.getClientPage().clickTestGroupClient.click();

}
@Then("A User select Address type as Residential")
public void aUserSelectAddressTypeAsResidential() {
	 dropdownselect(pm.getClientPage().selectAddresstypeClient, "Residential");

}
@Then("A User Enter An Address1 {string}")
public void aUserEnterAnAddress1(String string) throws IOException {
	 elementSendKeys(pm.getClientPage().EnterAddress1Client, Utils.readExcelFile(filepath, "sheet2", 9, 1));

}
@Then("A User Enter An Address2 {string}")
public void aUserEnterAnAddress2(String string) {


}
@Then("A User Enter a Zipcode {string}")
public void aUserEnterAZipcode(String string) throws IOException {
	elementSendKeys(pm.getClientPage().EnterZipClient, Utils.readExcelFile(filepath, "sheet2", 10, 1));

}
@Then("A User Enter a City    {string}")
public void aUserEnterACity(String string) throws IOException {

	elementSendKeys(pm.getClientPage().EnterCityClient, Utils.readExcelFile(filepath, "sheet2", 11, 1));
}
@Then("A User Enter a State {string}")
public void aUserEnterAState(String string) throws IOException {
	elementSendKeys(pm.getClientPage().EnterStateClient, Utils.readExcelFile(filepath, "sheet2", 12, 1));

}

@Then("A User Select Email Type dropdown in Client page")
public void aUserSelectEmailTypeDropdownInClientPage() {
	dropdownselect(pm.getClientPage().SelectemailtypeClient1, "Office");
}
@Then("A User Enter Email id in clientpage {string}")
public void aUserEnterEmailIdInClientpage(String string) throws IOException {
	 elementSendKeys(pm.getClientPage().EnterEmailidClient1, Utils.readExcelFile(filepath, "sheet2", 7, 1));
}
@Then("A User Select Phone type as in client page")
public void aUserSelectPhoneTypeAsInClientPage() {
	dropdownselect(pm.getClientPage().SelectPhonetypeClient1, "Office");
}
@Then("A User Enter phone Number in client page {string}")
public void aUserEnterPhoneNumberInClientPage(String string) throws IOException {
	elementSendKeys(pm.getClientPage().EnterPhoneNumberClient1, Utils.readExcelFile(filepath, "sheet2", 8, 1));
}



@When("A User click Create Client Button")
public void aUserClickCreateClientButton() {
   elementClick(pm.getClientPage().ClickClientButton);
}
@Then("A User should verify Client has been created pop-up")
public void aUserShouldVerifyClientHasBeenCreatedPopUp() {
   elementIsdisplayed(pm.getClientPage().VerifyClientCreateDone);

}
@Given("A User search an Client {string}")
public void aUserSearchAnClient(String string) {


	String Clientname2 = FileReaderUtil(string);
	  System.out.print(Clientname2+" ----- test");
	  elementSendKeys(pm.getEntityPage().SearchAsClient, Clientname2);
	  elementClick(pm.getClientPage().verifyCreatedClient);
}
@Given("A User click User Tab")
public void aUserClickUserTab() throws InterruptedException {
	Thread.sleep(3000);
   elementClick(pm.getClientPage().ClickUserTab);
}
@Given("A User select Type")
public void aUserSelectType() throws InterruptedException {
  //  dropdownselectdown(pm.getClientPage().SelectType, "Client User");
    Thread.sleep(2000);

	elementClick(pm.getClientPage().SelectType);
	elementSendKeys(pm.getClientPage().SelectType, "Client User");
	//KeywordEvents(pm.getClientPage().SelectType);
}
@Then("A User select Client User")
public void aUserSelectClientUser() throws InterruptedException {


	Thread.sleep(2000);
	elementClick(pm.getClientPage().ClientUser);
	elementSendKeys(pm.getClientPage().ClientUser,"Create New");
	KeywordEvents(pm.getClientPage().ClientUser);
}
@Then("A User Enter A first name {string}")
public void aUserEnterAFirstName(String string) {
   elementSendKeys(pm.getClientPage().UserFirstname, "Demo1");
}
@Then("A User Enter A Last name {string}")
public void aUserEnterALastName(String string) {
	elementSendKeys(pm.getClientPage().Userlastname, "User");
}
@Then("A User Enter Phone number {string}")
public void aUserEnterPhoneNumber(String string) throws InterruptedException {

	elementSendKeys(pm.getClientPage().UserEmail, ";manikandan.chidambaram@aroopatech.com");
	Thread.sleep(2000);
	elementSendKeys(pm.getClientPage().Userphone, "(646) 464-6464");

}
@When("A User click save button.")
public void aUserClickSaveButton()  {


   elementClick(pm.getClientPage().UsersaveButton);
}
 //  driver.close();



//////////////////////////////////////////////////////update page/////////////////////////////


@Then("A User search an Client As {string}")
public void aUserSearchAnClientAs(String string) throws IOException
{
	String Clientname3 = FileReaderUtil(string);
	  System.out.print(Clientname3+" ----- test");
	  elementSendKeys(pm.getEntityPage().SearchAsClient, Clientname3);
	 replacestring(Clientname3);
}
@Then("A User verify a Client")
public void aUserVerifyAClient() {
	elementIsdisplayed(pm.getClientPage().verifyCreatedClient);

	elementClick(pm.getClientPage().verifyCreatedClient);
}
@Then("A User update first report due day in client page {string}")
public void aUserUpdateFirstReportDueDayInClientPage(String string) throws IOException {
	RemoveText(pm.getClientPage().EnterFirstReportClient);
    elementSendKeys(pm.getClientPage().EnterFirstReportClient, Utils.readExcelFile(filepath, "sheet2", 17, 1));
}
@Then("A User update second report due day in client page {string}")
public void aUserUpdateSecondReportDueDayInClientPage(String string) throws IOException {
	RemoveText(pm.getClientPage().EnterSecondReportclient);
   elementSendKeys(pm.getClientPage().EnterSecondReportclient, Utils.readExcelFile(filepath, "sheet2", 18, 1));
}
@Then("A User update follow up report due day in client page\"\"")
public void aUserUpdateFollowUpReportDueDayInClientPage() throws IOException {
	RemoveText(pm.getClientPage().EnterFollowupReportclient);
   elementSendKeys(pm.getClientPage().EnterFollowupReportclient, Utils.readExcelFile(filepath, "sheet2", 19, 1));
}
@Then("A User update Tax Id in client page\"\"")
public void aUserUpdateTaxIdInClientPage() throws IOException {
	RemoveText(pm.getClientPage().EnterTaxidClient);
   elementSendKeys(pm.getClientPage().EnterTaxidClient, Utils.readExcelFile(filepath, "sheet2", 20, 1));
}
@Then("A User update Notification Email in client page\"\"")
public void aUserUpdateNotificationEmailInClientPage() throws IOException {
	RemoveText(pm.getClientPage().EnterEmailNofiticationclient);
    elementSendKeys(pm.getClientPage().EnterEmailNofiticationclient,Utils.readExcelFile(filepath, "sheet2", 21, 1));

}
@Then("A User update Additional Address As office in client page")
public void aUserUpdateAdditionalAddressAsOfficeInClientPage() {
    dropdownselectdown(pm.getClientPage().selectAddresstypeClient,"Office");
}
@Then("A User update Additional Addrees1 in client page {string}")
public void aUserUpdateAdditionalAddrees1InClientPage(String string) throws IOException {
	RemoveText(pm.getClientPage().EnterAddress1Client);
   elementSendKeys(pm.getClientPage().EnterAddress1Client, Utils.readExcelFile(filepath, "sheet2", 24, 1));
}
@Then("A User update Additional Zipcode  in client page {string}")
public void aUserUpdateAdditionalZipcodeInClientPage(String string) throws IOException {
	RemoveText(pm.getClientPage().EnterZipClient);
    elementSendKeys(pm.getClientPage().EnterZipClient, Utils.readExcelFile(filepath, "sheet2", 25, 1));
}
@Then("A User update Additional city  in client page\"\"")
public void aUserUpdateAdditionalCityInClientPage() throws IOException {
	RemoveText(pm.getClientPage().EnterCityClient);
   elementSendKeys(pm.getClientPage().EnterCityClient,  Utils.readExcelFile(filepath, "sheet2", 26, 1));

}
@Then("A User update Additional state in client page\"\"")
public void aUserUpdateAdditionalStateInClientPage() throws IOException {
	RemoveText(pm.getClientPage().EnterStateClient);
	elementSendKeys(pm.getClientPage().EnterStateClient, Utils.readExcelFile(filepath, "sheet2", 27, 1));
}
@Then("A User update Additional Email type dropdown as business in client page")
public void aUserUpdateAdditionalEmailTypeDropdownAsBusinessInClientPage() {
	dropdownselect(pm.getClientPage().Selectemailtypeclient, "Business");
}
@Then("A User update Additional Email id in client page\"\"")
public void aUserUpdateAdditionalEmailIdInClientPage() throws IOException {
    RemoveText(pm.getClientPage().EnterEmailidClient1);
    elementSendKeys(pm.getClientPage().EnterEmailidClient1, Utils.readExcelFile(filepath, "sheet2", 22, 1));
}
@Then("A User update Additional Phone type dropdown as mobile in client page")
public void aUserUpdateAdditionalPhoneTypeDropdownAsMobileInClientPage() {
   dropdownselect(pm.getClientPage().SelectPhonetypeclient, "Home");
}
@Then("A User update Additional Phone type in client page\"\"")
public void aUserUpdateAdditionalPhoneTypeInClientPage() throws IOException {
   RemoveText(pm.getClientPage().EnterPhoneNumberClient1);
   elementSendKeys(pm.getClientPage().EnterPhoneNumberClient1, Utils.readExcelFile(filepath, "sheet2", 23, 1));
}
@Then("A User click update button in client page")
public void aUserClickUpdateButtonInClientPage() {
	Scrolldown(pm.getClientPage().ClickupdateClient);

   elementClick(pm.getClientPage().ClickupdateClient);
}
@Then("A User should verify Entitty has been updated pop-up in client page")
public void aUserShouldVerifyEntittyHasBeenUpdatedPopUpInClientPage() {
	elementIsdisplayed(pm.getClientPage().VerifyClientupdated);
    Assert.assertTrue(pm.getClientPage().VerifyClientupdated.isDisplayed());
}
@Then("A User click Confirmation on pop-up in client page")
public void aUserClickConfirmationOnPopUpInClientPage() {
	elementClick(pm.getClientPage().ClickOkButton);
	   driver.quit();
}


}
