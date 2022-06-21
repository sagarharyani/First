import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;


public class FilesPlusMaths {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		String source  = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\First\\src\\AdvancedArrayList.java";
		String desination = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\First\\src\\AdvancedArrayListCopy.java";
		//IO Operation Code
		try {
			Files.copy(Path.of(source), Path.of(desination), StandardCopyOption.REPLACE_EXISTING);
			
		}
		catch(IOException e){
			throw new RuntimeException(e);
			
		}
		System.out.println("Copied");
		//CPU Operation Code
		int n = 30;
		MathSeries mathSeries = new MathSeries(new Random());
		System.out.println(mathSeries.fib(n));
		System.out.println("Fibo Series");
		
	}

}
