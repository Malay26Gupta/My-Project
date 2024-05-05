package amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void navigateTo(String url)
	{
		driver.get(url);
	}
}
