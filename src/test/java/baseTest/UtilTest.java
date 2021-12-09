package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import utils.ExtentReportListener;
import utils.fileandEnv;

@Listeners(ExtentReportListener.class)
public class UtilTest extends ExtentReportListener {
	@BeforeClass
	public void basetest() {
		//RestAssured.baseURI="http://localhost:3000";
		RestAssured.baseURI=fileandEnv.envAndFile().get("ServerURL");

		/*
		 * int a1 = 0,b=0,sum=0; sum=a1+b; System.out.println(fileandEnv.envAndFile());
		 * test.log(LogStatus.INFO, "test has been started"); test.log(LogStatus.PASS,
		 * "test pass"+sum); test.log(LogStatus.FAIL, "test fail"+sum);
		 */
	}
}
