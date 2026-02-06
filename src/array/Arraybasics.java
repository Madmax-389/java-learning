package array;

import java.util.Scanner;

public class Arraybasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q1 - Print all the elements 
		/*Scanner sc = new Scanner(System.in);
		
int[] arr = new int[4];
System.out.println("Enter the elements");
for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
	System.out.println("All the elements are ");
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}*/
		//Q2 - Find sum of elements 
		/*Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		System.out.println("Enter the elements");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	int sum =0;
	for (int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);*/
	
		//Q3- Find max value 
/*Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		System.out.println("Enter the elements");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max =arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max =arr[i];
			}
		}
		
		System.out.println("Max value is "+max);*/
Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		System.out.println("Enter the elements");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int count =0;
		for (int i=0;i<arr.length;i++) {
			if (!((arr[i]%2)==0)) {
				count++;
			}
		}
		
		System.out.println("THe number of odd elements are "+ count);
		
	}

}
