package assignment2;
//Write a program to find the duplicate characters in a string
public class Q11 {
	
	public static void main(String arg[]) {
		String str="salmnlmbl";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[j]!=' ') {
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
		
		
		
	}

}
