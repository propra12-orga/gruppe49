



public class SetBombThread implements Runnable {
	private int x,y;
	private int spieler;
	private BombEntity bomb;
	/*
	 * Dieser thred ist fuer das legen einer Bombe zusteandig die nach einer 
	 * bestimmten zeit platzt oder durch eine kettenreaktion von einem anderen
	 * thread zum platzen gebracht wird und nicht mehr von diesem thread esplidiert
	 */
	
	/**
	 * 
	 * @param spieler name des spielers
	 * @param x position x
	 * @param y posutuin y
	 */
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
				Thread.sleep(3000);
				if(bomb.getIsAlive()){
					EntityManager.entitylistb1.remove(bomb);
					new Thread(new ExplosionThread(spieler,x,y)).start();
				}
			}
			if(spieler==1){
				EntityManager.entitylistb2.add(bomb);
				Thread.sleep(3000);
				if(bomb.getIsAlive()){
					EntityManager.entitylistb2.remove(bomb);
					new Thread(new ExplosionThread(spieler,x,y)).start();
				}
			}	
		}catch(InterruptedException e){}
	}
}
