
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class ReadFile {

	private File myFile;
	private BufferedReader br;
	private int [][]a;
	private int n,m;
	
	/*
	 * Diese Klasse is fuer das einlesen der map txt dateien zusteandig
	 */
	
	/**
	 * 
	 * @param fileName name der datei
	 */
	public ReadFile(String fileName){
		myFile =new File(fileName);
	}
	
	/**
	 * 
	 * @return gibt ein int array zurueck in dem das spielfeld drinne ist
	 */
	public int[][] getContent(){
		String buffer="";
		String line="";
		int counter=0;
		n=0;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
			while((line=br.readLine())!=null){
				buffer+=line;
				n++;
				
			}
			m=buffer.length()/n;
			a= new int[n][m];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					a[i][j]=Character.getNumericValue(buffer.charAt(counter));
					counter++;
				}
			}
			br.close();
			
		} catch (Exception e) {
				System.out.println("Datei koonte nicht gefunden werden");
		}
		return a;
	}
	
	/**
	 * 
	 * @return gibt dimension x des array zurueck
	 */
	public int getDimX(){
		return n;
	}
	/**
	 * 
	 * @return gibt dimension y des array zurueck
	 */
	public int getDimY(){
		return m;
	}
	
}
