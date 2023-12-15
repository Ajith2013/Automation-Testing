package Stepdefinition;

import java.io.IOException;

import Baseclass.Baseclass;
import Baseclass.Utils;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Claim_StepDefinition extends Baseclass {

	PageObjectManager Pm =new PageObjectManager(driver);
	Utils u=new Utils();

	@Given("A User launch the chrome {string} Browser,")
	public void aUserLaunchTheChromeBrowser(String string) {
	   Browserlaunch("Chrome");
	}

	@Given("A User Navigate to the Url {string},")
	public void aUserNavigateToTheUrl(String string) throws IOException {
	    getUrl(Utils.readExcelFile(filepath, "Sheet1", 2, 0));
	    }

	@Given("A User enter the Username {string},")
	public void aUserEnterTheUsername(String string) throws IOException {
	  elementSendKeys(Pm.getClaimPage().EnterUsername,Utils.readExcelFile(filepath, "Sheet1", 1, 0));
	}
	@Given("A User enter the Password {string},")
	public void aUserEnterThePassword(String string) throws IOException {
	    elementSendKeys(Pm.getClaimPage().EnterPassword, Utils.readExcelFile(filepath, "Sheet1", 1, 1));
	}
	@Given("A User clicks Login Button.")
	public void aUserClicksLoginButton() {
	   click(Pm.getClaimPage().ClickLoginButton);
	}




@Given("A User click A Claim menu")
public void aUserClickAClaimMenu() {
	elementClick(Pm.getClaimPage().ClickClaim);
   //click(Pm.getClaimPage().ClickClaim);
}


@Given("A User click Add Claim Button")
public void aUserClickAddClaimButton()
{
elementClick(Pm.getClaimPage().ClickAddclaim);

}
@Given("A User select client Name")
public void aUserSelectClientName() throws InterruptedException, IOException
{
	Thread.sleep(3000);
	elementClick(Pm.getClaimPage().SelectClient);
	elementSendKeys(Pm.getClaimPage().SelectClient,Utils.readExcelFile(filepath, "Sheet4", 2, 1));
	KeywordEvents(Pm.getClaimPage().SelectClient);

}

@Given("A User Enter A claim Number")
public void aUserEnterAClaimNumber() throws IOException
{

   String formatname=generateCompanyname(Utils.readExcelFile(filepath, "Sheet4", 0,1));
	//  writerFile(formatname);
	  elementSendKeys(Pm.getClaimPage().EnterClaimNumber, formatname);

}

@Given("A User Enter A Policy Number")
public void aUserEnterAPolicyNumber() throws IOException {

	String formatname=generateCompanyname(Utils.readExcelFile(filepath, "Sheet4", 1,1));
	  //writerFile(formatname);

	  elementSendKeys(Pm.getClaimPage().EnterPolicyNumber, formatname);
}



@When("A User click create button")
public void aUserClickCreateButton() throws IOException {
	ClickbyAction(Pm.getClaimPage().ClickCreateClaim);

}



 @And("A User Verify A RyzeFile number")
public void  AUserVerifyARyzeFilenumber()
 {
        gettext(Pm.getClaimPage().RyzefileNumber);
        System.out.println("Ryzefile Number = "+RyzefileNumber);
        writerFile(RyzefileNumber);
}

@Given("A User Enter Insured First Name")
public void aUserEnterInsuredFirstName() throws IOException {
   elementSendKeys(Pm.getClaimPage().EnterInsuredFirstname,Utils.readExcelFile(filepath,"Sheet4", 3, 1));
}
@Given("A User Enter Insured Last Name")
public void aUserEnterInsuredLastName() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterInsuredLastname, Utils.readExcelFile(filepath, "Sheet4", 4, 1));
}
@Given("A User Enter Loss Address line1")
public void aUserEnterLossAddressLine1() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterAddress1, Utils.readExcelFile(filepath, "Sheet4", 5, 1));
}
@Given("A User Enter Loss Address line2")
public void aUserEnterLossAddressLine2() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterAddress2, Utils.readExcelFile(filepath, "Sheet4", 6, 1));
}
@Given("A User Enter Zip code")
public void aUserEnterZipCode() throws IOException {
	elementSendKeys(Pm.getClaimPage().EnterZip, Utils.readExcelFile(filepath, "Sheet4", 7, 1));
}
@Given("A User Select Primary Phone number Type")
public void aUserSelectPrimaryPhoneNumberType() throws InterruptedException, IOException {
	Thread.sleep(2000);

    DropdownbyAction(Pm.getClaimPage().PrimaryPhoneSelectType, Utils.readExcelFile(filepath, "Sheet4", 8, 1));
}
@Given("A User Enter Primary Phone number")
public void aUserEnterPrimaryPhoneNumber() throws IOException {
    elementSendKeys(Pm.getClaimPage().PrimaryPhone, Utils.readExcelFile(filepath, "Sheet4", 9, 1));
}
@Given("A User Select Secondary Phone number Type")
public void aUserSelectSecondaryPhoneNumberType() throws InterruptedException, IOException {
  //  dropdownselectdown(Pm.getClaimPage().SecondaryphoneSelectType, "Office");
    DropdownbyAction(Pm.getClaimPage().SecondaryphoneSelectType, Utils.readExcelFile(filepath, "Sheet4", 10, 1));
}
@Given("A User Enter Secondary Phone number")
public void aUserEnterSecondaryPhoneNumber() throws IOException {
   elementSendKeys(Pm.getClaimPage().SecondaryPhoneNumber, Utils.readExcelFile(filepath, "Sheet4", 11, 1));
}
@Given("A User Enter E-mail Id")
public void aUserEnterEMailId() throws IOException {
   elementSendKeys(Pm.getClaimPage().EmailId, Utils.readExcelFile(filepath, "Sheet4", 12, 1));
}
@Then("A User select Adjuster Name")
public void aUserSelectAdjusterName() throws InterruptedException, IOException {

	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignAdjuster);
	elementSendKeys(Pm.getClaimPage().AssignAdjuster,Utils.readExcelFile(filepath, "Sheet4", 13, 1));
	KeywordEvents(Pm.getClaimPage().AssignAdjuster);
}


@Given("A User Enter ACV value")
public void aUserEnterACVValue() throws IOException {
	 elementSendKeys(Pm.getClaimPage().ACV, Utils.readExcelFile(filepath, "Sheet4", 14, 1));
}
@Given("A User Enter RCV value.")
public void aUserEnterRCVValue() throws IOException {
	elementSendKeys(Pm.getClaimPage().RCV, Utils.readExcelFile(filepath, "Sheet4", 15, 1));

}
@Then("A User Assignment type")
public void aUserAssignmentType() throws InterruptedException, IOException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignmentType);
	elementSendKeys(Pm.getClaimPage().AssignmentType,Utils.readExcelFile(filepath, "Sheet4", 16, 1));
	KeywordEvents(Pm.getClaimPage().AssignmentType);
}
@Given("A User Select Examiner")
public void aUserSelectExaminer() throws InterruptedException, IOException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignExaminer);
	elementSendKeys(Pm.getClaimPage().AssignExaminer,Utils.readExcelFile(filepath, "Sheet4", 17, 1));
	KeywordEvents(Pm.getClaimPage().AssignExaminer);
}
@Given("A User Select TPA Reviewer")
public void aUserSelectTPAReviewer() throws InterruptedException, IOException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AssignTpaReviewer);
	elementSendKeys(Pm.getClaimPage().AssignTpaReviewer,Utils.readExcelFile(filepath, "Sheet4", 18, 1));
	KeywordEvents(Pm.getClaimPage().AssignTpaReviewer);
}
@Then("A User Select Client Adjuster.")
public void aUserSelectClientAdjuster() throws InterruptedException, IOException {

	hiddenElements(Pm.getClaimPage().ClientAdjuster);
	setAttributeValue(Pm.getClaimPage().ClientAdjuster, Utils.readExcelFile(filepath, "Sheet4", 19, 1));
	Scrolldown(Pm.getClaimPage().ClientAdjuster);
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().ClientAdjuster);
	elementSendKeys(Pm.getClaimPage().ClientAdjuster,Utils.readExcelFile(filepath, "Sheet4", 19, 1));
KeywordEvents(Pm.getClaimPage().ClientAdjuster);
}

@When("A User Clicks Update claim button.")
public void aUserClicksUpdateClaimButton() {
 elementClick(Pm.getClaimPage().updateClaimbutton);
}

@Then("A User Should Verify Claim updated Pop-up.")
public void aUserShouldVerifyClaimUpdatedPopUp() throws IOException {
   gettext(Pm.getClaimPage().UpdatedSuccessfullyPopUp);

   elementClick(Pm.getClaimPage().UpdatedclaimPop);
   elementClick(Pm.getClaimPage().ClickCancel);
}


/////////////////////////////////////////Closed claim///////////////////////////////

@Given("A User click  AdvanceFilter Button,")
public void aUserClickAdvanceFilterButton() {
   elementClick(Pm.getClaimPage().AdvanceFilter);
}
@Given("A User Enter Ryzefile number,")
public void aUserEnterRyzefileNumber() throws InterruptedException {
	Thread.sleep(3000);
//	click(Pm.getClaimPage().AdvanceFilterRyzezfile);
  String Filenumber = FileReaderUtil(RyzefileNumber);
	elementSendKeys(Pm.getClaimPage().AdvanceFilterRyzezfile, Filenumber);

}
@When("A User click Search button,")
public void aUserClickSearchButton() throws InterruptedException {
	Thread.sleep(3000);
   elementClick(Pm.getClaimPage().AdvanceSearch);
}
@Then("A User Should Verify RyzeFile number,")
public void aUserShouldVerifyRyzeFileNumber() throws InterruptedException, Throwable {
   gettext(Pm.getClaimPage().VerifyRyzefilenumber);
   Thread.sleep(3000);

}

@Then("A User clicks Close claim button,")
public void aUserClicksCloseClaimButton() throws InterruptedException {
	  Thread.sleep(1000);


	  highlightElement(Pm.getClaimPage().claimStatus);

	  elementClick(Pm.getClaimPage().claimStatus);

}
@When("A User clicks Save button.")
public void aUserClicksSaveButton() throws InterruptedException {
	  Thread.sleep(1000);
    elementClick(Pm.getClaimPage().changeClaimStatus);
}
@Then("A User Should verify Wheather Claim is closed or not?")
public void aUserShouldVerifyWheatherClaimIsClosedOrNot() throws IOException, InterruptedException {
	driver.navigate().refresh();
	Thread.sleep(4000);
	elementClick(Pm.getClaimPage().AdvanceFilter);
	Thread.sleep(2000);

	String Filenumber1 = FileReaderUtil(RyzefileNumber);
	elementSendKeys(Pm.getClaimPage().AdvanceFilterRyzezfile, Filenumber1);
	Thread.sleep(2000);

	elementClick(Pm.getClaimPage().AdvanceSearch);
	Thread.sleep(2000);

	Assertion(Pm.getClaimPage().claimStatus, "Closed");


}
////////////////////////////////////////////////////////Reopen claim/////////////////////////////

@Then("A User clicks Reopen button")
public void aUserClicksReopenButton() throws InterruptedException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().AdvanceFilter);
	Thread.sleep(2000);

	String Filenumber1 = FileReaderUtil(RyzefileNumber);
	elementSendKeys(Pm.getClaimPage().AdvanceFilterRyzezfile, Filenumber1);
	Thread.sleep(2000);

	elementClick(Pm.getClaimPage().AdvanceSearch);
	Thread.sleep(2000);

	 elementClick(Pm.getClaimPage().claimStatus);
	 elementClick(Pm.getClaimPage().ReopenConfirmPopUp);

System.out.println("Reopen status is stage.");
}
@Then("A User select Reopen reason and Sub reason")
public void aUserSelectReopenReasonAndSubReason() throws InterruptedException, IOException {
	Thread.sleep(2000);
	elementClick(Pm.getClaimPage().ReOpenReason);
	elementSendKeys(Pm.getClaimPage().ReOpenReason,Utils.readExcelFile(filepath, "Sheet4", 20, 1));
   KeywordEvents(Pm.getClaimPage().ReOpenReason);


   elementClick(Pm.getClaimPage().SubReason);
	elementSendKeys(Pm.getClaimPage().SubReason,Utils.readExcelFile(filepath, "Sheet4", 21, 1));
KeywordEvents(Pm.getClaimPage().SubReason);
}
@When("A User clicks Save button in A pop-up.")
public void aUserClicksSaveButtonInAPopUp() throws IOException, InterruptedException {
   elementClick(Pm.getClaimPage().ReopenSave);
   Thread.sleep(2000);

   String Filenumber1 = FileReaderUtil(RyzefileNumber);
	elementSendKeys(Pm.getClaimPage().QuickSearch, Filenumber1);

	Assertion(Pm.getClaimPage().claimStatus, "Reopened");

 replacestring(RyzefileNumber);
}


}
