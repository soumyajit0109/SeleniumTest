package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.BewakoofTest2;
import resources.Base;
import utility.ReuseableComponents;

public class bewakooftestcase2 extends Base{
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
	
	@Test(dataProvider="registerdata")
	public void DefaultTest(String email,String password)
	{
		BewakoofTest2 c1= new BewakoofTest2(driver);
		//Bewakooftest2 c2= new Bewakooftest2(driver);
		//Bewakooftest2 c3= new Bewakooftest2(driver);
		//bewakooftest2 c4= new bewakooftest2(driver);
		c1.getClick_On_Catagor().click();
	      c1.getClick_On_email().click();
		c1.getClick_On_emailid().sendKeys(email);
		c1.getClick_On_password().sendKeys(password);
		//c4.getClick_On_Login().click();
		
		
	}
	
	@DataProvider(name="registerdata")
	public Object[][] getTestData() throws FileNotFoundException, IOException
	{
		return rc.readDataFromExcel(0);
	}
	
}
