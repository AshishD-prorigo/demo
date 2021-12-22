package assignment1;
//Write a program that prints the numbers from 1 to 100. But for multiples of 
//three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
//For numbers which are multiples of both three and five print “FizzBuzz”.
public class Q7 {

	public static void main(String[] args) {
		String a="fizz";
		String b="Buzz";
		String c="FizzBuzz";
		
		for(int i=1;i<=100;i++) { 
			
			 if(i%3==0 && i%5==0) {
				System.out.println(c);
			}
			 else if(i%3==0) 
			{
				System.out.println(a);
			} 
				else if(i%5==0) {
					System.out.println(b);
				}
				
				else {
					System.out.println(i);
				}
		}

	}

}
