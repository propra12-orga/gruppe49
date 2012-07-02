

public class Map {
	private int[][] a;
	private ReadFile file;
	private int modus;
		
	public Map(int modus){
		this.modus=modus;
	}
	
	public void setModus(int moduschange){
		modus=moduschange;
	}
	
	public void setMap(){
		if(modus==1){
			file=new ReadFile("rescorce/ausgang.txt");
		}if(modus==2){
			file=new ReadFile("rescorce/mapsteinebomberman.txt");
		}
	    a=new int[file.getDimX()][file.getDimY()];
		a=file.getContent();
	}
	
	public int mapFieldX(){
		return file.getDimX();
	}
	
	public int mapFieldY(){
		return file.getDimY();
	}
	
	
	
	public int isSelected(int n,int m){
		return a[n][m];
	}
	
	

	public boolean isMovable(int x,int y){
		return false;
		
	}
		

	
}
