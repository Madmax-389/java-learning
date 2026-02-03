package Training;

import java.util.Scanner;

public class strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=0;
		
		int original =n;
		while(n>0) {
			int digit = n%10;
			int fact=1;
			n=n/10;
			for(int i=digit;i>0;i--) {
				fact =fact*i;
			}
			sum = sum+fact;
		}
		if(sum==original) {
			System.out.println("Number is a strong number");
		}
		else {
			System.out.println("Number is not a strong number");
		}
		

	}

}
