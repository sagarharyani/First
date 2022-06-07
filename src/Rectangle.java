
public class Rectangle {
	
	static int perimeter(int len, int bre) {
		return  2 * (len + bre);
	}
	public static void main(String[] args) {
		int l1 = 8;
		int l2 = 4;
		
		int p1 = perimeter(l1, l2);
		System.out.println(p1);
	}

}
