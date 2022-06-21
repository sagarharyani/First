import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.globalpayex.college.entities.Student;

public class ContainsElement {
	
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("mehul", 'm', 10, 99),
				new Student("sagar", 'm', 11, 95),
				new Student("mohit", 'f', 12, 90),
				new Student("rijay", 'f', 13, 91)
				
		);
		
		System.out.println("Enter roll number of student yu want to find");
		Scanner sc  = new Scanner(System.in);
		int roll = sc.nextInt();
		
		boolean isFound  = students.contains(new Student("NA", 'm', roll, 0));
		System.out.println(isFound ? "Student found" : "Student Not Found");
		
		
		/*
		boolean isPresent = false;
		for(Student s : students) {
			if(s.roll == roll) {
				isPresent = true;
				System.out.println(s.getDetails());
				//you could also use return statement but it will not execute other part of program 
				//if student is found
				break;
			}
		}
		
		if(!isPresent) {
			System.out.println("Student Not Found");
		}
		*/
		
		
	}

}
