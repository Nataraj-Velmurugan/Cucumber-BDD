package StepDefinitions;

import Amazon.Product;
import Amazon.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search field in Amazon Page")
	public void i_have_a_search_field_in_amazon_page() {

	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {

		product = new Product(productName, price);

	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {

		search = new Search();

		String name = search.displayProduct(product);
		Assert.assertEquals(product.getProductName(), name);
		System.out.println("I am All");

	}

}
