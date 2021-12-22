package assignment2;
//Write a program to replace lower-case characters with upper-case and vice-versa
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
			}
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
		char cn =' ';
		char c[]=new char[name.length()];
		for(int i=0;i<name.length();i++) {
			c[i]=name.charAt(i);
		}
		System.out.println();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='A' && c[i]<='Z')
			cn=(char)(c[i]+32);
			else if(c[i]>='a' && c[i]<='z') {
				cn=(char)(c[i]-32);
			}
			System.out.print(cn);
		}
		
		
		

	}

}
