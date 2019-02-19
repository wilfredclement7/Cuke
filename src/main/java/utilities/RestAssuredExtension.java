package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredExtension {
	
	public static RequestSpecification Request;
	
	public RestAssuredExtension() {
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://127.0.0.1:3000");
		builder.setContentType(ContentType.JSON);
		
		var request = builder.build();
		Request = RestAssured.given().spec(request);
	}

}