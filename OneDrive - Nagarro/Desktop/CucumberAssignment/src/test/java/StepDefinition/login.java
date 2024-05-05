package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import amazon.Loginpage;
import amazon.homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebDriverManager;

public class login {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private Loginpage loginPage = new Loginpage(driver);
	private homepage homePage =  new homepage(driver);
	
	@Given("user is on Amazon home page")
	public void user_is_on_amazon_home_page() {
		homePage.navigateTo("https://www.amazon.in/");
	}

	@When("user clicks on Sign In")
	public void user_clicks_on_sign_in() {
		homePage.clickSignIn();
		//loginPage = new Loginpage(driver);
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String username) {
		loginPage.enterEmail(username);
	}

	@When("user click on Continue button")
	public void user_click_on_continue_button() {
	    loginPage.clickContinueButton();
	}

	@When("user enter {string} as Password")
	public void user_enter_as_password(String password) {
	    loginPage.enterPassword(password);
	  
	    
	}

	@Then("user click on Signin button")
	public void user_click_on_signin_button() {
	    loginPage.clickSigninButton();
	}
	
	@Then("user gets error message")
	public void user_gets_error_message()
	{
		String expectedResult = "There was a problem";
		String errorMessage = loginPage.getErrorMessageText();
		Assert.assertFalse(errorMessage.contains(expectedResult));
	}
}
