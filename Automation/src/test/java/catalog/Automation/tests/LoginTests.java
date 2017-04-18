package catalog.Automation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import catalog.Automation.common.CommonMethods;
import catalog.Automation.common.ReadPropertyFile;
import catalog.Automation.pages.SignInPage;
import catalog.Automation.pages.WelcomePage;

public class LoginTests {
	private WebDriver driver;
	public CommonMethods CM;
	

		@Parameters({ "remoteBrowserType" })
		@BeforeMethod(alwaysRun=true)
		public void setUp(String remoteBrowserType)throws Exception{
		CM = new CommonMethods();
			driver = CM.getDriver();
		ReadPropertyFile ReadPropertyFile =new ReadPropertyFile();
		String browser =ReadPropertyFile.getConfigPropertyVal("BrowserType");
		driver=CM.openBrowser(browser);
		String getURL =ReadPropertyFile.getConfigPropertyVal("URL");

		CM.navigateToSite(getURL);
		}
	
	
	@AfterMethod(alwaysRun=true) 
	public void after(ITestResult it) throws Exception{
	    driver.manage().deleteAllCookies(); 
		CM.tearDown();
	}	

	@Test
	public void testLogin01(){
		//System.out.println("I am in Test");
		WelcomePage WelcomePage = new WelcomePage(driver);
	
		SignInPage SignInPage=WelcomePage.clickLogYOurSelfLink();
	//	AccountLoginPages loginPage = new AccountLoginPages(driver);
		SignInPage.validLogin();
		SignInPage.clickLogOff();


	}
	
}
