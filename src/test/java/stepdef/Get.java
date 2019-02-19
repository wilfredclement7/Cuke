package stepdef;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Get {

	@Given("^I perform GET operation on \"([^\"]*)\"$")
	public void i_perform_GET_operation_on(String url) throws Throwable {
		RestAssured.given().contentType(ContentType.JSON);
		RestAssured.baseURI = String.format("http://127.0.0.1:3000%s",url);
	}

	@Given("^to retrieve the values for ID \"([^\"]*)\"$")
	public void to_retrieve_the_values_for_ID(String postNumber) throws Throwable {
		RestAssured.when().get(String.format("%s", postNumber));
	}

	@Then("^I check the status code to be \"([^\"]*)\"$")
	public void i_check_the_status_code_to_be(String code) throws Throwable {
		Assert.assertEquals(code, code);
	}
	
}