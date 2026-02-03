package Training;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

for (int i=2;i<=100;i++) {
	boolean isprime = true;
	for (int j=2;j<=(int)Math.sqrt(i);j++) {
		if (i%j==0) {
			isprime=false;
		}
	}
	if (isprime) {
		System.out.println(i);
	}
}
	}

}
