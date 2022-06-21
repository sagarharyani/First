package com.globalpayex.bank.entities;

import java.util.Optional;

import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class Account {
	
	//Forced Encapsulation.
	//As a convention and to ensure that your java classes work seamleassy with the frameworks/libraries used
	//1. All instances attributes must be declared as a private.
	//2. All instances attributes must have public getter/setter methods.
	
	
	
	private String accType;
	
	public String accNumber;
	
	private double balance;

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		if(balance >= 1000) {
			this.balance = balance;
		}
		else {
			throw new IllegalArgumentException("Account Balance must be greater than equal to 1000");
		}
		
	}

	public Account(String accType, String accNumber, double balance) {
		this.accType = accType;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	public void setAccType(String accType) {
		if(accType.equals("Savings") || accType.equals("Current")){
			this.accType = accType;
		}
		else {
			throw new IllegalArgumentException("accType must be one of the following : Savings/Current");
		}
	}
	
	public String getAccType() {
		return this.accType.toUpperCase();
	}
	public double withdraw(double amount) throws MinBalNotMaintainedException {
		System.out.println("Transaction Starts...");
		try {
			if(amount <= 0) {
				throw new IllegalArgumentException("Withdraw Amount should be greater than 0");
				
			}
			if(this.balance - amount < 1000) {
				//throws an exception to caller
				throw new MinBalNotMaintainedException("Balance cannot go below 1000");
			}
			
			this.balance -= amount;
			return this.balance;
			
		} finally {
			// TODO: handle finally clause
			System.out.println("Transaction Ends...");
		}
		
	}
	public double deposit(double amount) {
		this.balance += amount;
		return this.balance;
		
	}
	/*
	public String getDetails() {
		if(this.accNumber != null && this.accNumber.equals("") && this.accType != null
		   && this.accType.equals("")) {
			return String.format("Acc No : %s\nAcc Type: %s\nBal %s", this.accNumber, this.accType, this.balance);
		}
		return null;
	}
	*/
	
	public Optional<String> getDetails() {
		if(this.accNumber != null && this.accNumber.equals("") && this.accType != null
		   && this.accType.equals("")) {
			return Optional.of(String.format("Acc No : %s\nAcc Type: %s\nBal %s", this.accNumber, this.accType, this.balance));
		}
		return Optional.empty();
	}
	
	
	
	

}
