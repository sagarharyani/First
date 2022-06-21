import java.util.*;

public class MathematicalSet {
	
	public static void main(String[] args) {
		
		List<Integer> d1 = Arrays.asList(1, 9, 1, 50, 4);
		List<Integer> d2 = Arrays.asList(8, 5, 6, 5, 3, 2, 1);
		
		HashSet<Integer> sd1 = new HashSet<>(d1);
		HashSet<Integer> sd2 = new HashSet<>(d2);
		
		HashSet<Integer> csd1 = (HashSet<Integer>) sd1.clone();
		System.out.println(csd1);
		
		csd1.addAll(sd2);
		System.out.println(csd1);
		
		//intersection
		csd1 = (HashSet<Integer>)sd1.clone();
		csd1.retainAll(sd2);
		System.out.println(csd1);
		
		
	}

}
