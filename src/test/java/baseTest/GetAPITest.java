package baseTest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiVerification.verifyApi;
import apiconfi.APIPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.fileandEnv;

public class GetAPITest extends UtilTest {
	@Test
	public void GetapiTest() {
		Response rs=RestAssured.given().when().get(APIPath.apipath.GET_LIST_OF_POSTS);
		verifyApi.responseCodeValiddation(rs, 400);
		verifyApi.responseKeyValidationfromArray(rs, "title");
		verifyApi.responseTimeValidation(rs);
		/*System.out.println(rs.getStatusCode());
		System.out.println(rs.getBody().asString());*/
		/*test.log(LogStatus.INFO, rs.getBody().asString());
		test.log(LogStatus.INFO, ""+rs.getStatusCode());
		*/
		/*JSONArray ar=new JSONArray(rs.getBody().asString());
		for(int i=0;i<ar.length();i++) {
		JSONObject object =ar.getJSONObject(i);
		System.out.println(object.get("title"));
	}*/
	}
}
