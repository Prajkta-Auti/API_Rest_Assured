package apiconfi;

import java.util.HashMap;
import java.util.Map;

public class Headerconfig {
	public Map <String ,String>defaultHeader(){
	Map <String ,String>defaultHeaders=new HashMap<String, String>();
	defaultHeaders.put("Content-Type", "application/json");
	defaultHeaders.put("Content-type", "application/json");
	defaultHeaders.put("Content-type", "application/json");
	return defaultHeaders;
	}
	public static void main(String[] args) {
		Headerconfig hd = new Headerconfig();
		System.out.println(hd.defaultHeader());
	}
}
