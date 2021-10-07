package StepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomDataTables {
	
	@Given("user lands ion reg page")
	public void user_lands_ion_reg_page() {

	}

	@When("user enters the following details")
	public void user_enters_the_following_details(DataTable dataTable) {
		List<List<String>> userDetails = dataTable.asLists(String.class);
		
		for(List<String> user: userDetails) {
			System.out.println(user);
		}
	}
	
	@When("user enters the following details as map")
	public void user_enters_the_following_details_as_map(DataTable dataTable) {
		List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class);
		System.out.println(userDetails);
		for(Map<String, String> user: userDetails) {
			System.out.println(user.get("name"));
		}
	}


	@Then("user registered succesfully")
	public void user_registered_succesfully() {

	}

}
