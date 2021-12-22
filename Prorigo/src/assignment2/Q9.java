package assignment2;
//Write a program to remove all the white spaces from a string
public class Q9 {

	public static void main(String[] args) {
		
		String str="Ashish Damahe";
		str=str.replaceAll(" ", "");
		System.out.println(str);
		//
		String st1="A B C D";
		char c[]=st1.toCharArray();
		String st2="";
		for(int i=0;i<st1.length();i++) {
			if(c[i]!=' ') {
				st2=st2+c[i];
			}
		}
		System.out.println(st2);
	}

}
