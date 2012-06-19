package zweispieler;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import game.*;


public class GameWindowZS extends JFrame{

	/*
	 * GameWindow enthält die Weite,die Höhe, die Dimension und das GamePanel 
	 * GameWindow erbt von JFRAME
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private Dimension dim;
	public static GamePanel panel;
	
	
	/**
	 * @param title Gibt den Title des Fensters an
	 * @param width Gibt die Weite des Fensters an
	 * @param height Gibt die Höhe des Fensters an
	 */
	/*
	 * Setzt Hintergund
	 * Setzt Fenster
	 * Beendet das Programm bei schliessen des Fensters
	 * Fenster ist nicht veränderbar
	 * 
	 */
	public GameWindowZS(String title,int width,int height){
		super(title);
		this.width=width;
		this.height=height;
		dim=new Dimension(this.width,this.height);
		
		panel=new GamePanel();
		panel.setBackground(Color.black);
		
		setMaximumSize(dim);
		setMinimumSize(dim);
		setPreferredSize(dim);
		add(panel);
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
