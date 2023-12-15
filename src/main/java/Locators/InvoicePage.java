package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class InvoicePage extends Baseclass{

	public WebDriver driver;
     public InvoicePage(WebDriver driver) {
	        this.driver=driver;
	         PageFactory.initElements(driver, this);

}



	@FindBy(xpath = "//button[@type='button'][contains(.,'Invoices/Billing')]")
	public WebElement Invoicetab;

	@FindBy(xpath = "//button[contains(.,'Add Invoice')]")
	public WebElement Addinvoicebutton;


	@FindBy(xpath = "//select[contains(@name,'productid')]")
	public WebElement SelectLineItems;

	@FindBy(xpath = "//input[@name='qty']")
	public WebElement Qty;

	@FindBy(xpath = "//input[contains(@name,'handleAmountChange')]")
	public WebElement cost;

	@FindBy(xpath = "//input[contains(@name,'acv')]")
	public WebElement ACV;

	@FindBy(xpath = "//input[contains(@name,'rcv')]")
	public WebElement RCV;

	@FindBy(xpath = "//button[@value='CreateInvoice']")
    public WebElement CreateInvoice;


	@FindBy(xpath = "(//div[contains(.,'Invoice has been created successfully!')])[3]")
	public WebElement invoiceSuccesfully;

	@FindBy(xpath = "//button[@type='button'][contains(.,'OK')]")
	public WebElement InvoiceConfirmedOk;


	@FindBy(xpath = "(//a[contains(.,'23')])[2]")
	public WebElement RyzefileNumberclicks;


	@FindBy(xpath = "//span[contains(.,'Invoice Number')]//following::a[1]")
	public WebElement InvoiceNumberclicks;

	@FindBy(xpath = "//lable[contains(.,'Review')]")
	public WebElement Reviewinvoice;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[30]")
	public WebElement SelectReviewQBclass;


	@FindBy(xpath = "//span[contains(.,'Save')]")
	public WebElement clickSavebutton;

	@FindBy(xpath = "//span[contains(.,'Cancel')]")
	public WebElement clickcancelinvoicePage;


	@FindBy(xpath = "//button[contains(.,'Reviewed')]")
	public WebElement verifyReviewed;

	@FindBy(xpath = "//lable[contains(.,'Approve')]")
	public WebElement Approveinvoice;

	@FindBy(xpath = "//button[contains(.,'Approved')]")
	public WebElement verifyApproved;

	@FindBy(xpath = "//div[@class='swal2-html-container'][contains(.,'Invoice has been approved successfully!')]")
	public WebElement ApprovedSuccessfully;


	@FindBy(xpath = "//button[contains(.,'OK')]")
	public WebElement Approvedokbutton;


}
