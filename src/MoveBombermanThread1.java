

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;


public class MoveBombermanThread1 implements Runnable {

	private Player[] players;
	private BombermanEntity[] bombermans;
	private JComponent comp;
	private int step=50;

	
	public MoveBombermanThread1(Player[] players,BombermanEntity[] bombermans,JComponent comp){
		 this.players=players;
		 this.bombermans=bombermans;
		 this.comp=comp;
	}

	public void run() {
		int currentTime1=(int)- System.currentTimeMillis();
		int currentTime2=(int)- System.currentTimeMillis();
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
					if(input.aktion && (currentTime1 +(int)System.currentTimeMillis())>1000  && h==0 ){
						currentTime1=(int)- System.currentTimeMillis();
							SetBombThread bombt1=new SetBombThread(h,bombermans[0].getX(),bombermans[0].getY());
							new Thread(bombt1).start();
					}
					if(input.aktion && (currentTime2 +(int)System.currentTimeMillis())>1000 && h==1  ){
						currentTime2=(int)- System.currentTimeMillis();
							SetBombThread bombt2=new SetBombThread(h,bombermans[1].getX(),bombermans[1].getY());
							new Thread(bombt2).start();
					}
					for(int i=0;i<EntityManager.entitylist.size();i++){
						Entity e=EntityManager.entitylist.get(i);
						if(e != null){
							if(e instanceof ExitEntity && bombermans[0].getX()==e.getX()&&bombermans[0].getY()==e.getY()){
								Game.winner="Spieler1";
								Game.running=false;
							}
						}
					}
				}
			
				
				for(int i=0;i<EntityManager.entitylist.size();i++){
					Entity e=EntityManager.entitylist.get(i);
					if(e != null){
						if(e.getHorizontalMovement()!=0) e.moveOnX();
						if(e.getVerticalMovement()!=0) e.moveOnY();
					}
				}

				comp.repaint();
				Thread.sleep(80);
			}catch(Exception e){}
		}
		if(!Game.running){
			ImageIcon icon1 = createImageIcon("Bomberman1.png",null);
			Object[] options = {"Beenden",
                    "Menue",
                    "Neustart"};
			int n=5;
			if(Game.winner=="Spieler2"){
				n = JOptionPane.showOptionDialog(Game.gamew,
					    "Sie haben verloren. \n "
					    + "Wollen Sie noch einmal Spielen?",
					    "Spiel beendet",
					    JOptionPane.YES_NO_CANCEL_OPTION,
					    JOptionPane.PLAIN_MESSAGE,
					    icon1,
					    options,
					    options[2]);
			}
			
			else if(Game.winner=="Spieler1"){
				n = JOptionPane.showOptionDialog(Game.gamew,
					    "Sie haben den Ausgang erreicht \n "
					    + "Wollen Sie noch einmal Spielen?",
					    "Spiel beendet",
					    JOptionPane.YES_NO_CANCEL_OPTION,
					    JOptionPane.PLAIN_MESSAGE,
					    icon1,
					    options,
					    options[2]);
			}
			
			if(n==0){
				System.exit(0);
			}
			if(n==1){
				EntityManager.entitylist.clear();
				EntityManager.entitylistb1.clear();
		        EntityManager.entitylistb2.clear();
		        EntityManager.entityliste1.clear();
		        EntityManager.entityliste2.clear();
		        Game.gamew.dispose();
			}
			if(n==2){
				
				EntityManager.entitylist.clear();
				EntityManager.entitylistb1.clear();
		        EntityManager.entitylistb2.clear();
		        EntityManager.entityliste1.clear();
		        EntityManager.entityliste2.clear();
		        Game.gamew.dispose();
		        Game.running=true;
				Game.gamew=new GameWindow("Bomberman", 750, 572,1);
			}
			 players=null;
			 bombermans=null;
			 comp=null;			
		}	
	}
	
		protected ImageIcon createImageIcon(String path,
	            String description) {
				java.net.URL imgURL = getClass().getResource(path);
				if (imgURL != null) {
					return new ImageIcon(imgURL, description);
				} else {
					System.err.println("Couldn't find file: " + path);
					return null;
				}
		}
		

	
	
}
