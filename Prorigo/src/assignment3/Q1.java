package assignment3;

import java.util.Scanner;

//Write a program to check if a given number is prime or not
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int count=0;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				count++;
			}	
		}
			if(count==0){
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");	
		}
	}

}
