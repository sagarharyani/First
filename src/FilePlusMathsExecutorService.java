import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class FilePlusMathsExecutorService {
	
	public static void main(String[] args) {
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(() -> {
			
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
			System.out.println(Thread.currentThread());
			
		});
		
		executorService.execute(() -> {
			String source  = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\First\\src\\AdvancedArrayList.java";
			
			try(Stream<String> lines = Files.lines(Path.of(source))){
				lines.forEach(System.out::println);
				System.out.println("File Read");
			}
			catch(IOException e) {
				throw new RuntimeException(e);
			}
			
		});
		
		
		executorService.execute(() -> {
			
		//CPU Operation Code
			
			int n = 30;
			MathSeries mathSeries = new MathSeries(new Random());
			System.out.println(mathSeries.fib(n));
			System.out.println("Fibo Series");
			System.out.println(Thread.currentThread());
			
		});
		
		
		executorService.shutdown();
		
	}

}
