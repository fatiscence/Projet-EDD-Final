import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileParser{
	
	public void parse(String fichier,ContentHandler handler){
		BufferedReader lect ;
		handler = new Exemple();
		int s=0,c=1;
		try
		{
			lect = new BufferedReader(new FileReader(fichier)) ;
			while (lect.ready()==true) 
			{  
				System.out.println(lect.readLine());
				s++;
				if(lect.readLine().startsWith("++")){
				c++; 
				}
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
		handler.defaultLine(fichier, s, c);
	}
	

}
