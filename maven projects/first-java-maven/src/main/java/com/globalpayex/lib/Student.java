package com.globalpayex.lib;

public class Student {

		// instance atribute
		public String Name;
		public char Gender;
		public int Rno;
		public float Marks;
		public static int count;

		public Student() {
			this("NA", 'n', 12, 0.0f);
		}

		public Student(String Name, char Gender, int Rno, float Marks) {
			this.Name = Name;
			this.Rno = Rno;
			this.Gender = Gender;
			this.Marks = Marks;
			++Student.count;
		}

		public String getDetails() {
//					return "Name:" + this.Name + "\nGender:" + this.Gender + "\nRno:" + this.Rno + "\nMarks:" + this.Marks;
			return String.format("Name:%s\n gender:%s\n Rno:%s\n Marks:%s/n", this.Name, this.Gender, this.Rno, this.Marks);

		}

		public char getGrade() {
			float n = this.Marks;
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


