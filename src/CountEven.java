
public class CountEven {
	
	static String count(int n) {
		
		String result = "";
		for(int i = 0; i<=n; i++) {
			if(i%2==0) {
				result += i; 
				if(i!=n&&i<n) {
					result += ',';
				}
			}
			
		}
		return result;
		
		/*int[] arr = new int[n];
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(i%2==0) {
				arr[count] = i;
				count++;
			}
		}
		return arr;
		*/
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(count(n));
		/*int[] res = new int[n];
		res  = count(n);
		for(int i = 0; i<n; i++) {
			if(res[i] != 0) {
				System.out.println(res[i]);
			}
		}
		*/
	}

}
