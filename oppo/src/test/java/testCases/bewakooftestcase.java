package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import PageObject.bewakooftest1;
import pageObject.BewakoofTest1;
import resources.Base;
import utility.ReuseableComponents;

public class bewakooftestcase extends Base {
	
	public WebDriver driver;
	public static Logger Log=(Logger) LogManager.getLogger(bewakooftestcase.class.getName());
	ReuseableComponents rc = new ReuseableComponents();
	

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		driver = setupdriver();
		String bewakooftestcaseurl = rc.getProperty("url");
		driver.get(bewakooftestcaseurl);
		Log.info("driver setup successfull");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
		Log.info("driver setup closed");
	}
	
	@Test(priority=1)
	public void DefaultTest()
	{
		BewakoofTest1 c6= new BewakoofTest1(driver);
		c6.getClick_On_Catagory().click();
	}
	
	@Test(priority=2)
	public void DefaultTestpass()
	{
		BewakoofTest1 c= new BewakoofTest1(driver);
		c.getClick_On_Catagor().click();
	}
	

}



