import java.io.File;



public class Map {
	private int[][] a;
	private ReadFile file;
	private int modus;
	
	/**
	 * 
	 * @param modus int modus der map
	 */
	public Map(int modus){
		this.modus=modus;
	}
	
	/*
	 *Hier kann man den modus aendern  bekommt int modus 
	 */
	/**
	 * 
	 * @param moduschange int neuer modus
	 */
	public void setModus(int moduschange){
		modus=moduschange;
	}
	/*
	 * Hier wird die map mit hilde der ReadFile klasse ausgelesen und in ein Array geschrieben
	 */
	public void setMap(){
		if(modus==1){
			file=new ReadFile("rescorce/ausgang.txt");
		}
		
		if(modus==2){
		 File file2=new File("rescorce/MapCreator.txt");
		 file=new ReadFile("rescorce/MapCreator.txt");
			if(!file2.exists()){
				file=new ReadFile("rescorce/mapsteinebomberman.txt");			
			}
		}
	    a=new int[file.getDimX()][file.getDimY()];
		a=file.getContent();
	}
	/*
	 * Gbit die breite des arrays an
	 */
	/**
	 * 
	 * @return int dimension x 
	 */
	public int mapFieldX(){
		return file.getDimX();
	}
	/*
	 * Gbit die hoehe des arrays an
	 */
	/**
	 * 
	 * @return int dimension y
	 */
	public int mapFieldY(){
		return file.getDimY();
	}
	
	
	/*
	 * Hier wird geschaut ob das feld gesetzt ist also nicht null
	 */
	/**
	 * 
	 * @param n n dimension einer m x n matrix
	 * @param m m dimension einer m x n matrix
	 * @return gibt den wert an der stelle zurueck
	 */
	public int isSelected(int n,int m){
		return a[n][m];
	}
	

	public boolean isMovable(int x,int y){
		return false;
		
	}
		

	
}
