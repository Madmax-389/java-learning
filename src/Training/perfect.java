package Training;

import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int sum =0;
for (int i=1;i<n;i++) {
	if (n%i==0) {
		sum =sum+i;
	}
}
if(sum==n) {
	System.out.println("Number is perfect ");
}
else {
	System.out.println("Number is not perfect");
}

	}

}
