package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.WebDriverManager;

public class Hooks {
	
	@Before
	public void setUp()
	{
		WebDriverManager.initializeDriver("chrome");
	}
	
	@After
	public void tearDown()
	{
		WebDriverManager.quitDriver();
	}
	
}
