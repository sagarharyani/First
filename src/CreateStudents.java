import com.globalpayex.college.entities.StudentOld;

public class CreateStudents {
	 
	public static void main(String[] args) {
		StudentOld s1 = new StudentOld("sagar", 'm', 21, 89.05f);
		StudentOld s2 = new StudentOld("samm",'f', 20, 79.05f);
		StudentOld s3 = StudentOld.newInstance("sam", 'm', 28, 78.9f);// creating a instance without using new keyword,
		//it is one most commonly used design pattern, such as whenever JVM runs main class it uses this kind of technique for creating instance.
		
		StudentOld[] arr = {s1, s2, s3};
		
		
		/*
		s2.name = "samm";
		s2.gender = 'f';
		s2.roll  = 20;
		s2.marks = 79.0f;
		*/
		
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
