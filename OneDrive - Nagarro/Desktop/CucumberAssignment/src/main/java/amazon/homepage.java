package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends BasePage {
	private By searchBox =  By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	private By signInLink = By.id("nav-link-accountList-nav-line-1");
	private By amazonLogo = By.id("nav-logo-sprites");
	public homepage(WebDriver driver) {
		super(driver);
	}
	
	public void clickSignIn()
	{
		driver.findElement(signInLink).click();
	}
	
	public void searchForProduct(String product)
	{
		driver.findElement(searchBox).sendKeys(product);
		driver.findElement(searchBox).submit();
	}

	public boolean isAmazonLogoDisplayed() {
		return driver.findElement(amazonLogo).isDisplayed();
	}
}
