import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;


public class GameWindow extends JFrame{

	/*
	 * GameWindow enthält die Weite,die Höhe, die Dimension und das GamePanel 
	 * GameWindow erbt von JFRAME
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private Dimension dim;
	private GamePanel panel;
	
	
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
	public GameWindow(String title,int width,int height){
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
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
