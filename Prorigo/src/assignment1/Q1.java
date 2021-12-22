package assignment1;
//Print Fibonacci series of up to 10 numbers


public class Q1 {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int result;
		int count=10;
		for(int i=0;i<=count;++i) {
			System.out.println(num1);
			result=num1+num2;
			num1=num2;
			num2=result;
		}
		
	}

}
