import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJson {

public static void main(String[] args) throws IOException, ParseException {
	

	/*	JSONParser parser=new JSONParser();
		FileReader reader=new FileReader("‪Input/example.json");
		Object zz=parser.parse(reader);
		JSONObject object = (JSONObject)zz;*/
	 Object ob = new JSONParser().parse(new FileReader("example.json"));

     // typecasting ob to JSONObject
     JSONObject js = (JSONObject) ob;

     String firstName = (String) js.get("firstName");
     String lastName = (String) js.get("lastName");

     System.out.println("First name is: " + firstName);
     System.out.println("Last name is: " +lastName);
		JSONArray array= (JSONArray)js.get("address");
		for(int i =0; i<array.size();i++) {
			JSONObject address = (JSONObject) array.get(i);
			String street =(String)	address.get("street");
			String city =(String)	address.get("city");
			System.out.println("street: "+street);
			System.out.println("city: "+city);
			}
		
     
	}



}

