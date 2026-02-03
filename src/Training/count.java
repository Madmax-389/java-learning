package Training;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers you wanna enter");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the numbers");
int evencount=0;
int oddcount=0;
for (int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	
}
for(int i=0;i<n;i++) {
	if (arr[i]%2==0) {
		evencount=evencount+1;
	}
	else {
		oddcount=oddcount+1;
	}
}
System.out.println("count of even number is "+evencount);
System.out.println("count of odd number is "+oddcount);
	}

}
