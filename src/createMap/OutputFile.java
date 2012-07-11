package createMap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {
	
	private int[][] a;
	
	public OutputFile(int[][] a){
		this.a=a;
	}	
	
	public void schreiben(){
		FileWriter schreiber;
		File datei;
	    
		// Datei anlegen
		datei = new File("rescorce/MapCreator.txt");
	    try {
	    	//ueberschreibt fall die datei schon ex
	    	schreiber = new FileWriter(datei ,false);
	       
	    	
	    	for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 15; j++) {
					schreiber.write(String.valueOf(a[i][j]));
				}
				//zeilenumbruch
				schreiber.write(System.getProperty("line.separator"));
			}
	   
	       // leert denn Stream
	       schreiber.flush();
	       
	       // Schlie§t den Stream
	       schreiber.close();
	       
	    } catch (IOException e) {}
	}
}
