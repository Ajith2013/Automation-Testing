package Baseclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Baseclass<XSSFWorkbook, XSSFSheet>

{
public static WebDriver driver;
public String filepath=".//ExcelData//Data.xlsx.xlsx";
public String sheetname="Sheet1";
public String datevalue="";
public String RyzefileNumber="";
@SuppressWarnings("deprecation")
public static WebDriver Browserlaunch(String BrowserName) {


	if (BrowserName.equalsIgnoreCase("chrome")) {
		//driver =new ChromeDriver();

  //System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src//test//resources//driver//chromedriver-win32//chromedriver.exe");
             // driver =new ChromeDriver();
  //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver-win32/chromedriver.exe");

//  ChromeOptions chromeOptions = new ChromeOptions();
//  chromeOptions.addArguments("--remote-allow-origins=*");
//  chromeOptions.addArguments("--headless"); // Enable headless mode
//  chromeOptions.addArguments("--window-size=1920,1080");
//
//  driver = new ChromeDriver(chromeOptions);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		//driver = webdriver.Chrome(service=service, options=options)
		  driver = new ChromeDriver(chromeOptions);

		 //chromeOptions.addArguments("--headless"); // Enable headless mode
	   //chromeOptions.addArguments("--window-size=1920,1080");
	    //driver = new ChromeDriver(chromeOptions);

	   }   else if (BrowserName.equalsIgnoreCase("edge")) {

		   driver =new EdgeDriver();
//		   EdgeOptions options = new EdgeOptions();
//	        options.addArguments("--start-maximized");
//	        driver = new EdgeDriver(options);
//

	 }
	     else if (BrowserName.equalsIgnoreCase("Firefox")) {
	    	 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/driver/geckodriver.exe");
	    	 FirefoxOptions options = new FirefoxOptions();
	    	    options.setHeadless(false); // Enable headless mode

	    	    driver = new FirefoxDriver(options);
	    	 //driver = new FirefoxDriver();


	    	  //System.getProperty("webdriver.gecko.driver",
	    			//  System.getProperty("user.dir")+"src//test//resources//driver//geckodriver.exe");
	    	// driver =new FirefoxDriver();
//	     	FirefoxOptions options=new FirefoxOptions();
//
//		    driver = new FirefoxDriver(options);

	}driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	return driver;
	}


	String myVar = System.getenv("MY_VAR");

		   /////////////////////// ///////Launch the Url///////////////////////
	public static void getUrl(String url) {
				try {
						driver.get(url);
} 					catch (Exception e) {
						System.err.println("Invalid URL :"+e.getMessage());
}
	}


	public void Assertion(WebElement element,String string) {
	    String text = element.getText();
	    System.out.println(text);
	    Assert.assertEquals(text, string);
		//Asserts.assertEquals(string, text);

	}





	public static boolean elementIsdisplayed(WebElement element) {
		boolean display=false;
				try {
					visiablityofelement().until(ExpectedConditions.visibilityOf(element));
					display=element.isDisplayed();
					String text = element.getText();
					System.out.println(text);

		}		 catch (Exception e) {
					System.err.println("Element not displayed : "+e.getMessage());
		}
				return display;
	}
	//////////////////////////////////sendkey//////////////////////////////////////
	public static void elementSendKeys(WebElement element,String value) {
				try {
						visiablityofelement().until(ExpectedConditions.visibilityOf(element));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].style.border='5px solid Green'",element);

						element.sendKeys(value);

} 				catch (Exception e) {
						System.err.println("Unable to Enter the value : "+e.getMessage());
}
	}
	public String gettext(WebElement element ) {
	try {
		String text = element.getText();
		RyzefileNumber=text;
		System.out.println(text);
	} catch (Exception e) {
		System.out.println("No text");
	}
	return RyzefileNumber;

	}
	public void click(WebElement element) {
		visiablityofelement().until(ExpectedConditions.visibilityOf(element));
		//element.isSelected();/////////////////////////////////////////
	    element.click();

	}
	public static void ClickbyAction(WebElement element) {
		visiablityofelement().until(ExpectedConditions.visibilityOf(element));
		Actions ac=new Actions(driver);
		ac.click().build().perform();
}

	public static void elementClick(WebElement element) {
				try {
					visiablityofelement().until(ExpectedConditions.elementToBeClickable(element));
					((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
} 				catch (Exception e) {
					System.err.println("Unable to Click A button: "+e.getMessage());
}
	}


	////////////////////////////////Screenshot/////////////////////////////////
	public static byte[] reports_Screenshot() {
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				return screenshot;
	}
	public static WebDriverWait visiablityofelement() {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

				return wait;
	}
	//////////////////////////////////dropdown/////////////////////////////////
	public static void dropdownselect(WebElement element,String value) {
				try {
					visiablityofelement().until(ExpectedConditions.visibilityOf(element));
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].style.border='5px solid orange'",element);

					Select sc = new Select(element);
					sc.selectByVisibleText(value);


} 				catch (Exception e) {
	System.err.println("Unable to select a value");
}




}
	public void KeywordEvents(WebElement element) {
	    Actions action = new Actions(driver);

	    // Move to the element, press Arrow Down, and then press Enter
	    action.moveToElement(element)
	          .sendKeys(Keys.ARROW_DOWN)
	          .sendKeys(Keys.ENTER)
	          .build()
	          .perform();
	}

				public static void dropdownselectdown(WebElement element,String value) {
					try {
						visiablityofelement().until(ExpectedConditions.visibilityOf(element));
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].style.border='5px solid orange'",element);

							element.sendKeys(value,Keys.ENTER);
							//element.click();
	} 				catch (Exception e) {
						System.out.println("Unable to select a value");

	}

	}
				public static void RemoveText(WebElement element) {
					element.sendKeys(Keys.CONTROL,Keys.chord("a"));
					element.sendKeys(Keys.BACK_SPACE);
				}

	public static void setAttributeValue(WebElement element, String value){
						visiablityofelement().until(ExpectedConditions.visibilityOf(element));
						JavascriptExecutor js = (JavascriptExecutor) driver;

						js.executeScript("arguments[0].style.border='5px solid Green'",element);

			js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, "value", value);
	}

	public static void DropdownbyAction(WebElement element,String value) throws InterruptedException {
						Actions action = new Actions(driver);
							action.sendKeys(element, value).build().perform();
							Thread.sleep(3000);
					action.click(driver.findElement(By.xpath("//li[text()='"+value+"']"))).build().perform();

							JavascriptExecutor js=(JavascriptExecutor)driver;
							js.executeScript("arguments[0].style.border='5px solid orange'",element);


	}

	public static void elementvisibleclick(WebElement element, String value) {


    			try {
					visiablityofelement().until(ExpectedConditions.visibilityOf(element));
					element.click();
				} catch (Exception e) {

					e.getMessage();
				}
    			}


	public static void Scrolldown(WebElement element) {
		try {
			visiablityofelement().until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollTo(1, document.body.scrollHeight)", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}
	public void ExpectedElementisPresent(WebElement element, String value) {
		if (element.equals(value)) {
						System.out.print(value);
		} else {
			System.err.println("Expected Element is not present :");
		}
	}

	public void hiddenElements(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.visibility='visible';", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void highlightElement(WebElement element) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='5px solid green'", element);
	}


	public String generateCompanyname(String value) {
		try {
			Date date = new Date();
		    Long timeInMilliSeconds = date.getTime();
		    String FormateName=value+"_"+timeInMilliSeconds.toString();
			return FormateName;
		}
		catch(Exception err) {
			System.err.println("Invalid URL :"+err.getMessage());
		}
		return value;
	}
	public String generateLastname(String value) {
		try {
			Date date = new Date();
		    Long timeInMilliSeconds = date.getTime();
		    String FormateName=value+"_"+timeInMilliSeconds.toString();
			return FormateName;
		}
		catch(Exception err) {
			System.err.println("Invalid URL :"+err.getMessage());
		}
		return value;
	}


	public static String FileReaderUtil(String value) {
		String readedText = "";

		try (
			    FileReader reader = new FileReader("test.txt")
			) {
			    int charRead = -1;

			    while ((charRead = reader.read()) != -1) {
			        readedText=readedText+(char) charRead;
			    }
			    return readedText;
			} catch (FileNotFoundException ex) {
			    System.err.println("File not found error: " + ex);
			} catch (IOException ex) {
			    System.err.println("I/O error: " + ex);
			}
		return readedText;
	}

	public String writerFile(String text) {
		try (

			    FileWriter writer = new FileWriter(new File("test.txt"), true);

			)
		{

			writer.write(text);

		} catch (IOException ex) {
			    System.err.println(ex);
			}
		return text;
	}


	public void replacestring(String text) throws IOException {

		 String filePath = "test.txt";
	     String result = FileReaderUtil(filePath);
	     System.out.println("Contents of the file: "+result);
	     //Replacing the word with desired one
	     result = result.replaceAll(FileReaderUtil(filePath), " ");
	     //Rewriting the contents of the file
	     PrintWriter writer = new PrintWriter(new File(filePath));
	     writer.append(result);
	     writer.flush();
	     System.out.println(FileReaderUtil(filePath));
	}



	}








