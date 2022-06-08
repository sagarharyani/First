package com.globalpayex.college.entities;

public class Student extends CollegeUser{

	int roll;
	float marks;
	
	public Student(String name, char gender, int roll, float marks) {
		//this --> Student object
		//super(); //calls the super class constructor
		//Internally
		//CollegeUser(this)
		super(name, gender);
		//Internally
		//CollegeUser(name, gender)
		this.roll = roll;
		this.marks = marks;
	}
	
	/*
	public String toString() {
		return String.format("Name  : %s \nGender  : %s", this.name, this.gender);
	}
	*/
	
	@Override
	public String getDetails() {
		String str1 = super.getDetails();
		//Interanlly
		//CollegeUser.getDetails(this)
		return String.format("%s\nRollNo : %s \nMarks : %s", str1, this.roll, this.marks);
	}
	
	

}
