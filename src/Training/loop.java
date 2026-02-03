package Training;

import java.util.Scanner;

public class loop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("enter the operator: +,-,*,/");
		char c = sc.next().charAt(0);
		
		switch (c)  {
		
		case '+':
			System.out.println("Sum is "+(a+b));
			break;
		case '-':
			System.out.println("Difference is "+(a-b));
			break;
		case '*':
			System.out.println("multiplaction is "+(a*b));
			break;
		case '/':
			if (a%b==0)
			{System.out.println("division is "+(a/b));}
			else
			{System.out.println(" Quotient is  "+(a/b)+" and remainder is "+a%b );}
			break;
			default:
				System.out.println("Operator is invald");
		}
		
		
		
		}
		
	}
	

