package stepdeffination;

import io.cucumber.java.en.*;

public class LoginFeature {
	@Given("login page is enabled")
	public void login_pahe_is_enabled() {
	    System.out.println("page enabled");
	}

	@Then("user has to enter username {string}")
	public void user_has_to_enter_username(String string) {
	  System.out.println(string);
	}

	@Then("user has to enter password {string}")
	public void user_has_to_enter_password(String int1) {
	 System.out.println(int1);
	}
}
