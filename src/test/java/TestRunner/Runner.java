package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
features = {"src\\test\\java\\Features"},
glue ={"Stepdefinition","Hooks"},
//tags = "@Login or @Entity or @Client or ~@Adjuster or @Invoice or @Claim",
//tags="@Invoice",
plugin = {"pretty",
		 "html:target\\report\\Ryze_Automation_report.html",
		 "json:target\\report\\Ryze_Automation_JReport.json",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		  },

snippets=SnippetType.CAMELCASE,
dryRun =!true)

public class Runner extends AbstractTestNGCucumberTests {

}

