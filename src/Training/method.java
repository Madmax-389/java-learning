package Training;

import java.util.Scanner;

public class method {

	public static boolean ispalindrom(int n ) {
		int original=n;
		int reversed=0;
	while (n!=0) {
		int digit =n%10;
		reversed=reversed*10+digit;
		n=n/10;
			
		}
	return reversed==original;
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wanna check");
		int n= sc.nextInt();
		if(ispalindrom(n)) {
	System.out.println("it is a palindrom");}
	else {
		System.out.println("It is not a palindrom");
	}
}
	}

