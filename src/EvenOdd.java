
public class EvenOdd {
	
	static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String args[]) {
		int n = 11;
		/*if(isEven(n)) {
			System.out.println("It is Even");
		}
		else {
			System.out.println("It is Odd");
		}*/
		System.out.println(isEven(n) ? "It is Even" : "It is Odd");
	}
	

}
