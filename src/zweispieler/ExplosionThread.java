package zweispieler;

import game.*;



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
				if(ex.killBomberman(x,y)!=null){
					BombermanEntity b=ex.killBomberman(x,y);
					if(b.getSpieler()=="Spieler1"){
						Game.winner="Spieler2";
					}
					if(b.getSpieler()=="Spieler2"){
						Game.winner="Spieler1";
					}
					Game.running=false;
				}
				if(ex.canExplode(x+50, y)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x+50,y));
					ex.multiExplode(spieler, x+50,y);
					if(ex.killBomberman(x+50,y)!=null){
						BombermanEntity b=ex.killBomberman(x+50,y);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
					
				}
				if(ex.canExplode(x-50, y)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x-50,y));
					ex.multiExplode(spieler, x-50,y);
					if(ex.killBomberman(x-50,y)!=null){
						BombermanEntity b=ex.killBomberman(x-50,y);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
					
				}
				if(ex.canExplode(x, y+50)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x,y+50));
					ex.multiExplode(spieler, x,y+50);
					if(ex.killBomberman(x,y+50)!=null){
						BombermanEntity b=ex.killBomberman(x,y+50);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
				}
				if(ex.canExplode(x, y-50)){
					EntityManager.entityliste1.add(new ExplosionEntity("explosion.png",x,y-50));
					ex.multiExplode(spieler, x,y-50);
					if(ex.killBomberman(x,y-50)!=null){
						BombermanEntity b=ex.killBomberman(x,y-50);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
				}				
				Thread.sleep(200);
				EntityManager.entityliste1.clear();
			}
			if(spieler==1){
				ExplosionEntity ex =new ExplosionEntity("explosion.png",x,y);
				EntityManager.entityliste2.add(ex);
				if(ex.killBomberman(x,y)!=null){
					BombermanEntity b=ex.killBomberman(x,y);
					if(b.getSpieler()=="Spieler1"){
						Game.winner="Spieler2";
					}
					if(b.getSpieler()=="Spieler2"){
						Game.winner="Spieler1";
					}
					Game.running=false;
				}
				if(ex.canExplode(x+50, y)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x+50,y));
					ex.multiExplode(spieler, x+50,y);
					if(ex.killBomberman(x+50,y)!=null){
						BombermanEntity b=ex.killBomberman(x+50,y);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
				}
				if(ex.canExplode(x-50, y)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x-50,y));
					ex.multiExplode(spieler, x-50,y);
					if(ex.killBomberman(x-50,y)!=null){
						BombermanEntity b=ex.killBomberman(x-50,y);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
				}
				if(ex.canExplode(x, y+50)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x,y+50));
					ex.multiExplode(spieler, x,y+50);
					if(ex.killBomberman(x,y+50)!=null){
						BombermanEntity b=ex.killBomberman(x,y+50);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
				}
				if(ex.canExplode(x, y-50)){
					EntityManager.entityliste2.add(new ExplosionEntity("explosion.png",x,y-50));
					ex.multiExplode(spieler, x,y-50);
					if(ex.killBomberman(x,y-50)!=null){
						BombermanEntity b=ex.killBomberman(x,y-50);
						if(b.getSpieler()=="Spieler1"){
							Game.winner="Spieler2";
						}
						if(b.getSpieler()=="Spieler2"){
							Game.winner="Spieler1";
						}
						Game.running=false;
					}
				}
				Thread.sleep(200);
				EntityManager.entityliste2.clear();
			}
			
			
		} catch (InterruptedException e) {}
		
	}

}
