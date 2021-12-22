package assignment3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a program to check if given string is a valid email address
public class Q2 {
	public static boolean validEmail(String email) {
		String emailRegx="^(.+)@(.+)$";
		Pattern pat=Pattern.compile(emailRegx,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pat.matcher(email);
		return matcher.find();
		}
	public static void main(String arg[]) {
		
		
		String email="ashish@gmail.com";
		System.out.println(validEmail(email));
	}
	
}
