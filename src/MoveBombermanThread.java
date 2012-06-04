import javax.swing.JComponent;


public class MoveBombermanThread implements Runnable {

	private Player[] players;
	private BombermanEntity[] bombermans;
	private JComponent comp;
	private long duration,last=0;
	
	public MoveBombermanThread(Player[] players,BombermanEntity[] bombermans,JComponent comp){
		 this.players=players;
		 this.bombermans=bombermans;
		 this.comp=comp;
	}

	public void run() {

		while(Game.running){
			duration=System.currentTimeMillis()-last;
			last=System.currentTimeMillis();

			try{
				for(int h=0;h<players.length;h++){
					
					BombermanEntity b=bombermans[h];
					InputHandler input=players[h].getInputHandler();
					b.setHorizontalMovement(0);
					b.setVerticalMovement(0);

					if(input.down && !input.up){
						b.setVerticalMovement(Entity.Default_Movement_On_Y);
					}
					if(input.up && !input.down){
						b.setVerticalMovement(-Entity.Default_Movement_On_Y);
					}
					if(input.left && !input.right){
						b.setHorizontalMovement(-Entity.Default_Movement_On_X);
					}
					if(input.right  && !input.left){
						b.setHorizontalMovement(Entity.Default_Movement_On_X);	
					}
				}
				for(int i=0;i<EntityManager.entitylist.size();i++){
					Entity e=EntityManager.entitylist.get(i);
					if(e != null){
						if(e.getHorizontalMovement()!=0) e.moveOnX(duration);
						if(e.getVerticalMovement()!=0) e.moveOnY(duration);
					}
				}

				
				comp.repaint();
				Thread.sleep(10);
			}catch(Exception e){}
		}
	}

}
