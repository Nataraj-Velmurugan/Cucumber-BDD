package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backy {
	
	@Given("I am giving the method")
	public void i_am_giving_the_method() {

	}

	@When("when i call this method")
	public void when_i_call_this_method() {

	}

	@Then("then this will get executed")
	public void then_this_will_get_executed() {

	}

	@Then("I am unique {int}")
	public void i_am_unique(Integer int1) {

	}

	@Then("I am unique {string}")
	public void i_am_unique(String string) {

	}

	@Then("I am unique always")
	public void i_am_unique_always() {

	}

	@Then("I am not unique always")
	public void i_am_not_unique_always() {

	}

}
