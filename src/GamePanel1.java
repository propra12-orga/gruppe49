
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class GamePanel1 extends JPanel {
	/*
	 *Diese Klasse setzt das Spielfeld und ist für das Zeichnen zuständig
	 *Dies geschied durch hinzufügen der Entity Objekte in die Entitylist des EntityManagers 
	 *Sie werden dann durch eine for Schleife auf das Spielfeld gezeichnet     
	 */
	
	private static final long serialVersionUID = 1L;
	private BombermanEntity b=new BombermanEntity("Bomberman1.png", 0, 0,"Spieler1");
	private StoneEntity st;
	private ExitEntity exit;
	private Player p= new Player("Spieler 1",new InputHandler(KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_W,KeyEvent.VK_S,KeyEvent.VK_SPACE));
	private Player[] players={p};
	private BombermanEntity[] bombermans={b};
	private InputHandler input=p.getInputHandler();
	private Map mp =new Map(1);
	private MoveBombermanThread1 mb=new MoveBombermanThread1(players, bombermans, this);
	public static GamePanel1 gp;
	


	public GamePanel1(){
		super();
		gp=this;
		gp.addKeyListener(input);
		gp.setFocusable(true);
		new Thread(mb).start();
		mp.setMap();
		
		for(int i=0;i<mp.mapFieldX();i++){
			for(int j=0;j<mp.mapFieldY();j++){
				if(mp.isSelected(i, j)==4){
					exit=new ExitEntity("exit.png",j*50 ,i*50);
					EntityManager.entitylist.add(exit);
					
				}
			}
		}

		mp.setModus(2);
		mp.setMap();

		for(int i=0;i<mp.mapFieldX();i++){
			for(int j=0;j<mp.mapFieldY();j++){
				if(mp.isSelected(i, j)==1){
					st=new StoneEntity("stone.png",j*50 ,i*50,false);
					EntityManager.entitylist.add(st);
				}
				if(mp.isSelected(i, j)==2){
					st=new StoneEntity("stone2.png",j*50 ,i*50,true);
					EntityManager.entitylist.add(st);
				}
				if(mp.isSelected(i, j)==3){
					b.setX(j*50);
					b.setY(i*50);
					EntityManager.entitylist.add(b);
				}
			}
		}
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics) 
	 */
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

		for(int i=0;i<EntityManager.entitylistb1.size();i++){
			Entity e=EntityManager.entitylistb1.get(i);
			if(e != null){
				if(e.getSprite().getImage()!=null){
					g.drawImage(e.getSprite().getImage(), e.getX(), e.getY(), null);
				}
			}
		}
		
		
		for(int i=0;i<EntityManager.entitylistb2.size();i++){
			Entity e=EntityManager.entitylistb2.get(i);
			if(e != null){
				if(e.getSprite().getImage()!=null){
					g.drawImage(e.getSprite().getImage(), e.getX(), e.getY(), null);
				}
			}
		}
		
		for(int i=0;i<EntityManager.entityliste1.size();i++){
			Entity e=EntityManager.entityliste1.get(i);
			if(e != null){
				if(e.getSprite().getImage()!=null){
					g.drawImage(e.getSprite().getImage(), e.getX(), e.getY(), null);
				}
			}
		}
			
		for(int i=0;i<EntityManager.entityliste2.size();i++){
			Entity e=EntityManager.entityliste2.get(i);
			if(e != null){
				if(e.getSprite().getImage()!=null){
					g.drawImage(e.getSprite().getImage(), e.getX(), e.getY(), null);
				}
			}
		}
		
		g.dispose();
		
	}

}
