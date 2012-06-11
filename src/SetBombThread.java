


public class SetBombThread implements Runnable {
	private int x,y;
	private boolean explode=true; 
	private int spieler;
	private StoneEntity st;
	
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
					
					for(int i=1;i<3;i++){
						
						StoneEntity	st1 =new StoneEntity("explosion.png",x+50*i,y);
							EntityManager.entitylistb1.add(st1);
							StoneEntity	st2 =new StoneEntity("explosion.png",x-50*i,y);
							EntityManager.entitylistb1.add(st2);
							StoneEntity	st3 =new StoneEntity("explosion.png",x,y+50*i);
							EntityManager.entitylistb1.add(st3);
							StoneEntity	st4 =new StoneEntity("explosion.png",x,y-50*i);
							EntityManager.entitylistb1.add(st4);
							Thread.sleep(500);
							EntityManager.entitylistb1.remove(st1);
							EntityManager.entitylistb1.remove(st2);
							EntityManager.entitylistb1.remove(st3);
							EntityManager.entitylistb1.remove(st4);
						
					}

				}
				if(spieler==1){
					EntityManager.entitylistb2.add(bomb);
					Thread.sleep(3000);
					EntityManager.entitylistb2.remove(bomb);
					
					for(int i=1;i<3;i++){
						
						StoneEntity	st1 =new StoneEntity("explosion.png",x+50*i,y);
							EntityManager.entitylistb2.add(st1);
							StoneEntity	st2 =new StoneEntity("explosion.png",x-50*i,y);
							EntityManager.entitylistb2.add(st2);
							StoneEntity	st3 =new StoneEntity("explosion.png",x,y+50*i);
							EntityManager.entitylistb2.add(st3);
							StoneEntity	st4 =new StoneEntity("explosion.png",x,y-50*i);
							EntityManager.entitylistb2.add(st4);
							Thread.sleep(500);
							EntityManager.entitylistb2.remove(st1);
							EntityManager.entitylistb2.remove(st2);
							EntityManager.entitylistb2.remove(st3);
							EntityManager.entitylistb2.remove(st4);
						
					}
					
					
					
				}

				explode=false;
			}catch(Exception e){}
		}
	}
}
