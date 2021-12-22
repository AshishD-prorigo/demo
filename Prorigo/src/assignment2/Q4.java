package assignment2;
//Write a program to sort the elements of an array in descending order
public class Q4 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,5,90,60,15};
		
		int s=0;
		
		System.out.println("Actual Element");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					s=arr[j];
					arr[j]=arr[i];
					arr[i]=s;
				}
			}
				
		}
		System.out.println();
		System.out.println("Sorted Element");
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
