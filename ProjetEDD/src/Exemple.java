import java.io.*;


public class Exemple implements ContentHandler{

	public static void main(String[] arg) throws java.io.IOException {
		FileParser fp =new FileParser();
		fp.parse("fichiercvs.cvs",null);
		
	}

	@Override
	public void defaultLine(String handler) {
		System.out.println("ce fichier : "+handler+ " est un fichier cvs");
	}




}
