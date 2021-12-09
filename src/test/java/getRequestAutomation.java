import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequestAutomation {
	@Test
public void getRequest() {
	RestAssured.baseURI="https://reqres.in/api/users";
	//RestAssured.given().when().param("page", "2").get().then().assertThat().log().all().statusCode(200);
	Response rs=RestAssured.given().when().param("page", "2").get();
	
}
}
