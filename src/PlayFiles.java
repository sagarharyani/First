import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
public class PlayFiles {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\First\\src\\AdvancedArrayList.java";
		System.out.println(Files.exists(Path.of(filePath)));
		String doesNotExist = "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\First\\srce\\AdvancedArrayList.java";
		System.out.println(Files.exists(Path.of(doesNotExist)));
		
		//check if its a directory regular file
		System.out.println(Files.isRegularFile(Path.of(filePath)));
		String dirPath =  "C:\\Users\\GPXPWRUSR\\eclipse-workspace\\First\\src";
		System.out.println(Files.isDirectory(Path.of(dirPath)));
		
		System.out.println("All files in src directory");
		
		//list all the files in the directory till level 1.
		/*
		Stream<Path> paths = null;
		try {
			paths = Files.list(Path.of(dirPath));
		} catch (IOException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		
		paths.forEach(path -> System.out.println(path.getFileName()));
		paths.close(); // because this Stream is connected to the file system.
		//To prevent memory leak always close this stream
		*/
		
		try(Stream<Path> files = Files.list(Path.of(dirPath))){
			//it automatically closes path resouces as files impement AutoClose Interface
			files.forEach(path -> System.out.println(path.getFileName()));
		}
		catch(IOException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("****All files in the src directory recursive****");
		//list all files/dir in src folder recursively
		try(Stream<Path> recursiveStream = Files.walk(Path.of(dirPath))){
			recursiveStream 
					.filter(path -> Files.isRegularFile(path))
					.forEach(path -> System.out.println(path.getFileName()));
		}
		catch(IOException e) {
			throw new RuntimeException(e);
		}
		
		
		
		
		
	}
}
