package utils;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class javaUtils {
public static String randomNumber() {
	Random random = new Random();
	int randonNumber=random.nextInt(100);
	String id=Integer.toString(randonNumber);
	return id;
	
}
public static String randomString() {
	String randomString=RandomStringUtils.randomAlphabetic(5);
	return randomString;
}
}
