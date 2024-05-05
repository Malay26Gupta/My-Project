package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends BasePage {
	
	private By emailField = By.id("ap_email");
	private By continueButton = By.id("continue");
	private By passwordField = By.id("ap_password");
	private By signinButton = By.xpath("//*[@id=\"signInSubmit\"]");
	private By errorMessage = By.xpath("//h4[@class='a-alert-heading']");
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(emailField).sendKeys(email);
	}
	
	public void clickContinueButton()
	{
		driver.findElement(continueButton).click();
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void clickSigninButton()
	{
		driver.findElement(signinButton).click();
		
	}
	
	public String getErrorMessageText()
	{
		return driver.findElement(errorMessage).getText();
	}
}
