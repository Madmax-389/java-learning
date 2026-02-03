package com.practise.oops;
class book{
	String title;
	String author;
	int price;
	book(String str1,String str2,int prc){
	title=str1;
	author=str2;
	price=prc;
		
	}
	void bookdetails() {
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Price : rs"+price);
	}
	
	
	
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
book a= new book("Atomic Habits","James Clear",499);

a.bookdetails();
	}

}
