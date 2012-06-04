import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;


public class GamePanel extends JPanel {
	private BombermanEntity b=new BombermanEntity("Bomberman1.png", 0, 0);
	private BombermanEntity b2=new BombermanEntity("Bomberman2.png", 700,500);
	private StoneEntity st=new StoneEntity("stone.png",100 ,100);
	private Player p= new Player("Spieler 1",new InputHandler(KeyEvent.VK_LEFT,KeyEvent.VK_RIGHT,KeyEvent.VK_UP,KeyEvent.VK_DOWN));
	private Player p2= new Player("Spieler 2 ",new InputHandler(KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_W,KeyEvent.VK_S));
	private Player[] players={p,p2};
	private BombermanEntity[] bombermans={b,b2};
	private InputHandler input=p.getInputHandler();
	private Map mp =new Map(16,12);
	private MoveBombermanThread mb=new MoveBombermanThread(players, bombermans, this);
	
    public static GamePanel gp;
	
	public GamePanel(){
		super();
		gp=this;
		gp.addKeyListener(input);
		gp.addKeyListener(p2.getInputHandler());
		gp.setFocusable(true);
		new Thread(mb).start();
		EntityManager.entitylist.add(b);
		EntityManager.entitylist.add(b2);
		mp.setMap();
		for(int i=0;i<16;i++){
			for(int j=0;j<12;j++){
			if(mp.isSelected(i, j)){
				  StoneEntity st=new StoneEntity("stone.png",i*50 ,j*50);
				  EntityManager.entitylist.add(st);
			}
			}
		}
		
	
	}
	public void paint(Graphics g){
		super.paint(g);
		for(int i=1;i<16;i++){
			g.drawLine(50*i, 0, 50*i, 600);
			}
			
			for(int i=1;i<16;i++){
			g.drawLine(0, 50*i,800, 50*i);
			}
			
		for(int i=0;i<EntityManager.entitylist.size();i++){
			Entity e=EntityManager.entitylist.get(i);
			if(e != null){
				if(e.getSprite().getImage()!=null){
					g.drawImage(e.getSprite().getImage(), e.getX(), e.getY(), null);
				}
			}
		}
		
		
		
		
			
	
			
		
		g.dispose();
		
	}

}
