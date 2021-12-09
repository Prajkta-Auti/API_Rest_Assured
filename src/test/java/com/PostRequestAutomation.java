package com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequestAutomation {
	@Test
public void PostRequest() {
	RestAssured.baseURI="https://reqres.in/api/users";
	String jscon="{\r\n" + 
			"    \"name\": \"morpheus\",\r\n" + 
			"    \"job\": \"leader\"\r\n" + 
			"}";
	RestAssured.given().body(jscon).post().then().log().all().assertThat().statusCode(201);
}
}
