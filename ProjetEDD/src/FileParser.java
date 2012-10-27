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
			while (lect.ready()==true) 
			{  
				System.out.println(lect.readLine());
				
			}//while
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
