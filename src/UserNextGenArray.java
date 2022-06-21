
public class UserNextGenArray {
	public static void main(String[] args) {
		String[] cars = {"Porshe", "mERCEDES", "tESLA", "nANO", "tIGER bISCIUT"};
		@SuppressWarnings("unchecked")
		NextGenArray<String> nextGenArray = new NextGenArray<String>(cars);
		
		String ele1 = nextGenArray.get(1);
		String ele2 = nextGenArray.get(5);
		
		System.out.println(ele1);
		System.out.println(ele2);
		
		nextGenArray.set(1, "120");
		
		System.out.println(nextGenArray);
		
		Integer[] nos  = {5, 7,  9 , 10, 3, 5};
		NextGenArray<Integer> nextGenArray1 = new NextGenArray(nos);
		
		
		

		
		
	}

}
