package baseTest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiBuilders.postAPIBuilder;
import apiVerification.verifyApi;
import apiconfi.APIPath.apipath;
import apiconfi.Headerconfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.javaUtils;

public class PostAPITest extends UtilTest {
	@Test
	public void validpostRequest() {
		test.log(LogStatus.INFO, "Test is started");
		Headerconfig header =new Headerconfig();
		postAPIBuilder builder =new postAPIBuilder();
		javaUtils utils = new javaUtils();
		/*Random random = new Random();
		int randonNumber=random.nextInt(100);
		String id=Integer.toString(randonNumber);
		System.out.println("id"+id);
		String randomString=RandomStringUtils.randomAlphabetic(5);
		System.out.println(randomString);*/
		Response rs=RestAssured.given().when().headers(header.defaultHeader()).body(builder.PostRequestBody(utils.randomNumber(),utils.randomString(),utils.randomString())).when().post(apipath.CREAT_USER);
		System.out.println(rs.getStatusCode());
		System.out.println(rs.getBody().prettyPrint());
		verifyApi.responseCodeValiddation(rs, 201);
		verifyApi.responseKeyValidationFromJsonObject(rs, "title");
		verifyApi.responseTimeValidation(rs);
		test.log(LogStatus.INFO, "Test ended");
	}

}
