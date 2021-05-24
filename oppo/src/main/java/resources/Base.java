package resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReuseableComponents;

public class Base {
	
	public WebDriver driver;
	ReuseableComponents rc= new ReuseableComponents();
	
	public WebDriver setupdriver() throws IOException
	{
		String browsername=rc.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		return driver;
	}

}