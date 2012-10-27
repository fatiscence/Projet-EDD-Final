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
			String ch=lect.readLine().trim();
			if(ch.equals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")){
				handler.defaultLine(fichier);	
				}//if
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
