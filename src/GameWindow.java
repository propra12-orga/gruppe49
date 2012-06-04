import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GameWindow extends JFrame{

	private String title;
	private int width;
	private int height;
	private Dimension dim;
	private GamePanel panel;
	public GameWindow(String title,int width,int height){
		super(title);
		this.title=title;
		this.width=width;
		this.height=height;
		dim=new Dimension(width,height);
		
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
