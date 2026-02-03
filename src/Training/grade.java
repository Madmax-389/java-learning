package Training;

import java.util.Scanner;

public class grade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the GRADE A/B/C/D/F");
		char c = sc.next().charAt(0);
		c=Character.toUpperCase(c);
		switch (c)  {
		
		case 'A':
			System.out.println("Your grade is excellent");
			break;
		case 'B':
			System.out.println("Your grade is good");
			break;
		case 'C':
			System.out.println("Your grade is average");
			break;
		case 'D':
			System.out.println("Your grade is below average");
			break;
		case 'F':
			System.out.println("Your grade is fail");
			break;
			default:
				System.out.println("Invalid grade entered");
		}
		
		
		
		}
		
	}
	

