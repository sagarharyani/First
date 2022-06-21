import java.util.*;

import java.util.stream.Collectors;

import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.Student;

public class StudentStream {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("mehul", 'm', 10, 99, new Address("yogidham", "Kalyan","IN", 12)),
			new Student("sagar", 'm', 11, 95, new Address("yogidham", "Kalyan","USA", 12)),
			new Student("mohit", 'f', 12, 90, new Address("yogidham", "Kalyan","CANADA", 12)),
			new Student("rijay", 'f', 13, 91, new Address("yogidham", "Kalyan","UK", 12))
		);
		
		//find the names of all students comma seprated, who have scored more 
		//than 80 marks
		
		String name = students.stream()
				.filter(student -> student.marks > 80)
				.map(student -> student.name)
				.collect(Collectors.joining(","));
		System.out.println(name);	
		
		//find the average marks scored by all students
		//students -> stream -> terminal ?? Collectors. ??
		//there is no need to use map because of mdoubleAveraging function
		double average = students.stream()
				.collect(Collectors.averagingDouble(student -> student.marks));
		
		System.out.println(average);
		
		//statistics of marks scored by all the students
		DoubleSummaryStatistics ds = students.stream()
				.collect(Collectors.summarizingDouble(student -> student.marks));
		System.out.println(ds);
		System.out.println(ds.getAverage());
		System.out.println(ds.getMax());
		System.out.println(ds.getMin());
		System.out.println(ds.getSum());
		
		//group the above students by gender
		Map<Character, List<Student>> genderMap =  students.stream()
				.collect(Collectors.groupingBy(student -> student.gender));
		System.out.println(genderMap);
		
		//group the above students by 
		Map<Boolean, List<Student>> marksMap = students.stream()
				.collect(Collectors.partitioningBy(student -> student.marks >= 80));
		System.out.println(marksMap);
		
		
		//students name whose country is usa.
		
		String result = students
				.stream()
				.filter(o-> o.getCountry().equals("USA"))
				.map(student -> student.name)
				.collect(Collectors.joining(","));
		
		System.out.println(result);		
		
	}
}

