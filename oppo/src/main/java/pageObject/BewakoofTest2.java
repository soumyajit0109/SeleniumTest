package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BewakoofTest2 {
	
	public WebDriver driver;
	
	private By Click_On_Catagor = By.id("loginLink");
	private By Click_On_email = By.id("web_email_login");
	private By Click_On_emailid = By.xpath("//input[@name='email']");
	private By Click_On_password =By.xpath("//input[@name='password']") ;
	private By Click_On_submit =By.xpath("//button[@type='submit']") ;
	//driver.findElement(By.id("mob_email_login")).sendKeys(userName); 
	//driver.findElement(By.id("password")).sendKeys(passWord);
	
	public BewakoofTest2(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getClick_On_Catagor() {
		return driver.findElement(Click_On_Catagor);
	}

	public WebElement getClick_On_email() {
		return driver.findElement(Click_On_email);
	}
	
	public WebElement getClick_On_emailid() {
		return driver.findElement(Click_On_emailid);
	}
	
	public WebElement getClick_On_password() {
		return driver.findElement(Click_On_password);
	}
	
	public WebElement getClick_On_submit() {
		return driver.findElement(Click_On_submit);
	}
	
	
}
	