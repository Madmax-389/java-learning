package Training;

import java.util.Scanner;

public class switchday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the first number");
int a =sc.nextInt();
System.out.println("Enter the second number");
int b =sc.nextInt();
System.out.println("Pls select the operator +,-,*,/ ");
char ch = sc.next().charAt(0);
switch (ch) {
case '+' :
	System.out.println("a+b = " + (a+b));
	break;
case '-' :
	System.out.println("a-b = " + (a-b));
	break;
case '*' :
	System.out.println("a*b = " + (a*b));
	break;
case '/' :
	System.out.println("a/b = " + (a/b));
	break;
	default:
		System.out.println("invalid operator selected");

}

	}

}
