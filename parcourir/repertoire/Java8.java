import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main
{
	// Method to traverse a directory and list all the files in Java 8 and above
	public static void main(String[] args)
	{
		// Root directory
		String rootDir = "/var/www/html";

		try {
			// using Files.walk method
			Files.walk(Paths.get(rootDir))
					.filter(Files::isRegularFile)
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}