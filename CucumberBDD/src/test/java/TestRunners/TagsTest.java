package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/AppFeatures/Tags.feature" }, 
		glue = {"StepDefinitions" }, 
		tags= "@Smoke or @Prod",
//		tags = "@Smoke and @Regression", 
//		tags = "@All", 
//		tags = "@Smoke or @Prod",
								
		plugin = { "pretty" }
)


public class TagsTest {

}
