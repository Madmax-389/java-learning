package array;

import java.util.Scanner;

public class two_d_Array_nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many rows you want");
int r = sc.nextInt();
System.out.println("How many columns you want");
int c = sc.nextInt();
int[][]arr= new int [r][c];
System.out.println("Enter the values now ");
for (int i =0;i<arr.length;i++) {
	for (int j=0;j<arr[0].length;j++) {
		arr[i][j]=sc.nextInt();
	}
}
/*Q1 - Print all the numbers 
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr[i].length;j++) {
		
	}
}

System.out.println(" Printed elements are ");
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println("");
}*/

/*Q2 - Sum of all the numbers 
int sum=0;
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr[i].length;j++) {
		sum+=arr[i][j];
	}
}

System.out.println("Sum of all the numbers is "+ sum);*/

/*Q3 - Rowwise sum 
for (int i=0;i<arr.length;i++) {
	int rowsum=0;
	for (int j=0;j<arr[i].length;j++) {
		rowsum+=arr[i][j];
	}
	System.out.println("sum of row "+(i+1)+" is "+rowsum);
}*/
/*Q4- Columnwise sum
for (int j=0;j<c;j++) {
	int colsum=0;
	for (int i=0;i<arr.length;i++) {
		colsum+=arr[i][j];
	}
	System.out.println("sum of column "+(j+1)+" is "+colsum);
}*/

/*Q5- Largest element
int largest=arr[0][0];
for (int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		if (arr[i][j]>largest) {
			largest = arr[i][j];
		}
	}
	
	
}
System.out.println("Largest element is "+ largest);*/

System.out.println("Enter the number you wanna search ");
int a = sc.nextInt();
boolean found = false;
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr[i].length;j++) {
		if (arr[i][j]==a) {
			found =true;
			System.out.println("Mentioned element is found at row "+(i+1)+" and column "+(j+1));
		}
		
		
	}
}

if (found==false) {
	System.out.println(" Number is not found in the array");
}
	}

}

// use arr[i].length for columns not arr[0].length 