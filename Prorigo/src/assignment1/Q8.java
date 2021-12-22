package assignment1;
//For a given string example "Prorigo", print the below pattern:
//P
//Pr
//Pro
//Pror
//Prori
//Prorig
//Prorigo
public class Q8 {

	public static void main(String[] args) {
		String a="Prorigo";
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}

}
