
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class GameWindow extends JFrame{

	/*
	 * GameWindow enth�lt die Weite,die H�he, die Dimension und das GamePanel 
	 * GameWindow erbt von JFRAME
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private Dimension dim;
	public static GamePanel1 panel1;
	public static GamePanel2 panel2;
	
	/**
	 * @param title Gibt den Title des Fensters an
	 * @param width Gibt die Weite des Fensters an
	 * @param height Gibt die H�he des Fensters an
	 */
	/*
	 * Setzt Hintergund
	 * Setzt Fenster
	 * Beendet das Programm bei schliessen des Fensters
	 * Fenster ist nicht ver�nderbar
	 * 
	 */
	public GameWindow(String title,int width,int height,final int modus){
		super(title);
		this.width=width;
		this.height=height;
		dim=new Dimension(this.width,this.height);
		
		if(modus==1){
			panel1=new GamePanel1();
			panel1.setBackground(Color.black);
		}
		else if(modus==2){
			panel2=new GamePanel2();
			panel2.setBackground(Color.black);
		}

		
		setMaximumSize(dim);
		setMinimumSize(dim);
		setPreferredSize(dim);
		if(modus==1){
			add(panel1);
		}else if(modus==2){
			add(panel2);
		}
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
	           public void windowClosing(WindowEvent event) {
	           Game.winner="";
	           Game.running=false;
	           EntityManager.entitylist.clear();
	           EntityManager.entitylistb1.clear();
	           EntityManager.entitylistb2.clear();
	           EntityManager.entityliste1.clear();
	           EntityManager.entityliste2.clear();
	           if(modus==1){
	        	   panel1.removeAll(); 
	           }else if(modus==2){
	        	   panel2.removeAll(); 
	           }
	           dispose();   
	            }
	        }); 
		
		
	}
}
