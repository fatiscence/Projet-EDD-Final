import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileParser{
	
	public void parse(String fichier,ContentHandler handler){
		BufferedReader lect ;
		handler = new Exemple();

		try
		{
			lect = new BufferedReader(new FileReader(fichier)) ;
			
			// si l'utilisateur a entré un point
			if (fichier.lastIndexOf(".") > 0) {
				// On récupère l'extension du fichier
				String ext = fichier.substring(fichier.lastIndexOf(".")).trim();
				// Si le fichier n'est pas en .txt on le met en .txt
				if (ext.equals(".cvs")) {
					handler.defaultLine(fichier);
				}}
		}//try
		catch (NullPointerException a)
		{
			System.out.println("Erreur : pointeur null");
		}
		catch (IOException a) 
		{
			System.out.println("Problème d'IO");
		}
	}
	

}
