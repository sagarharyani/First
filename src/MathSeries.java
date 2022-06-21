import java.util.*;
import java.util.stream.Collectors;

public class MathSeries {
	
	Random random;
	
	public MathSeries(Random random) {
		this.random = random;
	}
	
	public String fib(Integer n) { //if its of Integer wrapper class we can also pass null to function,
									//we cannot use this in a static function, <- search this if there is doubt.
		
		Integer nToUse = n;
		if(nToUse == null) {
			nToUse = this.random.nextInt(11);
		}
		List<Integer> nos= new ArrayList<>();
		int a = 0;
		int b = 1;
		
		nos.add(a);
		nos.add(b);
		
		int i = 2;
		while(i<n) {
			int c = a+b;
			nos.add(c);
			a = b;
			b = c;
			i++;
		}
		
		return nos
				.stream()
				.map(no -> no.toString())
				.collect(Collectors.joining(","));
		
	}
}	
