package einspieler;

import Entity;
import bomberman.BombermanEntity;


public class ExplosionEntity extends Entity{
	
	
	public ExplosionEntity(String src, double x, double y) {
		super(src, x, y);
	}
	
	
	
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
