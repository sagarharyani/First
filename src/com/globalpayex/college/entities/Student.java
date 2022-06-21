package com.globalpayex.college.entities;

final public class Student extends CollegeUser{

	public int roll;
	public int marks;
	private Address address;
	
	public Student(String name, char gender, int roll, int marks) {
		super(name, gender);
		this.roll = roll;
		this.marks = marks;
	}
	
	public Student(String name, char gender, int roll, int marks, Address address) {
		//this --> Student object
		//super(); //calls the super class constructor
		//Internally
		//CollegeUser(this)
		super(name, gender);
		//Internally
		//CollegeUser(name, gender)
		this.roll = roll;
		this.marks = marks;
		this.address = address;
	}
	
	/*
	public String toString() {
		return String.format("Name  : %s \nGender  : %s", this.name, this.gender);
	}
	*/
	


	public void setAddress(String hno,String state,String country,Number pincode)
	{
		this.address = new Address(hno,state,country,pincode);
		
	}
	
	public String getCountry()
	{
		if(address != null)
		return address.getCountry();
		else return "";
	}
	
	@Override
	public String getDetails() {
		String str = super.getDetails();
		//Interanlly
		//CollegeUser.getDetails(this)
		return String.format(" %s \n  %s",str,this.address.getDetails());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}
	
	

}
