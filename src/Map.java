
public class Map {
	private int[][] a;
	
		
	public Map(int n, int m){
     a=new int[n][m];
	}
	
	public void setMap(){
		for(int i=0;i<15;i++){
			for(int j=0;j<11;j++){
				if(j%2==1&&i%2==1){
				a[i][j]=1;
				}else{
					a[i][j]=0;
				}
			}
		}
	}
	
	
	
	
	public boolean isSelected(int n,int m){
		if(a[n][m]==1){
			return true;
		}else return false;
	}
	
	

	public boolean isMovable(int x,int y){
		return false;
		
	}
		

	
}
