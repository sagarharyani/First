import java.util.Random;

public class RandomArray {
	
	static <T > T randomElement(T[] elements) { //bounded generics learn
		Random random  = new Random();
		int index = random.nextInt(elements.length);
		return elements[index];
	}
	
	public static void main(String[] args) {
		/*
		String cars[] = {"Porshe", "Merdeces", "Bmw"};
		String elemnts = randomElement(cars);
		System.out.println(element);
		*/
		
		Integer[] nos = {5, 8 , 9 , 0, 4, 7, 8};
		int n = randomElement(nos);
		System.out.println(n);
		
		Double[] d = {5.0, 7.0, 4.0, 8.0, 10.0, 3.0};
		double dd = randomElement(d);
		System.out.println(dd);
		
		
		
	}
}
