package Stepdefinition;

import java.io.IOException;

import Baseclass.Baseclass;
import Baseclass.Utils;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invoice_StepDefinition extends Baseclass {


PageObjectManager Pm=new PageObjectManager(driver);
Utils u=new Utils();

@Given("User launch the chrome {string} Browser,")
public void userLaunchTheChromeBrowser(String string) {
   Browserlaunch(string);
}
@Given("User Navigate to the Url {string},")
public void userNavigateToTheUrl(String string) throws IOException {
	 getUrl(Utils.readExcelFile(filepath,"Sheet1", 2,0));
}
@Given("User enter the Username {string},")
public void userEnterTheUsername(String string) throws IOException {
	elementSendKeys(Pm.getClientPage().EnterUsername,Utils.readExcelFile(filepath,"Sheet1", 1, 0) );
	   highlightElement(Pm.getClientPage().EnterUsername);
}
@Given("User enter the Password {string},")
public void userEnterThePassword(String string) throws IOException {
	 elementSendKeys(Pm.getClientPage().EnterPassword, Utils.readExcelFile(filepath,"Sheet1", 1, 1));
	   highlightElement(Pm.getClientPage().EnterPassword);
}
@Given("User clicks Login Button.")
public void userClicksLoginButton() {
	 elementClick(Pm.getClientPage().ClickLoginButton);
}
@When("User click A Claim menu")
public void userClickAClaimMenu() {
	elementClick(Pm.getClaimPage().ClickClaim);
}
@Then("User click Add Claim Button")
public void userClickAddClaimButton() {

	elementClick(Pm.getClaimPage().ClickAddclaim);

}
@Then("User select client Name.")
public void userSelectClientName() throws IOException, InterruptedException {
	Thread.sleep(3000);
	elementClick(Pm.getClaimPage().SelectClient);
	elementSendKeys(Pm.getClaimPage().SelectClient,Utils.readExcelFile(filepath, "Sheet4", 2, 1));
	KeywordEvents(Pm.getClaimPage().SelectClient);
}
@Given("User Enter A claim Number.")
public void userEnterAClaimNumber() throws IOException {
	 String formatname=generateCompanyname(Utils.readExcelFile(filepath, "Sheet4", 0,1));
		//  writerFile(formatname);
		  elementSendKeys(Pm.getClaimPage().EnterClaimNumber, formatname);
}
@Given("User Enter A Policy Number.")
public void userEnterAPolicyNumber() throws IOException {
	String formatname=generateCompanyname(Utils.readExcelFile(filepath, "Sheet4", 1,1));
	  //writerFile(formatname);

	  elementSendKeys(Pm.getClaimPage().EnterPolicyNumber, formatname);
}
@When("User click create button.")
public void userClickCreateButton() {
	ClickbyAction(Pm.getClaimPage().ClickCreateClaim);
}
@When("User Verify A RyzeFile number.")
public void userVerifyARyzeFileNumber() {
	  gettext(Pm.getClaimPage().RyzefileNumber);
      System.out.println("Ryzefile Number = "+RyzefileNumber);
      writerFile(RyzefileNumber);
}
@Given("User Enter Insured First Name.")
public void userEnterInsuredFirstName() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterInsuredFirstname,Utils.readExcelFile(filepath,"Sheet4", 3, 1));
}
@Given("User Enter Insured Last Name.")
public void userEnterInsuredLastName() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterInsuredLastname, Utils.readExcelFile(filepath, "Sheet4", 4, 1));
}
@Given("User Enter Loss Address line1.")
public void userEnterLossAddressLine1() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterAddress1, Utils.readExcelFile(filepath, "Sheet4", 5, 1));
}
@Given("User Enter Loss Address line2.")
public void userEnterLossAddressLine2() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterAddress2, Utils.readExcelFile(filepath, "Sheet4", 6, 1));
}
@Given("User Enter Zip code.")
public void userEnterZipCode() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterZip, Utils.readExcelFile(filepath, "Sheet4", 7, 1));
}
@Given("User Select Primary Phone number Type.")
public void userSelectPrimaryPhoneNumberType() throws InterruptedException, IOException {
Thread.sleep(2000);

    DropdownbyAction(Pm.getClaimPage().PrimaryPhoneSelectType, Utils.readExcelFile(filepath, "Sheet4", 8, 1));
}
@Given("User Enter Primary Phone number.")
public void userEnterPrimaryPhoneNumber() throws IOException {
	 elementSendKeys(Pm.getClaimPage().PrimaryPhone, Utils.readExcelFile(filepath, "Sheet4", 9, 1));
}

@Given("User Enter E-mail Id.")
public void userEnterEMailId() throws IOException {
	  elementSendKeys(Pm.getClaimPage().EmailId, Utils.readExcelFile(filepath, "Sheet4", 12, 1));
}
@Then("User select Adjuster Name.")
public void userSelectAdjusterName() throws InterruptedException, IOException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignAdjuster);
	elementSendKeys(Pm.getClaimPage().AssignAdjuster,Utils.readExcelFile(filepath, "Sheet4", 13, 1));
	KeywordEvents(Pm.getClaimPage().AssignAdjuster);
}
@Then("User Assignment type.")
public void userAssignmentType() throws InterruptedException, IOException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignmentType);
	elementSendKeys(Pm.getClaimPage().AssignmentType,Utils.readExcelFile(filepath, "Sheet4", 16, 1));
	KeywordEvents(Pm.getClaimPage().AssignmentType);
}
@Given("User Select Examiner.")
public void userSelectExaminer() throws IOException, InterruptedException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignExaminer);
	elementSendKeys(Pm.getClaimPage().AssignExaminer,Utils.readExcelFile(filepath, "Sheet4", 17, 1));
	KeywordEvents(Pm.getClaimPage().AssignExaminer);
}
@Given("User Select TPA Reviewer.")
public void userSelectTPAReviewer() throws IOException, InterruptedException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignTpaReviewer);
	elementSendKeys(Pm.getClaimPage().AssignTpaReviewer,Utils.readExcelFile(filepath, "Sheet4", 18, 1));
	KeywordEvents(Pm.getClaimPage().AssignTpaReviewer);
}
@Then("User Select Client Adjuster..")
public void userSelectClientAdjuster() throws InterruptedException, IOException {
	hiddenElements(Pm.getClaimPage().ClientAdjuster);
	setAttributeValue(Pm.getClaimPage().ClientAdjuster, Utils.readExcelFile(filepath, "Sheet4", 19, 1));
	Scrolldown(Pm.getClaimPage().ClientAdjuster);
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().ClientAdjuster);
	elementSendKeys(Pm.getClaimPage().ClientAdjuster,Utils.readExcelFile(filepath, "Sheet4", 19, 1));
KeywordEvents(Pm.getClaimPage().ClientAdjuster);
}
@When("User Clicks Update claim button..")
public void userClicksUpdateClaimButton() {
	 elementClick(Pm.getClaimPage().updateClaimbutton);
}
@Then("User Should Verify Claim updated Pop-up..")
public void userShouldVerifyClaimUpdatedPopUp() {
	 gettext(Pm.getClaimPage().UpdatedSuccessfullyPopUp);

	   elementClick(Pm.getClaimPage().UpdatedclaimPop);
}
@Then("User clicks Invoice Tab..")
public void userClicksInvoiceTab() {
   elementClick(Pm.getinvoicePage().Invoicetab);
}
@When("User click Add invoice button..")
public void userClickAddInvoiceButton() throws IOException {
   elementClick(Pm.getinvoicePage().Addinvoicebutton);

}


@When("User select Product item.")
public void userSelectProductItem() throws InterruptedException {
   Thread.sleep(2000);
   dropdownselect(Pm.getinvoicePage().SelectLineItems, "Service Fee");
}
@Then("User Enter A Quantity.")
public void userEnterAQuantity() {
    elementSendKeys(Pm.getinvoicePage().Qty, "10");
}
@Then("User Enter A Cost.")
public void userEnterACost() throws InterruptedException {
    elementSendKeys(Pm.getinvoicePage().cost, "100");
    Thread.sleep(2000);
    elementSendKeys(Pm.getinvoicePage().ACV, "100");
    Thread.sleep(2000);
    elementSendKeys(Pm.getinvoicePage().RCV, "200");
}
@When("User Clicks create invoice button.")
public void userClicksCreateInvoiceButton() {
    elementClick(Pm.getinvoicePage().CreateInvoice);
}
@Then("User should be verify Invoice created Successfully!")
public void userShouldBeVerifyInvoiceCreatedSuccessfully() {
   Assertion(Pm.getinvoicePage().invoiceSuccesfully, "Invoice has been created successfully!");
   elementClick(Pm.getinvoicePage().InvoiceConfirmedOk);
}

/////////////////////////////////////////Reviewing invoice///////////////
@Given("the User navigates to the Invoice tab")
public void theUserNavigatesToTheInvoiceTab() throws IOException, InterruptedException {
	Thread.sleep(2000);
	   String Filenumber1 = FileReaderUtil(RyzefileNumber);
		elementSendKeys(Pm.getClaimPage().QuickSearch, Filenumber1);
	Thread.sleep(3000);
		elementClick(Pm.getinvoicePage().RyzefileNumberclicks);
	Thread.sleep(2000);
	 elementClick(Pm.getinvoicePage().Invoicetab);
	 //replacestring(RyzefileNumber);
}
@When("the User clicks on an invoice")
public void theUserClicksOnAnInvoice() throws InterruptedException {
	Thread.sleep(2000);
  elementClick(Pm.getinvoicePage().InvoiceNumberclicks);
  System.out.println("navigated update invoice page");
}
@When("the User clicks the Review button")
public void theUserClicksTheReviewButton() throws InterruptedException {

	Thread.sleep(9000);
	highlightElement(Pm.getinvoicePage().Reviewinvoice);
	 try {
		elementClick(Pm.getinvoicePage().Reviewinvoice);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		 ClickbyAction(Pm.getinvoicePage().Reviewinvoice);
	}
	//click(Pm.getinvoicePage().Reviewinvoice);

  }
@When("the User selects the QuickBooks \\(QB) class")
public void theUserSelectsTheQuickBooksQBClass() throws InterruptedException {
	Thread.sleep(2000);
	elementClick(Pm.getinvoicePage().SelectReviewQBclass);
	elementSendKeys(Pm.getinvoicePage().SelectReviewQBclass,"Cat Services");
	KeywordEvents(Pm.getinvoicePage().SelectReviewQBclass);
	Thread.sleep(2000);
	elementClick(Pm.getinvoicePage().clickSavebutton);
	Thread.sleep(2000);
	elementClick(Pm.getinvoicePage().clickcancelinvoicePage);
	System.out.println("navaigated to Invoice list page");
}
@Then("the User should verify if the invoice is reviewed")
public void theUserShouldVerifyIfTheInvoiceIsReviewed() {
    Assertion(Pm.getinvoicePage().verifyReviewed, "Reviewed");
}


////////////////////////////////////////////////Approving invoice//////////////////////


@Given("the User navigates to the Invoice & Billing tab")
public void theUserNavigatesToTheInvoiceBillingTab() throws InterruptedException, IOException {
	Thread.sleep(2000);
	   String Filenumber1 = FileReaderUtil(RyzefileNumber);
		elementSendKeys(Pm.getClaimPage().QuickSearch, Filenumber1);
	Thread.sleep(3000);
		elementClick(Pm.getinvoicePage().RyzefileNumberclicks);
	Thread.sleep(2000);
	 elementClick(Pm.getinvoicePage().Invoicetab);
	 replacestring(RyzefileNumber);
}

@Then("the User clicks on a specific invoice")
public void theUserClicksOnASpecificInvoice() throws InterruptedException {
	Thread.sleep(2000);
	  elementClick(Pm.getinvoicePage().InvoiceNumberclicks);
	  System.out.println("navigated update invoice page");
}
@Then("the User clicks the Approve button")
public void theUserClicksTheApproveButton() throws InterruptedException {

	highlightElement(Pm.getinvoicePage().Approveinvoice);
	Thread.sleep(9000);
	try {
		elementClick(Pm.getinvoicePage().Approveinvoice);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		ClickbyAction(Pm.getinvoicePage().Approveinvoice);
	}

}
@Then("the User selects QB class")
public void theUserSelectsQBClass() throws InterruptedException {
   RemoveText(Pm.getinvoicePage().SelectReviewQBclass);
   Thread.sleep(2000);
   elementClick(Pm.getinvoicePage().SelectReviewQBclass);
	elementSendKeys(Pm.getinvoicePage().SelectReviewQBclass,"Field Services");
	KeywordEvents(Pm.getinvoicePage().SelectReviewQBclass);
	Thread.sleep(2000);
	elementClick(Pm.getinvoicePage().clickSavebutton);
	Thread.sleep(2000);
	//elementClick(Pm.getinvoicePage().clickcancelinvoicePage);
	System.out.println("navaigated to Invoice list page");
}
@Then("the User should verify if the invoice is approved")
public void theUserShouldVerifyIfTheInvoiceIsApproved() throws InterruptedException {

	gettext(Pm.getinvoicePage().ApprovedSuccessfully);
	elementClick(Pm.getinvoicePage().Approvedokbutton);
	Thread.sleep(2000);
	 Assertion(Pm.getinvoicePage().verifyApproved, "Approved");
}


















}
