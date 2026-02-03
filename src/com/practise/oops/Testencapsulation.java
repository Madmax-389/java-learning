package com.practise.oops;
class Students{
	
	private String name;
	private int age;
	void setname(String newname) {
		name =newname;
		
	}
	public String getname() {
		return name;
	}
	
	void setage(int newage) {
		if(newage>0) {
		age = newage;
		}
	}
	public int getage() {

		return age;
	}
}
public class Testencapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1= new Students();
		s1.setname("Mohit");
		s1.setage(25);
		
		System.out.println("Name is "+s1.getname()+" and the age is : "+s1.getage());
		
	}

}
