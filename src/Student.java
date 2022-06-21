
public class Student {

		// instance atribute
		public String name;
		public char gender;
		public int roll;
		public float marks;
		public static int count;

		public Student() {
			this("NA", 'n', 12, 0.0f);
		}

		public Student(String name, char gender, int roll, float Marks) {
			this.name = name;
			this.roll = roll;
			this.gender = gender;
			this.marks = Marks;
			++Student.count;
		}

		public String getDetails() {
//					return "Name:" + this.Name + "\nGender:" + this.Gender + "\nRno:" + this.Rno + "\nMarks:" + this.Marks;
			return String.format("Name:%s\n gender:%s\n Rno:%s\n Marks:%s/n", this.name, this.gender, this.roll, this.marks);

		}

		public char getGrade() {
			float n = this.marks;
			if (n > 100 || n < 0) {
				return 'I';

			}

			else if (n >= 70) {
				return 'a';

			} else if (n >= 60) {
				return 'b';

			} else if (n >= 50) {
				return 'c';

			} else {
				return 'F';

			}

		}

		public static Student newInstance(String Name, char Gender, int Rno, float Marks) {
			return new Student(Name, Gender, Rno, Marks);
		}

}


