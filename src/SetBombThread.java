


public class SetBombThread implements Runnable {
	private int x,y;
	private boolean explode=true; 
	private int spieler;

	
	public SetBombThread(int spieler,int x,int y){
		this.spieler=spieler;
		this.x=x;
		this.y=y;
	}
	
	
	


	public void run(){
		while(explode){
			
			
			try{
				BombEntity bomb=new BombEntity("Bomb.png",x,y);
				
				if(spieler==0){
					EntityManager.entitylistb1.add(bomb);
					Thread.sleep(3000);
					EntityManager.entitylistb1.remove(bomb);
				}
				if(spieler==1){
					EntityManager.entitylistb2.add(bomb);
					Thread.sleep(3000);
					EntityManager.entitylistb2.remove(bomb);
				}

				explode=false;
			}catch(Exception e){}
		}
	}
}
