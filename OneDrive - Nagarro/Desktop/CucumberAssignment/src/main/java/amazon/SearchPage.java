package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
	
	private By firstResult = By.xpath("//div[@data-index='0']//h2//a");
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickFirstResult()
	{
		driver.findElement(firstResult).click();
	}
}
