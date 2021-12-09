package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class fileandEnv {
public static Map<String, String> fileandenv=new HashMap<String,String>();
public static Properties propMain=new Properties();
public static Properties propPreSet=new Properties();

String env=(System.getProperty("dev"));
public static Map<String, String> envAndFile(){
String env=(System.getProperty("env"));
try {
	if(env.equalsIgnoreCase("dev")) {
		FileInputStream fisdev = new FileInputStream("Input/dev.properties");
		propMain.load(fisdev);
		fileandenv.put("ServerURL", propMain.getProperty("ServerURL"));
		fileandenv.put("portNo", propMain.getProperty("portNo"));
		fileandenv.put("username", propMain.getProperty("username"));
		fileandenv.put("password", propMain.getProperty("password"));
	}
	else if(env.equalsIgnoreCase("qa")){
		FileInputStream fisqa = new FileInputStream(System.getProperty("Input/qa.properties"));
		propMain.load(fisqa);
		fileandenv.put("ServerURL", propMain.getProperty("ServerURL"));
		fileandenv.put("portNo", propMain.getProperty("portNo"));
		fileandenv.put("username", propMain.getProperty("username"));
		fileandenv.put("password", propMain.getProperty("password"));
	}
	else if(env.equalsIgnoreCase("staging")){
		FileInputStream fisstaging = new FileInputStream(System.getProperty("user.dir")+"/Input/staging.properties");
		propMain.load(fisstaging);
		fileandenv.put("ServerURL", propMain.getProperty("ServerURL"));
		fileandenv.put("portNo", propMain.getProperty("portNo"));
		fileandenv.put("username", propMain.getProperty("username"));
		fileandenv.put("password", propMain.getProperty("password"));
	}
}catch(Exception e) {
}
return fileandenv;
}
public static Map<String ,String> getconfigReader()
{
	if (fileandenv==null) {
		fileandenv=envAndFile();
	}
	return fileandenv;
}
}
