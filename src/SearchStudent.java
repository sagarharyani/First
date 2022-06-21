import java.util.HashMap;
import java.util.*;

import com.globalpayex.college.entities.Address;
import com.globalpayex.college.entities.Student;

public class SearchStudent {
	
	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(10, new Student("mehul", 'm', 10, 99));
		map.put(11, new Student("sagar", 'm', 11, 95));
		map.put(12, new Student("mohit", 'f', 12, 90));
		map.put(13, new Student("rijay", 'f', 13, 91));
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Collection<Student> student = map.values();
		System.out.println(student);
		
		System.out.println(map.containsKey(13));
		
		Set<Map.Entry<Integer, Student>> entries = map.entrySet();
		for(Map.Entry<Integer, Student> entry : entries) {
			System.out.println(entry.getValue().name);
			System.out.println(entry.getKey());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter roll no to search");
		int roll = sc.nextInt();	
		if(map.containsKey(roll)) {
			 Student s = map.get(roll);
			 System.out.println(s.getDetails());
		}
		else {
			System.out.println("Student Object is not present");
		}
		
		
	}

}
