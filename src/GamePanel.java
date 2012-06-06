import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;


public class GamePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BombermanEntity b=new BombermanEntity("Bomberman1.png", 0, 0);
	private BombermanEntity b2=new BombermanEntity("Bomberman2.png", 700,500);
	private StoneEntity st;
	private Player p= new Player("Spieler 1",new InputHandler(KeyEvent.VK_LEFT,KeyEvent.VK_RIGHT,KeyEvent.VK_UP,KeyEvent.VK_DOWN));
	private Player p2= new Player("Spieler 2 ",new InputHandler(KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_W,KeyEvent.VK_S));
	private Player[] players={p,p2};
	private BombermanEntity[] bombermans={b,b2};
	private InputHandler input=p.getInputHandler();
	private Map mp =new Map();
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
		

		for(int i=0;i<mp.mapFieldX();i++){
			for(int j=0;j<mp.mapFieldY();j++){
			if(mp.isSelected(i, j)){
				  st=new StoneEntity("stone.png",j*50 ,i*50);
				  EntityManager.entitylist.add(st);
			}
			}
		}
		
	
	}
	public void paint(Graphics g){
		super.paint(g);
			
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
