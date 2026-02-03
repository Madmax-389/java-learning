package com.practise.oops;
class Movie {
	String title;
	float rating;
	int duration;
	
	Movie(String str1,double rat){
		title=str1;
		rating=(float) rat;
	}
	Movie(String str2, double d,int dur){
		title=str2;
		rating=(float) d;
		duration=dur;
	}
	
	void Moviedetail() {
		System.out.println("Title :"+title);
		System.out.println("Rating :"+rating);
		System.out.println("Duration :"+duration);
	}
}
public class constructorpractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie a = new Movie("Intersteller",8.6,169);
Movie b =new Movie("Inception",8.8);

a.Moviedetail();
b.Moviedetail();
	}

}
