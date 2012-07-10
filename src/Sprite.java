
import java.awt.Image; 

public class Sprite {
	
	/*
	 * Dies ist die sprite klasse dient zur darstellung der verschieden sprites und 
	 * gibt die bilgergroessen wieder
	 */
	private Image img ;
	/**
	 * 
	 * @param img erhealt ein bild von typ Image
	 */
	public Sprite(Image img) {
		this.img =img;
	}
	/**
	 * 
	 * @return gibt das Image zurueck
	 */
	public Image getImage(){
		return img;
	}
	
	/**
	 * 
	 * @return gibt die weite des bilges an
	 */
	public int getWidth(){
		return img.getWidth(null);
	}
	/**
	 * 
	 * @return gibt die hoehe des bildes an
	 */
	public int getHeight(){
		return img.getHeight(null);
	}
}
