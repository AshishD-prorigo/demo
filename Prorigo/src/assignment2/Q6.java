package assignment2;
//Write a program to count the total number of characters in a string
public class Q6 {

	public static void main(String[] args) {
		
		String a="ashish damahe abc";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=' ') {
			count++;
			}
		}
		System.out.println(count++);

	}

}
