package Training;

import java.util.Scanner;

public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Department code 1/2/3");
int a =sc.nextInt();
System.out.println("Enter the Role code1/2");
int b =sc.nextInt();

switch (a) {
case 1:
	switch (b) {
	case 1 :
		System.out.println("Department :IT , Role :Developer");
		break;
	case 2 :
		System.out.println("Department :IT , Role :Tester");
		break;
	}
	break;
case 2:
	switch (b) {
	case 1 :
		System.out.println("Department :HR , Role :Recruiter");
		break;
	case 2 :
		System.out.println("Department :HR , Role :Manager");
		break;
	}
	break;
case 3:
	switch (b) {
	case 1 :
		System.out.println("Department :Finance , Role :Analyst");
		break;
	case 2 :
		System.out.println("Department :Finance , Role :Accountant");
		break;
	}
	break;
	
	default:
		System.out.println("You have selected option that is not available");
}

	}

}
