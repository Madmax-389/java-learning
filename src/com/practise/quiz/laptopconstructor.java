package com.practise.quiz;

class Laptop{
	
	String brand;
	double price;
	int ram;
	


Laptop(String brand,double price,int ram){
	this.brand=brand;
	this.price=price;
	this.ram=ram;
	
}

void display() {
	System.out.println("This "+brand+ " laptop has "+ram+" GB RAM and cost rs "+price);
}
}
public class laptopconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Laptop a = new	Laptop("Dell",75000,32);
	Laptop b = new	Laptop("HP",65000,16);
	
	a.display();
	b.display();

	}

}
