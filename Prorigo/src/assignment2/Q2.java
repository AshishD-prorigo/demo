package assignment2;

import java.util.Scanner;

//Write a program to print the duplicate elements of an array
//[1,2,3,4,4,5,2,6]
//Duplicates: 4, 2
public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the Element of array");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Duplicate element are");
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println(a[i]);
				}
			}
		}
		
		

	}

}
