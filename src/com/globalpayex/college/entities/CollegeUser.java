package com.globalpayex.college.entities;

public class CollegeUser {
	
	public String name;
	
	public char gender;
	
	//Composition Attribute
	////HAS-A relationship
	//Student has a addreess
	//professor has a address
	
	private Address address;

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
		
		return String.format("Name : %s \n Gender : %s \n Address :",name,gender,
				this.address!=null?this.address.getDetails():"NA");
	}
	
	@Override
	public String toString() {
		return "CollegeUser [name=" + name + ", gender=" + gender + "]";
	}
	
	public char getGender()
	{
		return gender;
	}

	
	

}
