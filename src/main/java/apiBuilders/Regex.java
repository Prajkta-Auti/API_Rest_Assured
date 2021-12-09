package apiBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
 //String zz="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PATTERN="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
			List<String> values = new ArrayList<String>();	
			values.add("Jaisingh1A@a"); 

	 
			Pattern pattern = Pattern.compile(PATTERN);
			for (String value : values){
			  Matcher matcher = pattern.matcher(value);
			  if(matcher.matches()){
				  System.out.println("Password "+ value +" is valid");
			  }else{
				  System.out.println("Password "+ value +" is invalid");
			    
			}
		}
	}

}
