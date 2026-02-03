package Training;

public class overload {
	
	public static int sum(int a , int b) {
		
		return a+b;
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3,4));
		System.out.println(sum(3,4,9));
		
		
	}

}
