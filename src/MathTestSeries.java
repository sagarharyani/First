import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;


@ExtendWith(MockitoExtension.class)
class MathTestSeries {
	
	@Mock                 //class to test for mock
	MathSeries mathSeries = new MathSeries(new Random());
	
	@InjectMocks        //collaborator
	Random random;
	
	@org.junit.jupiter.api.Test
	void fib() {
		//Test Case Function
		MathSeries mathSeries = new MathSeries(new Random());
		String actual = mathSeries.fib(8);
		//compare actual -- expect
		String expect = "0,1,1,2,3,5,8,13";
		assertEquals(actual, expect);
	}
	
	@Test
	void fib_base_n() {
		//Test case function
		
		String actual = mathSeries.fib(2);
		//compare actual -- expect
		String expect = "0,1";
		assertEquals(actual, expect);
	}
	
	/*
	@Test
	void fib_base_null() {
		//Test case function
		//Mock the collaborator object -- Dummy Object -- Random
		String actual = MathSeries.fib(null);
		//compare actual -- expect
		String expect = "null";
		assertEquals(actual, expect);
	}
	*/

}
