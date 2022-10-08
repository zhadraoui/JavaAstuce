package lister_fichiers_dossiers_repertoire;

public class Main {

	/**
	 * Exemple : lister les fichiers dans tous les sous-dossiers
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String pathToExplore = "D:\\Documents\\LP GI\\JavaEE\\TP JAVAEE Gestion Commande";
		DiskFileExplorer diskFileExplorer = new DiskFileExplorer(pathToExplore, true);
		Long start = System.currentTimeMillis();
		diskFileExplorer.list();
		System.out.println("----------");
		System.out.println("Analyse de " + pathToExplore + " en " + (System.currentTimeMillis() - start) + " mses");
		System.out.println(diskFileExplorer.dircount + " dossiers");
		System.out.println(diskFileExplorer.filecount + " fichiers");
	}

}
