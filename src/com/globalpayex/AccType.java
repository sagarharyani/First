package com.globalpayex;

public enum AccType {
	
	SAVINGS("S"),
	CURRENT("C");
	
	private String actualValue;
	
	AccType(String actualValue){
		this.actualValue = actualValue;
	}
	
	public String getActualValue() {
		return actualValue;
	}

}
