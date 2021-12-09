package com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetReqest {
	@Test
	public void GetRequestAutomation() {
		RestAssured.baseURI="https://reqres.in/api/users";
		Response res=RestAssured.given().param("page", "2").when().get();
		int statCode=res.statusCode();
		System.out.println(statCode);
		System.out.println("response body"+res.prettyPrint());
		
	}

}
