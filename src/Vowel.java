
public class Vowel {
	
	static boolean isVowel(char ch) {
		//switch expression
		/*
		  return switch(ch) {
			case 'a', 'e', 'i', 'o', 'u' -> true;
			default -> false;
		};
		*/
		
		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'u':
				return true;
				//use 'break;' if you are not returning.
			default:
				return false;
		}
	}
	public static void main(String args[]){
		char c = 'c';
		boolean res = isVowel(c);
		System.out.println(res);
	}

}
