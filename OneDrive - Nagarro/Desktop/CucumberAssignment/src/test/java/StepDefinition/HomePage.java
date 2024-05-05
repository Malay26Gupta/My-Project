package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import amazon.homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.WebDriverManager;

public class HomePage {
	private WebDriver driver = WebDriverManager.getDriver();
	private homepage homePage = new homepage(driver);
	@Given("User is on Amazon home page")
	public void user_is_on_Amazon_home_page() {
		homePage.navigateTo("https://www.amazon.in/");
	}

	@Then("user should see amazon logo")
	public void user_should_see_amazon_logo() {
		boolean logoDisplayed = homePage.isAmazonLogoDisplayed();
		Assert.assertTrue(logoDisplayed);
	}

	@When("user searches for {string} as product")
	public void user_searches_for(String product) {
		homePage.searchForProduct(product);
	}

	@Then("search results are displayed for {string} as product")
	public void search_results_are_displayed_for(String product) {
		System.out.println("asd");
	}

}
