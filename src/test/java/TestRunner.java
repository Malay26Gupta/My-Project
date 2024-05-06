import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class) 
@CucumberOptions(
		features = {"src/test/java/Features/HomePage.feature", "src/test/java/Features/login.feature"},
		glue = "StepDefinition",
		dryRun = false,
		tags =  "@Regression or @login" ,
		plugin = {"pretty", "html:target/cucumber.html"}
		)
public class TestRunner {

}
