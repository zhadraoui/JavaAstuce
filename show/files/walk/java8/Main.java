package show.files.walk.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main {
	// Méthode pour parcourir un répertoire et lister tous les fichiers en Java 8 et
	// supérieur
	public static void main(String[] args) {
		// Répertoire racine
		String rootDir = "D:\\Google drive\\Association";

		try {
			// en utilisant la méthode `Files.walk()`
			Files.walk(Paths.get(rootDir)).filter(Files::isRegularFile).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}