package Training;

import java.util.Scanner;

public class arrayy {

	public static void main(String[] args) {
		// to ask user how many numbers they want to enter and then to print sum and min/max 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you want to enter");
		int n = sc.nextInt();
		int arr[]=new int [n];
		int sum =0;
		int min;
		for(int i =0;i<n;i++) {
			System.out.println("Enter the number "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("You entered :");
for (int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
			
			min =arr[0];
		for (int j=0;j<n;j++) {
			sum = sum+arr[j];
			
		if (arr[j]<min) {
			min =arr[j];
		}
		
		}
		System.out.println("\n The sum of the number is :" + sum);
		System.out.println("\n The smallest number is :" + min);
	}}
	
