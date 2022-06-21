import java.util.Scanner;

public class PlayInput {
	
	public static void main(String[] args) {
		System.out.println("Program started");
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		
		try {
			n = sc.nextInt();
			System.out.println(n %2 == 0 ?"It is even" : "It is odd");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Please only integer value");
		}
		sc.close();
		System.out.println("Program Ended");
		
	}
}
