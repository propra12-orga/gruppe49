
public class ExplosionThread implements Runnable {
	private int x,y,spieler;
	
	
	
	
	public ExplosionThread(int spieler,int x,int y){
		this.spieler=spieler;
		this.x=x;
		this.y=y;
	}
	
	public void run() {
		
		try {
			if(spieler==0){
				ExplosionEntity ex =new ExplosionEntity("explosion.png",x,y);
				EntityManager.entityliste1.add(ex);
				if(ex.canExplode(x+50, y)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x+50,y));
					ex.multiExplode(spieler, x+50,y);
				}
				if(ex.canExplode(x-50, y)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x-50,y));
					ex.multiExplode(spieler, x-50,y);
				}
				if(ex.canExplode(x, y+50)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x,y+50));
					ex.multiExplode(spieler, x,y+50);
				}
				if(ex.canExplode(x, y-50)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x,y-50));
					ex.multiExplode(spieler, x,y-50);
				}				
				Thread.sleep(200);
				EntityManager.entityliste1.clear();
			}
			if(spieler==1){
				ExplosionEntity ex =new ExplosionEntity("explosion.png",x,y);
				EntityManager.entityliste2.add(ex);
				if(ex.canExplode(x+50, y)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x+50,y));
					ex.multiExplode(spieler, x+50,y);
				}
				if(ex.canExplode(x-50, y)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x-50,y));
					ex.multiExplode(spieler, x-50,y);
				}
				if(ex.canExplode(x, y+50)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x,y+50));
					ex.multiExplode(spieler, x,y+50);
				}
				if(ex.canExplode(x, y-50)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x,y-50));
					ex.multiExplode(spieler, x,y-50);
				}
				Thread.sleep(200);
				EntityManager.entityliste2.clear();
			}
			
			
		} catch (InterruptedException e) {}
		
	}

}
