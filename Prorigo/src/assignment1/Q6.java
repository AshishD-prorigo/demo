package assignment1;
//Print the factorial of a given number. Program using recursion.
public class Q6 {
	
	static int fact(int n) {
		if(n!=0) {
			return (n*fact(n-1));
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		int factorial=1;
		factorial=fact(5);
		System.out.println(factorial);

	}

}
