package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverManager {
	private static WebDriver driver;
	
	public static void initializeDriver(String browserName)
	{
		if(driver == null)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\malaygupta\\Downloads\\chromedriver-win64\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			else
			{
				System.out.println("Unsupported browser");
			}
		}
	}
	
	public static WebDriver getDriver()
	{
		if(driver == null)
		{
			System.out.println("driver is not initialized. call driver first");
		}
		return driver;
	}
	public static void quitDriver()
	{
		if(driver != null)
		{
			driver.quit();
			driver = null;
		}
	}
}
