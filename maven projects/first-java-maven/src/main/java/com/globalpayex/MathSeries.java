package com.globalpayex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.globalpayex.lib.CustomRandom;

public class MathSeries {
	CustomRandom customRandom ;
	
	
	
	public MathSeries(CustomRandom customRandom) {
		this.customRandom = customRandom;
	}



	public String fib(Integer n) { //if its of Integer wrapper class we can also pass null to function,
		//we cannot use this in a static function, <- search this if there is doubt.

		Integer _n = n;
		List<Integer> nos= new ArrayList<>();
		
		if(_n == null) {
			_n = this.customRandom.nextInt(10);
		}
		
		if(_n < 0) {
			throw new IllegalArgumentException("Can calculate only for positive number");
		}
		
		int a = 0;
		int b = 1;

		nos.add(a);
		nos.add(b);

		int i = 2;
		while(i<_n) {
			int c = a+b;
			nos.add(c);
			a = b;
			b = c;
			i++;
		}

		return nos
				.stream()
				.map(no -> no.toString())
				.collect(Collectors.joining(","));

	}

}
