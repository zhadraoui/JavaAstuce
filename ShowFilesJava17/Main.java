package ShowFilesJava17;

// Java Program to Display Files with
// Complete Path Present in a Directory

// Importing required classes
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args) throws IOException {

		// Creating try-catch block and
		// providing the directory path of local machine
		try (Stream<Path> filepath = Files.walk(Paths.get("c:\\GFG")))

		{
			// Printing the name of directories and files
			// with entire path
			filepath.forEach(System.out::println);
		}

		// Catch block to handle exceptions
		catch (IOException e) {

			// If no such directory exists throw an
			// exception
			throw new IOException("Directory Not Present!");
		}
	}
}