import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Main
{
	// Method to traverse a directory and list all the files in Java 8 and above
	public static void main(String[] args)
	{
		// Root directory
		String rootDir = "/var/www/html";

		try {
			// use `Files.walk()` method with try-with-resources
			try (Stream<Path> paths = Files.walk(Paths.get(rootDir))) {
				paths.filter(Files::isRegularFile)
					.forEach(System.out::println);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}