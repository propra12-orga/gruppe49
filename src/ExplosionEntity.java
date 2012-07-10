

public class ExplosionEntity extends Entity{
	
	/*
	 * Dies sind die explosionen
	 */
	/**
	 * 
	 * @param src ist der Pfad der datei als string
	 * @param x  x position vom entity
	 * @param y  y position vom entity
	 */
	public ExplosionEntity(String src, double x, double y) {
		super(src, x, y);
	}
	/*
	 * Diese Methode prueft ob die Bombe auf einen unzerbrechlichen stein stoest
	 */
	
	/**
	 * @param x  x position 
	 * @param y  y position
	 * @return   boolean wert ob die bombe explodieren kann
	 */
	public boolean canExplode(int x, int y){
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){				
				if(x==e.getX()&&y==e.getY()&& e instanceof StoneEntity ){
					StoneEntity st=(StoneEntity)e;
					if(st.getIsBreakable()){
						EntityManager.entitylist.remove(e);
						return true;
					}
					return false;
				}
			}
		}
		return true;
	}
	/*
	 * Diese Methode verursacht eine Kettenreaktion
	 */
	/**
	 * 
	 * @param spieler 
	 * @param x
	 * @param y
	 */
	public void multiExplode(int spieler, int x,int y){
		for(int i=0;i<EntityManager.entitylistb1.size();i++){
			BombEntity e=(BombEntity) EntityManager.entitylistb1.get(i);
			if(e != null){				
				if(x==e.getX()&&y==e.getY()&& e instanceof BombEntity){
					e.setIsAlive(false);
					EntityManager.entitylistb1.remove(e);
					new Thread(new ExplosionThread(spieler,x,y)).start();
				}
			}
		}
		
		for(int i=0;i<EntityManager.entitylistb2.size();i++){
			BombEntity e=(BombEntity) EntityManager.entitylistb2.get(i);
			if(e != null){				
				if(x==e.getX()&&y==e.getY()&& e instanceof BombEntity){
					e.setIsAlive(false);
					EntityManager.entitylistb2.remove(e);
					new Thread(new ExplosionThread(spieler,x,y)).start();
				}
			}
		}
	}

	/*
	 * Diese Methode schaut ob bei einer Bombenexplosion ein Spieler getroffen wird
	 */
	/**
	 * 
	 * @param x  Position x der Explosion
	 * @param y	 Postion y der Explosion
	 * @return BombermanEntity gibt den Bomberman zurueck der getroffen wurde
	 */
	public BombermanEntity killBomberman(int x, int y) {
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){				
				if(x==e.getX()&&y==e.getY()&& e instanceof BombermanEntity ){
					BombermanEntity b=(BombermanEntity)e;
					return b;
				}
			}
		}
		return null;
	}
	
	
}
