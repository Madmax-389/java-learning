package Training;

import java.util.Scanner;

public class primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean isprime = false;
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				
				isprime =true;
			}
			
		}
		if (isprime) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}

	}

}
