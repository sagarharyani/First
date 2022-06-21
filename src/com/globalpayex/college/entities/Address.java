package com.globalpayex.college.entities;

public class Address {
	
	private String address;
	private String state;
	private String country;
	private Number pincode;
	
	public Address(String address, String state, String country, Number pincode) {
		super();
		this.address = address;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public Number getPincode() {
//		return pincode;
//	}
//	public void setPincode(Number pincode) {
//		this.pincode = pincode;
//	}
	
	public String getDetails()
	{
		return String.format("House : %s \n City : %s \n State : %s\n PinCode : %s",address,state,country,pincode);
	}
	
	

}
