package com.globalpayex.college.entities;

public class StudentOld {
	
	//instance attributes
	
	String name;
	public char gender;
	public int roll;
	public float marks;
	public static int count;
	
	public StudentOld(String name, char gender, int roll, float marks){
		this.name = name;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
		StudentOld.count++; //Always use classname to access static variable, its the best practice to do this, classname.staticvarible.
		
	}
	
	public StudentOld(){
		// calling the parameterized constructor for the same object
		this("NA", 'M', -1, 0.0f);
	}
	
	
	public String getDetails() {
		//Implicit parameter called as 'this' -->s1, s2, s3 --> current object
		//return "Name:" + this.name + "\nGender:" + this.gender + "\nRoll No:" + this.roll + "\nMarks : "+ this.marks;
		return String.format("Name : %s\nGender : %s\nRoll No  : %s\nMarks : %s\n", this.name, this.gender, this.roll, this.marks);
		
	}
	
	public static StudentOld newInstance(String name, char gender, int roll, float marks) {
		//System.out.println(this); //no 'this' in a static function
		return new StudentOld (name, gender, roll, marks);
	}
	
	/*
	 Internally
	 String getDetails(Student this) {
		
	}
	
	 */
	
	public char getGrading() {
		char grade;
		float n = this.marks;
		if(n < 0 || n>100) {
			grade =  'I';
		}
		else if(n >= 70) {
			grade = 'A';
		}
		else if(n >= 60) {
			grade = 'B';
		}
		else if(n >= 40) {
			grade = 'C';
		}
		else {
			grade =  'F';
		}
		return grade;
		
	}
	
}
