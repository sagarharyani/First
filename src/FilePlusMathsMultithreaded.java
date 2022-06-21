import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FilePlusMathsMultithreaded {
	
	public static void main(String[] args) {
		//send the IO logic for execution on a seprate thread
		long startTime = System.currentTimeMillis();
		Thread thread = new Thread(() -> {
			//IO logic
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
			
			
		});
		thread.start(); //schedules the thread for execution.
		
		//CPU Operation Code
		int n = 30;
		MathSeries mathSeries = new MathSeries(new Random());
		System.out.println(mathSeries.fib(n));
		System.out.println("Fibo Series");
		
		 long endTime = System.currentTimeMillis();
		 
	     long timeElapsed = endTime - startTime;
	 
	     System.out.println("Execution time in milliseconds: " + timeElapsed);
	}

}
