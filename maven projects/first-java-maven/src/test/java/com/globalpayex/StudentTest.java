package com.globalpayex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.globalpayex.lib.Student;

public class StudentTest {
	
	void getDetails() {
		
	}
	
	@ParameterizedTest
	@ValueSource(floats  = {101f, 85f, 62f, 50f, 32f})
	void getGrade(float marks) {
		Map<Float, Character> expectationMap = new HashMap<>();
		expectationMap.put(101f, 'I');
		expectationMap.put(85f, 'A');
		expectationMap.put(62f, 'B');
		expectationMap.put(50f, 'C');
		expectationMap.put(32f, 'F');
		
		Student student = new Student("sagar", 'm', 10, marks);
		assertEquals(expectationMap.get(marks), student.getGrade());
		
		
	}

}
