package com.practise.oops;
class overlaod{
	String name;
	int age;
	
	
	overlaod(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	overlaod(String name){
		this.name=name;
		age =18;
	}
	void display() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
}
public class constroverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
overlaod o = new overlaod("Mohit",25);
overlaod o1= new overlaod("Ram");
o.display();
o1.display();

	}

}
