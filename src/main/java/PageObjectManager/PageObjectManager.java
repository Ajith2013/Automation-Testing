package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Baseclass.Baseclass;
import Locators.AdjusterPage;
import Locators.ClaimPage;
import Locators.ClientPage;
import Locators.EntityPage;
import Locators.InvoicePage;

public class PageObjectManager<Claimpage> extends Baseclass{
//public WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		Baseclass.driver=driver;
	}

		private ClientPage Clientpage;
		public ClientPage getClientPage() {
			if (Clientpage==null) {
				Clientpage=new ClientPage(driver);
			}
			return Clientpage;
		}

	private EntityPage EntityPage;
	public EntityPage getEntityPage() {
		if (EntityPage==null) {
			EntityPage=new EntityPage(driver);
		}
		return EntityPage;
	}
		private AdjusterPage Adjusterpage;
		public AdjusterPage getAdjustertPage() {
			if (Adjusterpage==null) {
				Adjusterpage=new AdjusterPage(driver);
			}
			return Adjusterpage;
		}

private ClaimPage Claimpage;
public ClaimPage getClaimPage() {

	if (Claimpage==null) {
		Claimpage =new ClaimPage(driver);
	}
	return Claimpage;

}

private InvoicePage invoicepage;
public InvoicePage getinvoicePage() {
	if (invoicepage==null) {
		invoicepage =new InvoicePage(driver);
	}
	return invoicepage;
}

}




