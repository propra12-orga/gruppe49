package createMap;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class CMap extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private Dimension dim;
	public static boolean running=true;
	
	public CMap(String title, int width,int height){
		super(title);
		this.height=height;
		this.width=width+200;
		dim=new Dimension(this.width,this.height);
		
		setMaximumSize(dim);
		setMinimumSize(dim);
		setPreferredSize(dim);
	
		MapField mf=new MapField();
		mf.setBackground(Color.black);
		add(mf);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	
	
	
	
}
