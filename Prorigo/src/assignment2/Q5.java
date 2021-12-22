package assignment2;
//Write a program to remove Duplicate Element in an array
public class Q5 {

	public static void main(String[] args) {
		int arr[]= {10,20,5,90,60,15,10,90};
		int k=0;
		int c[]=new int [arr.length];
		
		for(int i=0;i<arr.length;i++ ) {
			boolean flag=false;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				c[k]=arr[i];
				k++;
			}
		}
		for(int a:c) {
			System.out.print(a+" ");
		}
		

	}

}
