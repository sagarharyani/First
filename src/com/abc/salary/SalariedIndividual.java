package com.abc.salary;

public interface SalariedIndividual {
	
	//methods are by default public abstract
	int getNoOfDaysWorked();
	
	double getPricePerDay();
	
	public default double calculate() {
		int noOfDays = this.getNoOfDaysWorked();
		double costPerDay = this.getPricePerDay();
		
		double costWithoutTax = noOfDays * costPerDay;
		return costWithoutTax - 10000000;
	}
}
	
