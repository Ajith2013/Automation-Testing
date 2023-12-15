package Stepdefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import Baseclass.Baseclass;
import Baseclass.Utils;
import PageObjectManager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_StepDefinition extends Baseclass {
	PageObjectManager pm=new PageObjectManager(driver);
	Utils u=new Utils();

	@Given("User launch the {string} Browser")
	public void userLaunchTheBrowser(String string) {
	    Browserlaunch(string);
	}
@Given("User Navigate the Url")
public void userNavigateTheUrl() throws IOException {
	 getUrl(Utils.readExcelFile(filepath,"Sheet1", 2,0));
}



@Given("User Enter valid UserName {string}")
public void userEnterValidUserName(String string) {
	elementSendKeys(pm.getClientPage().EnterUsername, string);
	   highlightElement(pm.getClientPage().EnterUsername);
}
@Given("User Enter Valid Password {string}")
public void userEnterValidPassword(String string) {
	elementSendKeys(pm.getClientPage().EnterPassword, string);
	   highlightElement(pm.getClientPage().EnterPassword);
}

@Given("User click the login Button")
public void userClickTheLoginButton() {
	 elementClick(pm.getClientPage().ClickLoginButton);
}
@Then("User Verify logined Successfully")
public void userVerifyLoginedSuccessfully() {

	assertTrue(elementIsdisplayed(pm.getClientPage().Verify_LoGo));
	driver.quit();
}


/////////////////////////////////////Invalid Credentails/////////////////////////////////////////////////

@Given("A User launch the {string} Browser.")
public void aUserLaunchTheBrowser(String string) {

    Browserlaunch(string);
}
@Given("A User Navigate the Ryze claim Url.")
public void aUserNavigateTheRyzeClaimUrl() throws IOException {
	getUrl(Utils.readExcelFile(filepath,"Sheet1", 2,0));
}
@Given("A User Enter invalid UserName")
public void aUserEnterInvalidUserName() throws IOException {
	elementSendKeys(pm.getClientPage().EnterUsername,Utils.readExcelFile(filepath,"Sheet1", 0, 0) );
	   highlightElement(pm.getClientPage().EnterUsername);
}
@Given("A User Enter inValid Password")
public void aUserEnterInValidPassword() throws IOException {
	elementSendKeys(pm.getClientPage().EnterPassword, Utils.readExcelFile(filepath,"Sheet1", 0, 1));
	   highlightElement(pm.getClientPage().EnterPassword);
}
@Given("A User click the login Button.")
public void aUserClickTheLoginButton() {
	elementClick(pm.getClientPage().ClickLoginButton);
}

@Then("A User Verify A Error Messsage.")
public void aUserVerifyAErrorMesssage() {
	Assertion(pm.getClientPage().VerifyErrorMessage, "Password is invalid");
//Assertion(true, pm.getClientPage().VerifyErrorMessage);
driver.quit();
}


}
