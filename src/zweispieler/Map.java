package zweispieler;


public class Map {
	private int[][] a;
	private ReadFile file;
		
	public Map(){
	file=new ReadFile("rescorce/map.txt");
     a=new int[file.getDimX()][file.getDimY()];
	}
	
	public void setMap(){
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
