package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;

public class Test {
public static void main(String[] args) throws IOException {
	String filepath="Input/dev.properties";
	Properties prop=new Properties();
	String url;
	String port;
	FileInputStream sm=new FileInputStream(filepath);
	prop.load(sm);
	url=prop.getProperty("ServerURL");
	System.out.println(url);
}

}
