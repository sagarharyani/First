import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;


public class RunCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Student s = new Student("sagar", 'm', 10, 90);
		
		String[] subjects = {"Physics", "Chemistry"};
		Professor p = new Professor("mehul", 'm', subjects);
		
		System.out.println(i);
		
		System.out.println(s);
		//Internally
		//System.out.println(s.toString());
		//System.out.println(s.toString(s);
		
		System.out.println(p);
		//Internally
		//System.out.println(p.toString());
		//System.out.println(p.toString(p);
		
		
		/*
		System.out.println(s.name);
		System.out.println(s.gender);
		System.out.println(p.name);
		System.out.println(p.gender);
		*/
		
		/*
		System.out.println(s.getDetails());
		//Internally
		//Student.getDetails(s);
		System.out.println(p.getDetails());
		//Internally
		//Professor.getDetails(p);
		 */
	}

}
