import java.util.*;

public class AdvancedArrayListCopy {
	public static void main(String[] args) {
		List<Integer> no = Arrays.asList(4, 1, 4, 6, 6, 0, 5, 6, 2);
		System.out.println(no);
		System.out.println(no.getClass());
		
		
		LinkedList<Integer> nos = new LinkedList<>(no);
		//to print all thr number from the nos list without explicitly using the loop
		nos.forEach(n -> System.out.println(n));
		
		//to print all the even nos from the nos list without explicitly using the loop
		//whenever there are multiple staements in lambda expression use curly braces 
		nos.forEach(n -> {
			if(n%2==0) {
				System.out.println(n);
			}
		});
		
		//Method refrences, in this we pass the refrence of function to a function using lambda,
		//in this System.out class gives the refrence of println to function 
		nos.forEach(System.out::println);
		
	}
}
