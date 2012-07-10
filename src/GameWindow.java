
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class GameWindow extends JFrame{

	/*
	 * GameWindow enthaelt die Weite,die Hoehe, die Dimension und das GamePanel 
	 * GameWindow erbt von JFRAME
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private Dimension dim;
	public static GamePanel panel;
	public static int modus;
	
	/**
	 * @param title Gibt den Title des Fensters an
	 * @param width Gibt die Weite des Fensters an
	 * @param height Gibt die H�he des Fensters an
	 */
	/*
	 * Setzt Hintergund
	 * Setzt Fenster
	 * Beendet das Programm bei schliessen des Fensters
	 * Fenster ist nicht veraenderbar
	 * 
	 */
	public GameWindow(String title,int width,int height,final int modus){
		super(title);
		this.width=width;
		this.height=height;
		GameWindow.modus=modus;
		dim=new Dimension(this.width,this.height);	
		panel=new GamePanel();
		panel.setBackground(Color.black);
		setMaximumSize(dim);
		setPreferredSize(dim);
		setUndecorated(true);
		System.out.println(getContentPane().getInsets().left);
		add(panel);
		pack();
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
	           panel.removeAll();
	           dispose();   
	            }
	        }); 
		
		
	}
}
