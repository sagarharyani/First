package com.globalpayex.lib;

import java.util.Random;

public class CustomRandom {
	//there are issues testing built in class, so build a custom class.
	
	public int nextInt(int upperBoundInclusive) {
		return new Random().nextInt(upperBoundInclusive + 1);
	}
	
	

}
