
public class Grader {
	
	static char grading(int n) {
		if(n < 0 || n>100) {
			return 'I';
		}
		else if(n >= 70) {
			return 'A';
		}
		else if(n >= 60) {
			return 'B';
		}
		else if(n >= 40) {
			return 'C';
		}
		else {
			return 'F';
		}
		
	}
	
	static String getDetails(String name, char grade, int roll, int marks) {
		return ("Name : " + name + "\n" + "Grade : " + grade + "\n" + "Roll No : " + roll + "\n" + "Marks  : "+ marks);
	}
	
	public static void main(String args[]) {
		String name = "Sagar";
		int n = 96;
		int roll = 21;
		char res = grading(n);
		System.out.println(getDetails(name, res, roll, n));
	}

}
