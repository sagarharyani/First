import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.*;


import java.util.*;

public class ListOperation {
	
	public static void main(String[] args) {
		//Java 8
		//Stream API
		
		List<Integer> nos = Arrays.asList(4, 1, 4, 6, 6, 0, 5, 6, 7, 9, 11);
		Stream<Integer> stream = nos.stream();
		
		//create a new list containing of odd numbers more than 3 from the nos list
		//print the new list
		//Intermediate operations in a tree
		List<Integer> odds = stream
				.filter(element -> element % 2!=0 && element>3)
				.collect(Collectors.toList());
		System.out.println(odds);
		
		//Create a string of elements seprate by coma, consisting of even numbers more than 2 from the
		//nos list
		
		String s = nos.stream()
				.filter(element -> element % 2 ==0  && element > 2)
				.map(element -> element.toString())
				.collect(Collectors.joining(","));
		System.out.println(s);
		
		//whenevr you write statement in curly braces for lambda expression you will have to return 
		//explicitly to the function, if you do'nt use curly braces lambda expression will 
		//automatically return something to the function. 
		//create new list containing of elements more than 4 from the list squared up each of the
		//elements sorted in descending order
		//filter -> map ->sort-> collect
		//any intermediate operation that reduces the size of the pipeline should be written first
		List<Integer> nn = nos.stream()
				.filter(element -> element > 4)
				.distinct()
				.map(element -> element * element)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(nn);
		
		
		
		
		
		
		
		
		//source data
		int[] n = {6, 4, 5, 9, 10, 11}; 
		//Stream<Integer> iStream = Arrays.stream(n);
		IntStream intStream = Arrays.stream(n); //Stream of Integers
		
		//build up Streeam of specific value
		Stream<Integer> st = Stream.of(5, 4, 8, 10, 4, 2);
		
		//empty stream
		//Stream stream1 = st.empty();
		
		//create a new list consisting of odd numbers more than 3 from the nos list
		List<Integer> d = new ArrayList<>();
		for(int no : nos) {
			if(no % 2 ==1 && no >3) {
				d.add(no);
			}
		}
		System.out.println(d);
		
		
		
		
	}

}
