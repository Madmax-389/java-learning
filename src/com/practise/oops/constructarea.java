package com.practise.oops;
class Area{
	int length; 
	int width; 
	
	Area(int length,int width){
		this.length=length;
		this.width=width;
		
	}
	int area() {
		return (length*width);
	}
	
}
public class constructarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area rectangle = new Area(6,8);
		System.out.println("Area of rectangle is: "+rectangle.area());
	}

}
