package stepdeffination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StepdeffLoginPage {
	@Given("user on log in page")
	public void user_on_log_in_page() {
	   System.out.println("on log in page");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	
		List<List<String>>user= dataTable.asLists(String.class);
		for(List<String>e :user) {
			System.out.println(e);
		}
	}
	@When("user enters following details in columns")
	public void user_enters_following_details_in_columns(DataTable dataTable) {
	 List<Map<String, String>>userlist=  dataTable.asMaps(String.class,String.class);
	 //System.out.println(userlist);
	 for( Map<String, String>e:userlist) {
			System.out.println(e.get("Email"));
			System.out.println(e.get("NickName"));
			System.out.println(e.get("City"));
	 }
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("click log in button");
	}
}
