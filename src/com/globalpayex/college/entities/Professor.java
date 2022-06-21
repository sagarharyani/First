package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {
	
	
	double costPerDay;
	int workingDays;
	String[] subjects = {"Physics, Chemistry"};	
	public Professor(String name, char gender, String[] subjects, double costPerDay, int workingDays ) {
		
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

	@Override
	public int getNoOfDaysWorked() {
		// TODO Auto-generated method stub
		return this.workingDays;
	}

	@Override
	public double getPricePerDay() {
		// TODO Auto-generated method stub
		return this.costPerDay;
	}
	

}
