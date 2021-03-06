package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"src/test/resources/AppFeatures/BackGround.feature" },
			glue= {"StepDefinitions"},
			plugin = { "pretty" }
			
		)
public class BackGroundTest {

}
