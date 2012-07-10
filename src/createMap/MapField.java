package createMap;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MapField extends JPanel {

	
	private static final long serialVersionUID = 1L;
	public static MapField mf;
	public static InputListener input=new InputListener();
	private MapSet ms=new MapSet(this);
	/*
	 * Die Mapfield klasse ist fuer das zeichnen der mapcreate fenster zusteandig 
	 */
	public MapField(){
		super();
		mf=this;
		//fuegt einen mouslistener hinzu
		mf.addMouseListener(input);
		mf.setFocusable(true);
		//Startet den Mapsetmodus
		new Thread(ms).start();
	}
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		//rote trennlinien
		for(int i=1;i<=15;i++){
		g.drawLine(50*i, 0, 50*i, 570);
		}
		for(int i=1;i<=15;i++){
		g.drawLine(0, 50*i, 750, 50*i);
		}
		//Buttons fur die ausswahl
		g.drawRect(760, 50, 180, 50);
		g.drawRect(760, 150, 180, 50);
		g.drawRect(760, 250, 180, 50);
		g.drawRect(760, 350, 180, 50);
		g.drawRect(760, 455, 180, 40);
		g.drawRect(760, 505, 180, 40);
		
		ImageIcon icon1= new ImageIcon("src/createMap/Bomberman1.png");
		ImageIcon icon2= new ImageIcon("src/createMap/Bomberman2.png");
		ImageIcon icon3= new ImageIcon("src/createMap/stone.png");
		ImageIcon icon4= new ImageIcon("src/createMap/stone2.png");
		Image img1=icon1.getImage();
		Image img2=icon2.getImage();
		Image img3=icon3.getImage();
		Image img4=icon4.getImage();
		g.drawImage(img1,825,50,null);
		g.drawImage(img2,825,150,null);
		g.drawImage(img3,825,250,null);
		g.drawImage(img4,825,350,null);
		
		g.setColor(Color.green);
		g.drawString("Fertig", 835, 480);
		
		g.drawString("Reset", 835, 530);
		
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
