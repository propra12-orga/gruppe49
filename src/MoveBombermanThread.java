import javax.swing.JComponent;


public class MoveBombermanThread implements Runnable {

	private Player[] players;
	private BombermanEntity[] bombermans;
	private JComponent comp;
	private int step=50;

	
	public MoveBombermanThread(Player[] players,BombermanEntity[] bombermans,JComponent comp){
		 this.players=players;
		 this.bombermans=bombermans;
		 this.comp=comp;
	}

	public void run() {

		while(Game.running){
			try{
				for(int h=0;h<players.length;h++){
					BombermanEntity b=bombermans[h];
					InputHandler input=players[h].getInputHandler();
					b.setHorizontalMovement(0);
					b.setVerticalMovement(0);

					if(input.down && !input.up&& !input.left && !input.right  && b.canMoveDown(step)){
						b.setVerticalMovement(step);
					}
					if(input.up && !input.down && !input.left && !input.right &&b.canMoveUP(step)){
						b.setVerticalMovement(-step);
					}
					if(input.left && !input.right &&!input.up &&!input.down && b.canMoveLeft(step)){
						b.setHorizontalMovement(-step);
					}
					if(input.right  && !input.left &&!input.up &&!input.down && b.canMoveRight(step)){
						b.setHorizontalMovement(step);	
					}
				}
				for(int i=0;i<EntityManager.entitylist.size();i++){
					Entity e=EntityManager.entitylist.get(i);
					if(e != null){
						if(e.getHorizontalMovement()!=0) e.moveOnX(step);
						if(e.getVerticalMovement()!=0) e.moveOnY(step);
					}
				}

				comp.repaint();
				Thread.sleep(80);
			}catch(Exception e){}
		}
	}

}
