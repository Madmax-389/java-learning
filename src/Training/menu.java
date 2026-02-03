package Training;

import java.util.Scanner;

public class menu {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number from below menu to use the conversion:");
		System.out.println("1. KM to Miles");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("3. INR to USD");
		
		int a= sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Enter the value in KMS");
			int k= sc.nextInt();
			System.out.println("Value in miles is : "+ (0.621371)*k);
			break;
		case 2:
			System.out.println("Enter the value in Celsius");
			double c= sc.nextDouble();
			System.out.println("Value in fehrenheit is : "+ (c*9/5) + 32);
			break;
		case 3:
			System.out.println("Enter the value in INR");
			double i= sc.nextDouble();
			System.out.println("Value in dollar is : "+ 0.012*i);
			break;
			default:
				System.out.println("No conversion selected from the presented menu");
		sc.close();
		}
		
	}
}

