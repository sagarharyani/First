package com.globalpayex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.globalpayex.lib.CustomRandom;

@ExtendWith(MockitoExtension.class)
public class MathSeriesTest {
	
	@Mock
	CustomRandom customRandom;
	
	MathSeries mathSeries;
	
	@BeforeEach
	void beforeEach() {
		mathSeries = new MathSeries(this.customRandom);
	}
	
//	@AfterEach
//	void afterEach(){
//		mathSeries = null;
//	}
//	
	
	@Test
	@DisplayName("Testing fibo with regular value")
	void fib() {
		//Test Case Function
		//this.mathSeries = new MathSeries(new CustomRandom()); //when we use before each and afterEach this is not needed.
		String actual = mathSeries.fib(8);
		//compare actual -- expect
		String expect = "0,1,1,2,3,5,8,13";
		assertEquals(actual, expect);
	}
	
	@Test
	@DisplayName("Testing fibo with null value")
	void fib_surprise_me(){
		//this.mathSeries  = new MathSeries(this.customRandom);
		Mockito.when(this.customRandom.nextInt(10)).thenReturn(6);
		String actual = mathSeries.fib(null);
		String expected = "0,1,1,2,3,5";
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("Testing fibo with negative value")
	void fibo_negative_value() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.mathSeries = new MathSeries(this.customRandom);
			mathSeries.fib(-9);
		}, "Can calculate only only for positive numbers");
	}

}
