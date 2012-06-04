import java.awt.Image; 
import java.net.URL;
import javax.swing.ImageIcon;

public class Sprite {
	
	private Image img ;
	
	public Sprite(Image img) {
		this.img =img;
	}

	public Image getImage(){
		return img;
	}
	
	public int getWidth(){
		return img.getWidth(null);
	}

	public int getHeight(){
		return img.getHeight(null);
	}
}
