import java.io.*;


public class Exemple implements ContentHandler{

	public static void main(String[] arg) throws java.io.IOException {
		FileParser fp =new FileParser();
		fp.parse("test.txt",null);
		
	}

	@Override
	public void defaultLine(String handler) {
		System.out.println("le fichier "+handler+" a bien ete executé !");
	}



}
