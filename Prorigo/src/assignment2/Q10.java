package assignment2;

import java.util.Arrays;

//Write a program to find maximum and minimum occurring character in a string
public class Q10 {

	public static void main(String[] args) {
		
		String str="ashish";
		char str1[]=str.toCharArray();
		int min;
		int max;
		char minChar=str1[0];
		char maxChar=str1[0];
		int freq[]=new int[str.length()];
		for(int i=0;i<str1.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i]==str1[j] && str1[j]!=' ' && str1[j]!='0') {
					freq[i]++;
					str1[j]='0';
				}
			}
		}
		System.out.println(Arrays.toString(freq));
		
		min=max=freq[0];
		for(int i=0;i<freq.length;i++) {
			if(min>freq[i] && freq[i]!='0') {
				min=freq[i];
				minChar=str1[min];
			}
			if(max<freq[i] && freq[i]!='0') {
				max=freq[i];
				maxChar=str1[i];
			}
		}
		System.out.println("Min Char="+minChar+" "+"Max Char="+maxChar);
		

	}

}
