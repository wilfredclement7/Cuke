package utilities;

import java.net.URI;
import java.net.URISyntaxException;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExtension {
	
	public static RequestSpecification Request;
	
	public RestAssuredExtension() {
		//Arrange
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://127.0.0.1:3000");
		builder.setContentType(ContentType.JSON);
		
		RequestSpecification request = builder.build();
		Request = RestAssured.given().spec(request);
	}
	//Act
	public static ResponseOptions<Response> GetDetailsWithPath(String url) {
		
		try {
			Request.get(new URI(url));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}