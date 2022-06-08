package com.globalpayex.college.entities;

public class CollegeUser {
	
	public String name;
	
	public char gender;

	public CollegeUser(String name, char gender) {

		this.name = name;
		this.gender = gender;
	}
	
	/*
	 CollegeUser(){
	 	//this -->	Student object, Professor object
	 }
	 */
	
	public String getDetails() {
		return String.format("Name : %s \nGender : %s", this.name, this.gender);
	}

	@Override
	public String toString() {
		return "CollegeUser [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
