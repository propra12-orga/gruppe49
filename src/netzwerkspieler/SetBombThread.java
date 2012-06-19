package netzwerkspieler;




public class SetBombThread implements Runnable {
	private int x,y;
	private int spieler;
	private BombEntity bomb;
	
	public SetBombThread(int spieler,int x,int y){
		this.spieler=spieler;
		this.x=x;
		this.y=y;
	}
	
	public void run(){
		
		bomb=new BombEntity("Bomb.png",x,y,true);
		try{
			if(spieler==0){
				EntityManager.entitylistb1.add(bomb);
				Thread.sleep(1000);
				if(bomb.getIsAlive()){
					EntityManager.entitylistb1.remove(bomb);
					new Thread(new ExplosionThread(spieler,x,y)).start();
				}
			}
			if(spieler==1){
				EntityManager.entitylistb2.add(bomb);
				Thread.sleep(1000);
				if(bomb.getIsAlive()){
					EntityManager.entitylistb2.remove(bomb);
					new Thread(new ExplosionThread(spieler,x,y)).start();
				}
			}	
		}catch(InterruptedException e){}
	}
}
