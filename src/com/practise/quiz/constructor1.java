package com.practise.quiz;
class Movie{
	String title;
	float rating; 
	int duration;
	
	Movie(String name,float rate,int time){
		title= name;
		rating=rate;
		duration= time;
		
	}
	
	void showDetails() {
		
		System.out.println("Title : "+title);
		System.out.println("Rating : "+rating);
		System.out.println("duration : "+duration+" mins ");
	}
	
}
public class constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie a = new Movie("Intersteller",8.5f,146);
a.showDetails();
	}

}
