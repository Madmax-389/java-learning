package Training;
import java.util.Scanner;


public class Test {
	 public static void main(String[] args) {
   Scanner b = new Scanner(System.in);
   System.out.println("enter the first number");
  int a = b.nextInt();
   System.out.println("enter the second number");
   int c = b.nextInt();
   System.out.println("enter the third number");
   int d = b.nextInt();
  /* String d = "admin";
   String e = "1234";*/
   
 int e = Math.max(a,c);
 int f = Math.min(d, e);
 System.out.println("The second largest number is " + f);
 
  /* if (Math.max(a,c)) {
	   System.out.println("Login Successful !");
   }
   else if (a.equals(d)&& !c.equals(e)) {
	   System.out.println("Incorrect Password");
   }
   else if (c.equals(e)&& ! a.equals(d)) {
	   System.out.println("Incorrect Username");
   }
   else if (! c.equals(e)&& ! a.equals(d)) {
	   System.out.println("Invalid Credentials");
   }
 //  System.out.println("The lowest number is "+ Math.min(d,Math.min(a,c)))
   ;
  /*if(a>c) {
   System.out.println(a + "is the largest number");
   }
   else if (a==c) {
	   System.out.println("both are equal");
   }
   else {
	   System.out.println(c + " is the largest number");
   }*/
		b.close();
	}
	}

