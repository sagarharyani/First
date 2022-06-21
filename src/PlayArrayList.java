import java.util.ArrayList;

public class PlayArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> cars= new ArrayList<>();
		
		cars.add("I10");
		cars.add("I20");
		cars.add("Nanu");
		cars.add("Tiger Bisciut");
		System.out.println(cars);
		
		cars.add(1, "Porche");
		System.out.println(cars);
		
		System.out.println(cars.size());
		
		System.out.println(cars.remove(0));
		System.out.println(cars);
		
		cars.remove("Porshe");
		System.out.println(cars);
		
		System.out.println(cars.contains("Porche"));
		System.out.println(cars.contains("I10"));
		
		System.out.println(cars.indexOf("Porche"));
		System.out.println(cars.indexOf("I10"));
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		
	}

}
