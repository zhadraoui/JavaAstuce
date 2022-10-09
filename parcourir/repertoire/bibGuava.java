import com.google.common.io.Files;
import java.io.File;

class Main
{
	// Method to list all files in a directory using Guava
	public static void listFiles(File rootDir)
	{
		for (File file: Files.fileTreeTraverser().breadthFirstTraversal(rootDir))
		{
			if (file.isFile()) {
				System.out.println(file);
			}
		}
	}

	public static void main(String args[])
	{
		String rootDir = "C:\\Java";

		listFiles(new File(rootDir));
	}
}