package Training;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int sum=0;
int digit = 0;
int original=n;

while  (n>0) {
	digit = n%10;
	sum =sum+digit;
	n=n/10;
}
if(original%sum==0) {
		System.out.println("It is a harshad number");
}
else {
	System.out.println("It is not a harshad number");
}

	}

}
