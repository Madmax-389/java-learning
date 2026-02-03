package Training;

import java.util.Scanner;

public class practise {
	public static int fact(int n) {
		int fact=1;
		for (int i =n;i>0;i--) {
			fact =fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
	System.out.println("factorial is "+fact(n));
		
	}
	
}
