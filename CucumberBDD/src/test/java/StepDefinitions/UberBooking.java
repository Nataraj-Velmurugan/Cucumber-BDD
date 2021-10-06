package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBooking {
	
	@Given("user wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String string) {

	    
	}

	@When("user selects car {string} and pick up point {string} and drop location {string} exit")
	public void user_selects_car_and_pick_up_point_and_drop_location(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
