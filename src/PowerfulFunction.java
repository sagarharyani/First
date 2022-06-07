
public class PowerfulFunction {
	static int nextGenAdd(int... nos) { //this is called variance syntax method, where it uses array data structures internally
		int sum = 0;
		for(int i = 0; i<nos.length; i++) {
			sum += nos[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(nextGenAdd(5));
		System.out.println(nextGenAdd(5, 6));
		System.out.println(nextGenAdd(5, 6, 4, 8, 10, 11));
	}

}
