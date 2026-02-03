package Training;

import java.util.Scanner;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers you wanna enter");
int n=sc.nextInt();
int[] arr= new int[n];

System.out.println("enter the numbers you wanna sort");
for (int i=0;i<n;i++) {
	arr[i]= sc.nextInt();
}

for(int i=0;i<arr.length;i++) {
	for (int j=0;j<arr.length-1-i;j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		
		
	}
}
System.out.print("Sorted array is :");
for (int value: arr) {
	System.out.print(value+" ");
}


/*int i =0;
int j =arr.length-1;
while (i<j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;
	
}

System.out.println("Reversed array is ");
for (int value:arr) {
	System.out.println(value);
}*/

		}

}
