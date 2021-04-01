package pathclassexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("Hello World.txt");
		try {
			Files.deleteIfExists(path);
		} catch(IOException IOE) {
			
		}
		
		Path path2 = Paths.get("/Users/c0s09w5/Desktop/myFiles/example.txt");
		System.out.println(path2.getParent());
		System.out.println(path2.getRoot());
		System.out.println(path2.getFileName());

	}

}
