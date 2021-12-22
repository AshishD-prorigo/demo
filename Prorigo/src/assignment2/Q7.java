package assignment2;
//Write a program to count the total number of vowels and consonants in a string
public class Q7 {

	public static void main(String[] args) {
		
		String name="ashish damahe";
		char na[]=new char[name.length()];
		int k=0;
		int cons=0;
		int vowel=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
			na[k]=name.charAt(i);
			k++;	
			}
		}
		
		
		for(char c:na) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowel++;
			}
			else {
				cons++;
			}
		}
		System.out.println("Vowel:"+vowel+"  "+"cons:"+cons);
		
		
		
	}

}


