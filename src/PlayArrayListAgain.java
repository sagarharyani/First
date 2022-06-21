import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class PlayArrayListAgain {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(10);
		marks.add(5);
		marks.add(15);
		marks.add(1);
		marks.add(2);
		marks.add(12);
//		marks.sort(new DescendingComparator());
//		System.out.println(marks);
		
		/*
		//This is called inner class, please use this only in static method, use this if it 
		//usage limited to on
		public class DescendingComparator2 implements Comparator<Integer> {
			
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		}
		
		marks.sort(new DescendingComparato2());
		System.out.println(marks);
		
		*/
		/*
		 annonymous inner class
		 marks.sort(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
			
		});
		 */
		
		//Lambda Expression
		//Lamda Expression can only be used with functional interface, functional interface is an 
		//interface where there is only 1 abstaract method, so we can use lambda expressions as 
		//there will be no ambiguity which abstract function to use in lambda function.
		//always search in documnetation that interface is functional interface, and always use that 
		//parameter and return type of abstarct method for building lambda expression abstact method in 
		marks.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(marks);
		
		
		

	}
}
