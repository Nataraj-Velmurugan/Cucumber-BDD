package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/AppFeatures/Hooks.feature" },
		glue = {"StepDefinitions", "CustomHooks"},
		tags="@Smoke or @Regression",
		plugin= {"pretty"}

)

public class HooksTest {
	

}
