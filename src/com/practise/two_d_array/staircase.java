package com.practise.two_d_array;

import java.util.Scanner;

public class staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows=4;
		int columns=4;
int [][] arr= {
		{1,3,5,7},
		{2,4,6,8},
		{5,7,9,11},
		{9,10,14,17}
};

System.out.println("Enter the number you wanna search ");
int a=sc.nextInt();
int i=0;
int j=columns-1;
boolean found = false;
while(i<rows&&j>=0) {
if(arr[i][j]==a) {
	found = true;
	break;
}
else if (arr[i][j]>a) {
	j--;
}
else {
	i++;
}
	}
if (found) {
	System.out.println("Caught the element and it is at position "+(i+1)+" , "+(j+1));
}
if(!found) {
	System.out.println("Element not avaialble in the matrix ");
}
	
	}}