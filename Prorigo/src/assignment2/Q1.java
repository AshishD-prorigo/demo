package assignment2;
//Assignment 2:
//Write a program to left rotate elements of an array by the delimiter specified. 
//Suppose array is [1, 2, 3, 4, 5] and delimiter is 1, then after left rotation it 
//should be:
//[2, 3, 4, 5, 1].
//If delimiter is 2 then array should [3,4,5,1,2]

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Delimiter Point");
		int split=sc.nextInt();
		int rotate=split;
		
		int arr2[]=new int[arr.length];
		
		int k=0;
		while(rotate<arr.length) {
			arr2[k]=arr[rotate];
			k++;
			rotate++;
		}
		rotate=0;
		while(rotate<split) {
			arr2[k]=arr[rotate];
			k++;
			rotate++;
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
