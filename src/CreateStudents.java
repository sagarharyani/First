
public class CreateStudents {
	 public static void main(String[] args) {
		Student s1 = new Student("sagar", 'm', 21, 89.05f);
		Student s2 = new Student("samm",'f', 20, 79.05f);
		Student s3 = Student.newInstance("sam", 'm', 28, 78.9f);// creating a instance without using new keyword,
		//it is one most commonly used design pattern, such as whenever JVM runs main class it uses this kind of technique for creating instance.
		
		Student[] arr = {s1, s2, s3};
		
		s1.name = "sAgar";
		s1.gender = 'm';
		s1.roll  = 21;
		s1.marks = 89.0f;
		
		s2.name = "samm";
		s2.gender = 'f';
		s2.roll  = 20;
		s2.marks = 79.0f;
		
		
//		System.out.println(s1.name);
//		System.out.println(s1.gender);
//		System.out.println(s1.roll);
//		System.out.println(s1.marks);
		
		System.out.println(s1.getDetails());
		
		/*
		 Internally 
		 System.out.println(get.Details(s1));
		 */
		
		//System.out.println(s1.getGrading());
		
		  		
		//System.out.println(s3.getDetails());
		
		/* 
		for(int i = 0; i< arr.length; i++) {
			System.out.println("Name : " + arr[i].name + " \nGender : " + arr[i].gender ); 
		}
		*/
		
	}

}
