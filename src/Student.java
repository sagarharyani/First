
public class Student {
	
	//instance attributes
	
	String name;
	char gender;
	int roll;
	float marks;
	static int count;
	
	Student(String name, char gender, int roll, float marks){
		this.name = name;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
		Student.count++; //Always use classname to access static variable, its the best practice to do this, classname.staticvarible.
		
	}
	
	Student(){
		// calling the parameterized constructor for the same object
		this("NA", 'M', -1, 0.0f);
	}
	
	
	String getDetails() {
		//Implicit parameter called as 'this' -->s1, s2, s3 --> current object
		//return "Name:" + this.name + "\nGender:" + this.gender + "\nRoll No:" + this.roll + "\nMarks : "+ this.marks;
		return String.format("Name : %s\nGender : %s\nRoll No  : %s\nMarks : %s\n", this.name, this.gender, this.roll, this.marks);
		
	}
	
	static Student newInstance(String name, char gender, int roll, float marks) {
		//System.out.println(this); //no 'this' in a static function
		return new Student (name, gender, roll, marks);
	}
	
	/*
	 Internally
	 String getDetails(Student this) {
		
	}
	
	 */
	
	char getGrading() {
		char grade;
		float n = this.marks;
		if(n < 0 || n>100) {
			grade =  'I';
		}
		else if(n >= 70) {
			grade = 'A';
		}
		else if(n >= 60) {
			grade = 'B';
		}
		else if(n >= 40) {
			grade = 'C';
		}
		else {
			grade =  'F';
		}
		return grade;
		
	}
	
}
