

import java.awt.Dimension;


import java.io.IOException;


import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextPane;


import javax.swing.JScrollPane;


public class Dokumentation {
	/*
	 * Die Show Methode macht eine HTML Datei in einem JFrame auf
	 */
	
	public static void show(){

		 //Erzeugt ein editorpane
        JEditorPane editorPane = createEditorPane();
        JScrollPane editorScrollPane = new JScrollPane(editorPane);
        editorScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        editorScrollPane.setPreferredSize(new Dimension(250, 145));
        editorScrollPane.setMinimumSize(new Dimension(10, 10));
 
        //Erzeugt ein Textpane
        JTextPane textPane = new JTextPane();
        JScrollPane paneScrollPane = new JScrollPane(textPane);
        paneScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        paneScrollPane.setPreferredSize(new Dimension(250, 155));
        paneScrollPane.setMinimumSize(new Dimension(10, 10));

        
        JFrame frame = new JFrame("Dokumentation");
        frame.add(editorScrollPane);
        frame.pack();
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setSize(750, 572);
        frame.setResizable(false);
		
	}
	
	 public static JEditorPane createEditorPane() {
	        JEditorPane editorPane = new JEditorPane();
	        editorPane.setEditable(false);
	        java.net.URL helpURL = Dokumentation.class.getResource(
	                                        "dokumentation.html");
	        if (helpURL != null) {
	            try {
	                editorPane.setPage(helpURL);
	            } catch (IOException e) {
	                System.err.println("Error: " + helpURL);
	            }
	        } else {
	            System.err.println("Konnte nicht finden: dokumentation.html");
	        }
	 
	        return editorPane;
	    }
	 
	
	   
}


