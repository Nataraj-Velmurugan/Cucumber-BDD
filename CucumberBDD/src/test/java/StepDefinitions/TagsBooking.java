package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsBooking {
	
	@Given("user wants to select a car type from uber app as {string}")
	public void user_wants_to_select_a_car_type_from_uber_app_as(String string) {
		
		System.out.println("I am success");

	}

	@When("user selects car pick up point")
	public void user_selects_car_pick_up_point() {

	}

	@Then("driver starts the journeys")
	public void driver_starts_the_journeys() {

	}

	@Then("driver ends the journeys")
	public void driver_ends_the_journeys() {

	}

	@Then("user pays USD {int}")
	public void user_pays_usd(Integer int1) {

	}

}
