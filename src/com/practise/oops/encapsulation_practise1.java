package com.practise.oops;
class Employee{
	
	private int id;
	private String name;
	private int salary;
	
	public void setid1(int id) {
		this.id=id;
		
	}
	
	public int getid1() {
		return id;
	}
	
	public void setname(String name) {
		this.name=name;
		
	}
	
	public String getname() {
		return name;
	}
	public void setsalary(int salary) {
		
		if(salary>0) {
		this.salary=salary;
		}
		
	}
	
	public int getsalary() {
		return salary;
	}
	
	
	
	
	
}
public class encapsulation_practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee a = new Employee();
a.setid1(5);
a.setname("Mohit");
a.setsalary(-123);

System.out.println("Employee id is : "+a.getid1());
System.out.println("Employee name is : "+a.getname());
if (a.getsalary()>0) {
	System.out.println("Salary is : "+a.getsalary());
}
else {
	System.out.println("Salary is not properly set ");
}
	}

}
