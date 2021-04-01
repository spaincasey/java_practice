package filecopyexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class FileCopyExample {

	public static void main(String[] args) {
		Path source = Paths.get("/Users/c0s09w5/Desktop/myFiles/example.txt");
		Path dest = Paths.get("/Users/c0s09w5/Desktop/myFiles/new.txt");
		try {
		Files.copy(source, dest, REPLACE_EXISTING);
		} catch(IOException IOE) {
			IOE.printStackTrace();
		}

	}

}
