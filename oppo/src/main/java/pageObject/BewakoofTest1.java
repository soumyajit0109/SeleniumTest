package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BewakoofTest1 {
	
	public WebDriver driver;
	
	private By Click_On_Catagory = By.linkText("Women");
	
	private By Click_On_Catagor = By.id("loginLink");
	
	public BewakoofTest1(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getClick_On_Catagory() {
		return driver.findElement(Click_On_Catagory);
	}
	
	public WebElement getClick_On_Catagor() {
		return driver.findElement(Click_On_Catagor);
	}

}