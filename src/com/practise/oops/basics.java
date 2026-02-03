package com.practise.oops;
class basic {
	String name;
	int age;
	
	void study() {
		System.out.println("The student"+name+"is of the age "+age);
	}
	
	
	
}
public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		basic a=new basic();
		a.name="Mohit";
		a.age=25;
		a.study();

	}

}
