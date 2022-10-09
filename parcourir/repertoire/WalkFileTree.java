import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Main
{
	// Method to traverse a directory and list all the files in Java 7
	public static void main(String[] args)
	{
		// Root directory
		String rootDir = "/var/www/html";

		try {
			// using Files.walkFileTree method in Java 7
			Files.walkFileTree(Paths.get(rootDir), new SimpleFileVisitor<Path>()
			{
				@Override
				public FileVisitResult visitFile(Path filePath,
												BasicFileAttributes attributes)
				{
					System.out.println(filePath);
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}