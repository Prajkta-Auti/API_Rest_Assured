package apiBuilders;

public class Try {
		public static void main(String args[]){
		  String example="abababcdefababcdab";
		  String arr="ab";
		  char prevchar = ' ';
		  String n="";
		  for(int i=0;i<example.length();i++) {
			  if (example.contains(arr)) {
				  example=example.replace("ab", "X"); 
				
				 for(int j=0;j<example.length();j++)
				  {
				  if(prevchar!=example.charAt(j)) {
					 n=n+example.charAt(j);
					 prevchar=example.charAt(j);
				  }
				  
				  }
				  
			  }
		  }
		  System.out.println(example);
		  System.out.println(n);
		 /* for(int j=0;j<example.length();j++)
		  {
		  if(prevchar!=example.charAt(j)) {
			 n=n+example.charAt(j);
			 prevchar=example.charAt(j);
		  }
		  
		  }
		  System.out.println(n);*/
		}
	
		}

