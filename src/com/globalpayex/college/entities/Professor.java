package com.globalpayex.college.entities;

public class Professor extends CollegeUser {
	
	String[] subjects;
	
	public Professor(String name, char gender, String[] subjects) {
		
		//this --> Professor object
		//super(); //calls the super class constructor
		//Internally
		//CollegeUser(this)
		super(name, gender);
		//Internally
		//CollegeUser(name, gender);
		this.name = name;
		this.gender = gender;
		this.subjects = subjects;
	}
	
	
	

}
