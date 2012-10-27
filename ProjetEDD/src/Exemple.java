import java.io.*;


public class Exemple implements ContentHandler{

	public static void main(String[] arg) throws java.io.IOException {
		FileParser fp =new FileParser();
		fp.parse("fichier.Yaml",null);
		
	}

	@Override
	public void defaultLine(String handler,int compteur1,int compteur2) {
		System.out.println("le fichier"+handler+ " contient "+compteur1+" lignes en total est "+compteur2+" commentaires");
	}



}
