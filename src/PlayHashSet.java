import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PlayHashSet {
	
	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(4, 1, 4, 6, 6, 0, 5, 6, 2);
		HashSet<Integer> hashSet = new HashSet<>(nos);
		System.out.println(hashSet);
		
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Mango");
		fruits.add("Aam");
		fruits.add("Kiwi");
		fruits.add("DragonFruit");
		
		System.out.println(fruits);
		
		fruits.remove("Aam");
		System.out.println(fruits);
		
		System.out.println(fruits.contains("DragonFruit"));
		System.out.println(fruits.contains("Banana"));
	}

}
