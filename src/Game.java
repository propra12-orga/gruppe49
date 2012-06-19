
import einspieler.*;
import zweispieler.*;
import netzwerkspieler.*;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Game {
	 final static boolean shouldFill = true;
	   final static boolean shouldWeightX = true;
	   final static boolean RIGHT_TO_LEFT = false;
	   public static GameWindowES gamewes;
	   public static GameWindowZS gamewzs;
	   public static GameWindowNS gamewns;
	   public static String winner="";
	/*
	*	Boolean variable um zu sehen ob das Spiel am laufen ist 
	*/
	public static boolean running=false;
	
	
	/*
	 * Setzt Das spiel auf laufen und šffnet ein neues SpielFenster
	 */
	public static void main(String[] args) {
		running=true;
		createAndShowGUI();
		
	}

	
	
	   public static void addComponentsToPane(Container pane) {
	        if (RIGHT_TO_LEFT) {
	            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	        }
	 
	        JButton button1,button2,button3,button4;
	    pane.setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    if (shouldFill) {
	    //natural height, maximum width
	    c.fill = GridBagConstraints.HORIZONTAL;
	    }
	 
	    button1 = new JButton("Einspieler");
	    if (shouldWeightX) {
	    c.weightx = 0.5;
	    }
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    pane.add(button1, c);
	 
	    button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				running=true;
				gamewes=new GameWindowES("Bomberman", 750, 572);
			 
			}
		});
	    
	  //Button2
	    button2 = new JButton("Zweispieler");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 0;
	    pane.add(button2, c);
	    
	    button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				running=true;
				gamewzs=new GameWindowZS("Bomberman", 750, 572);

			}
		});
	    
	    //Button2
	    button3 = new JButton("Dokumentation");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 0;
	    pane.add(button3, c);
	    
	    button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Dokumentation.show();

			}
		});
	    
	    
	    
	    
	    
	    //Button 3 
	     button4 = new JButton("Beenden");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 3;
	    c.gridy = 0;
	    pane.add(button4, c);
	    
	    button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		
	 
	 
	    }
	
	
	
	
	
	
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Bomberman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        
        frame.pack();
        frame.setVisible(true);
        frame.setSize(570, 572);
        frame.setResizable(false);
    }
}
