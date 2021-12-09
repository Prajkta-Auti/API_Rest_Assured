package apiBuilders;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateChar {
	//Enter yout name and return a string "print the title first and then comma and then first letter of initial name
	//public static void main(String args[]) {
		/*String name="Ms Prajkta Auti";
		String n=name.substring(0, 4).replace(" ", ",");
		System.out.println(n);
		*/
	/*//Write a Program that accepts a string and removes the duplicate characters
	String s="Sorrryysorry";
	char ch=s.charAt(0);
	String n=" ";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			
			System.out.println("repeat");
			ch=s.charAt(i);
		}
		else {
		 n=n+s.charAt(i);
		}
	}
	System.out.println("n value: "+n);*/
	/*	String s="orrryysorry";
		char[] arr=s.toCharArray();
		LinkedHashSet<Character>sc= new LinkedHashSet();
		for(char c : arr)
		sc.add(c);
		StringBuilder sb = new StringBuilder();
		for (Character character : sc) {
		    sb.append(character);
		}*/
		//System.out.println(sb.toString());
		
		
		//correct way
		/*String str="sorrysorry";
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean repeatedChar;
		for (int i = 0; i < chars.length; i++) {
		    repeatedChar = false;
		    for (int j = i + 1; j < chars.length; j++) {
		        if (chars[i] == chars[j]) {
		            repeatedChar = true;
		            break;
		        }
		    }
		    if (!repeatedChar) {
		        sb.append(chars[i]);
		    }
		}
		System.out.println(sb.toString());*/
		
		/*String str1="zzzzzzzzzetvcvfgf";
		String ch="";
		for(int i1=0;i1<str1.length();i1++) {
			for(int j1=i1+1;j1<str1.length();j1++) {
				if(str1.charAt(i1)!=str1.charAt(j1)) {
					ch=ch+str1.charAt(i1);
					
				}
				else {
					break;
				}
			}
		
		}
		System.out.println(ch);*/
		//
		/*String [] words = name. split(" ", 1);
		
		for (String word : words)
		System. out. println(word);*/
		
		/*String arr[]=name.split(" ");
		for(int i =0; i<2; i++) {
			
		}*/
		//System.out.println(name);
	//}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "abababcdefababcdab";
		
		String arr[] = s.split("(?<=\\G.{2})");
	
		for(int i =0; i<arr.length; i++) {
			
			if(arr[i].equals("ab")) {
				
				arr[i] = "X";
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}*/
	@Test
	public void duplicateNumber() {
		int arr[]= {1,22,1,4,};
		Set az= new HashSet();
		for(int num : arr) 
			az.add(num);
		System.out.println(az);
	}

	}


