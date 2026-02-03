package com.practise.encapsulation;
class Student{
	
	private int rollno;
	private String name;
	private int marks; 
public void setroll(int rollno){
	this.rollno=rollno;
	
}
public int getroll() {
	return rollno;
}
	
public void setname(String name) {
	this.name= name;
}
	
public String getname() {
	return name;
	
}

public void setmarks(int marks) {
	this.marks=marks;
}
public int getmarks() {
	return marks;
}
}

public class encaps01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s = new Student();
s.setname("Mohit");
s.setroll(12);
s.setmarks(89);
System.out.println("Student "+s.getname()+" having roll no : "+s.getroll()+" has obtained "+s.getmarks()+" marks");
	}

}
