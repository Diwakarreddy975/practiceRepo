package stepdeffination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*
;

public class Stepdeff {

@Given("type {string} on search field with price {int}")
public void type_on_search_field_with_price(String string, Integer int1) {
  System.out.println(string+int1);
  
}

	@When("click on the search icon")
	public void click_on_the_search_icon() {
	   System.out.println("click on the search icon");
	}

	@Then("product will show")
	public void product_will_show() {
	    System.out.println("product will show");
	}
	@Before("@sanity")
	public void setup(Scenario sc) {
		System.out.println("driver initiated"+sc.getName());
	}
	@After
	public void teardown() {
		System.out.println("driver closed");
	}
}
