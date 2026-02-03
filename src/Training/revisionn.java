package Training;

import java.util.Scanner;

public class revisionn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers you wanna store");
int n = sc.nextInt()

;

int[] arr=new int[n];
System.out.println("Enter "+n+" numbers");

for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
	
}
	for (int i =0;i<arr.length;i++){
	for (int j =arr.length-1;j>i;j++)	{
		arr[arr.length-1]=arr[i];
		System.out.println("Reversed array is "+arr[j]);
	}
		
	}
		
		/*System.out.println("Which number you wnan search");
	}
	int a =sc.nextInt();
	boolean found=false;
for (int i=0;i<n;i++) {
	if (arr[i]==a) {
		System.out.println("your number is at "+ (i+1)+ " th place");
		found =true;
		break;
	}
}
if (!found) {
	System.out.println("Number could not be found");
}*/


}}